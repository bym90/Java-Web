package P_0614;

import java.awt.*;
import javax.swing.*;
import GUI.*;
public class Slider_01 extends CJFrame{

	public Slider_01() {
		this.setLayout(new FlowLayout());
		JSlider js = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);
		js.setPaintTicks(true);
		js.setMajorTickSpacing(20);
		js.setMinorTickSpacing(10);
		js.setPaintLabels(true);
		js.setSnapToTicks(true);
		this.add(js);
		
		this.setSize(400, 400);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Slider_01();

	}

}
