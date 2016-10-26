package P_0623;

import java.io.*;
import java.net.*;

public class PingServer {

	public PingServer() {
		ServerSocket server = null;
		try {
			server = new ServerSocket(7777);
			// ���� �� ������ 7777�� ��Ʈ�� �����°͸� ó����
			// �����̴�.

			// ������ ����ϵ��� �Ѵ�.
			System.out.println("���� �����");
			while (true) {
				Socket socket = server.accept();
				// �� �Լ��� Blocking �Լ��̴�. �ڽ��� ���� ��Ģ�� �������� ������
				// ������� �ʴ� �Լ��� Blocking �Լ��̴�.
				// �������� ������ �ϴ� ���� �� �Լ��� ����ȴ�.
				System.out.println("������ ����");

				// ������ ���� ������ ����� ����� �� �ְ� �Ǿ���.
				// �������� ����� �ϱ� ���ؼ��� ��Ʈ���� �ʿ��ϴ�.
				// �׷��� Ŭ���̾�Ʈ�� ���������� ��Ʈ���� ����� ����.
				InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream();
				PrintWriter pw = new PrintWriter(os);
				// �ݵ�� Ŭ���̾�Ʈ�� ������ ��Ʈ���� ���� �ʿ�� ����.
				// �����
				InputStreamReader temp = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(temp);

				// �� ���α׷��� Ư¡�� Ŭ���̾�Ʈ�� �� �����͸� ���� �ް�
				// �� �����͸� �����ؼ� Ŭ���̾�Ʈ���� �����ϸ� �ȴ�.

				String data = br.readLine();
				System.out.println("Ŭ���̾�Ʈ�� �� ������ = " + data);
				data = "[����]" + data;
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