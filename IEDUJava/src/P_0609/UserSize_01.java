package P_0609;

import java.awt.*;
public class UserSize_01 {

	public UserSize_01() {
		Frame f = new Frame();
		f.setLayout(new FlowLayout());
		
		Button b = new Button("1번"){
			public Dimension getPreferredSize(){
//				Dimension dim = new Dimension(100, 20);
//				return dim;
				//문제 가로크기는 원래 크기 그대로 사용하고
				//	   세로크기는 100으로 하고싶다
				//절차
				//현재 크기를 알아낸다
				Dimension dim = super.getPreferredSize();
				//상속받았으니 아버지의 크기
				int		width = dim.width;
				int		height = dim.height;
				return new Dimension(width, 100);
			}
		};
		f.add(b);
		
		f.setSize(400, 400);
		f.setVisible(true);
		
	}

	public static void main(String[] args) {
		new UserSize_01();

	}

}

//도구의 최소크기를 사용자가 지정해서 사용하는 방법
//1. 필요한 도구를 상속받은 클래스를 제작한다.
//class MyButton extends Button{
//	//2. getPreferredSize()를 오버라이드 한다.
//	public Dimension getPreferredSize(){
//		//3. 최소크기로 잡을 크기를 Dimension 클래스로 만들어서
//		//	 반환한다.
//		Dimension dim = new Dimension(100, 20);
//		return dim;
//	}
//}