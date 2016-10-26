package P_0615;

/*
 * ��ȭ��ȣ �������α׷��� ������
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
		CJFrame frame = new CJFrame("��ȭ��ȣ ���� ���α׷�");
		frame.setResizable(false);
		// ���� �����
		// ���̺�
		String[] title = { "�̸�", "��ȭ��ȣ", "�̸���", "ȸ��", "�ּ�" };
		model = new DefaultTableModel(title, 0);
		table = new JTable(model);
		table.addMouseListener(new TableEvent());
		JScrollPane sp = new JScrollPane(table);

		addB = new JButton("�߰��ϱ�");
		modifyB = new JButton("�����ϱ�");
		deleteB = new JButton("�����ϱ�");
		exitB = new JButton("�����ϱ�");

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

		// �ؽ�Ʈ�ʵ�
		JLabel nameL = new JLabel("�̸�", JLabel.RIGHT);
		JLabel telL = new JLabel("��ȭ��ȣ", JLabel.RIGHT);
		JLabel mailL = new JLabel("�̸���", JLabel.RIGHT);
		JLabel comL = new JLabel("ȸ��", JLabel.RIGHT);
		JLabel addrL = new JLabel("�ּ�", JLabel.RIGHT);

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
		// ���� �������� ũ��� ����� ���ؼ� ������������
		JPanel westP = new JPanel(new FlowLayout());
		westP.add(p3);

		JLabel logoL = new JLabel(new ImageIcon("src/P_0615/����.jpg"));
		p3.add("South", logoL);

		frame.add("Center", sp);
		frame.add("South", southP);
		frame.add("West", westP);

		frame.setSize(700, 400);
		frame.setVisible(true);
	}

	public void deleteProc(){
		// 1. ������ ���� �˾Ƴ���.
		int row = table.getSelectedRow();
		if(row == -1){
			return;
		}
		// 2. �� ���� �����Ѵ�(����� ���ϹǷ� model)
		model.removeRow(row);
		
		deleteField();
	}
	
	public void modifyProc(){
		// 1. �ؽ�Ʈ �ʵ��� ������ �˾Ƴ���
		String name = nameF.getText().trim();
		if (name == null || name.length() == 0) {
			return;
		}
		String tel = telF.getText().trim();
		String mail = mailF.getText().trim();
		String com = comF.getText().trim();
		String addr = addrF.getText().trim();
		// 2. �� ������ ������ ���� �������� �����Ѵ�.
		// 	  �����͸� �����ϴ� ���� ��� ������ �ƴϴ�.
		//    �� �Լ��� table���� ã�ƾ��Ѵ�.
		int row = table.getSelectedRow();
		if(row == -1){
			return;
		}
		table.setValueAt(name, row, 0);
		table.setValueAt(tel, row, 1);
		table.setValueAt(mail, row, 2);
		table.setValueAt(com, row, 3);
		table.setValueAt(addr, row, 4);
		// 3. �ʵ��� ������ �����.
		deleteField();
	}
	
	// ���������� ���� ����ϴ� �ؽ�Ʈ �ʵ� ���� ����� �����
	// �Լ��� ���� �������.
	public void deleteField() {
		nameF.setText("");
		telF.setText("");
		mailF.setText("");
		comF.setText("");
		addrF.setText("");
	}

	public void addProc() {
		// 1. �ؽ�Ʈ �ʵ忡 �Է��� ������ �˾Ƴ���.
		String name = nameF.getText().trim();
		// ���� �ʼ� �Է� �׸��� �ִٸ� �Էµ��� ���� ��� �߰� �۾��� �ߴ��ؾ� �Ѵ�.
		// ���Ἲ �˻�
		if (name == null || name.length() == 0) {
			// name.length() == 0 || name == null �̶�� �ϸ� �ȵȴ�.
			// name�� null�λ��¿��� name.length() �Լ� ȣ�� ���� ����
			// name�� �ּҰ� ���� �����̱� �����̴�.
			return;
		}
		String tel = telF.getText().trim();
		String mail = mailF.getText().trim();
		String com = comF.getText().trim();
		String addr = addrF.getText().trim();
		// 2. �� ������ ���̺��� �߰��Ѵ�.
		String[] data = { name, tel, mail, com, addr };
		model.addRow(data);
		
		// 3. �ؽ�Ʈ �ʵ忡 �Է��� ������ �ڵ����� ������.
		deleteField();
	}

	public static void main(String[] args) {
		new Tel_01();

	}

	class ButtonEvent implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton target = (JButton) e.getSource();
			if (target == addB) {
				// �̰����� �߰��۾��� �ϸ�Ǵµ� �� ������ �����ϹǷ�
				// �Լ��� ���� ���� ó���� �����̴�.
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

	// ���̺��� Ŭ���ϴ� �̺�Ʈ�� ����.
	// ���� �Ϲ� Ŭ���̺�Ʈ�� �̿��ؼ� ó���ϵ��� �Ѵ�.
	class TableEvent extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			// ������ ���� ���° ������ �˾Ƴ���.
			// getSelecteRow();
			int row = table.getSelectedRow();
			if (row == -1) {
				return;
			}
			// �� ���� ������ �ϳ��� �˾Ƴ���.
			// getValueAt(int row, int column)
			String name = (String) table.getValueAt(row, 0);
			String tel = (String) table.getValueAt(row, 1);
			String mail = (String) table.getValueAt(row, 2);
			String com = (String) table.getValueAt(row, 3);
			String addr = (String) table.getValueAt(row, 4);
			// �� ������ ���� �ؽ�Ʈ �ʵ忡 �Է�
			nameF.setText(name);
			telF.setText(tel);
			mailF.setText(mail);
			comF.setText(com);
			addrF.setText(addr);
		}
	}
}