package P_0607;

import java.awt.*;
public class Button_01 {

	public Button_01() {
		//먼저 컨테이너를 하나 준비한다.
		Frame f = new Frame();
		//컨테이너에 들어갈 도구(컴포넌트)를 필요한 만큼 준비한다.
		Button b = new Button("버튼");
		
		
		//컴포넌트는 반드시 컨테이너에 들어가야 한다.
		f.add(b);
		
		//화면에는 컨테이너를 출력하면 된다. 그러면 그 안에 있는
		//모든 컴포넌트가 출력되게 된다.
		f.setSize(400, 400);
		f.setVisible(true);
		
	}

	public static void main(String[] args) {
		new Button_01();
		

	}

}
