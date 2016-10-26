package P_0610;

import java.awt.*;
import GUI.*;
public class Canvas_01 extends CFrame{

	public Canvas_01() {
		Canvas c = new Canvas();
		
		this.add(c);
		
		this.setSize(400, 400);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Canvas_01();
	}

}
