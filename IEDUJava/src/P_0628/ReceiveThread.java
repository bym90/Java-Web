package P_0628;

import java.net.*;

/*
 * 이 클래스는 언제 상대방이 나에게 쪽지를 보낼지 모르므로
 * 상대방이 보내줄 쪽지를 받기 위한 독립적인 프로그램이 필요했다.
 * 이 클래스는 스레드로 만들어서 처리한다.
 */
public class ReceiveThread extends Thread {
	ShortMsg main;

	public ReceiveThread(ShortMsg m) {
		main = m;
	}

	public void showDlg(DatagramPacket p){
		// 포장을 뜯는다.
		byte[] buff = p.getData(); // 내용
		String msg = new String(buff, 0, buff.length);
		InetAddress addr = p.getAddress(); // 상대방 주소
		String ip = addr.getHostAddress();
		String name = (String) main.ipToName.get(ip);
		// 이 정보를 이용해서 대화상자를 만든다.
		ReceiveDlg dlg = new ReceiveDlg(main);
		dlg.whoF.setText(name);
		dlg.area.setText(msg);
		dlg.setSize(400, 300);
		dlg.setVisible(true);
	}
	
	public void run() {
		try {
			while(true){
				// 패킷을 받는다.
				// 도착한 것이 패킷이므로 받을때도 패킷으로 받는다.
				// 1. 받을 패킷을 준비한다.
				byte[] buff = new byte[1024*1024];
				DatagramPacket packet = new DatagramPacket(buff, buff.length);
				// 2. 패킷 받기
				main.rSocket.receive(packet);
				// 3. 쪽지가 도착한 것이므로 대화상자를 출력해서
				// 쪽지의 내용을 화면에 보여주면 된다.
				showDlg(packet);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
