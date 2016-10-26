package P_0623;

/*
 * ���� Ŭ���̾�Ʈ�� ä���� �ϱ����� ���� �־���Ѵ�.
 */
import java.io.*;
import java.net.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import GUI.*;

public class ChatClient extends CJFrame {
	JTextArea area;
	JTextField field;
	JButton sendB;
	Socket socket;
	PrintWriter pw;
	BufferedReader br;
	JScrollPane sp;
	public ChatClient() {
		area = new JTextArea();
		area.setBackground(Color.ORANGE);
		sp = new JScrollPane(area);

		field = new JTextField();
		field.setBackground(Color.MAGENTA);
		sendB = new JButton("������");
		ButtonEvent evt = new ButtonEvent();
		field.addActionListener(evt);
		sendB.addActionListener(evt);

		JPanel southP = new JPanel(new BorderLayout());
		southP.add("Center", field);
		southP.add("East", sendB);

		this.add("Center", sp);
		this.add("South", southP);

		this.setSize(400, 600);
		this.setVisible(true);

		// ���� ���� ����������Ƿ� ��ũ��ũ ������ ����.
		// ������ �����Ѵ�.
		try {
			socket = new Socket("192.168.56.28", 7788);
			// ��Ʈ���� �ʿ��ϴ�.
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			pw = new PrintWriter(os);
			InputStreamReader temp = new InputStreamReader(is);
			br = new BufferedReader(temp);
			
			// ��Ʈ�� �������� �����ϸ� ���� ������ �����ִ� ������ ���� �� �ִ�.
			// ������ ������ �޴� �����带 �⵿����
			ReceiveThread t = new ReceiveThread(this);
			t.start();

		} catch (Exception e) {
			e.printStackTrace();
			// ���� ������ �߻��ϸ� �� ���α׷��� ������ ���α׷��̴�.
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		new ChatClient();

	}

	// ��ȭ�� ����Ű�� �����ų� ���߸� ������ ��ȭ�� �������� �����Ѵ�.
	class ButtonEvent implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// ��ȭ������ �˾Ƴ���
			String msg = field.getText().trim();
			if (msg == null || msg.length() == 0) {
				return;
			}
			// �������� �����Ѵ�.
			try {
				pw.println(msg);
				pw.flush();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			// ������ȭ�� ���ؼ� �ؽ�Ʈ �ʵ带 ��������.
			field.setText("");
		}
	}
}


