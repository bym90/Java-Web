package P_0608;

import java.awt.*;
public class Panel_01 {

	public Panel_01() {
		Frame f = new Frame();
		
		Button b1 = new Button("1번");
		Button b2 = new Button("2번");
		//단추 2개를 동시에 아래로 집어넣기 위해서 포장을 해야한다.
		Panel p = new Panel();
		p.add(b1);
		p.add(b2);
		
		f.add(p, "South");
		
		f.setSize(400, 400);
		f.setVisible(true);
		
	}

	public static void main(String[] args) {
		new Panel_01();

	}

}
