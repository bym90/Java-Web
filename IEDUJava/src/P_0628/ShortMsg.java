package P_0628;

import java.awt.*;
// 만약 같은 이름의 클래스가 두군데 있어서 충돌날 경우에는 
//어디것을 사용할지 명백하게 밝혀주어야한다.
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
	Hashtable ipToName, nameToIp; // 이름을 이용해서 ip주소를 잧고
	// ip 주솔르 이용해서 이름을 찾기 위해서 우리반 학생들 이름과
	// ip주소를 관리할 클래스
	// UDP 통신을 위한 클래스 준비
	DatagramSocket rSocket, sSocket;
	public ShortMsg() {
		ipToName = new Hashtable();
		nameToIp = new Hashtable();
		// 먼저 파일에서 우리반 학생들의 이름과 ip주소를 읽어들일 예정이다.
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
//				System.out.println("이름 = " + name + " IP = " + ip);
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
		// 이안에는 먼저 우리반 친구 이름을 나열해 놓도록 하자.
		Enumeration e = nameToIp.keys();
		while(e.hasMoreElements()){
			String name = (String) e.nextElement();
			list.add(name);
		}
		exitB = new JButton("종료");

		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p1.add(exitB);
		exitB.addActionListener(new ButtonEvent());

		JPanel p2 = new JPanel(new BorderLayout());
		p2.add("Center", list);
		p2.add("South", p1);

		this.add("Center", p2);
		setSize(300, 300);
		setVisible(true);
		
		// 네트워크 연결
		try {
			sSocket = new DatagramSocket();
			rSocket = new DatagramSocket(7878);
			// 이제 상대방이 보내주는 데이터를 받을 수 있을 것이다.
			// 그러므로 데이터를 받기 위한 스레드를 기동해 놓자.
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

	// 프로그램이 종료할 때 소켓을 닫아주는 작업이 필요하다.
	// 리스트에서 더블클릭하면 그 사람에게 데이터를 보낼 수 있는
	// 대화상자가 화면에 나타나도록 할 예정이다.
	class ListEvent implements ActionListener{
		public void actionPerformed(ActionEvent e){
			// 선택한 이름을 알아낸다.
			String name = list.getSelectedItem();
			// 쪽지 보내기 대화상자를 화면에 출력한다.
			SendDlg dlg = new SendDlg(ShortMsg.this);
			// 보낼 사람이름을 강제로 기록해주자
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
