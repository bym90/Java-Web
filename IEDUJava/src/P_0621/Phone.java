package P_0621;

/*
 * �����ͺ��̽��� �̿��� ��ȭ��ȣ ���� ���α׷��� �ۼ��غ���.
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
	// �� ���α׷��� Ư¡�� ���������� ���Ǹ����� �ʿ��ϹǷ�
	// ������ ���Ǹ����� ������ PreparedStatement�� ����� �ش�.
	PreparedStatement allS, nameS, telS, addS, modifyS, deleteS, extiS;
	ResultSet rs;

	public Phone() {
		super("��ȭ��ȣ ���� ���α׷�");
		setTable();
		setButton();
		setEvent();
		setTextField();

		setSize(800, 800);
		setVisible(true);
		// �����ͺ��̽��� ����
		setDB();
	}

	
	// ���� ���� �ϼ��Ǹ� �� ���α׷� Ư¡�� �����ͺ��̽��� ����Ǿ�� �Ѵ�.
	// �����ͺ��̽��� �����ϴ� �Լ��� ������.
	public void setDB() {
		db = new MyJDBC();
		con = db.getCon();
		// ������Ʈ��Ʈ�� ���� ������ ������Ʈ��Ʈ�� ������ �ߴ�.
		// ���� ���� ������Ʈ��Ʈ�� ����� ����.
		// 1. ��ü�˻�
		String sqlAll = "select * from Phone order by p_NO";
		allS = db.getPstmt(sqlAll, con);
		// 2. �̸��˻�
		String sqlName = "select * from Phone where p_Name like ?";
		nameS = db.getPstmt(sqlName, con);
		// 3. ��ȣ�˻�
		String sqlTel = "select * from Phone where p_Tel like ?";
		telS = db.getPstmt(sqlTel, con);
		// 4. ������ �߰�
		String sqlAdd = "insert into Phone values((select nvl(Max(p_No), 0) + 1 from Phone), ?, ?, ?, ?, ?)";
		addS = db.getPstmt(sqlAdd, con);
		// 5. ������ ����
		String sqlModify = "update Phone set p_Tel = ?,  p_Mail = ?, p_Com = ?, p_Addr = ? where p_No = ?";
		modifyS = db.getPstmt(sqlModify, con);
		// 6. ������ ����
		String sqlDelete = "delete from Phone where p_No = ?";
		deleteS = db.getPstmt(sqlDelete, con);

		allProc();
	}

	
	// �ؽ�Ʈ�ʵ带 ���� �Լ�
	public void setTextField() {
		JLabel noL = new JLabel("��ȣ");
		JLabel nameL = new JLabel("�̸�");
		JLabel telL = new JLabel("��ȭ��ȣ");
		JLabel mailL = new JLabel("�̸��� �ּ�");
		JLabel comL = new JLabel("ȸ���");
		JLabel addL = new JLabel("�ּ�");

		noF = new JTextField(10);
		// ��ȣ�� �ڵ��Էµǵ��� �� �����̴�.
		// �׷��� ����ڴ� �Է����� ���ϰ� �ϰ��ʹ�.
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

	
	// ���߸� ���� �Լ�
	public void setButton() {
		allB = new JButton("��ü �˻�");
		nameB = new JButton("�̸� �˻�");
		telB = new JButton("��ȣ �˻�");
		addB = new JButton("��     ��");
		modifyB = new JButton("��    ��");
		deleteB = new JButton("��     ��");
		exitB = new JButton("�����ϱ�");

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

	
	// ���̺��� ���� �Լ�
	public void setTable() {
		String[] title = { "��ȣ", "�̸�", "��ȭ��ȣ", "�̸����ּ�", "ȸ���", "�ּ�" };
		model = new DefaultTableModel(title, 0);
		table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		this.add("Center", sp);
	}

	
	// �̺�Ʈ ó���� ����� �Լ��� ���� ������.
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

	
	// ���̺� ������ �����ִ� ���� �Լ�
	public void clearTable() {
		// ����
		// ������ ������ ���� �˾Ƴ���.
		int row = table.getRowCount();
		// �Ѳ����� ����� ����� ����
		// ���پ� �������Ѵ�.
		for (int i = 0; i < row; i++) {
			model.removeRow(0);
		}
	}

	
	// �ؽ�Ʈ�ʵ� ���� ����
	public void clearText() {
		noF.setText("");
		nameF.setText("");
		telF.setText("");
		mailF.setText("");
		comF.setText("");
		addrF.setText("");
	}

	
	// ��ü �˻� ����
	public void allProc() {
		// ���� ���̺��� �ִ� ������ �����.
		// �ֳ��ϸ� ���Ӱ� ��ü ������ �ҷ��ͼ� ���̺��� �Է��ؾ� �ϹǷ�
		// ���̺� ������ ���������� ������ �ȴ�.
		clearTable();
		// �����ͺ��̽����� ��ü ������ ������ �´�.
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
				// �� ������ �ϳ��� ���̺��� �߰��Ѵ�.
				model.addRow(temp);
			}
		} catch (Exception e) {
			System.out.println("��ü �˻� ���� = " + e);
			e.printStackTrace();
		}
	}

	
	// �̸� �˻� ����
	public void nameProc() {
		// ����
		// ���̺� �����.
		clearTable();
		// �ؽ�Ʈ �ʵ忡�� �Է��� �̸��� �˾Ƴ���.
		String name = nameF.getText().trim();
		if (name == null || name.length() == 0) {
			return;
		}
		// ���� ������ ������
		// ����
		// LIKE ������ �� Ȥ�� �ڿ� % ��ȣ�� �ٴ´�.
		// ��> LIKE '%ȫ%'
		// �׷��Ƿ� %��ȣ���� ���� �����ͺ��̽��� �����ؾ� �Ѵ�.
		name = "%" + name + "%";
		try {
			nameS.setString(1, name);
			// ���Ǹ� �����Ѵ�.
			rs = nameS.executeQuery();

			// ���� ����� ���̺��� ����Ѵ�.
			while (rs.next()) {
				Object[] temp = new Object[6];
				temp[0] = rs.getInt("p_no");
				temp[1] = rs.getString("p_name");
				temp[2] = rs.getString("p_tel");
				temp[3] = rs.getString("p_mail");
				temp[4] = rs.getString("p_com");
				temp[5] = rs.getString("p_addr");
				// �� ������ �ϳ��� ���̺��� �߰��Ѵ�.
				model.addRow(temp);
			}
		} catch (Exception e) {
			System.out.println("�̸� �˻� ���� = " + e);
			e.printStackTrace();
		}
		clearText();
	}

	
	// ��ȭ��ȣ �˻� ����
	public void telProc() {
		// ����
		// ���̺� �����.
		clearTable();
		// �˻��� ��ȭ��ȣ �˾Ƴ���.
		String tel = telF.getText().trim();
		if (tel == null || tel.length() == 0) {
			return;
		}
		// �����ͺ��̽����� ������.
		// p_Tel LIKE '%0895'
		tel = "%" + tel + "%";
		try {
			telS.setString(1, tel);
			// �����Ѵ�.
			rs = telS.executeQuery();
			// ��� ����Ѵ�.
			while (rs.next()) {
				Object[] temp = new Object[6];
				temp[0] = rs.getInt("p_no");
				temp[1] = rs.getString("p_name");
				temp[2] = rs.getString("p_tel");
				temp[3] = rs.getString("p_mail");
				temp[4] = rs.getString("p_com");
				temp[5] = rs.getString("p_addr");
				// �� ������ �ϳ��� ���̺��� �߰��Ѵ�.
				model.addRow(temp);
			}
		} catch (Exception e) {
			System.out.println("��ȭ��ȣ �˻� ���� = " + e);
			e.printStackTrace();
		}
		clearText();
	}

	
	// �߰� ����
	public void addProc() {
		// 1. �Է»��ڿ� �Էµ� ������ �˾Ƴ���.
		String name = nameF.getText().trim();
		String tel = telF.getText().trim();
		String mail = mailF.getText().trim();
		String com = comF.getText().trim();
		String addr = addrF.getText().trim();
		// 2. �� ������ �����ͺ��̽����� ������.
		try {
			addS.setString(1, name);
			addS.setString(2, tel);
			addS.setString(3, mail);
			addS.setString(4, com);
			addS.setString(5, addr);
			// 3. ���Ǹ��� ����
			addS.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}
		// �ؽ�Ʈ �ʵ忡 �Է��� ������ ������.
		// ����� ����� ���������� ����� �����̹Ƿ� �Լ��� ���� ������.
		clearText();
		allProc();
	}

	
	// ���� ����
	public void modifyProc() {
		// �Է»��ڿ� �ִ� ������ �˾Ƴ���.
		String no = noF.getText().trim();
		String name = nameF.getText().trim();
		String tel = telF.getText().trim();
		String mail = mailF.getText().trim();
		String com = comF.getText().trim();
		String addr = addrF.getText().trim();
		// �����ͺ��̽��� ���� ������.
		try {
			modifyS.setString(1, tel);
			modifyS.setString(2, mail);
			modifyS.setString(3, com);
			modifyS.setString(4, addr);
			modifyS.setInt(5, Integer.parseInt(no));
			// �����Ѵ�
			modifyS.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// �ؽ�Ʈ �ʵ� �����.
		clearText();
		// ������ ����� �����ʹ�.
		allProc();
	}

	
	// ���� ����
	public void deleteProc() {
		// ������ ģ���� ��ȣ�� �˾Ƴ���.
		String no = noF.getText().trim();
		try {
			// �����ͺ��̽����� ������.
			deleteS.setInt(1, Integer.parseInt(no));
			// �����Ѵ�.
			deleteS.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// �ؽ�Ʈ�ʵ� �����.
		clearText();
		allProc();
	}


	// ���� �Լ�
	public static void main(String[] args) {
		new Phone();

	}

	
	// â�ݱ�
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

	
	// ���� �̺�Ʈ�� �������
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

	
	// ���̺����� �̺�Ʈ�� ���� ������ MouseListener�� �̿��ؼ�
	// ���콺 Ŭ���� ó���Ѵ�.
	class TableEvent extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			// ����� ���� �����ߴ��� �˾Ƴ���
			int row = table.getSelectedRow();
			if (row == -1) {
				return;
			}
			// �� ���� �����͸� �ϳ��� ������
			String no = (int) table.getValueAt(row, 0) + "";
			String name = (String) table.getValueAt(row, 1);
			String tel = (String) table.getValueAt(row, 2);
			String mail = (String) table.getValueAt(row, 3);
			String com = (String) table.getValueAt(row, 4);
			String addr = (String) table.getValueAt(row, 5);
			// ���� �ؽ�Ʈ �ʵ忡 ����Ѵ�.
			noF.setText(no);
			nameF.setText(name);
			telF.setText(tel);
			mailF.setText(mail);
			comF.setText(com);
			addrF.setText(addr);
		}
	}
  
}