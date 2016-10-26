package P_0621;

/*
 * 데이터베이스를 이용한 전화번호 관리 프로그램을 작성해보자.
 */
import java.sql.*;
import SQL.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class Phone extends JFrame {
	JTable table;
	DefaultTableModel model;
	JTextField noF, nameF, telF, mailF, comF, addrF;
	JButton allB, nameB, telB, modifyB, addB, deleteB, exitB;
	MyJDBC db;
	Connection con;
	// 이 프로그램의 특징상 여러종류의 질의명령이 필요하므로
	// 각각의 질의명령을 전담할 PreparedStatement를 만들어 준다.
	PreparedStatement allS, nameS, telS, addS, modifyS, deleteS, extiS;
	ResultSet rs;

	public Phone() {
		super("전화번호 관리 프로그램");
		setTable();
		setButton();
		setEvent();
		setTextField();

		setSize(800, 800);
		setVisible(true);
		// 데이터베이스와 연결
		setDB();
	}

	
	// 이제 폼이 완성되면 이 프로그램 특징상 데이터베이스와 연결되어야 한다.
	// 데이터베이스와 연결하는 함수를 만들어보자.
	public void setDB() {
		db = new MyJDBC();
		con = db.getCon();
		// 스테이트먼트는 각각 전담할 스테이트먼트를 만들기로 했다.
		// 각각 전용 스테이트먼트를 만들어 놓자.
		// 1. 전체검색
		String sqlAll = "select * from Phone order by p_NO";
		allS = db.getPstmt(sqlAll, con);
		// 2. 이름검색
		String sqlName = "select * from Phone where p_Name like ?";
		nameS = db.getPstmt(sqlName, con);
		// 3. 번호검색
		String sqlTel = "select * from Phone where p_Tel like ?";
		telS = db.getPstmt(sqlTel, con);
		// 4. 데이터 추가
		String sqlAdd = "insert into Phone values((select nvl(Max(p_No), 0) + 1 from Phone), ?, ?, ?, ?, ?)";
		addS = db.getPstmt(sqlAdd, con);
		// 5. 데이터 수정
		String sqlModify = "update Phone set p_Tel = ?,  p_Mail = ?, p_Com = ?, p_Addr = ? where p_No = ?";
		modifyS = db.getPstmt(sqlModify, con);
		// 6. 데이터 삭제
		String sqlDelete = "delete from Phone where p_No = ?";
		deleteS = db.getPstmt(sqlDelete, con);

		allProc();
	}

	
	// 텍스트필드를 만들 함수
	public void setTextField() {
		JLabel noL = new JLabel("번호");
		JLabel nameL = new JLabel("이름");
		JLabel telL = new JLabel("전화번호");
		JLabel mailL = new JLabel("이메일 주소");
		JLabel comL = new JLabel("회사명");
		JLabel addL = new JLabel("주소");

		noF = new JTextField(10);
		// 번호는 자동입력되도록 할 예정이다.
		// 그래서 사용자는 입력하지 못하게 하고싶다.
		noF.setEditable(false);
		nameF = new JTextField(10);
		telF = new JTextField(10);
		mailF = new JTextField(10);
		comF = new JTextField(10);
		addrF = new JTextField(10);

		JPanel p1 = new JPanel(new GridLayout(6, 1));
		p1.add(noL);
		p1.add(nameL);
		p1.add(telL);
		p1.add(mailL);
		p1.add(comL);
		p1.add(addL);

		JPanel p2 = new JPanel(new GridLayout(6, 1));
		p2.add(noF);
		p2.add(nameF);
		p2.add(telF);
		p2.add(mailF);
		p2.add(comF);
		p2.add(addrF);

		JPanel p3 = new JPanel(new BorderLayout());
		p3.add("West", p1);
		p3.add("Center", p2);

		JPanel westP = new JPanel(new FlowLayout());
		westP.add(p3);

		this.add("West", westP);
	}

	
	// 단추를 만들 함수
	public void setButton() {
		allB = new JButton("전체 검색");
		nameB = new JButton("이름 검색");
		telB = new JButton("번호 검색");
		addB = new JButton("추     가");
		modifyB = new JButton("수    정");
		deleteB = new JButton("삭     제");
		exitB = new JButton("종료하기");

		JPanel southP = new JPanel();
		southP.add(allB);
		southP.add(nameB);
		southP.add(telB);
		southP.add(addB);
		southP.add(modifyB);
		southP.add(deleteB);
		southP.add(exitB);

		this.add("South", southP);
	}

	
	// 테이블을 만들 함수
	public void setTable() {
		String[] title = { "번호", "이름", "전화번호", "이메일주소", "회사명", "주소" };
		model = new DefaultTableModel(title, 0);
		table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		this.add("Center", sp);
	}

	
	// 이벤트 처리만 기록할 함수를 따로 만들자.
	public void setEvent() {
		this.addWindowListener(new CloseEvent());
		ButtonEvent evt = new ButtonEvent();
		allB.addActionListener(evt);
		nameB.addActionListener(evt);
		telB.addActionListener(evt);
		addB.addActionListener(evt);
		modifyB.addActionListener(evt);
		deleteB.addActionListener(evt);
		exitB.addActionListener(evt);
		table.addMouseListener(new TableEvent());
	}

	
	// 테이블 내용을 지워주는 전담 함수
	public void clearTable() {
		// 할일
		// 몇줄을 지워야 할지 알아낸다.
		int row = table.getRowCount();
		// 한꺼번에 지우는 방법은 없고
		// 한줄씩 지워야한다.
		for (int i = 0; i < row; i++) {
			model.removeRow(0);
		}
	}

	
	// 텍스트필드 내용 삭제
	public void clearText() {
		noF.setText("");
		nameF.setText("");
		telF.setText("");
		mailF.setText("");
		comF.setText("");
		addrF.setText("");
	}

	
	// 전체 검색 과정
	public void allProc() {
		// 현재 테이블에 있는 내용을 지운다.
		// 왜냐하면 새롭게 전체 내용을 불러와서 테이블에 입력해야 하므로
		// 테이블 내용이 남아있으면 썩히게 된다.
		clearTable();
		// 데이터베이스에서 전체 내용을 가지고 온다.
		try {
			rs = allS.executeQuery();
			while (rs.next()) {
				Object[] temp = new Object[6];
				temp[0] = rs.getInt("p_no");
				temp[1] = rs.getString("p_name");
				temp[2] = rs.getString("p_tel");
				temp[3] = rs.getString("p_mail");
				temp[4] = rs.getString("p_com");
				temp[5] = rs.getString("p_addr");
				// 그 내용을 하나씩 테이블에 추가한다.
				model.addRow(temp);
			}
		} catch (Exception e) {
			System.out.println("전체 검색 에러 = " + e);
			e.printStackTrace();
		}
	}

	
	// 이름 검색 과정
	public void nameProc() {
		// 할일
		// 테이블 지운다.
		clearTable();
		// 텍스트 필드에서 입력한 이름만 알아낸다.
		String name = nameF.getText().trim();
		if (name == null || name.length() == 0) {
			return;
		}
		// 먼저 내용을 보내고
		// 참고
		// LIKE 조건은 앞 혹은 뒤에 % 기호가 붙는다.
		// 예> LIKE '%홍%'
		// 그러므로 %기호까지 만들어서 데이터베이스에 전달해야 한다.
		name = "%" + name + "%";
		try {
			nameS.setString(1, name);
			// 질의를 실행한다.
			rs = nameS.executeQuery();

			// 질의 결과를 테이블에 출력한다.
			while (rs.next()) {
				Object[] temp = new Object[6];
				temp[0] = rs.getInt("p_no");
				temp[1] = rs.getString("p_name");
				temp[2] = rs.getString("p_tel");
				temp[3] = rs.getString("p_mail");
				temp[4] = rs.getString("p_com");
				temp[5] = rs.getString("p_addr");
				// 그 내용을 하나씩 테이블에 추가한다.
				model.addRow(temp);
			}
		} catch (Exception e) {
			System.out.println("이름 검색 에러 = " + e);
			e.printStackTrace();
		}
		clearText();
	}

	
	// 전화번호 검색 과정
	public void telProc() {
		// 할일
		// 테이블 지운다.
		clearTable();
		// 검색할 전화번호 알아낸다.
		String tel = telF.getText().trim();
		if (tel == null || tel.length() == 0) {
			return;
		}
		// 데이터베이스에게 보낸다.
		// p_Tel LIKE '%0895'
		tel = "%" + tel + "%";
		try {
			telS.setString(1, tel);
			// 실행한다.
			rs = telS.executeQuery();
			// 결과 출력한다.
			while (rs.next()) {
				Object[] temp = new Object[6];
				temp[0] = rs.getInt("p_no");
				temp[1] = rs.getString("p_name");
				temp[2] = rs.getString("p_tel");
				temp[3] = rs.getString("p_mail");
				temp[4] = rs.getString("p_com");
				temp[5] = rs.getString("p_addr");
				// 그 내용을 하나씩 테이블에 추가한다.
				model.addRow(temp);
			}
		} catch (Exception e) {
			System.out.println("전화번호 검색 에러 = " + e);
			e.printStackTrace();
		}
		clearText();
	}

	
	// 추가 과정
	public void addProc() {
		// 1. 입력상자에 입력된 내용을 알아낸다.
		String name = nameF.getText().trim();
		String tel = telF.getText().trim();
		String mail = mailF.getText().trim();
		String com = comF.getText().trim();
		String addr = addrF.getText().trim();
		// 2. 그 내용을 데이터베이스에게 보낸다.
		try {
			addS.setString(1, name);
			addS.setString(2, tel);
			addS.setString(3, mail);
			addS.setString(4, com);
			addS.setString(5, addr);
			// 3. 질의명령 실행
			addS.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}
		// 텍스트 필드에 입력한 내용을 지우자.
		// 지우는 기능은 여러곳에서 사용할 예정이므로 함수로 따로 만들자.
		clearText();
		allProc();
	}

	
	// 수정 과정
	public void modifyProc() {
		// 입력상자에 있는 내용을 알아낸다.
		String no = noF.getText().trim();
		String name = nameF.getText().trim();
		String tel = telF.getText().trim();
		String mail = mailF.getText().trim();
		String com = comF.getText().trim();
		String addr = addrF.getText().trim();
		// 데이터베이스에 먼저 보낸다.
		try {
			modifyS.setString(1, tel);
			modifyS.setString(2, mail);
			modifyS.setString(3, com);
			modifyS.setString(4, addr);
			modifyS.setInt(5, Integer.parseInt(no));
			// 실행한다
			modifyS.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 텍스트 필드 지운다.
		clearText();
		// 수정한 결과를 보고싶다.
		allProc();
	}

	
	// 삭제 과정
	public void deleteProc() {
		// 삭제할 친구의 번호를 알아낸다.
		String no = noF.getText().trim();
		try {
			// 데이터베이스에게 보낸다.
			deleteS.setInt(1, Integer.parseInt(no));
			// 실행한다.
			deleteS.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 텍스트필드 지운다.
		clearText();
		allProc();
	}


	// 메인 함수
	public static void main(String[] args) {
		new Phone();

	}

	
	// 창닫기
	class CloseEvent extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent e) {
			db.close(allS);
			db.close(nameS);
			db.close(telS);
			db.close(addS);
			db.close(modifyS);
			db.close(deleteS);
			db.close(con);
			System.exit(0);
		}
	}

	
	// 단추 이벤트를 등록하자
	class ButtonEvent implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton target = (JButton) e.getSource();
			if (target == allB) {
				allProc();
			} else if (target == nameB) {
				nameProc();
			} else if (target == telB) {
				telProc();
			} else if (target == addB) {
				addProc();
			} else if (target == modifyB) {
				modifyProc();
			} else if (target == deleteB) {
				deleteProc();
			} else if (target == exitB) {
				db.close(allS);
				db.close(nameS);
				db.close(telS);
				db.close(addS);
				db.close(modifyS);
				db.close(deleteS);
				db.close(con);
				System.exit(0);
			}
		}
	}

	
	// 테이블에는 이벤트가 없기 때문에 MouseListener를 이용해서
	// 마우스 클릭을 처리한다.
	class TableEvent extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			// 몇번쨰 줄을 선택했는지 알아내고
			int row = table.getSelectedRow();
			if (row == -1) {
				return;
			}
			// 그 줄의 데이터를 하나씩 꺼내서
			String no = (int) table.getValueAt(row, 0) + "";
			String name = (String) table.getValueAt(row, 1);
			String tel = (String) table.getValueAt(row, 2);
			String mail = (String) table.getValueAt(row, 3);
			String com = (String) table.getValueAt(row, 4);
			String addr = (String) table.getValueAt(row, 5);
			// 옆의 텍스트 필드에 출력한다.
			noF.setText(no);
			nameF.setText(name);
			telF.setText(tel);
			mailF.setText(mail);
			comF.setText(com);
			addrF.setText(addr);
		}
	}
  
}
