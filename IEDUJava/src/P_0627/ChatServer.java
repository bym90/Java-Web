package P_0627;

import java.io.*;
import java.net.*;
import java.sql.*;
import SQL.*;
import java.util.*;

public class ChatServer {
	// ���� ���� �غ�
	public ServerSocket server;
	// ������ Ŭ���̾�Ʈ ������ ���� �÷��� �غ�
	public ArrayList clientList;
	// ������ ���̽� ó���� �����غ�
	public MyJDBC db;
	public Connection con;
	public PreparedStatement loginS;
	public ResultSet rs;

	// ������Ʈ������ Ŭ���̾�Ʈ�� �����ͺ��̽��� ������� ���ϰ� �ϰ�
	// �����ͺ��̽��� �ʿ��ϸ� ������ ��û�� �ؼ�
	// ������ �ʿ��� ����� �� �����ϴ� ������� ó���ؾ� �Ѵ�.
	// ���� Ŭ���̾�Ʈ�� ���� �����ͺ��̽��� ����� �� �ֵ��� �ع�����
	// ������ �����Ǿ� �����Ƿ� 10���� Ŭ���̾�Ʈ �̿ܿ��� ���α׷���
	// ����� �� ���� �ȴ�.
	public ChatServer() {
		try {
			// ���� ���� �����
			server = new ServerSocket(8888);
			// Ŭ���̾�Ʈ ������ ����� �غ� �Ѵ�.
			clientList = new ArrayList();
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}

		// Ŭ���̾�Ʈ�� ��û�� ���� �����ͺ��̽��� ����� �غ� �Ѵ�.
		try {
			db = new MyJDBC(); // ����̹� �ε�
			con = db.getCon(); // ���ӽõ�
			// ���� ������ ������ ������Ʈ��Ʈ �ۼ�
			String sql = "select * from member where id=? and pw=?";
			loginS = db.getPstmt(sql, con);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
		System.out.println("������");
		while (true) {
			try {
				Socket socket = server.accept();
				// ������ �Ǹ� �ش� Ŭ���̾�Ʈ�� ����� �����带 ����� �־���Ѵ�
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