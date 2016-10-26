package P_0615;

/*
 * 전화번호 관리프로그램을 만들어보자
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import GUI.*;

public class Tel_01 {
	JTextField nameF, telF, mailF, comF, addrF;
	JButton addB, modifyB, deleteB, exitB;
	DefaultTableModel model;
	JTable table;

	public Tel_01() {
		CJFrame frame = new CJFrame("전화번호 관리 프로그램");
		frame.setResizable(false);
		// 도구 만들기
		// 테이블
		String[] title = { "이름", "전화번호", "이메일", "회사", "주소" };
		model = new DefaultTableModel(title, 0);
		table = new JTable(model);
		table.addMouseListener(new TableEvent());
		JScrollPane sp = new JScrollPane(table);

		addB = new JButton("추가하기");
		modifyB = new JButton("수정하기");
		deleteB = new JButton("삭제하기");
		exitB = new JButton("종료하기");

		ButtonEvent evt = new ButtonEvent();
		addB.addActionListener(evt);
		modifyB.addActionListener(evt);
		deleteB.addActionListener(evt);
		exitB.addActionListener(evt);

		JPanel southP = new JPanel();
		southP.add(addB);
		southP.add(modifyB);
		southP.add(deleteB);
		southP.add(exitB);

		// 텍스트필드
		JLabel nameL = new JLabel("이름", JLabel.RIGHT);
		JLabel telL = new JLabel("전화번호", JLabel.RIGHT);
		JLabel mailL = new JLabel("이메일", JLabel.RIGHT);
		JLabel comL = new JLabel("회사", JLabel.RIGHT);
		JLabel addrL = new JLabel("주소", JLabel.RIGHT);

		JPanel p1 = new JPanel(new GridLayout(5, 1));
		p1.add(nameL);
		p1.add(telL);
		p1.add(mailL);
		p1.add(comL);
		p1.add(addrL);

		nameF = new JTextField(10);
		telF = new JTextField(10);
		mailF = new JTextField(10);
		comF = new JTextField(10);
		addrF = new JTextField(10);

		JPanel p2 = new JPanel(new GridLayout(5, 1));
		p2.add(nameF);
		p2.add(telF);
		p2.add(mailF);
		p2.add(comF);
		p2.add(addrF);

		JPanel p3 = new JPanel(new BorderLayout());
		p3.add("West", p1);
		p3.add("East", p2);
		// 위에 가장작은 크기로 만들기 위해서 진공포장하자
		JPanel westP = new JPanel(new FlowLayout());
		westP.add(p3);

		JLabel logoL = new JLabel(new ImageIcon("src/P_0615/유정.jpg"));
		p3.add("South", logoL);

		frame.add("Center", sp);
		frame.add("South", southP);
		frame.add("West", westP);

		frame.setSize(700, 400);
		frame.setVisible(true);
	}

	public void deleteProc(){
		// 1. 선택한 줄을 알아낸다.
		int row = table.getSelectedRow();
		if(row == -1){
			return;
		}
		// 2. 그 줄을 삭제한다(모양이 변하므로 model)
		model.removeRow(row);
		
		deleteField();
	}
	
	public void modifyProc(){
		// 1. 텍스트 필드의 내용을 알아내고
		String name = nameF.getText().trim();
		if (name == null || name.length() == 0) {
			return;
		}
		String tel = telF.getText().trim();
		String mail = mailF.getText().trim();
		String com = comF.getText().trim();
		String addr = addrF.getText().trim();
		// 2. 그 내용을 선택한 줄의 내용으로 변경한다.
		// 	  데이터를 변경하는 것은 모양 변경이 아니다.
		//    그 함수는 table에서 찾아야한다.
		int row = table.getSelectedRow();
		if(row == -1){
			return;
		}
		table.setValueAt(name, row, 0);
		table.setValueAt(tel, row, 1);
		table.setValueAt(mail, row, 2);
		table.setValueAt(com, row, 3);
		table.setValueAt(addr, row, 4);
		// 3. 필드의 내용을 지운다.
		deleteField();
	}
	
	// 여러곳에서 자주 사용하는 텍스트 필드 내용 지우기 기능을
	// 함수로 만들어서 사용하자.
	public void deleteField() {
		nameF.setText("");
		telF.setText("");
		mailF.setText("");
		comF.setText("");
		addrF.setText("");
	}

	public void addProc() {
		// 1. 텍스트 필드에 입력한 내용을 알아낸다.
		String name = nameF.getText().trim();
		// 만약 필수 입력 항목이 있다면 입력되지 않은 경우 추가 작업을 중단해야 한다.
		// 무결성 검사
		if (name == null || name.length() == 0) {
			// name.length() == 0 || name == null 이라고 하면 안된다.
			// name이 null인상태에서 name.length() 함수 호출 상태 에러
			// name의 주소가 없는 상태이기 때문이다.
			return;
		}
		String tel = telF.getText().trim();
		String mail = mailF.getText().trim();
		String com = comF.getText().trim();
		String addr = addrF.getText().trim();
		// 2. 그 내용을 테이블에 추가한다.
		String[] data = { name, tel, mail, com, addr };
		model.addRow(data);
		
		// 3. 텍스트 필드에 입력한 내용은 자동으로 지원다.
		deleteField();
	}

	public static void main(String[] args) {
		new Tel_01();

	}

	class ButtonEvent implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton target = (JButton) e.getSource();
			if (target == addB) {
				// 이곳에서 추가작업을 하면되는데 그 과정이 복잡하므로
				// 함수를 따로 만들어서 처리할 예정이다.
				addProc();
			} else if (target == modifyB) {
				modifyProc();
			} else if (target == deleteB) {
				deleteProc();
			} else if (target == exitB) {
				System.exit(0);
			}
		}
	}

	// 테이블을 클릭하는 이벤트는 없다.
	// 편법 일반 클릭이벤트를 이용해서 처리하도록 한다.
	class TableEvent extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			// 선택한 줄이 몇번째 줄인지 알아낸다.
			// getSelecteRow();
			int row = table.getSelectedRow();
			if (row == -1) {
				return;
			}
			// 그 줄의 내용을 하나씩 알아낸다.
			// getValueAt(int row, int column)
			String name = (String) table.getValueAt(row, 0);
			String tel = (String) table.getValueAt(row, 1);
			String mail = (String) table.getValueAt(row, 2);
			String com = (String) table.getValueAt(row, 3);
			String addr = (String) table.getValueAt(row, 4);
			// 그 내용을 옆의 텍스트 필드에 입력
			nameF.setText(name);
			telF.setText(tel);
			mailF.setText(mail);
			comF.setText(com);
			addrF.setText(addr);
		}
	}
}
