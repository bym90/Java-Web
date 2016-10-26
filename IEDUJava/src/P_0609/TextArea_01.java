package P_0609;

import java.awt.*;
public class TextArea_01 extends Frame{

	public TextArea_01() {
		//컨테이너의 배치전략을 flow로 세운다.
		setLayout(new FlowLayout());
		
		TextArea area = new TextArea("", 5, 30, TextArea.SCROLLBARS_NONE);
		add(area);
		
		this.setSize(400, 400);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new TextArea_01();

	}

}
