package P_0607;

import java.awt.*;
public class Border_01 extends Frame {

	public Border_01() {
		BorderLayout lay = new BorderLayout();
		setLayout(lay);
		//7,8 주석처리해도 dafault가 BorderLayout이 된다.
		//도구가 들어가는 위치를 지정해주지 않으면 자동적으로 Center가 된다
		
		Button b1 = new Button("A");
		Button b2 = new Button("B");
		Button b3 = new Button("C");
		Button b4 = new Button("D");
		Button b5 = new Button("E");
		Button b6 = new Button("F");
		
		//컨테이너에 도구를 넣는데 배치전략이 Border이므로 
		//방향을 지정해서 넣어야한다.
		
		add(b1, "East");
		add("South", b2);
		add(b3, BorderLayout.NORTH);
		add(BorderLayout.WEST, b4);
		add(b5);
//		add(b6, "Center");
		
		setSize(300, 300);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new Border_01();

	}

}
