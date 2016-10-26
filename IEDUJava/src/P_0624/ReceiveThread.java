package P_0624;

import javax.swing.JScrollBar;

//이제 서버가 보내주는 데이터를 받을 준비를 하자.
//서버는 언제 나에게 데이터를 보낼짖 모르므로 데이터를 받는 부분은
//독립적으로 실행되어야 한다.
//그래서 데이터를 받는 프로그램은 스레드 프로그램을 만들 예정이다.
class ReceiveThread extends Thread {
	RoomChatClient main;

	ReceiveThread(RoomChatClient m) {
		main = m;
	}

	public void nickProc(String msg) {
		// 데이터를 자신의 정보에 기억하고 방을 선택할 수 있도록 한다.
		main.nick = msg;
		main.nickC.roomBox.setEnabled(true);
	}

	public void enterProc(String msg) {
		// 데이터를 자신의 정보에 기억하고
		// 화면을 채팅방으로 전환시킨다.
		main.room = msg;
		main.card.show(main.mainP, "CHAT");
		main.setTitle(msg + "입니다.");

	}

	public void exitProc(String msg) {
		// 데이터 정보를 원상태로 복귀하고
		// 화면은 대기방 화면으로 전환시킨다.
		main.room = msg;
		main.card.show(main.mainP, "NICK");
		main.setTitle("대기방");
		// 지금까지 대화내용은 지운다.
		main.chatC.area.setText("");
	}

	public void msgProc(String msg) {
		// 대화내용을 화면에 출력한다.
		main.chatC.area.append(msg + "\r\n");
		// 스크롤바 자동 밑으로 내리기 적용
		JScrollBar sbar = main.chatC.sp.getVerticalScrollBar();
		int max = sbar.getMaximum();
		sbar.setValue(max);
	}

	public void run() {
		// 계속해서 서버가 주는 데이터를 받고 처리한다.
		try {
			while (true) {
				// 데이터를 받자.
				String temp = main.br.readLine();
				if (temp == null || temp.length() == 0) {
					break;
				}
				// 서버자 준 내용에는 의미를 구분하는 약속 기호가 붙어있다.
				// 일단 약속을 분리해낸다.
				String protocol = temp.substring(0, 4);
				String msg = temp.substring(4);
				int intP = Integer.parseInt(protocol);
				switch (intP) {
				case 2101: // 닉네임을 잘받았다
					nickProc(msg);
					break;
				case 2201: // 방입장을 허락한다.
					enterProc(msg);
					break;
				case 2202: // 방퇴장을 허락한다.
					exitProc(msg);
					break;
				case 2301: // 대화내용이다.
					msgProc(msg);
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			main.closeProc();
			System.exit(0);
		}

	}
}