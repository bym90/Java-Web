package P_0610;

/*
 * 문제
 * 빈 캔버스를 만들고 그 안에서 마우스 단추를 누르면 그 장소에
 * 사각형 모양을 그리는 프로그램을 작성하세요.
 */
import java.awt.*;
import java.awt.event.*;
import GUI.*;

public class Canvas_03 extends CFrame {

	public Canvas_03() {
		MyCanvas03 c = new MyCanvas03();

		this.add(c);
		this.setSize(400, 400);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Canvas_03();

	}

}

// 사각형이 그려진 Canvas를 만들자
class MyCanvas03 extends Canvas {
	int x = -100, y = -100; // 마우스가 눌러진 위치를 기억할 변수

	MyCanvas03() {
		this.addMouseListener(new MyEvent03());
	}

	// 오버라이드 함으로써 아버지 기능을 무시했다.
	public void update(Graphics g) {
		paint(g);
	}

	public void paint(Graphics g) {
		// 그림을 그릴때 마다 색상을 바꾸고 싶다
		int red = (int) (Math.random() * (255 - 0 + 1) + 0);
		int blue = (int) (Math.random() * (255 - 0 + 1) + 0);
		int green = (int) (Math.random() * (255 - 0 + 1) + 0);

		Color color = new Color(red, green, blue);

		// 그림의 색상을 바꾸는 명령
		g.setColor(color);

		// g.fillRect(x, y, 100, 100);
		// g.fillOval(x, y, 100, 100);
		// g.fill3DRect(x, y, 100, 100, true);
		// g.fillArc(x, y, 100, 100, 100, 100);
		g.fillRoundRect(x, y, 100, 100, 100, 100);

	}
	// 이 캔버스 안에서 마우스를 누르는 이벤트가 발생하면
	// 원하는 행동을 해야 한다.
	// 마우스를 누르는 이벤트는 MouseListener 경청자 인터페이스가 처리한다.
	//

	class MyEvent03 extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			// 1. 마우스가 눌러진 위치를 알아낸다.
			x = e.getX();
			y = e.getY();
			// 2. 그 위치에 사각형을 그린다.
			// Canvas에서 그림을 그리는 함수는 paint함수이다.
			// 이 함수는 자동호출만 가능한 함수이다.
			// 즉, 개발자가 호출할 수 없고 JVM이 호출하는 함수이다.
			// 편법 JVM에게 paint()가 필요하다고 요구하는 함수이다.
			// repaint();
			repaint();

		}
	}

}