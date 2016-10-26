package P_0623;

import javax.swing.*;

//서버가 주는 내용은 받는 시점이 불명확하다.
//그러므로 대화내용을 받는 프로그램이 독립적으로 실행되어야 한다.
class ReceiveThread extends Thread {
	// 이 클래스 역시 위의 메인 클래스와 통신할 필요가 있다.
	ChatClient main;
	public ReceiveThread(ChatClient m){
		main = m;	
	}
	
	public void run(){
		// 계속해서 대화내용을 받는다.
		try {
			while(true){
				String msg = main.br.readLine();
				// 이 대화 내용을 Area에 출력하면된다.
				main.area.append(msg + "\r\n");
				//readLine 줄바꿈 기호를 제거하기 때문에 \r\n을 붙인다.
				
				// 스크롤바를 자동으로 내려보자
				// 1. 세로방향 스크롤바를 관리하는 클래스를 구하고
				JScrollBar sbar = main.sp.getVerticalScrollBar();
				// 2. 현재의 스크롤바의 마지막 위치를 알아낸다.
				int mx = sbar.getMaximum();
				// 3. 세로방향 스크롤바를 그 위치로 내린다.
				sbar.setValue(mx);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.exit(0);
		}
	}
	
}


