package P_0608;

/*
 * 3���� üũ���ڸ� ����� ���õ� üũ������ ������ ȥ���ؼ� ����� ĥ����
 */
import java.awt.*;
import java.awt.event.*;

public class Checkbox_04 extends Frame {
	Checkbox redB, greenB, blueB;

	public Checkbox_04() {
		redB = new Checkbox("������");
		greenB = new Checkbox("�ʷϻ�");
		blueB = new Checkbox("�Ķ���");

		Panel p = new Panel();
		p.add(redB);
		p.add(greenB);
		p.add(blueB);

		MyEvent e = new MyEvent();

		redB.addItemListener(e);
		greenB.addItemListener(e);
		blueB.addItemListener(e);

		this.add("North", p);
		this.setSize(400, 400);
		this.setVisible(true);

	}

	public static void main(String[] args) {
		new Checkbox_04();

	}

	// �̺�Ʈ Ŭ���� ����
	class MyEvent implements ItemListener {
		@Override
		public void itemStateChanged(ItemEvent e) {
			// ���� �� �κп��� ��� �̺�Ʈ�� �߻��ߴ����� �߿��ϴ�.
			// ������ ������ 3���� üũ���ڸ� ��δ� �˻��ؾ��Ѵ�.
			// �̺�Ʈ�� ��� �߻��ߴ��� ������� 3���� üũ���ڸ� ���
			// �˻��Ѵ�.
			// ���� 3�� ��� �����Ǿ��ٰ� �����ϰ� ���
			int red = 0;
			int green = 0;
			int blue = 0;
			// Ȥ�� ������ üũ���ڰ� ���õǾ����� 255�� �ٲ�����Ѵ�
			if (redB.getState() == true) {
				red = 255;
			} else {
				red = 0;
			}
			if (greenB.getState() == true) {
				green = 255;
			} else {
				green = 0;
			}
			if (blueB.getState() == true) {
				blue = 255;
			} else {
				blue = 0;
			}

			Color color = new Color(red, green, blue);
			Checkbox_04.this.setBackground(color);

		}
	}

}