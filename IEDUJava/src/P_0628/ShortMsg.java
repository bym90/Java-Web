package P_0628;

import java.awt.*;
// ���� ���� �̸��� Ŭ������ �α��� �־ �浹�� ��쿡�� 
//������ ������� �����ϰ� �����־���Ѵ�.
import java.awt.List;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import GUI.*;
import javax.swing.*;
import java.net.*;

public class ShortMsg extends CJFrame {
	List list;
	JButton exitB;
	Hashtable ipToName, nameToIp; // �̸��� �̿��ؼ� ip�ּҸ� ���
	// ip �ָּ� �̿��ؼ� �̸��� ã�� ���ؼ� �츮�� �л��� �̸���
	// ip�ּҸ� ������ Ŭ����
	// UDP ����� ���� Ŭ���� �غ�
	DatagramSocket rSocket, sSocket;
	public ShortMsg() {
		ipToName = new Hashtable();
		nameToIp = new Hashtable();
		// ���� ���Ͽ��� �츮�� �л����� �̸��� ip�ּҸ� �о���� �����̴�.
		BufferedReader br = null;
		FileReader fr = null;
		try {
			fr = new FileReader("src/P_0628/nametoip.txt");
			br = new BufferedReader(fr);
			while(true){
				String line = br.readLine();
				if(line == null){
					break;
				}
				int pos = line.indexOf("=");
				String name = line.substring(0, pos);
				String ip = line.substring(pos+1);
				ipToName.put(ip, name);
				nameToIp.put(name, ip);
//				System.out.println("�̸� = " + name + " IP = " + ip);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				fr.close();
				br.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		list = new List();
		list.addActionListener(new ListEvent());
		// �̾ȿ��� ���� �츮�� ģ�� �̸��� ������ ������ ����.
		Enumeration e = nameToIp.keys();
		while(e.hasMoreElements()){
			String name = (String) e.nextElement();
			list.add(name);
		}
		exitB = new JButton("����");

		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p1.add(exitB);
		exitB.addActionListener(new ButtonEvent());

		JPanel p2 = new JPanel(new BorderLayout());
		p2.add("Center", list);
		p2.add("South", p1);

		this.add("Center", p2);
		setSize(300, 300);
		setVisible(true);
		
		// ��Ʈ��ũ ����
		try {
			sSocket = new DatagramSocket();
			rSocket = new DatagramSocket(7878);
			// ���� ������ �����ִ� �����͸� ���� �� ���� ���̴�.
			// �׷��Ƿ� �����͸� �ޱ� ���� �����带 �⵿�� ����.
			ReceiveThread  t = new ReceiveThread(this);
			t.start();
		} catch (Exception e2) {
			e2.printStackTrace();
			System.exit(0);
		}

	}

	public static void main(String[] args) {
		new ShortMsg();

	}

	// ���α׷��� ������ �� ������ �ݾ��ִ� �۾��� �ʿ��ϴ�.
	// ����Ʈ���� ����Ŭ���ϸ� �� ������� �����͸� ���� �� �ִ�
	// ��ȭ���ڰ� ȭ�鿡 ��Ÿ������ �� �����̴�.
	class ListEvent implements ActionListener{
		public void actionPerformed(ActionEvent e){
			// ������ �̸��� �˾Ƴ���.
			String name = list.getSelectedItem();
			// ���� ������ ��ȭ���ڸ� ȭ�鿡 ����Ѵ�.
			SendDlg dlg = new SendDlg(ShortMsg.this);
			// ���� ����̸��� ������ ���������
			dlg.whoF.setText(name);
			dlg.setSize(400, 300);
			dlg.setVisible(true);
			
		}
	}
	
	class ButtonEvent implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
}