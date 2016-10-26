package P_0623;

import java.io.*;
import java.net.*;
import java.util.*;

// ������ ������ Ŭ���̾�Ʈ�� ��ȭ�� ó���� �������� ���α׷���
// �־�� �Ѵ�.
public class ClientThread extends Thread {
	// �� Ŭ������ ���� �ִ� ���� Ŭ�����ϰ� ����� �� �ʿ䰡 �ִ�.
	// �� �����ִ� ���� Ŭ������ ������ ����ؾ� �� ���̴�.
	ChatServer main;
	// �� Ŭ������ Ŭ���̾�Ʈ�ϰ� ��ȭ�� �õ��ϱ� ���� ����� Ŭ����
	// �ʼ� ����
	Socket socket;
	PrintWriter pw;
	BufferedReader br;
	// ���� ����
	// ���� ��ȭ���� Ŭ���̾�Ʈ�� ������ �ʿ��ϴٸ� ����Ѵ�.
	String ip;

	public ClientThread(ChatServer m, Socket s) throws Exception {
		// ChatServer m ����Ŭ�����ϰ� ����� �Ϸ��� ������ �ּҸ�
		// �޾ƾ� ������
		main = m;
		// Socket s ��Ŭ������ Ŭ���̾�Ʈ�ϰ� ����ϱ����� ��������
		// ���� Ŭ�����̴�.
		// �׷��Ƿ� ����� �Ϸ��� Socket�� �־�� �ϴµ�
		// �� Socket�� accept()�ϴ� ���� ����ڸ� ������ ������ �������Ƿ�
		// �װ��� �޾ƾ� ����� �����ϴ�.

		// throws Exception �ϴ� ����?
		// �� ������ �ȿ��� �� ���� Ŭ���̾�Ʈ�ϰ� ����� �� �غ� �� �����̴�.
		// (��Ʈ�� ���� ����)
		// �ٵ� ��Ʈ���� ����ٰ� �����ϸ� �� Ŭ������ ���� �ƹ��ϵ� �� �� ����.
		// �׷��� �߰��� ������ �����ϸ� �ƿ� ��Ŭ������ ������ ���ϵ���
		// �ϱ� ���ؼ��̴�.
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
		// �ٸ� Ŭ���̾�Ʈ���� �ִ� ������ �����.
		String msg = "[" + ip + "]�� : " + data;
		// ������ ��� Ŭ���̾�Ʈ���� �� ������ �����Ѵ�.
		// ��Ʈ��ũ�� �ѹ��� ���� �ѻ�����Ը� ������ �� �� �ִ�.
		// ���� ������ Ŭ���̾�Ʈ�� ���� Ȯ���Ѵ�.
		synchronized (main.clientList) { // ����� �ְ� ����������
			// �� ������ ������ �� ���������� ������ �ȵǱ� ������
			// ����ȭ�� ���״�.
			int size = main.clientList.size();
			for (int i = 0; i < size; i++) {
				// �ѻ���� ������.
				ClientThread temp = (ClientThread) main.clientList.get(i);
				temp.pw.println(msg);
				temp.pw.flush();
			}
		}
	}

	public void run() {
		// �����尡 ���۵Ǹ� �� �Լ��� ����ȴ�.
		// �� �Լ����� ����
		// �� ���α׷� ������ Ŭ���̾�Ʈ�� �� ��ȭ������ �޾Ƽ�
		// ������ ��� Ŭ���̾�Ʈ���� �����Ѵ�.
		try {
			while (true) {
				// ��� ��ȭ�� ������� �𸣹Ƿ� ���ѷ���
				String msg = br.readLine();
				if (msg == null) {
					// ���� ������ �ִ� ���̹Ƿ� �����带 �����Ѵ�.
					break;
				}
				// ���� ���� ��Ȱ�� ������ ��� Ŭ���̾�Ʈ���� �����ϳ�.
				sendData(msg);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// �� �κ��� ����ȴٴ� ���� ��ȭ ���൵�� ������ ����ٴ� ���̴�.
			// �ַ� Ŭ���̾�Ʈ�� ������ �����ϸ� �̹����� �����.
			// ���� �� Ŭ������ ���� ����ϸ� �ȵǴ� Ŭ������ �ȴ�.
			// �׷��Ƿ� ������ Ŭ���̾�Ʈ ����Ʈ���� ���־���Ѵ�.
			main.clientList.remove(this);
		}
	}
}