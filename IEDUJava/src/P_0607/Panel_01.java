package P_0607;

import java.awt.*;

public class Panel_01 {

	public Panel_01() {
		//패널은 스스로 화면에 나오지 못한다.
		//반드시 다른 컨테이너에 포함시켜서 다른 컨테이너가 나올때
		//같이 나오도록 해야한다.
		Frame f = new Frame();
		Panel p = new Panel();
		
		p.setBackground(Color.red);
	
		f.add(p);
		
		f.setSize(400, 400);
		f.setVisible(true);
		
	}

	public static void main(String[] args) {
		new Panel_01();

	}

}
