package P_0608;

/*
 * 3개의 체크상자를 만들고 선택된 체크상자의 색상을 혼합해서 배경을 칠하자
 */
import java.awt.*;
import java.awt.event.*;

public class Checkbox_04 extends Frame {
	Checkbox redB, greenB, blueB;

	public Checkbox_04() {
		redB = new Checkbox("빨간색");
		greenB = new Checkbox("초록색");
		blueB = new Checkbox("파란색");

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

	// 이벤트 클래스 제작
	class MyEvent implements ItemListener {
		@Override
		public void itemStateChanged(ItemEvent e) {
			// 물론 이 부분에서 어디서 이벤트가 발생했는지도 중요하다.
			// 색상을 섞으려 3개의 체크상자를 모두다 검사해야한다.
			// 이벤트가 어디서 발생했는지 관계없이 3개의 체크상자를 모두
			// 검사한다.
			// 먼저 3개 모두 해제되었다고 가정하고 출발
			int red = 0;
			int green = 0;
			int blue = 0;
			// 혹시 빨간색 체크상자가 선택되었으면 255로 바꿔줘야한다
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
