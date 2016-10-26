package P_0607;

import java.awt.*;
public class Window_01 {

	public Window_01() {
		//Window는 스스로 생성되지 못하므로 다른 컨테이너가 존재해야 한다.
		Frame f = new Frame();
		Window w = new Window(f);
			
		w.setSize(400, 400);
		w.setVisible(true);
	}

	public static void main(String[] args) {
		new Window_01();

	}

}
