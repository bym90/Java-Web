package P_0607;

import java.awt.*;
/*
 * 단추 5개를 입력해보자
 */
public class FlowLayout_01 extends Frame{

	public FlowLayout_01() {
		//이미 Frame은 준비되어 있다.
		//배치 전략을 세우도록 한다.
		//1. 선택한 배치전략을 생성한다.
		FlowLayout lay = new FlowLayout(FlowLayout.LEFT, 10, 10);
		//2. 컨테이너에 배치전략을 설치한다.
		this.setLayout(lay);
		//필요한 도구 생성한다.
		String[] title = {"A", "B", "C", "D", "E"};
		Button[] btn = new Button[5];
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new Button(title[i]);
		}
		
		//도구는 반드시 컨테이너에 넣어야한다.
		for (int i = 0; i < btn.length; i++) {
			this.add(btn[i]);
		}
		
		setSize(400, 400);
		setVisible(true);
		
		
	}

	public static void main(String[] args) {
		new FlowLayout_01();

	}

}
