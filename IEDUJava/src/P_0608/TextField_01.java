package P_0608;
/*
 * 문제
 * 텍스트 필드를 만들어 놓는다
 */
import java.awt.*;
public class TextField_01 {
	
	public TextField_01() {
		Frame f = new Frame();
		//최소크기르 ㄹ보기위해서는 최소크기로 나타나는 배치전략을 선택하자
		f.setLayout(new FlowLayout());
		//팁 도구에 나타나는 글자의 글꼴을 지정하는 방법
		//Font 클래스를 생성한 후 이 클래스를 setFont()를 이용해서 등록한다.
		Font font = new Font("SansSerif", Font.BOLD, 20);
		TextField  tf = new TextField(20);
		tf.setFont(font);
		
		f.add(tf);
		f.setSize(400, 400);
		f.setVisible(true);
		
	}

	public static void main(String[] args) {
		new TextField_01();

	}

}
