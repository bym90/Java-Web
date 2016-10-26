package P_0627;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;

import javax.swing.*;
import GUI.*;
import NetData.ChatData;
import NetData.FileData;
import NetData.MainData;

public class ChatCard extends JPanel {
	JTextArea area;
	JScrollPane sp;
	JTextField field;
	JButton sendB, exitB, downB, upB;
	ChatClient main;

	public ChatCard(ChatClient m) {
		main = m;
		// Base�� �޶����� �⺻ ��ġ������ �޶�����.
		// �׷��Ƿ� ���������� ���� ��ġ������ �����ϱ� ���ؼ� ��ġ������ ó���Ѵ�.
		this.setLayout(new BorderLayout());

		area = new JTextArea();
		sp = new JScrollPane(area);

		field = new JTextField();
		sendB = new JButton("��ȭ�ϱ�");
		exitB = new JButton("�泪����");
		downB = new JButton("�ٿ�ε�");
		upB = new JButton("���ε�");

		ButtonEvent evt = new ButtonEvent();
		field.addActionListener(evt);
		sendB.addActionListener(evt);
		exitB.addActionListener(evt);
		downB.addActionListener(evt);
		upB.addActionListener(evt);

		JPanel p1 = new JPanel(new BorderLayout());
		p1.add("Center", field);
		p1.add("East", sendB);

		JPanel p2 = new JPanel();
		p2.add(upB);
		p2.add(downB);

		JPanel p4 = new JPanel();
		p4.add(exitB);

		JPanel p3 = new JPanel(new BorderLayout());
		p3.add("West", p2);
		p3.add("East", p4);

		this.add("North", p3);
		this.add("Center", sp);
		this.add("South", p1);

		// this.setSize(500, 700);
		// this.setVisible(true);
	}

	// public static void main(String[] args) {
	// new ChatCard();
	//
	// }

	public void sendProc() {
		// ���� ���� �˾Ƴ���
		String msg = field.getText().trim();
		if (msg == null || msg.length() == 0) {
			return;
			// ������ ������.
		}
		MainData data = new MainData();
		data.protocol = 1401;
		ChatData temp = new ChatData();
		temp.msg = msg;
		data.cData = temp;
		try {
			main.oos.writeObject(data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		field.setText("");
	}

	public void exitProc() {
		// ������ ���� �����ڴٰ� ��û�Ѵ�.
		MainData data = new MainData();
		data.protocol = 1302;
		ChatData temp = new ChatData();
		temp.room = main.room;
		data.cData = temp;
		try {
			main.oos.writeObject(data);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void upProc() {
		// ���� ������ �����Ѵ�.
		JFileChooser fc = new JFileChooser("D:\\");
		int kind = fc.showOpenDialog(main);
		if (kind != JFileChooser.APPROVE_OPTION) {
			return;
		}
		// ������ �̸��� ������ �˾Ƴ���.
		File file = fc.getSelectedFile();
		String fileName = file.getName();
		long size = file.length();
		byte[] buff = new byte[(int) size];
		FileInputStream fin = null;
		try {
			fin = new FileInputStream(file);
			fin.read();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fin.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		// Ŭ������ ���´�.
		MainData data = new MainData();
		data.protocol = 1501;
		FileData temp = new FileData();
		temp.fileName = fileName;
		temp.buff = buff;
		data.fData = temp;
		// ������ ������.
		try {
			main.oos.writeObject(data);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void downProc() {
		// ����� �����޶�� ��û�ؾ� �Ѵ�.
		MainData data = new MainData();
		data.protocol = 1601;
		try {
			main.oos.writeObject(data);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	class ButtonEvent implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Object target = e.getSource();
			if (target instanceof JTextField) {
				sendProc();
			} else { // �����̴�
				JButton temp = (JButton) target;
				if (temp == sendB) {
					sendProc();
				} else if (temp == exitB) {
					exitProc();
				} else if (temp == upB) {
					upProc();
				} else {
					downProc();
				}
			}
		}
	}
}