package P_0608;

import java.awt.*;

public class Checkbox_01 {

	public Checkbox_01() {
		Frame f = new Frame();

		Checkbox box1 = new Checkbox("Àåµ¿°Ç");
		Checkbox box2 = new Checkbox("ÀÌº´Çå");
		Checkbox box3 = new Checkbox("¼Û½ÂÇå", true);

		Panel p = new Panel();
		p.add(box1);
		p.add(box2);
		p.add(box3);

		f.add("North", p);
		f.setSize(400, 400);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new Checkbox_01();

	}

}
