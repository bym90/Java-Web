package P_0623;

import java.io.*;
import java.net.*;
import java.util.*;

// 각각의 접속한 클라이언트와 대화를 처리할 독립적인 프로그램이
// 있어야 한다.
public class ClientThread extends Thread {
	// 이 클래스는 위에 있는 메인 클래스하고 통신을 할 필요가 있다.
	// 즉 위에있는 메인 클래스의 변수를 사용해야 할 것이다.
	ChatServer main;
	// 이 클래스는 클라이언트하고 대화를 시도하기 위해 만드는 클래스
	// 필수 변수
	Socket socket;
	PrintWriter pw;
	BufferedReader br;
	// 선택 변수
	// 지금 대화중이 클라이언트의 정보가 필요하다면 사용한다.
	String ip;

	public ClientThread(ChatServer m, Socket s) throws Exception {
		// ChatServer m 메인클래스하고 통신을 하려면 메인이 주소를
		// 받아야 함으로
		main = m;
		// Socket s 이클래스는 클라이언트하고 통신하기위한 목적으로
		// 만든 클래스이다.
		// 그러므로 통신을 하려면 Socket이 있어야 하는데
		// 이 Socket은 accept()하는 순간 담당자를 위에서 배정해 놓았으므로
		// 그것을 받아야 통신이 가능하다.

		// throws Exception 하는 이유?
		// 이 생성자 안에서 할 일은 클라이언트하고 통신을 할 준비를 할 예정이다.
		// (스트림 만들 예정)
		// 근데 스트림을 만들다가 실패하면 이 클래스는 전혀 아무일도 할 수 없다.
		// 그래서 중간에 뭔가를 실패하면 아예 이클래스를 만들지 못하도록
		// 하기 위해서이다.
		socket = s;
		InputStream is = socket.getInputStream();
		OutputStream os = socket.getOutputStream();

		pw = new PrintWriter(os);
		InputStreamReader temp = new InputStreamReader(is);
		br = new BufferedReader(temp);

		InetAddress ipa = socket.getInetAddress();
		ip = ipa.getHostAddress();
	}

	public void sendData(String data) {
		// 다른 클라이언트에게 주는 내용을 만든다.
		String msg = "[" + ip + "]님 : " + data;
		// 접속한 모든 클라이언트에게 이 내용을 전달한다.
		// 네트워크는 한번에 오직 한사람에게만 내용을 줄 수 있다.
		// 먼저 접속한 클라이언트의 수를 확인한다.
		synchronized (main.clientList) { // 사이즈를 주고 시작했으니
			// 그 사이즈 루프가 다 돌때까지는 나가면 안되기 때문에
			// 동기화를 시켰다.
			int size = main.clientList.size();
			for (int i = 0; i < size; i++) {
				// 한사람씩 꺼낸다.
				ClientThread temp = (ClientThread) main.clientList.get(i);
				temp.pw.println(msg);
				temp.pw.flush();
			}
		}
	}

	public void run() {
		// 스레드가 시작되면 이 함수가 실행된다.
		// 이 함수에서 할일
		// 이 프로그램 목적상 클라이언트가 준 대화내용을 받아서
		// 접속한 모든 클라이언트에게 전달한다.
		try {
			while (true) {
				// 몇번 대화가 진행될지 모르므로 무한루프
				String msg = br.readLine();
				if (msg == null) {
					// 뭔가 문제가 있는 것이므로 스레드를 종료한다.
					break;
				}
				// 지금 받은 대활르 접속한 모든 클라이언트에게 전달하낟.
				sendData(msg);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 이 부분이 실행된다는 말은 대화 진행도중 문제가 생겼다는 말이다.
			// 주로 클라이언트가 접속을 단절하면 이문제가 생긴다.
			// 고로 이 클래스는 이제 사용하면 안되는 클래스가 된다.
			// 그러므로 접속한 클라이언트 리스트에서 빼주어야한다.
			main.clientList.remove(this);
		}
	}
}
