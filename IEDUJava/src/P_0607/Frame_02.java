package P_0607;

import java.awt.*;
public class Frame_02 extends Frame{
	
//클래스를 사용하는 방법은 두가지가 있는데
//1. new를 시켜서 사용하는 방법 has A
//2. 상속받아서 사용하는 방법 is A
	public Frame_02() {
		//어떤 클래스가 필요한 시점이 되면 그 순간에 클래스를 new시켜서 사용하는 방법
//		Frame f = new Frame();
//		
//		f.setSize(300, 400);
//		f.setVisible(true);
		
		//is A관계로 클래스를 사용하는 방법
		//4번째줄에 extends Frame을 사용함으로써 이 클래스는 Frame이 가진 모든 기능을
		//복사해서 사용할 수 있다.
		//따라서 생성자함수를 호출했다는 것은 아버지 클래스의 생성자도
		//호출되었다는 의미이다.(아버지 클래스의 Frame이 이미 만들어짐)
		//그러므로 이미 Frame이 생성되었다.
		this.setSize(400, 400);
		this.setVisible(true);
		
	}

	public static void main(String[] args) {
		new Frame_02();

	}

}
