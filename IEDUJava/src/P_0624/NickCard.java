package P_0624;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NickCard extends JPanel {
	RoomChatClient main;
	JTextField nickField; // �г����� �Է��� �ʵ�
	JComboBox roomBox; // ���� ������ �޺�����
	JButton enterB; // �������� �õ��� ����

	public NickCard(RoomChatClient m) {
		main = m;
		JLabel nickL = new JLabel("�г���");
		JLabel roomL = new JLabel("�漱��");

		nickField = new JTextField();
		roomBox = new JComboBox();
		roomBox.addItem("�ڹٹ�");
		roomBox.addItem("�������͹�");
		roomBox.addItem("302ȣ��");

		JPanel p1 = new JPanel(new GridLayout(2, 1));
		p1.add(nickL);
		p1.add(roomL);

		nickField = new JTextField();
		roomBox = new JComboBox();
		// ó������ �������� ���ϰ� �س��� ���߿� �г����� ���۵Ǹ�
		// �׶� ����� �� �ֵ��� ��ġ�غ��ڴ�.
		roomBox.setEnabled(false);
		roomBox.addItem("�ڹٹ�");
		roomBox.addItem("�������͹�");
		roomBox.addItem("302ȣ��");

		JPanel p2 = new JPanel(new GridLayout(2, 1));
		p2.add(nickField);
		p2.add(roomBox);

		enterB = new JButton("������");
		NickEvent evt = new NickEvent();
		nickField.addActionListener(evt);
		enterB.addActionListener(evt);

		JPanel p3 = new JPanel(new GridLayout(2, 1));
		p3.add(new JLabel("    "));
		p3.add(enterB);

		JPanel p4 = new JPanel(new BorderLayout());
		p4.add("West", p1);
		p4.add("Center", p2);
		p4.add("East", p3);

		this.setLayout(new BorderLayout());
		this.add("South", p4);
	}

	public void nickSend() {
		// �г����� �˾Ƴ���.
		String nick = nickField.getText().trim();
		if (nick == null || nick.length() == 0) {
			return;
		}
		// ������ �����͸� �����ϱ� ���� �ݵ�� �������� �ǹ̸�
		// �����ϴ� ��ӵ� ���������� �ٿ��� �����Ѵ�.
		String msg = "1101" + nick;
		// �����Ѵ�.
		try {
			main.pw.println(msg);
			main.pw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void roomSend() {
		// ������ ���� �˾Ƴ���
		String room = (String) roomBox.getSelectedItem();
		// ������ �� �̸��� ������.
		String msg = "1201" + room;
		try {
			main.pw.println(msg);
			main.pw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	class NickEvent implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// �� �̺�Ʈ �Լ��� �г����� �Է��ϰ� ����Ű�� ġ�� ����
			// ������ ���߸� ������ �� �Լ��� ����ȴ�.
			// �����ؼ� ó���ؾ��Ѵ�.
			Object target = e.getSource();
			if (target instanceof JTextField) {
				nickSend();
			} else if (target instanceof JButton) {
				roomSend();
			}
		}
	}
}