package P_0608;

/*
 * 문제 라디오 단추3개를 만들고 선택하면 색상이 변화되도록 하자.
 */
import java.awt.*;
import java.awt.event.*;

public class Checkbox_03 {
	Checkbox redB, greenB, blueB;
	Frame frame;

	public Checkbox_03() {
		frame = new Frame();

		CheckboxGroup g = new CheckboxGroup();
		redB = new Checkbox("빨간색", false, g);
		greenB = new Checkbox("초록색", false, g);
		blueB = new Checkbox("파란색", false, g);
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

	// 이벤트 클래스 제작하자.
	class MyEvent implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			// 라디오 단추가 3개이므로 어느 라디오 단추가 변경되었는지 알아야한다.
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
