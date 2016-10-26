package P_0623;

import java.net.*;
import java.io.*;
public class PingClient {

	public PingClient() {
		// Ŭ���̾�Ʈ�� �ʿ��ϸ� ������ ������ �õ��Ѵ�.
		Socket socket = null;
		try {
			socket = new Socket("192.168.56.28", 7777);
			// 192.168.56.181 �ý��ۿ� �ִ� 7777�� ���α׷��� ������ �õ��Ѵ�.
			
			// �� ���α׷��� ������ Ŭ���̾�Ʈ�� �������� ���� ������ ������ �Ѵ�.
			// �����͸� �ְ� �ް��� �ϸ� ��Ʈ���� �ʿ��ϴ�.
			// ��Ʈ���� �ʼ��� Ÿ�ٽ�Ʈ���� �־�� �ϰ� �ʿ��ϸ�
			// ���Ϳ� ������ �� �ִ�.
			InputStream is = socket.getInputStream();
			// ��Ʈ���� �ܹ����̱� ������ �ְ� �ޱ� ���� ��Ʈ���� �ϳ��� �ʿ�
			OutputStream os = socket.getOutputStream(); 
			// PrintWriter�� BufferedReader�� ����� �����̴�.
			PrintWriter pw = new PrintWriter(os);
			// �����
			InputStreamReader temp = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(temp);
			// ���� �������� �����͸� ������
			pw.println("���� �ʿ��� �����͸� ������");
			pw.flush();
			// ���� ������ �����ϴ� �����͸� ����
			String data = br.readLine();
			System.out.println("������ �� ������ = " +  data);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new PingClient();

	}

}