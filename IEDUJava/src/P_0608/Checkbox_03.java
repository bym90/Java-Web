package P_0608;

/*
 * ���� ���� ����3���� ����� �����ϸ� ������ ��ȭ�ǵ��� ����.
 */
import java.awt.*;
import java.awt.event.*;

public class Checkbox_03 {
	Checkbox redB, greenB, blueB;
	Frame frame;

	public Checkbox_03() {
		frame = new Frame();

		CheckboxGroup g = new CheckboxGroup();
		redB = new Checkbox("������", false, g);
		greenB = new Checkbox("�ʷϻ�", false, g);
		blueB = new Checkbox("�Ķ���", false, g);
		Panel p = new Panel();
		p.add(redB);
		p.add(greenB);
		p.add(blueB);

		MyEvent e = new MyEvent();
		redB.addItemListener(e);
		greenB.addItemListener(e);
		blueB.addItemListener(e);

		frame.add(p, "North");
		frame.setSize(400, 400);
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		new Checkbox_03();

	}

	// �̺�Ʈ Ŭ���� ��������.
	class MyEvent implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			// ���� ���߰� 3���̹Ƿ� ��� ���� ���߰� ����Ǿ����� �˾ƾ��Ѵ�.
			Checkbox target = (Checkbox) e.getSource();
			if (target == redB) {
				frame.setBackground(Color.red);
			} else if (target == greenB) {
				frame.setBackground(Color.green);
			} else if (target == blueB) {
				frame.setBackground(Color.blue);
			}

		}

	}

}