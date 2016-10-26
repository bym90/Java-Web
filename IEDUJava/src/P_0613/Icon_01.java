package P_0613;

import java.awt.*;
import javax.swing.*;
public class Icon_01 extends JFrame {

	public Icon_01() {
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		ImageIcon icon = new ImageIcon("src/P_0613/icon.gif");
		JButton b = new JButton(icon);
		
		this.add(b);
		this.setSize(400, 400);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Icon_01();

	}

}
