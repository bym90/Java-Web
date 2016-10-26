package P_0609;

import java.awt.*;

public class NoLayout_01 extends Frame{

	public NoLayout_01() {
		this.setLayout(null);
		
		Button b1 = new Button("1¹ø");
		Button b2 = new Button("2¹ø");
		
		b1.setBounds(50, 50, 100, 100);
		b2.setBounds(160, 160, 100, 100);
		
		this.add(b1);
		this.add(b2);
		
		this.setSize(400, 400);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new NoLayout_01();
	}

}