package P_0627;
import NetData.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import GUI.*;

public class NickCard extends JPanel {
	public JTextField nickF;
	public JComboBox roomBox;
	public JButton nickB, enterB;
	ChatClient main;

	public NickCard(ChatClient m) {
		main = m;
		this.setLayout(new BorderLayout());

		JLabel nickL = new JLabel("닉네임");
		JLabel roomL = new JLabel("방선택");
		nickF = new JTextField();
		roomBox = new JComboBox();
		roomBox.setEnabled(false);
		roomBox.addItem("자바방");
		roomBox.addItem("경영기술개발원방");
		roomBox.addItem("302방");

		nickB = new JButton("닉네임 전송");
		enterB = new JButton("방 입장하기");
		enterB.setEnabled(false);
		
		ButtonEvent	evt = new ButtonEvent();
		nickB.addActionListener(evt);
		enterB.addActionListener(evt);

		JPanel p1 = new JPanel(new GridLayout(2, 1));
		p1.add(nickL);
		p1.add(roomL);

		JPanel p2 = new JPanel(new GridLayout(2, 1));
		p2.add(nickF);
		p2.add(roomBox);

		JPanel p3 = new JPanel(new GridLayout(2, 1));
		p3.add(nickB);
		p3.add(enterB);

		JPanel p4 = new JPanel(new BorderLayout());
		p4.add("West", p1);
		p4.add("Center", p2);
		p4.add("East", p3);

		this.add("South", p4);

		// this.setSize(500, 700);
		// this.setVisible(true);
	}

	// public static void main(String[] args) {
	// new NickCard();
	//
	// }
	
	public void nickProc(){
		String nick = nickF.getText();
		if(nick == null || nick.length() == 0){
			return;
		}
		// 서버에게 보낸다.
		MainData data = new MainData();
		data.protocol = 1201;
		ChatData  temp = new ChatData();
		temp.nick = nick;
		data.cData = temp;
		try {
			main.oos.writeObject(data);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void enterProc(){
		// 입장할 방을 알아낸다
		String room = (String) roomBox.getSelectedItem();
		if(room == null || room.length() == 0){
			return;
		}
		MainData data = new MainData();
		data.protocol = 1301;
		ChatData temp = new ChatData();
		temp.room = room;
		data.cData = temp;
		try {
			main.oos.writeObject(data);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	class ButtonEvent implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// 이 화면에서는 단추가 2개 있으므로 구분해서 처리해야 한다.
			JButton target = (JButton) e.getSource();
			if (target == nickB) {
				// 닉네임
				nickProc();
			} else {
				// 방 입장하기
				enterProc();
			}
		}
	}
}
