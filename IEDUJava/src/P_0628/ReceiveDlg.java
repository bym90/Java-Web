package P_0628;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import GUI.*;

public class ReceiveDlg extends JDialog {
	ShortMsg main;
	TextArea area;
	JTextField whoF;
	JButton reB, closeB;

	public ReceiveDlg(ShortMsg m) {
		super(m);
		main = m;
		area = new TextArea();
		whoF = new JTextField();
		whoF.setEnabled(false);
		reB = new JButton("답장하기");
		closeB = new JButton("닫기");

		ButtonEvent evt = new ButtonEvent();
		reB.addActionListener(evt);
		closeB.addActionListener(evt);
		
		JLabel whoL = new JLabel("보낸 사람 : ");
		JPanel p1 = new JPanel(new BorderLayout());
		p1.add("West", whoL);
		p1.add("Center", whoF);

		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p2.add(reB);
		p2.add(closeB);

		this.add("North", p1);
		this.add("Center", area);
		this.add("South", p2);

		// this.setSize(400, 400);
		// this.setVisible(true);
		//
	}
	//
	// public static void main(String[] args) {
	// new ReceiveDlg();
	// }
	
	public void reProc(){
		// 다시 보내기 대화상자를 화면에 출력한다.
		// 먼저 상대방 이름을 알아야 한다.
		String name = whoF.getText();
		SendDlg dlg = new SendDlg(main);
		dlg.whoF.setText(name);
		dlg.setSize(400, 300);
		dlg.setVisible(true);
		// 자신은 닫는다.
		closeProc();
	}

	public void closeProc(){
		this.setVisible(false);
		this.dispose();
	}
	
	class ButtonEvent implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton target = (JButton) e.getSource();
			if (target == reB) {
				reProc();
			} else {
				closeProc();
			}
		}
	}

}
