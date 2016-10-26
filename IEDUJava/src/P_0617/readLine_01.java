package P_0617;

/*
 * 무조건 특정 파일을 읽어서
 * 텍스트 에리어에 출력하도록 하자.
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
			// 스트림 개설
			FileReader fr = null;
			BufferedReader br = null;
			// readLine()을 이용해서 할줄씩 읽어서 처리예정
			try {
				fr = new FileReader("src/P_0617/Test_01.java");
				br = new BufferedReader(fr);
				while (true) {
					// 읽는다
					String text = br.readLine();

					if (text == null) {
						break;
					}
					area.append(text + "\r\n");
					// readLine()으로 읽은 결과는 줄 바꿈 기호가 삭제된다.
					// 그러므로 필요하다면 강제로 줄바꿈기호(\r\n)를 넣어주어야한다.
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

			// 쓴다
		}
	}

}
