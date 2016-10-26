package P_0624;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChatCard extends JPanel {
	RoomChatClient main;
	JTextArea area;
	JScrollPane sp;
	JTextField field;
	JButton sendB, exitB;

	public ChatCard(RoomChatClient m) {
		main = m;
		area = new JTextArea();
		area.setBackground(Color.pink);
		sp = new JScrollPane(area);

		field = new JTextField();
		field.setBackground(Color.yellow);
		sendB = new JButton("��ȭ�ϱ�");
		exitB = new JButton("�����ϱ�");

		ChatEvent evt = new ChatEvent();
		field.addActionListener(evt);
		sendB.addActionListener(evt);
		exitB.addActionListener(evt);

		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p1.add(exitB);

		JPanel p2 = new JPanel(new BorderLayout());
		p2.add("Center", field);
		p2.add("East", sendB);

		this.setLayout(new BorderLayout());
		this.add("North", p1);
		this.add("Center", sp);
		this.add("South", p2);
	}

	public void sendMsg() {
		// ��ȭ���� �ľ�
		String temp = field.getText().trim();
		if (temp == null || temp.length() == 0) {
			return;
		}
		// ������ ������.
		String msg = "1301" + temp;
		try {
			main.pw.println(msg);
			main.pw.flush();
		} catch (Exception e) {
			e.printStackTrace();

		}
		// ������ ��ȭ�� ���ؼ� �ؽ�Ʈ �ʵ带 �����.
		field.setText("");
	}

	public void exitProc() {
		// �������� �����ϰ��ʹٰ� �˷��ش�.
		String msg = "1202" + main.room;
		try {
			main.pw.println(msg);
			main.pw.flush();
		} catch (Exception e) {
		}
	}

	class ChatEvent implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// �̹����� ���� �ؽ�Ʈ�ʵ�� ���߿� ��� �̺�Ʈ�� ����� �����̴�.
			Object target = e.getSource();
			if (target instanceof JTextField) {
				sendMsg();
			} else if (target instanceof JButton) {
				// ���ߵ� 2���� �־ �����ؾ��Ѵ�.
				JButton temp = (JButton) target;
				if (temp == sendB) {
					sendMsg();
				} else if (temp == exitB) {
					exitProc();
				}
			}
		}
	}
}