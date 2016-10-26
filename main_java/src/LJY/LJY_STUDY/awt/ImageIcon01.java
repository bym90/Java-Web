package LJY.LJY_STUDY.awt;

import javax.swing.*;
import java.awt.*;
public class ImageIcon01 extends JFrame {
	public ImageIcon01() {
		this.setTitle("잉미지아이콘 예제");

		setLayout(new FlowLayout());

		ImageIcon normal = new ImageIcon("src/images/normal.gif");
		ImageIcon rollover = new ImageIcon("src/images/rollover.gif");
		ImageIcon pressed = new ImageIcon("src/images/pressed.gif");

		JButton btn = new JButton("",normal);
		btn.setPressedIcon(pressed);
		btn.setRolloverIcon(rollover);

		add(btn);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		setVisible(true);

	}
	public static void main(String[] args) {
		new ImageIcon01();
	}
}
