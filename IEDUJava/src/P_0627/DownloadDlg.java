package P_0627;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import GUI.*;
import NetData.*;

public class DownloadDlg extends JDialog {
	ChatClient main;
	JList list;
	JButton downB, exitB;

	public DownloadDlg(ChatClient m) {
		super(m);
		main = m;
		this.setLayout(new BorderLayout());

		list = new JList();
		JScrollPane sp = new JScrollPane(list);

		downB = new JButton("다운로드");
		exitB = new JButton("창 닫기");
		ButtonEvent evt = new ButtonEvent();
		downB.addActionListener(evt);
		exitB.addActionListener(evt);

		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p1.add(downB);
		p1.add(exitB);

		JPanel p2 = new JPanel(new BorderLayout());
		p2.add("Center", sp);
		p2.add("South", p1);

		// 위쪽에 들어갈 빈 공간 Panel을 만들자.
		JPanel northP = new JPanel() {
			public Dimension getPreferredSize() {
				return new Dimension(100, 50);
			}
		};
		JPanel southP = new JPanel() {
			public Dimension getPreferredSize() {
				return new Dimension(100, 50);
			}
		};
		JPanel eastP = new JPanel() {
			public Dimension getPreferredSize() {
				return new Dimension(30, 100);
			}
		};
		JPanel westP = new JPanel() {
			public Dimension getPreferredSize() {
				return new Dimension(30, 100);
			}
		};

		this.add("North", northP);
		this.add("Center", p2);
		this.add("South", southP);
		this.add("West", westP);
		this.add("East", eastP);

		// this.setSize(400, 300);
		// this.setVisible(true);
	}

	// public static void main(String[] args) {
	// new DownloadDlg();
	// }
	// 단추를 누르면 다운로드 요청을 하도록 한다.
	class ButtonEvent implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton target = (JButton) e.getSource();
			if (target == downB) {
				// 서버에 선택한 파일의 이름을 알려주면서 그 파일을
				// 다운로드 해달라고 부탁한다.
				String name = (String) list.getSelectedValue();

				MainData data = new MainData();
				data.protocol = 1602;
				FileData temp = new FileData();
				temp.fileName = name;
				data.fData = temp;

				try {
					main.oos.writeObject(data);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			} else {
				main.dDlg.setVisible(false);
				main.dDlg.dispose();
			}
		}
	}
}
