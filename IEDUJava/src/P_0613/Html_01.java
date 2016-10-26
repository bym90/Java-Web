package P_0613;

import java.awt.*;
import javax.swing.*;
public class Html_01 {

	public Html_01() {
		String text = "<html><center>나는 <b><font color='blue'>ABCD</font></b><br>EGFH</center><html>";
		//awt는 폰트 특성을 부분적으로 못바꾸고 줄바꿈 또한 안된다.]
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new FlowLayout());
		
		JLabel label = new JLabel(text);
		f.add(label);
		
		f.setSize(400, 400);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new Html_01();

	}

}
