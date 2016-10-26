package P_0617;

/*
 * ������ Ư�� ������ �о
 * �ؽ�Ʈ ����� ����ϵ��� ����.
 */
import java.awt.event.*;
import javax.swing.*;
import GUI.*;
import java.io.*;

public class readLine_01 extends CJFrame {
	JTextArea area;

	public readLine_01() {
		area = new JTextArea();
		JScrollPane sp = new JScrollPane(area);
		JButton b = new JButton("Click");
		b.addActionListener(new ButtonEvent());
		this.add("Center", sp);
		this.add("South", b);
		this.setSize(400, 400);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new readLine_01();

	}

	class ButtonEvent implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// ��Ʈ�� ����
			FileReader fr = null;
			BufferedReader br = null;
			// readLine()�� �̿��ؼ� ���پ� �о ó������
			try {
				fr = new FileReader("src/P_0617/Test_01.java");
				br = new BufferedReader(fr);
				while (true) {
					// �д´�
					String text = br.readLine();

					if (text == null) {
						break;
					}
					area.append(text + "\r\n");
					// readLine()���� ���� ����� �� �ٲ� ��ȣ�� �����ȴ�.
					// �׷��Ƿ� �ʿ��ϴٸ� ������ �ٹٲޱ�ȣ(\r\n)�� �־��־���Ѵ�.
				}
			} catch (Exception e1) {
				e1.printStackTrace();
			} finally {
				try {
					br.close();
					fr.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}

			// ����
		}
	}

}