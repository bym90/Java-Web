package P_0627;

// 처음에는 Frame으로 만들어서 결과를 확인하고 합칠때 Panel로 조절한다.
import NetData.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import GUI.*;

public class LoginCard extends JPanel {
	JTextField idF;
	JPasswordField pwF;
	JButton loginB;
	ChatClient main;

	public LoginCard(ChatClient m) {
		main = m;
		this.setLayout(new BorderLayout());

		JLabel idL = new JLabel("ID");
		JLabel pwL = new JLabel("Password");
		idF = new JTextField();
		pwF = new JPasswordField();
		pwF.setEchoChar('●');
		loginB = new JButton("Login");
		loginB.addActionListener(new ButtonEvent());

		JPanel p1 = new JPanel(new GridLayout(2, 1));
		p1.add(idL);
		p1.add(pwL);

		JPanel p2 = new JPanel(new GridLayout(2, 1));
		p2.add(idF);
		p2.add(pwF);

		JPanel p3 = new JPanel(new BorderLayout());
		p3.add("West", p1);
		p3.add("Center", p2);
		p3.add("East", loginB);

		// 위에 들어갈 빈 공간 Panel을 만들자.
		JPanel northP = new JPanel() {
			public Dimension getPreferredSize() {
				return new Dimension(100, 305);
			}
		};
		// 아래에 들어갈 빈 공간 Panel을 만들자.
		JPanel southP = new JPanel() {
			public Dimension getPreferredSize() {
				return new Dimension(100, 305);
			}
		};
		// 왼쪽에 들어갈 빈 공간 Panel을 만들자.
		JPanel westP = new JPanel() {
			public Dimension getPreferredSize() {
				return new Dimension(50, 310);
			}
		};
		// 왼쪽에 들어갈 빈 공간 Panel을 만들자.
		JPanel eastP = new JPanel() {
			public Dimension getPreferredSize() {
				return new Dimension(50, 300);
			}
		};

		this.add("North", northP);
		this.add("Center", p3);
		this.add("South", southP);
		this.add("West", westP);
		this.add("East", eastP);
		// 이 두줄 역시 확인을 위한 작업이므로 나중에 합칠때는 주석처리한다
		// this.setSize(500, 700);
		// this.setVisible(true);
	}

	// 임시로 메인을 만들어서 확인한 후에 주석처리한다.
	// public static void main(String[] args) {
	// new LoginCard();
	//
	// }

	class ButtonEvent implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// 아이디와 비번을 알아낸다.
			String id = idF.getText();
			// 전송할 데이터의 무결성 검사
			if(id == null || id.length() == 0){
				return;
			}
			char[] tempPW = pwF.getPassword();
			String pw = new String(tempPW, 0, tempPW.length);
			if(pw == null || pw.length() == 0){
				return;
			}
			// 알아낸 정보를 클래스에 넣어서 서버에 보낸다.
			MainData data = new MainData();
			data.protocol = 1101;
			data.id = id;
			data.pw = pw;

			try {
				main.oos.writeObject(data);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}

}
