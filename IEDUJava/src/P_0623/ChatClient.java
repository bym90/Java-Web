package P_0623;

/*
 * 먼저 클라이언트는 채팅을 하기위해 폼이 있어야한다.
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
		sendB = new JButton("보내기");
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

		// 이제 폼이 만들어졌으므로 네크워크 연결을 하자.
		// 서버에 접속한다.
		try {
			socket = new Socket("192.168.56.28", 7788);
			// 스트림이 필요하다.
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			pw = new PrintWriter(os);
			InputStreamReader temp = new InputStreamReader(is);
			br = new BufferedReader(temp);
			
			// 스트림 생성까지 성공하면 이제 서버가 보내주는 내용을 받을 수 있다.
			// 서버의 내용을 받는 스레드를 기동하자
			ReceiveThread t = new ReceiveThread(this);
			t.start();

		} catch (Exception e) {
			e.printStackTrace();
			// 만약 에러가 발생하면 이 프로그램은 못쓰는 프로그램이다.
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		new ChatClient();

	}

	// 대화는 엔터키를 누르거나 단추를 누르면 대화가 서버에게 가야한다.
	class ButtonEvent implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// 대화내용을 알아내고
			String msg = field.getText().trim();
			if (msg == null || msg.length() == 0) {
				return;
			}
			// 서버에게 전달한다.
			try {
				pw.println(msg);
				pw.flush();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			// 다음대화를 위해서 텍스트 필드를 지워놓자.
			field.setText("");
		}
	}
}



