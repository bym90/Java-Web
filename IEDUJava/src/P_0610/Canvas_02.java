package P_0610;

/*
 * ����
 * ȸ�� �α� ��ũ�� ȭ�鿡 �׷��� ����ϴ� ���α׷��� �ۼ��ϼ���
 * 
 */
import java.awt.*;
import java.awt.image.ImageObserver;

import GUI.*;

public class Canvas_02 extends CFrame {

	public Canvas_02() {
		CFrame f = new CFrame();
		LogoCanvas02 logo = new LogoCanvas02();
		f.add(logo);
		f.setSize(800, 800);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new Canvas_02();

	}

}

// ȸ�� �ΰ� ��ũ�� ������ ����� ���ؼ� CanvasŬ������ ��ӹ��� Ŭ������ �����
class LogoCanvas02 extends Canvas {
	// �ܺ� �ΰ� �̹����� ����ϴ� ������ �����.
	Image logo;

	// �� Ŭ������ new��ų�� �̹����� �ҷ�����
	// ������ �ܺ������̹Ƿ� �ð��� �ɸ� �� �����Ƿ� �̸� �������� �����̴�.
	LogoCanvas02() {
		Toolkit kit = Toolkit.getDefaultToolkit();
		logo = kit.getImage("src/P_0610/������.jpg");
	}

	// �� �ȿ� paint()�� �������̵� �Ѵ�.
	public void paint(Graphics g) {
		// �� �Լ��� ĵ������ �ʿ��� �׸��� �׸��� ������ �ϴ� Ŭ�����̴�.
		// Graphics g �̰��� �׸��� �׸��� ����� �����ϴ� Ŭ�����̴�.
		// ���� Graphics Ŭ������ ���� ����� �׿��ؼ� ���ϴ� �׸��� �׸���ȴ�.
		// drawImage(Image img, int x, int y, ImageObserver observer)
		// �׸��� �׸� ���� ��ġ�� �˷��ָ� ���ڸ��� �׸��� �׸��� ���
		// ImageObserver observer �׸��� �׸��� ��Ҹ� �����ϴ� ��
		// Canvas�� �׸��� �׸� �� �ִ� ����
		g.drawImage(logo, 10, 10, this);
	}
}