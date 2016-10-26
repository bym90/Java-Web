package P_0607;

import java.awt.*;
public class Frame_01 {
	public Frame_01(){
		//생성자 함수 안에서는 this를 사용할 수 있고
		//그 덕분에 모든 멤버를 사용할 수 있다.
		Frame f = new Frame();
		//Frame은 다른 컨테이너가 없이 사용할 수 있다.
		
		f.setSize(400, 400);
		f.setVisible(true);
		//아직은 이벤트를 배우지 않았으므로 종료를시킬 수 없다.
		//콘솔창에 강제로 종료해야 한다.
	}
	public static void main(String[] args) {
		//메인 함수는 static 함수이므로 static 멤버만 사용할 수 있다.
		//따라서 실무에서는 main에는 코딩하지 않는 것이 원칙이다.
		//대신 this가 존재하는 생성자 함수부터 코딩해 나가는 것으로 한다.
		//모든 프로그램은 main부터 출발하므로 강제로 생성자 함수를 호출해야 한다.
		new Frame_01();
		//이 과정까지가 프로그램 틀만드는 작업
	}

}
