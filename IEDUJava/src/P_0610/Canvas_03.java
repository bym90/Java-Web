package P_0610;

/*
 * ����
 * �� ĵ������ ����� �� �ȿ��� ���콺 ���߸� ������ �� ��ҿ�
 * �簢�� ����� �׸��� ���α׷��� �ۼ��ϼ���.
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

// �簢���� �׷��� Canvas�� ������
class MyCanvas03 extends Canvas {
	int x = -100, y = -100; // ���콺�� ������ ��ġ�� ����� ����

	MyCanvas03() {
		this.addMouseListener(new MyEvent03());
	}

	// �������̵� �����ν� �ƹ��� ����� �����ߴ�.
	public void update(Graphics g) {
		paint(g);
	}

	public void paint(Graphics g) {
		// �׸��� �׸��� ���� ������ �ٲٰ� �ʹ�
		int red = (int) (Math.random() * (255 - 0 + 1) + 0);
		int blue = (int) (Math.random() * (255 - 0 + 1) + 0);
		int green = (int) (Math.random() * (255 - 0 + 1) + 0);

		Color color = new Color(red, green, blue);

		// �׸��� ������ �ٲٴ� ����
		g.setColor(color);

		// g.fillRect(x, y, 100, 100);
		// g.fillOval(x, y, 100, 100);
		// g.fill3DRect(x, y, 100, 100, true);
		// g.fillArc(x, y, 100, 100, 100, 100);
		g.fillRoundRect(x, y, 100, 100, 100, 100);

	}
	// �� ĵ���� �ȿ��� ���콺�� ������ �̺�Ʈ�� �߻��ϸ�
	// ���ϴ� �ൿ�� �ؾ� �Ѵ�.
	// ���콺�� ������ �̺�Ʈ�� MouseListener ��û�� �������̽��� ó���Ѵ�.
	//

	class MyEvent03 extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			// 1. ���콺�� ������ ��ġ�� �˾Ƴ���.
			x = e.getX();
			y = e.getY();
			// 2. �� ��ġ�� �簢���� �׸���.
			// Canvas���� �׸��� �׸��� �Լ��� paint�Լ��̴�.
			// �� �Լ��� �ڵ�ȣ�⸸ ������ �Լ��̴�.
			// ��, �����ڰ� ȣ���� �� ���� JVM�� ȣ���ϴ� �Լ��̴�.
			// ���� JVM���� paint()�� �ʿ��ϴٰ� �䱸�ϴ� �Լ��̴�.
			// repaint();
			repaint();

		}
	}

}