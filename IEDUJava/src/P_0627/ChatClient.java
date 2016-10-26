package P_0627;

import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import GUI.*;

public class ChatClient extends JFrame {
	public LoginCard lCard;
	public NickCard nCard;
	public ChatCard cCard;
	public DownloadDlg dDlg;

	// ���� 3���� ī�带 ī�� ��ġ�������� ����� ���ؼ��� JFrame����
	// ī�� ���̾ƿ��� ������ ���ϹǷ� �߰��� Panel�� �̿��ؼ� ó���ؾ� �Ѵ�.
	public JPanel mainP;
	public CardLayout card;

	// ��Ʈ��ũ ó���� ���� ����
	public Socket socket;
	public ObjectInputStream ois;
	public ObjectOutputStream oos;

	// ������ �� Ŭ���̾�Ʈ�� ������ ����� �غ� ����.
	public String nick;
	public String room;

	public ChatClient() {
		this.addWindowListener(new CloseEvent());
		lCard = new LoginCard(this);
		nCard = new NickCard(this);
		cCard = new ChatCard(this);

		mainP = new JPanel(card = new CardLayout());
		mainP.add(lCard, "LOGIN");
		mainP.add(nCard, "NICK");
		mainP.add(cCard, "CHAT");

		this.add(mainP);

		this.setSize(500, 700);
		this.setResizable(false);
		this.setVisible(true);

		// ���� ������ ������ �õ��Ѵ�.
		try {
			socket = new Socket("192.168.56.28", 8888);
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			// �ڡ�
			// �̶��� �ٸ� ��Ʈ���� �ٸ��� ����� ������ �ſ� �߿��ѵ�
			// �ݵ�� ���� Output�� ����� ���߿� Input�� ������ �Ѵ�.
			oos = new ObjectOutputStream(os);
			ois = new ObjectInputStream(is);
			
			// ���� ��� �غ� �Ϸ�Ǿ������� ������ �� �����͸�
			// ���� �� �������̴�.
			ReceiveThread t = new ReceiveThread(this);
			t.start();
		} catch (Exception e) {
			e.printStackTrace();
			// ���α׷��� �����ϱ� ������ ����ϴ� �ڿ��� �ݾ��־�� �Ѵ�.
			closeProc();

		}
	}

	// ����ϴ� �ڿ��� �ݾ��ִ� �Լ�
	public void closeProc() {
		try {
			ois.close();
			oos.close();
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		new ChatClient();

	}

	class CloseEvent extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			closeProc();
		}
	}

}