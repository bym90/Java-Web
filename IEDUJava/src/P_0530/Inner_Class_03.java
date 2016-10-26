package P_0530;

import java.awt.*;
import java.awt.event.*;

public class Inner_Class_03 {
	Frame f;
	Button b;
	Inner_Class_03(){
		f = new Frame();
		f.setLayout(new FlowLayout());
		b = new Button("눌러봐");
		b.addActionListener(new ButtonEvent());
		f.add(b);
		f.setSize(400,  400);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new Inner_Class_03();
	}


	class ButtonEvent implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int red = (int)(Math.random() * 255);
			int green = (int)(Math.random() * 255);
			int blue = (int)(Math.random() * 255);
			Color c = new Color(red, green, blue);
			//	이제 이 색상을 Frame에 적용하면 된다.
			f.setBackground(c);
		}
	}
}



