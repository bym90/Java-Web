package P_0608;

import java.awt.*;
public class Panel_02 extends Frame {

	public Panel_02() {
		Button b1 = new Button("1번");
		Button b2 = new Button("2번");
		Button b3 = new Button("3번");
		
		Panel p1 = new Panel(new GridLayout(3, 1, 10, 10));
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		//Panel은 배치전략을 세우지 않으면 Flow가 된다
		Panel p2 = new Panel();
		p2.add(p1);
		
		this.add("West", p2);
		this.setSize(400, 400);
		this.setVisible(true);
		
	}

	public static void main(String[] args) {
		new Panel_02();

	}

}

//숙제 간단한 대화상자 2~3개를 선택하여 그 모습 그대로 만들도록 해보자.
