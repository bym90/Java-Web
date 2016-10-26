package P_0608;

import java.awt.*;

public class Checkbox_02 extends Frame {

	public Checkbox_02() {
		CheckboxGroup g1 = new CheckboxGroup();
		CheckboxGroup g2 = new CheckboxGroup();

		Checkbox b1 = new Checkbox("害切1", false, g1);
		Checkbox b2 = new Checkbox("害切2", false, g1);
		Checkbox b3 = new Checkbox("害切3", true, g1);
		Panel p1 = new Panel();
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);

		Checkbox b4 = new Checkbox("食切1", false, g2);
		Checkbox b5 = new Checkbox("食切2", false, g2);
		Checkbox b6 = new Checkbox("食切3", true, g2);
		Panel p2 = new Panel();
		p2.add(b4);
		p2.add(b5);
		p2.add(b6);

		Panel p3 = new Panel(new GridLayout(2, 1));

		p3.add(p1);
		p3.add(p2);
		
		Panel p4 = new Panel();
		
		p4.add(p3);

		this.add(p4, "East");
		this.setSize(400, 400);
		this.setVisible(true);

	}

	public static void main(String[] args) {
		new Checkbox_02();

	}

}
