package P_0610;

/*
 * �׸����� ���ʱ׸��� ����� ������ ����.
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

// �׸����� ���� ĵ������ �����Ѵ�.
class DrawCanvas04 extends Canvas {
	// �׸��� �׸� ������ġ�� �������븦 ����� ����
	int startx = -100, starty = -100, endx = -100, endy = -100;

	DrawCanvas04() {
		//������ �ΰ��� �����ʸ� �̿��ؾ��� Ǯ �� �ִ� ����
		//�ڡڡ� ���� �̺�Ʈ ��ϵ� �ι� �ؾ��Ѵ�.
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

	// �̺�Ʈ ó��
	// 1. ���콺�� ������ �̺�Ʈ (�׸��� �׸��� ����)
	// 2. ���콺 �巡�� �̺�Ʈ (�׸��� �׷������� ����)
	// 3. ���콺�� ���� ���� �̺�Ʈ (�׸��� �׸��⸦ ����)
	// 1, 3�� MouseListener
	// 2���� MouseMotionListener
	class MyEvent04 extends MouseAdapter {
		public void mouseDragged(MouseEvent e) {
			//�׸� �׷���������
			//�̹� ���콺�� ������ ���� ������ġ�� ���������Ƿ�
			//�̵� ��ġ���� �׸��� �׷��� �ϹǷ� end��ġ�� ������ġ�� �ٲ����Ѵ�.
			
			startx = endx;
			starty = endy;
			
			endx = e.getX();
			endy = e.getY();
			
			repaint();
		}

		public void mousePressed(MouseEvent e) {
			//�׸� �׸��� ����
			//���� ���� ��ġ�� ������ġ�� �Ǿ���Ѵ�.
			startx = endx = e.getX();
			starty = endy = e.getY();
		}

		public void mouseReleased(MouseEvent e) {
			// �׸��׸��� ����
			// ó������� �׸��� �׸� ��ġ�� ĵ���� ������ ��������.
			startx = starty = endx = endy = -100;
		}
	}
}