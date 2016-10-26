package P_0624;

/*
 * 클라이언트쪽에서 폼을 카드 레이아웃을 이용해서 첫번째 카드는
 * 닉네임을 입력하고 두번째는 원하는 방을 선택해서 입장할 수 있도록 한다.
 * 두번째 카드는 채팅화면을 만들예정이다.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import GUI.*;
import java.io.*;
import java.net.*;

public class RoomChatClient extends JFrame {
	NickCard nickC;
	ChatCard chatC;
	// JFrame에는 CardLayout이 적용되지 않는다.
	// JFrame안에 가득차게 JPanl을 넣는다.
	// JPanel에 CardLayout을 설치하여 처리한다.
	JPanel mainP;
	CardLayout card;
	BufferedReader br;

	Socket socket;
	PrintWriter pw;

	String nick = "이름";
	String room = "대기방";

	public RoomChatClient() {
		// 나자신이 닫히면 외부장치를 닫기 위해서
		this.addWindowListener(new CloseEvent());

		mainP = new JPanel();
		card = new CardLayout();
		mainP.setLayout(card);

		this.add("Center", mainP);

		nickC = new NickCard(this);
		chatC = new ChatCard(this);
		mainP.add(nickC, "NICK");
		mainP.add(chatC, "CHAT");
		this.setSize(400, 600);
		this.setVisible(true);

		// 이제 화면이 완성되었으므로 네트워크를 구성하자.
		try {
			// 소켓으르 생성하면 서버에 연결을 한다.
			socket = new Socket("192.168.56.188", 8877);
			// 통신을 하기 위해서 스트림이 준비되어야 한다.
			// 필수 타겟
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			// 선택 필터
			pw = new PrintWriter(os);
			InputStreamReader temp = new InputStreamReader(is);
			br = new BufferedReader(temp);

			// 이제 여기까지 성공했으면 네트워크가 구성된것이다.
			// 그러므로 서버가 보내준 데이터를 받을수 있을것이다.
			ReceiveThread t = new ReceiveThread(this);
			t.start();

		} catch (Exception e) {
			e.printStackTrace();
			closeProc();
			System.exit(0);
		}
	}

	// 이 프로그램이 종료되기전에는 사용하던 스트림과 소켓을 닫아주어야 한다.
	// 닫기를 담당할 함수를 만든다.
	public void closeProc() {
		try {
			if (pw != null) {
				pw.close();
			}
			if (br != null) {
				br.close();
			}
			if (socket != null) {
				socket.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// x 단추를 누르면 프로그램이 종료되어야 한다.
	public class CloseEvent extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			closeProc();
			System.exit(0);
		}

	}

	public static void main(String[] args) {
		new RoomChatClient();
	}

}
