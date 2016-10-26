package P_0610;

import java.awt.*;
import GUI.*;
public class Test_01 {

	public Test_01() {
		//Frame을 만들 위치에서 내가 만든 CFrame을 이용하자
		CFrame f = new CFrame();
		//이 안에 필요한 도구도 담을 수 있다
		
		f.setSize(400, 400);
		f.setVisible(true);
		
	}

	public static void main(String[] args) {
		new Test_01();

	}

}
