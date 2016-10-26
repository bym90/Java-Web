package LKY.test;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class test {
public static void main(String ar[]){

	    JFrame frame = new JFrame(); //프레임 만들기

		// 프레임에서 x누르면 정상 종료
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 창안에서 중앙에 쓸 내용 정하기
		JLabel label = new JLabel("자바 스윙");

		// 창안에 내용 넣기
		frame.getContentPane().add(label);

		// 프레임 제목 쓰기
		frame.setTitle("Java Swing");
		// JFrame frame = new JFrame("Java Swing); 프레임 제목과 함께 객체 생성

		// 프레임 사이즈 정하기(가로,세로)
		frame.setSize(300, 100);
		// frame.pack(); 내용에 맞춰 프레임 사이즈 자동조절

		// 프레임은 기본세이팅 보이지 않게 되어 있으므로 보이게 하는 세팅
		frame.setVisible(true);
}
}
