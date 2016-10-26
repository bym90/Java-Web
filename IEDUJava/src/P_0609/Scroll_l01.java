package P_0609;

import java.awt.*;
import java.awt.event.*;

public class Scroll_l01 {
	Frame frame;
	Scrollbar redB, greenB, blueB;
	TextField redF, greenF, blueF;

	public Scroll_l01() {
		frame = new Frame("������");

		redB = new Scrollbar(Scrollbar.HORIZONTAL, 255, 10, 0, 255 + 10);
		greenB = new Scrollbar(Scrollbar.HORIZONTAL, 255, 10, 0, 255 + 10);
		blueB = new Scrollbar(Scrollbar.HORIZONTAL, 255, 10, 0, 255 + 10);
		// �̺�Ʈ ����Ѵ�.
		ColorEvent evt = new ColorEvent();
		redB.addAdjustmentListener(evt);
		greenB.addAdjustmentListener(evt);
		blueB.addAdjustmentListener(evt);

		redF = new TextField(5);
		greenF = new TextField(5);
		blueF = new TextField(5);

		Label redL = new Label("RED", Label.RIGHT);
		Label greenL = new Label("GREEN", Label.RIGHT);
		Label blueL = new Label("BLUE", Label.RIGHT);

		GridLayout glay = new GridLayout(3, 1);
		Panel labelP = new Panel(glay);
		labelP.add(redL);
		labelP.add(greenL);
		labelP.add(blueL);
		Panel scrollP = new Panel(glay);
		scrollP.add(redB);
		scrollP.add(greenB);
		scrollP.add(blueB);
		Panel fieldP = new Panel(glay);
		fieldP.add(redF);
		fieldP.add(greenF);
		fieldP.add(blueF);

		Panel southP = new Panel(new BorderLayout());
		southP.add("West", labelP);
		southP.add("East", fieldP);
		southP.add("Center", scrollP);

		frame.add("South", southP);

		frame.setSize(400, 600);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new Scroll_l01();
	}

	class ColorEvent implements AdjustmentListener {
		public void adjustmentValueChanged(AdjustmentEvent e) {
			// 1. 3���� ��ũ�ѹ��� ƼĿ�� ��ġ�� �˾Ƴ���.
			int red = redB.getValue();
			int green = greenB.getValue();
			int blue = blueB.getValue();
			// 2. �̰��� �̿��ؼ� ������ �����
			Color color = new Color(red, green, blue);
			// 3. �� ������ Frame�� �������� �����Ѵ�.
			frame.setBackground(color);

			String redX = Integer.toHexString(red);
			String blueX = Integer.toHexString(blue);
			String greenX = Integer.toHexString(green);

			redF.setText(redX.toUpperCase());
			greenF.setText(greenX.toUpperCase());
			blueF.setText(blueX.toUpperCase());

		}
	}
}