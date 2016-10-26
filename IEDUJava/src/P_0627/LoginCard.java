package P_0627;

// ó������ Frame���� ���� ����� Ȯ���ϰ� ��ĥ�� Panel�� �����Ѵ�.
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
		pwF.setEchoChar('��');
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

		// ���� �� �� ���� Panel�� ������.
		JPanel northP = new JPanel() {
			public Dimension getPreferredSize() {
				return new Dimension(100, 305);
			}
		};
		// �Ʒ��� �� �� ���� Panel�� ������.
		JPanel southP = new JPanel() {
			public Dimension getPreferredSize() {
				return new Dimension(100, 305);
			}
		};
		// ���ʿ� �� �� ���� Panel�� ������.
		JPanel westP = new JPanel() {
			public Dimension getPreferredSize() {
				return new Dimension(50, 310);
			}
		};
		// ���ʿ� �� �� ���� Panel�� ������.
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
		// �� ���� ���� Ȯ���� ���� �۾��̹Ƿ� ���߿� ��ĥ���� �ּ�ó���Ѵ�
		// this.setSize(500, 700);
		// this.setVisible(true);
	}

	// �ӽ÷� ������ ���� Ȯ���� �Ŀ� �ּ�ó���Ѵ�.
	// public static void main(String[] args) {
	// new LoginCard();
	//
	// }

	class ButtonEvent implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// ���̵�� ����� �˾Ƴ���.
			String id = idF.getText();
			// ������ �������� ���Ἲ �˻�
			if(id == null || id.length() == 0){
				return;
			}
			char[] tempPW = pwF.getPassword();
			String pw = new String(tempPW, 0, tempPW.length);
			if(pw == null || pw.length() == 0){
				return;
			}
			// �˾Ƴ� ������ Ŭ������ �־ ������ ������.
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