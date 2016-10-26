package P_0627;

import java.io.*;
import java.net.*;
import java.sql.*;
import SQL.*;
import java.util.*;

public class ChatServer {
	// 대기용 소켓 준비
	public ServerSocket server;
	// 접속한 클라이언트 관리를 위한 컬렉션 준비
	public ArrayList clientList;
	// 데이터 베이스 처리를 위한준비
	public MyJDBC db;
	public Connection con;
	public PreparedStatement loginS;
	public ResultSet rs;

	// 프로젝트에서는 클라이언트는 데이터베이스를 사용하지 못하게 하고
	// 데이터베이스가 필요하면 서버에 요청을 해서
	// 서버가 필요한 결과를 얻어서 제공하는 방식으로 처리해야 한다.
	// 만약 클라이언트가 직접 데이터베이스를 사용할 수 있도록 해버리면
	// 세션이 한정되어 있으므로 10개의 클라이언트 이외에는 프로그램을
	// 사용할 수 없게 된다.
	public ChatServer() {
		try {
			// 서버 소켓 만들기
			server = new ServerSocket(8888);
			// 클라이언트 정보를 기억할 준비를 한다.
			clientList = new ArrayList();
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}

		// 클라이언트의 요청에 따라서 데이터베이스를 사용할 준비를 한다.
		try {
			db = new MyJDBC(); // 드라이버 로딩
			con = db.getCon(); // 접속시도
			// 질의 명령을 실행할 스테이트먼트 작성
			String sql = "select * from member where id=? and pw=?";
			loginS = db.getPstmt(sql, con);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
		System.out.println("대기시작");
		while (true) {
			try {
				Socket socket = server.accept();
				// 접속이 되면 해당 클라이언트와 통신할 스레드를 만들어 주어야한다
				ClientThread t = new ClientThread(this, socket);
				t.start();
				clientList.add(t);

			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

	public static void main(String[] args) {
		new ChatServer();

	}

}
