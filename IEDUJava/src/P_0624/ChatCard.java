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
		sendB = new JButton("대화하기");
		exitB = new JButton("퇴장하기");

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
		// 대화내용 파악
		String temp = field.getText().trim();
		if (temp == null || temp.length() == 0) {
			return;
		}
		// 서버로 보낸다.
		String msg = "1301" + temp;
		try {
			main.pw.println(msg);
			main.pw.flush();
		} catch (Exception e) {
			e.printStackTrace();

		}
		// 다음번 대화를 위해서 텍스트 필드를 지운다.
		field.setText("");
	}

	public void exitProc() {
		// 서버에게 퇴장하고싶다고 알려준다.
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
			// 이번에도 역시 텍스트필드와 단추에 모두 이벤트를 사용할 예정이다.
			Object target = e.getSource();
			if (target instanceof JTextField) {
				sendMsg();
			} else if (target instanceof JButton) {
				// 단추도 2개가 있어서 구분해야한다.
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