package P_0627;

import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import GUI.*;

public class ChatClient extends JFrame {
	public LoginCard lCard;
	public NickCard nCard;
	public ChatCard cCard;
	public DownloadDlg dDlg;

	// 위의 3개의 카드를 카드 배치전략으로 세우기 위해서는 JFrame에는
	// 카드 레이아웃을 만들지 못하므로 중간에 Panel을 이용해서 처리해야 한다.
	public JPanel mainP;
	public CardLayout card;

	// 네트워크 처리를 위한 변수
	public Socket socket;
	public ObjectInputStream ois;
	public ObjectOutputStream oos;

	// 지금이 이 클라이언트의 정보를 기억할 준비를 하자.
	public String nick;
	public String room;

	public ChatClient() {
		this.addWindowListener(new CloseEvent());
		lCard = new LoginCard(this);
		nCard = new NickCard(this);
		cCard = new ChatCard(this);

		mainP = new JPanel(card = new CardLayout());
		mainP.add(lCard, "LOGIN");
		mainP.add(nCard, "NICK");
		mainP.add(cCard, "CHAT");

		this.add(mainP);

		this.setSize(500, 700);
		this.setResizable(false);
		this.setVisible(true);

		// 이제 서버에 연결을 시도한다.
		try {
			socket = new Socket("192.168.56.28", 8888);
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			// ★★
			// 이때는 다른 스트림과 다르게 만드는 순서가 매우 중요한데
			// 반드시 먼저 Output을 만들고 나중에 Input을 만들어야 한다.
			oos = new ObjectOutputStream(os);
			ois = new ObjectInputStream(is);
			
			// 이제 통신 준비가 완료되었으르모 서버가 준 데이터를
			// 받을 수 있을것이다.
			ReceiveThread t = new ReceiveThread(this);
			t.start();
		} catch (Exception e) {
			e.printStackTrace();
			// 프로그램을 종료하기 전에는 사용하던 자원을 닫아주어야 한다.
			closeProc();

		}
	}

	// 사용하던 자원을 닫아주는 함수
	public void closeProc() {
		try {
			ois.close();
			oos.close();
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		new ChatClient();

	}

	class CloseEvent extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			closeProc();
		}
	}

}
