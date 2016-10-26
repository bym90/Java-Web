package P_0624;

/*
 * Ŭ���̾�Ʈ�ʿ��� ���� ī�� ���̾ƿ��� �̿��ؼ� ù��° ī���
 * �г����� �Է��ϰ� �ι�°�� ���ϴ� ���� �����ؼ� ������ �� �ֵ��� �Ѵ�.
 * �ι�° ī��� ä��ȭ���� ���鿹���̴�.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import GUI.*;
import java.io.*;
import java.net.*;

public class RoomChatClient extends JFrame {
	NickCard nickC;
	ChatCard chatC;
	// JFrame���� CardLayout�� ������� �ʴ´�.
	// JFrame�ȿ� �������� JPanl�� �ִ´�.
	// JPanel�� CardLayout�� ��ġ�Ͽ� ó���Ѵ�.
	JPanel mainP;
	CardLayout card;
	BufferedReader br;

	Socket socket;
	PrintWriter pw;

	String nick = "�̸�";
	String room = "����";

	public RoomChatClient() {
		// ���ڽ��� ������ �ܺ���ġ�� �ݱ� ���ؼ�
		this.addWindowListener(new CloseEvent());

		mainP = new JPanel();
		card = new CardLayout();
		mainP.setLayout(card);

		this.add("Center", mainP);

		nickC = new NickCard(this);
		chatC = new ChatCard(this);
		mainP.add(nickC, "NICK");
		mainP.add(chatC, "CHAT");
		this.setSize(400, 600);
		this.setVisible(true);

		// ���� ȭ���� �ϼ��Ǿ����Ƿ� ��Ʈ��ũ�� ��������.
		try {
			// �������� �����ϸ� ������ ������ �Ѵ�.
			socket = new Socket("192.168.56.188", 8877);
			// ����� �ϱ� ���ؼ� ��Ʈ���� �غ�Ǿ�� �Ѵ�.
			// �ʼ� Ÿ��
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			// ���� ����
			pw = new PrintWriter(os);
			InputStreamReader temp = new InputStreamReader(is);
			br = new BufferedReader(temp);

			// ���� ������� ���������� ��Ʈ��ũ�� �����Ȱ��̴�.
			// �׷��Ƿ� ������ ������ �����͸� ������ �������̴�.
			ReceiveThread t = new ReceiveThread(this);
			t.start();

		} catch (Exception e) {
			e.printStackTrace();
			closeProc();
			System.exit(0);
		}
	}

	// �� ���α׷��� ����Ǳ������� ����ϴ� ��Ʈ���� ������ �ݾ��־�� �Ѵ�.
	// �ݱ⸦ ����� �Լ��� �����.
	public void closeProc() {
		try {
			if (pw != null) {
				pw.close();
			}
			if (br != null) {
				br.close();
			}
			if (socket != null) {
				socket.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// x ���߸� ������ ���α׷��� ����Ǿ�� �Ѵ�.
	public class CloseEvent extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			closeProc();
			System.exit(0);
		}

	}

	public static void main(String[] args) {
		new RoomChatClient();
	}

}