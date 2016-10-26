package P_0623;

import java.io.*;
import java.net.*;
import java.util.*;

public class ChatServer {
	ServerSocket server;
	// ���� ���忡���� �ڽſ��� ������ Ŭ���̾�Ʈ�� ������ 
	// �����ϰ� �־���� ���̴�.
	ArrayList clientList;
	public ChatServer() {
		try {
			// ��⸦ ������ ����
			server = new ServerSocket(7788);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("���� ���� ���� = " + e);
		}
		// try { // 1������ try�� ��ԵǸ� �������� ���ӿ����� 
		// ���ԵǸ� ���α׷��� ����Ǳ� ������ 2������ �ؾߵȴ�
		System.out.println("���� ���");
		while (true) {
			// ������ ����ϵ��� �Ѵ�.
			try { // 2��
				Socket socket = server.accept();
				// �������� ������ �ϸ�
				// �� Ŭ���̾�Ʈ�� ����� �����带 �����Ѵ�.
				ClientThread t = new ClientThread(this, socket);
				t.start();
				
				// ������ ������ Ŭ���̾�Ʈ�� ������ ����ϵ��� ����ߴ�.
				// ���� ��ȭ�ϴ� Ŭ���̾�Ʈ�� ������ ArrayList�� �������.
				clientList.add(t);
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("������ ���� = " + e);
			}
		}
	}

	public static void main(String[] args) {
		new ChatServer();

	}

}