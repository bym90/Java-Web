package P_0613;

/*
 * Swing Frame을 만들자.
 */
import javax.swing.*;

public class JFrame_01 {

	public JFrame_01() {
		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		frame.setVisible(true);
		// AWT와 차이점
		// 1. x 단추를 누르면 이벤트가 자동 걸려있다.
		// 문제 setVisible(false)만 처리된다.
		// 팁
		// JFrame에 x 단추 누르면 실행되는 이벤트 바꾸기
		// 사용함수 setDefaultCloseOperation(int operation)
		// DO_NOTHING_ON_CLOSE
		// HIDE_ON_CLOSE
		// DISPOSE_ON_CLOSE
		// EXIT_ON_CLOSE
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new JFrame_01();

	}

}
