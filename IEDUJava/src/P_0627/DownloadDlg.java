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

		downB = new JButton("�ٿ�ε�");
		exitB = new JButton("â �ݱ�");
		ButtonEvent evt = new ButtonEvent();
		downB.addActionListener(evt);
		exitB.addActionListener(evt);

		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p1.add(downB);
		p1.add(exitB);

		JPanel p2 = new JPanel(new BorderLayout());
		p2.add("Center", sp);
		p2.add("South", p1);

		// ���ʿ� �� �� ���� Panel�� ������.
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
	// ���߸� ������ �ٿ�ε� ��û�� �ϵ��� �Ѵ�.
	class ButtonEvent implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton target = (JButton) e.getSource();
			if (target == downB) {
				// ������ ������ ������ �̸��� �˷��ָ鼭 �� ������
				// �ٿ�ε� �ش޶�� ��Ź�Ѵ�.
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