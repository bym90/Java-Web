package P_0607;

import java.awt.*;
public class Window_01 {

	public Window_01() {
		//Window�� ������ �������� ���ϹǷ� �ٸ� �����̳ʰ� �����ؾ� �Ѵ�.
		Frame f = new Frame();
		Window w = new Window(f);
			
		w.setSize(400, 400);
		w.setVisible(true);
	}

	public static void main(String[] args) {
		new Window_01();

	}

}