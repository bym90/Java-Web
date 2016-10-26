package P_0628;

import java.net.*;

/*
 * �� Ŭ������ ���� ������ ������ ������ ������ �𸣹Ƿ�
 * ������ ������ ������ �ޱ� ���� �������� ���α׷��� �ʿ��ߴ�.
 * �� Ŭ������ ������� ���� ó���Ѵ�.
 */
public class ReceiveThread extends Thread {
	ShortMsg main;

	public ReceiveThread(ShortMsg m) {
		main = m;
	}

	public void showDlg(DatagramPacket p){
		// ������ ��´�.
		byte[] buff = p.getData(); // ����
		String msg = new String(buff, 0, buff.length);
		InetAddress addr = p.getAddress(); // ���� �ּ�
		String ip = addr.getHostAddress();
		String name = (String) main.ipToName.get(ip);
		// �� ������ �̿��ؼ� ��ȭ���ڸ� �����.
		ReceiveDlg dlg = new ReceiveDlg(main);
		dlg.whoF.setText(name);
		dlg.area.setText(msg);
		dlg.setSize(400, 300);
		dlg.setVisible(true);
	}
	
	public void run() {
		try {
			while(true){
				// ��Ŷ�� �޴´�.
				// ������ ���� ��Ŷ�̹Ƿ� �������� ��Ŷ���� �޴´�.
				// 1. ���� ��Ŷ�� �غ��Ѵ�.
				byte[] buff = new byte[1024*1024];
				DatagramPacket packet = new DatagramPacket(buff, buff.length);
				// 2. ��Ŷ �ޱ�
				main.rSocket.receive(packet);
				// 3. ������ ������ ���̹Ƿ� ��ȭ���ڸ� ����ؼ�
				// ������ ������ ȭ�鿡 �����ָ� �ȴ�.
				showDlg(packet);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}