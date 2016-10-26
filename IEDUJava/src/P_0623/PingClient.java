package P_0623;

import java.net.*;
import java.io.*;
public class PingClient {

	public PingClient() {
		// 클라이언트는 필요하면 서버에 접속을 시도한다.
		Socket socket = null;
		try {
			socket = new Socket("192.168.56.28", 7777);
			// 192.168.56.181 시스템에 있는 7777번 프로그램에 접속을 시도한다.
			
			// 이 프로그램의 목적상 클라이언트가 서버에게 먼저 내용을 보내야 한다.
			// 데이터를 주고 받고자 하면 스트림이 필요하다.
			// 스트림은 필수가 타겟스트림이 있어야 하고 필요하면
			// 필터와 연결할 수 있다.
			InputStream is = socket.getInputStream();
			// 스트림은 단방향이기 때문에 주고 받기 위해 스트림이 하나더 필요
			OutputStream os = socket.getOutputStream(); 
			// PrintWriter와 BufferedReader를 사용할 예정이다.
			PrintWriter pw = new PrintWriter(os);
			// 연결관
			InputStreamReader temp = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(temp);
			// 먼저 서버에게 데이터를 보낸다
			pw.println("내가 너에게 데이터를 보낸다");
			pw.flush();
			// 이제 서버가 응답하는 데이터를 받자
			String data = br.readLine();
			System.out.println("서버가 준 데이터 = " +  data);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new PingClient();

	}

}
