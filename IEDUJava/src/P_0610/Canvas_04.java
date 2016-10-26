package P_0610;

/*
 * 그림판의 연필그리기 기능을 구현해 보자.
 */
import java.awt.*;
import java.awt.event.*;
import GUI.*;

public class Canvas_04 extends CFrame {

	public Canvas_04() {
		DrawCanvas04 c = new DrawCanvas04();
		
		this.add(c);
		this.setSize(400, 400);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Canvas_04();

	}

}

// 그림판을 위한 캔버스를 제작한다.
class DrawCanvas04 extends Canvas {
	// 그림을 그릴 시작위치와 종료위취를 기억할 변수
	int startx = -100, starty = -100, endx = -100, endy = -100;

	DrawCanvas04() {
		//원래의 두개의 리스너를 이용해야지 풀 수 있는 문제
		//★★★ 따라서 이벤트 등록도 두번 해야한다.
		MyEvent04 e = new MyEvent04();
		this.addMouseListener(e);
		this.addMouseMotionListener(e);
	}

	public void update(Graphics g) {
		paint(g);
	}

	public void paint(Graphics g) {
		g.drawLine(startx, starty, endx, endy);
	}

	// 이벤트 처리
	// 1. 마우스를 누르는 이벤트 (그림을 그리기 시작)
	// 2. 마우스 드래그 이벤트 (그림을 그려나가기 시작)
	// 3. 마우스에 손을 놓는 이벤트 (그림을 그리기를 중지)
	// 1, 3번 MouseListener
	// 2번은 MouseMotionListener
	class MyEvent04 extends MouseAdapter {
		public void mouseDragged(MouseEvent e) {
			//그림 그려나가가기
			//이미 마우스를 누르는 순간 시작위치는 정해졌으므로
			//이동 위치까지 그림을 그려야 하므로 end위치가 현재위치로 바껴야한다.
			
			startx = endx;
			starty = endy;
			
			endx = e.getX();
			endy = e.getY();
			
			repaint();
		}

		public void mousePressed(MouseEvent e) {
			//그림 그리기 시작
			//지금 찍은 위치가 시작위치가 되어야한다.
			startx = endx = e.getX();
			starty = endy = e.getY();
		}

		public void mouseReleased(MouseEvent e) {
			// 그림그리기 중지
			// 처리방식은 그림을 그릴 위치를 캔버스 밖으로 내보낸다.
			startx = starty = endx = endy = -100;
		}
	}
}