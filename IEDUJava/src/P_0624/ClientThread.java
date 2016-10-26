package P_0624;

// ������ Ŭ���̾�Ʈ�� ���������� ����� Ŭ������ �����ؾ� �Ѵ�.
import java.io.*;
import java.net.*;

class ClientThread extends Thread {
	RoomChatServer main;
	// ��Ŭ������ Ŭ���̾�Ʈ�� ����� �������� ����� Ŭ�����̹Ƿ�..
	// �ʼ����� ����� �غ� �ؾ��Ѵ�.
	Socket socket;
	PrintWriter pw;
	BufferedReader br;
	// �� ������� ���� �ѻ���� Ŭ���̾�Ʈ�� ����ϹǷ�
	// ������ ������ �˰� ������ �۾��� ������ �� ���̴�.
	// ���ú��� ������ ����� ����
	String ip;
	String nick = "�̸�";
	String room = "����";

	// ������ �Լ�
	// �Ķ���� 1. ���ΰ� ����� �ּҸ� �޾ƾ��Ѵ�.
	// 2. ����� ���ؼ��� ������ �ʿ��ѵ�...
	// ������ ������ �ϸ� ��� ������ ���������Ƿ�
	// �� ������ �޾Ƽ� ����ؾ� �Ѵ�.
	public ClientThread(RoomChatServer m, Socket s) throws Exception {
		// �Ķ���͸� �غ�� ������ ����Ѵ�.
		main = m;
		socket = s;
		// ����� ���ؼ� ��Ʈ�� �غ� �Ѵ�.
		InputStream is = socket.getInputStream();
		OutputStream os = socket.getOutputStream();
		pw = new PrintWriter(os);
		InputStreamReader temp = new InputStreamReader(is);
		br = new BufferedReader(temp);

		// ���ú����� ����
		InetAddress addr = socket.getInetAddress();
		ip = addr.getHostAddress();
	}

	public void nickProc(String msg) {
		// �� Ŭ���̾�Ʈ�� ������ ����Ѵ�.
		nick = msg;
		// �ٽ� Ŭ���̾�Ʈ���� �� �޾Ҵٰ� �˷��ش�.
		String sendMsg = "2101" + nick;
		try {
			pw.println(sendMsg);
			pw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterProc(String msg) {
		// ������ ���
		room = msg;
		// ������ �޼���
		String sendMsg = "2201" + room;
		try {
			pw.println(sendMsg);
			pw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void exitProc(String msg) {
		// ������ ������� �����.
		room = "����";
		// ������ �޼���
		String sendMsg = "2202" + room;
		try {
			pw.println(sendMsg);
			pw.flush();
		} catch (Exception e) {
			e.printStackTrace();
			
		}

	}

	public void sendProc(String msg) {
		// ������ Ŭ���̾�Ʈ �߿��� ������ �濡 �ִ� �������
		// �����͸� ������
		String sendMsg = "2301" + "[" + nick + "]�� ���� : " + msg;
		// ������ Ŭ���̾�Ʈ ���� �ϳ��� ���ؼ� �ڽŰ� �Ȱ��� �濡 �ִ���
		// ã�Ƽ� ó���Ѵ�.
		synchronized (main.clientList) {
			int size = main.clientList.size();
			for (int i = 0; i < size; i++) {
				// �ѻ���� ������
				ClientThread t = (ClientThread) main.clientList.get(i);
				// ���� ������ ���Ѵ�.
				if (this.room.equals(t)) {
					// ������ ��ģ������ ������ �ȴ�.
					t.pw.println(sendMsg);
					t.pw.flush();
				}
			}
		}

	}

	public void run() {
		try {
			while (true) {
				// Ŭ���̾�Ʈ�� ������ ������ �޴´�
				String temp = br.readLine();
				if (temp == null || temp.length() == 0) {
					break;
				}
				// �ʿ��� �۾��Ѵ�.
				// 1. �������� �κа� �����ͺκ��� �и��Ѵ�.
				String protocol = temp.substring(0, 4);
				String msg = temp.substring(4);
				int intP = Integer.parseInt(protocol);
				// 2. �������ݿ� ���� ó���ϴ� ����� �޶����Ƿ�
				switch (intP) {
				case 1101: // �г��� ���¾��
					nickProc(msg);
					break;
				case 1201: // ������ ������ּ���
					enterProc(msg);
					break;
				case 1202: // ������ ������ּ���
					exitProc(msg);
					break;
				case 1301: // �Ϲݴ�ȭ����
					sendProc(msg);
					break;
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// �� Ŭ���̾�Ʈ���� ������ ������̴�.(�ַ� ������ �����ϸ�)
			// ����ϴ��� �ܺ���ġ�� �ݴ´�.
			try {
				br.close();
				pw.close();
				socket.close();
			} catch (Exception e2) {
				e2.printStackTrace();
				// Ŭ���̾�Ʈ ��Ͽ��� ������ ������.
				main.clientList.remove(this);
			}
		}

	}
}