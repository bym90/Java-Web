package P_0610;

/*
 * 문제
 * 회사 로그 마크를 화면에 그려서 출력하는 프로그램을 작성하세요
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

// 회사 로고 마크를 도구로 만들기 위해서 Canvas클래스를 상속받은 클래스를 만든다
class LogoCanvas02 extends Canvas {
	// 외부 로고 이미지를 기억하는 변수를 만든다.
	Image logo;

	// 이 클래스를 new시킬때 이미지를 불러오자
	// 이유는 외부파일이므로 시간이 걸릴 수 있으므로 미리 가지고올 예정이다.
	LogoCanvas02() {
		Toolkit kit = Toolkit.getDefaultToolkit();
		logo = kit.getImage("src/P_0610/김유정.jpg");
	}

	// 이 안에 paint()를 오버라이드 한다.
	public void paint(Graphics g) {
		// 이 함수는 캔버스에 필요한 그림을 그리는 역할을 하는 클래스이다.
		// Graphics g 이것이 그림을 그리는 기능을 제공하는 클래스이다.
		// 따라서 Graphics 클래스가 가진 기능을 잉요해서 원하는 그림을 그리면된다.
		// drawImage(Image img, int x, int y, ImageObserver observer)
		// 그림을 그릴 시작 위치를 알려주면 그자리에 그림을 그리는 기능
		// ImageObserver observer 그림을 그리는 장소를 지정하는 것
		// Canvas는 그림을 그릴 수 있는 도구
		g.drawImage(logo, 10, 10, this);
	}
}
