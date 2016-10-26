package P_0623;

import java.io.*;
import java.net.*;

public class PingServer {

	public PingServer() {
		ServerSocket server = null;
		try {
			server = new ServerSocket(7777);
			// 이제 이 서버는 7777번 포트로 들어오는것만 처리할
			// 예정이다.

			// 접속을 대기하도록 한다.
			System.out.println("서버 대기중");
			while (true) {
				Socket socket = server.accept();
				// 이 함수는 Blocking 함수이다. 자신의 정한 규칙이 만족되지 않으면
				// 실행되지 않는 함수를 Blocking 함수이다.
				// 누군가가 접속을 하는 순간 이 함수가 실행된다.
				System.out.println("누군가 접속");

				// 서버도 이제 접속한 사람과 통신할 수 있게 되었다.
				// 서버역시 통신을 하기 위해서는 스트림이 필요하다.
				// 그래서 클라이언트와 마찬가지로 스트림을 만들어 놓자.
				InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream();
				PrintWriter pw = new PrintWriter(os);
				// 반드시 클라이언트와 서버의 스트림이 같을 필요는 없다.
				// 연결관
				InputStreamReader temp = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(temp);

				// 이 프로그램의 특징상 클라이언트가 준 데이터를 먼저 받고
				// 이 데이터를 변경해서 클라이언트에게 응답하면 된다.

				String data = br.readLine();
				System.out.println("클라이언트가 준 데이터 = " + data);
				data = "[응답]" + data;
				pw.println(data);
				pw.flush();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new PingServer();

	}

}
