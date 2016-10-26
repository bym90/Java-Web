package P_0623;

import java.io.*;
import java.net.*;
import java.util.*;

public class ChatServer {
	ServerSocket server;
	// 서버 입장에서는 자신에게 접속한 클라이언트의 정보를 
	// 관리하고 있어야할 것이다.
	ArrayList clientList;
	public ChatServer() {
		try {
			// 대기를 전담할 소켓
			server = new ServerSocket(7788);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("서버 소켓 에러 = " + e);
		}
		// try { // 1번에서 try를 잡게되면 누군가가 접속오류가 
		// 나게되면 프로그램이 종료되기 떄문에 2번으로 해야된다
		System.out.println("접속 대기");
		while (true) {
			// 접속을 대기하도록 한다.
			try { // 2번
				Socket socket = server.accept();
				// 누군가가 접속을 하면
				// 이 클라이언트를 담당할 스레드를 시작한다.
				ClientThread t = new ClientThread(this, socket);
				t.start();
				
				// 서버는 접속한 클라이언트의 정보를 기억하도록 약속했다.
				// 지금 대화하는 클라이언트의 정보를 ArrayList에 기억하자.
				clientList.add(t);
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("접속중 에러 = " + e);
			}
		}
	}

	public static void main(String[] args) {
		new ChatServer();

	}

}
