package P_0607;

import java.awt.*;

public class Dialog_01 {

	public Dialog_01() {
		//Dialog를 만들기 위해서는 다른 컨테이너가 우선 존재해야 한다.
		Frame f = new Frame();
		Dialog d = new Dialog(f);
		
		d.setSize(400, 400);
		d.setVisible(true);
		
	}

	public static void main(String[] args) {
		new Dialog_01();

	}

}
