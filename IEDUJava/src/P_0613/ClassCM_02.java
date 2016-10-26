package P_0613;

/*
 * 단추를 하나 만들고 그 단추를 클릭하면 색상을 바꾸는 프로그램을 작성하세요
 * 단, 이벤트 클래스를 독립 클래스로 제작하세요.
 */
import java.awt.*;
import java.awt.event.*;
import GUI.*;

// frame이라는 변수를 MyEvent02에서 사용하기위해
//이 클래스와 밑에 클래스가 서로 통신을 해야한다
//1. 먼저 생성되는 클래스는 그대로 new 시킨다.
//2. 다음에 생성되는 클래스는 new시키면서 자신의 주소를 알려준다.
public class ClassCM_02 {
	CFrame frame;

	public ClassCM_02() {
		frame = new CFrame();
		frame.setLayout(new FlowLayout());
		Button b = new Button("Click");
		b.addActionListener(new MyEvent02(this));// 2번 부분
		frame.add(b);
		frame.setSize(400, 400);
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		new ClassCM_02();

	}

}

class MyEvent02 implements ActionListener {
	// 3. 다음에 생성되는 클래스는 생성자 함수를 이용해서 넘어오는 주소를
	// 받을 준비를 한다.
	ClassCM_02 main;
	MyEvent02(){}
	MyEvent02(ClassCM_02 cc){
		main = cc;
	}
	public void actionPerformed(ActionEvent e) {
		// 색상 정하기
		int red = (int) (Math.random() * (255 - 0 + 1) + 1);
		int blue = (int) (Math.random() * (255 - 0 + 1) + 1);
		int green = (int) (Math.random() * (255 - 0 + 1) + 1);
		Color c = new Color(red, blue, green);
		main.frame.setBackground(c);
	}
}
