package P_0614;

import java.awt.*;
import javax.swing.*;
import GUI.*;
public class Spinner_01 {

	public Spinner_01() {
		CJFrame f = new CJFrame();
		f.setLayout(new FlowLayout());
		
		JSpinner sp = new JSpinner(){
			@Override
			public Dimension getPreferredSize(){
				Dimension dim = super.getPreferredSize();
				return new Dimension(100, dim.height);
			}
		};
		
		f.add(sp);
		f.setSize(400, 400);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new Spinner_01();

	}

}
