package P_0624;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NickCard extends JPanel {
	RoomChatClient main;
	JTextField nickField; // 닉네임을 입력할 필드
	JComboBox roomBox; // 방을 선택할 콤보상자
	JButton enterB; // 방입장을 시도할 단추

	public NickCard(RoomChatClient m) {
		main = m;
		JLabel nickL = new JLabel("닉네임");
		JLabel roomL = new JLabel("방선택");

		nickField = new JTextField();
		roomBox = new JComboBox();
		roomBox.addItem("자바방");
		roomBox.addItem("교육센터방");
		roomBox.addItem("302호방");

		JPanel p1 = new JPanel(new GridLayout(2, 1));
		p1.add(nickL);
		p1.add(roomL);

		nickField = new JTextField();
		roomBox = new JComboBox();
		// 처음에는 선택하지 못하게 해놓고 나중에 닉네임이 전송되면
		// 그때 사용할 수 있도록 조치해보겠다.
		roomBox.setEnabled(false);
		roomBox.addItem("자바방");
		roomBox.addItem("교육센터방");
		roomBox.addItem("302호방");

		JPanel p2 = new JPanel(new GridLayout(2, 1));
		p2.add(nickField);
		p2.add(roomBox);

		enterB = new JButton("방입장");
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
		// 닉네임을 알아낸다.
		String nick = nickField.getText().trim();
		if (nick == null || nick.length() == 0) {
			return;
		}
		// 오늘은 데이터를 전송하기 전에 반드시 데이터의 의미를
		// 지정하는 약속된 프로토콜을 붙여서 전송한다.
		String msg = "1101" + nick;
		// 전송한다.
		try {
			main.pw.println(msg);
			main.pw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void roomSend() {
		// 선택한 방을 알아내고
		String room = (String) roomBox.getSelectedItem();
		// 서버에 방 이름을 보낸다.
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
			// 이 이벤트 함수는 닉네임을 입력하고 엔터키를 치는 순간
			// 방입장 단추를 눌러도 이 함수가 실행된다.
			// 구분해서 처리해야한다.
			Object target = e.getSource();
			if (target instanceof JTextField) {
				nickSend();
			} else if (target instanceof JButton) {
				roomSend();
			}
		}
	}
}
