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
		reB = new JButton("�����ϱ�");
		closeB = new JButton("�ݱ�");

		ButtonEvent evt = new ButtonEvent();
		reB.addActionListener(evt);
		closeB.addActionListener(evt);
		
		JLabel whoL = new JLabel("���� ��� : ");
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
		// �ٽ� ������ ��ȭ���ڸ� ȭ�鿡 ����Ѵ�.
		// ���� ���� �̸��� �˾ƾ� �Ѵ�.
		String name = whoF.getText();
		SendDlg dlg = new SendDlg(main);
		dlg.whoF.setText(name);
		dlg.setSize(400, 300);
		dlg.setVisible(true);
		// �ڽ��� �ݴ´�.
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