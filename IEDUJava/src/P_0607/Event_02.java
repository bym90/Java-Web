package P_0607;

/*
 * 단추를 하나 만들고 단추를 누를때마다 프레임의 색상을 랜덤하게 변경하라
 */
import java.awt.*;
import java.awt.event.*;

public class Event_02 {
	Frame frame;

	// 이 변수가 다른곳에서도 사용할 필요가 있으면 전역으로 만드록
	// 사용할 필요가 없으면 지역으로 만들면 된다.
	public Event_02() {
		frame = new Frame();

		frame.setLayout(new FlowLayout());
		frame.setSize(300, 300);
		frame.setVisible(true);
		
		Button b = new Button("Click");
		b.addActionListener(new ButtonEvent02());
		
		frame.add(b);
	}

	public static void main(String[] args) {
		new Event_02();
	}

	class ButtonEvent02 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// 팁
			// awt에서 색상을 지정하는 방법
			// color클래스를 이용한다.
			// 방법 1. 이미 설정된 색상을 이용한다.
			// 예> Color.green
			// 2. 필요한 색상을 만들어서 생성한다.
			// 예> new Color();
			int red = (int) (Math.random() * (255 - 0 + 1) + 0);
			int blue = (int) (Math.random() * (255 - 0 + 1) + 0);
			int green = (int) (Math.random() * (255 - 0 + 1) + 0);

			Color color = new Color(red, green, blue);
			// 배경색을 칠하는 함수는 setBackground(색상);
			frame.setBackground(color);

		}
	}
}
