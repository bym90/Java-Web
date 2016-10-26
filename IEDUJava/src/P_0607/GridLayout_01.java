package P_0607;

import java.awt.*;
public class GridLayout_01 {

	public GridLayout_01() {
		Frame f = new Frame();
		//이 컨테이너에 대한 배치전략을 세운다.
		GridLayout lay = new GridLayout(2, 3, 10, 10);
		f.setLayout(lay);
		
		String[] title = {"A", "B", "C", "D", "E", "F"};
		Button[] btn = new Button[6];
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new Button(title[i]);
		}
		
		for (int i = 0; i < 4; i++) {//길이 5와 6의 차이
			f.add(btn[i]);
		}
		
		f.add(new Label(""));
		f.add(new Label(""));
		//격자를 맞춰주기위해 빈칸을 넣어준다.
		
		f.setSize(300, 300);
		f.setVisible(true);
		
	}

	public static void main(String[] args) {
		new GridLayout_01();

	}

}
