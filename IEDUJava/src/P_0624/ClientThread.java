package P_0624;

// 각각의 클라이언트와 독립적으로 통신할 클래스를 제작해야 한다.
import java.io.*;
import java.net.*;

class ClientThread extends Thread {
	RoomChatServer main;
	// 이클래스는 클라이언트와 통신할 목적으로 만든느 클래스이므로..
	// 필수변수 통신할 준비를 해야한다.
	Socket socket;
	PrintWriter pw;
	BufferedReader br;
	// 이 스레드는 각각 한사람의 클라이언트와 통신하므로
	// 상대방의 정보를 알고 있으면 작업에 도움이 될 것이다.
	// 선택변수 정보를 기억할 변수
	String ip;
	String nick = "이름";
	String room = "대기방";

	// 생성자 함수
	// 파라미터 1. 메인과 통신할 주소를 받아야한다.
	// 2. 통신을 위해서는 소켓이 필요한데...
	// 소켓은 접속을 하면 대기 소켓이 배정했으므로
	// 이 소켓을 받아서 사용해야 한다.
	public ClientThread(RoomChatServer m, Socket s) throws Exception {
		// 파라메터를 준비된 변수에 기억한다.
		main = m;
		socket = s;
		// 통신을 위해서 스트림 준비를 한다.
		InputStream is = socket.getInputStream();
		OutputStream os = socket.getOutputStream();
		pw = new PrintWriter(os);
		InputStreamReader temp = new InputStreamReader(is);
		br = new BufferedReader(temp);

		// 선택변수를 세팅
		InetAddress addr = socket.getInetAddress();
		ip = addr.getHostAddress();
	}

	public void nickProc(String msg) {
		// 이 클라이언트의 정보를 기억한다.
		nick = msg;
		// 다시 클라이언트에게 잘 받았다고 알려준다.
		String sendMsg = "2101" + nick;
		try {
			pw.println(sendMsg);
			pw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterProc(String msg) {
		// 정보를 기억
		room = msg;
		// 방입장 메세지
		String sendMsg = "2201" + room;
		try {
			pw.println(sendMsg);
			pw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void exitProc(String msg) {
		// 정보를 원래대로 만든다.
		room = "대기방";
		// 방퇴장 메세지
		String sendMsg = "2202" + room;
		try {
			pw.println(sendMsg);
			pw.flush();
		} catch (Exception e) {
			e.printStackTrace();
			
		}

	}

	public void sendProc(String msg) {
		// 접속한 클라이언트 중에서 동일한 방에 있는 사람에게
		// 데이터를 보낸다
		String sendMsg = "2301" + "[" + nick + "]님 말씀 : " + msg;
		// 접속한 클라이언트 마다 하나씩 비교해서 자신과 똑같은 방에 있는지
		// 찾아서 처리한다.
		synchronized (main.clientList) {
			int size = main.clientList.size();
			for (int i = 0; i < size; i++) {
				// 한사람씩 꺼내서
				ClientThread t = (ClientThread) main.clientList.get(i);
				// 같은 방인지 비교한다.
				if (this.room.equals(t)) {
					// 같으면 이친구에게 보내면 된다.
					t.pw.println(sendMsg);
					t.pw.flush();
				}
			}
		}

	}

	public void run() {
		try {
			while (true) {
				// 클라이언트가 보내준 데이터 받는다
				String temp = br.readLine();
				if (temp == null || temp.length() == 0) {
					break;
				}
				// 필요한 작업한다.
				// 1. 프로토콜 부분과 데이터부분을 분리한다.
				String protocol = temp.substring(0, 4);
				String msg = temp.substring(4);
				int intP = Integer.parseInt(protocol);
				// 2. 프로토콜에 따라서 처리하는 방식이 달라지므로
				switch (intP) {
				case 1101: // 닉네임 보냈어요
					nickProc(msg);
					break;
				case 1201: // 방입장 허락해주세요
					enterProc(msg);
					break;
				case 1202: // 방퇴장 허락해주세요
					exitProc(msg);
					break;
				case 1301: // 일반대화내용
					sendProc(msg);
					break;
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 이 클라이언트에게 문제가 생긴것이다.(주로 접속을 단절하면)
			// 사용하더너 외부장치와 닫는다.
			try {
				br.close();
				pw.close();
				socket.close();
			} catch (Exception e2) {
				e2.printStackTrace();
				// 클라이언트 목록에서 스스로 빠진다.
				main.clientList.remove(this);
			}
		}

	}
}
