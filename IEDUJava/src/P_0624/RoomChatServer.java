package P_0624;

import java.io.*;
import java.util.*;
import java.net.*;
public class RoomChatServer {
	// 필요한 변수
	// 클라이언트의 접속을 받아야 하므로 접속 전용 소켓을 준비한다.
	ServerSocket server;
	// 접속한 클라이언트를 기억해 놓아야 작업을 할때 누가 접속했는지
	// 구분이 되므로 접속한 클라이언트를 기억할 변수를 준비한다.
	ArrayList clientList;
	// 수시로 접속과 해제를 번갈아가면서 할 예정이므로
	// 추가와 삭제가 빠른 컬렉션을 준비한다.

	public RoomChatServer() {
		try {
			// 1. 대기 소켓 준비
			server = new ServerSocket(8877);
			// 2. 접속한 클라이언트를 기억할 준비를 한다.
			clientList = new ArrayList();
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
		// 3. 대기하고 있다가 접속을 받는다.
		while(true){
			try {
				// 접속이 되면 이 함수가 실행되면서 담당하는 실제 소켓을
				// 배정하게 된다.
				Socket socket = server.accept();
				// 그러면 이제 이 접속한 클라이언트와 통신을 하면된다.
				// 접속자가 여러사람이 있으므로 각자 독립적으로 통신을 해야한다.
				// 그러므로 각각의 클라이언트와 통신할 수 있는 독립적인 프로세스
				// 만들어서 사용해야한다.
				
				// 이 클라이언트와 통신할 스레드를 시작한다.
				ClientThread t = new ClientThread(this, socket);
				t.start();
				
				// 접속한 클라이언트를 관리해야 하므로 준비된 컬렉션에
				// 기억한다.
				clientList.add(t);
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new RoomChatServer();
	}
}
