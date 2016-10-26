package P_0609;

import java.awt.*;
public class Space_01 extends Frame{

	public Space_01() {
		Button b = new Button("Click");
		
		Panel SouthP = new Panel(){
			public Dimension getPreferredSize(){
				return new Dimension(100, 100);
			}
		};
		
		Panel NorthP = new Panel(){
			public Dimension getPreferredSize(){
				return new Dimension(100, 100);
			}
		};
		//하나만 만들어서 사용하면 안된다.
		//여백이 필요한 곳에다마 다른것을 사용해야한다.
		
//		this.add("South", SouthP);
//		this.add("North", SouthP);
		//아래쪽 여백이 생기지 않는 이유는
		//같은 도구는 두군데 들어가지 못한다.
		
		this.add("South", SouthP);
		this.add("North", NorthP);

		
		this.add(b);
		
		this.setSize(400, 400);
		this.setVisible(true);
		
	}

	public static void main(String[] args) {
		new Space_01();

	}

}
