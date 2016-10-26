package P_0628;

import java.awt.*;
import java.awt.event.*;
import java.net.*;

import javax.swing.*;
import GUI.*;

public class SendDlg extends JDialog {
	ShortMsg main;
	TextArea area;
	JTextField whoF;
	JButton sendB, closeB;

	public SendDlg(ShortMsg m) {
		super(m);
		main = m;
		area = new TextArea();
		whoF = new JTextField();
		whoF.setEnabled(false);
		sendB = new JButton("보내기");
		closeB = new JButton("닫기");

		ButtonEvent evt = new ButtonEvent();
		sendB.addActionListener(evt);
		closeB.addActionListener(evt);

		JLabel whoL = new JLabel("받는 사람 : ");
		JPanel p1 = new JPanel(new BorderLayout());
		p1.add("West", whoL);
		p1.add("Center", whoF);

		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p2.add(sendB);
		p2.add(closeB);

		this.add("North", p1);
		this.add("Center", area);
		this.add("South", p2);

		// this.setSize(400, 400);
		// this.setVisible(true);
		//
	}
	//
	// public static void main(String[] args) {
	// new SendDlg();

	// }

	public void sendProc() {
		// 보낼내용을 Packet으로 포장해야 한다.
		// 포장을 하려면 보낼데이터 byte[]
		String msg = area.getText();
		byte[] buff = msg.getBytes();
		// 데이터의 크기
		int len = buff.length;
		// 상대방주소
		String name = whoF.getText();
		String ip = (String) main.nameToIp.get(name);
		InetAddress addr = null;
		try {
			addr = InetAddress.getByName(ip);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 상대방포트
		int port = 7878;
		DatagramPacket packet = new DatagramPacket(buff, len, addr, port);
		try {
			// 패킷이 준비되었으면 네트워크에 보내면 된다.
			main.sSocket.send(packet);
		} catch (Exception e) {
			e.printStackTrace();
		}
		closeProc();
	}

	public void closeProc() {
		this.setVisible(false);
		this.dispose();
	}

	class ButtonEvent implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton target = (JButton) e.getSource();
			if (target == sendB) {
				sendProc();
			} else {
				closeProc();
			}
		}
	}
}
