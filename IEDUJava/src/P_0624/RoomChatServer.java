package P_0624;

import java.io.*;
import java.util.*;
import java.net.*;
public class RoomChatServer {
	// �ʿ��� ����
	// Ŭ���̾�Ʈ�� ������ �޾ƾ� �ϹǷ� ���� ���� ������ �غ��Ѵ�.
	ServerSocket server;
	// ������ Ŭ���̾�Ʈ�� ����� ���ƾ� �۾��� �Ҷ� ���� �����ߴ���
	// ������ �ǹǷ� ������ Ŭ���̾�Ʈ�� ����� ������ �غ��Ѵ�.
	ArrayList clientList;
	// ���÷� ���Ӱ� ������ �����ư��鼭 �� �����̹Ƿ�
	// �߰��� ������ ���� �÷����� �غ��Ѵ�.

	public RoomChatServer() {
		try {
			// 1. ��� ���� �غ�
			server = new ServerSocket(8877);
			// 2. ������ Ŭ���̾�Ʈ�� ����� �غ� �Ѵ�.
			clientList = new ArrayList();
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
		// 3. ����ϰ� �ִٰ� ������ �޴´�.
		while(true){
			try {
				// ������ �Ǹ� �� �Լ��� ����Ǹ鼭 ����ϴ� ���� ������
				// �����ϰ� �ȴ�.
				Socket socket = server.accept();
				// �׷��� ���� �� ������ Ŭ���̾�Ʈ�� ����� �ϸ�ȴ�.
				// �����ڰ� ��������� �����Ƿ� ���� ���������� ����� �ؾ��Ѵ�.
				// �׷��Ƿ� ������ Ŭ���̾�Ʈ�� ����� �� �ִ� �������� ���μ���
				// ���� ����ؾ��Ѵ�.
				
				// �� Ŭ���̾�Ʈ�� ����� �����带 �����Ѵ�.
				ClientThread t = new ClientThread(this, socket);
				t.start();
				
				// ������ Ŭ���̾�Ʈ�� �����ؾ� �ϹǷ� �غ�� �÷��ǿ�
				// ����Ѵ�.
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