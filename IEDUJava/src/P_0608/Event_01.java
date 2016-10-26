package P_0608;

/*
 * 단추를 두개 만들고 하나를 누르면 파란색으로 색상을 칠하고
 * 다른 하나를 누르면 빨간색으로 색상을 칠하라.
 */
import java.awt.*;
import java.awt.event.*;

public class Event_01 {
	public Frame frame;

	public Event_01() {
		frame = new Frame("대화상자");
		frame.setLayout(new BorderLayout());

		Button b1 = new Button("파란색");
		Button b2 = new Button("빨간색");
		b1.addActionListener(new ButtonEvent1());
		b2.addActionListener(new ButtonEvent2());

		frame.add("North", b1);
		frame.add("South", b2);

		frame.setSize(400, 400);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new Event_01();
	}
	
	//이벤트 클래스를 제작한다.
	class ButtonEvent1 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			//이곳은 첫번째 단추를 위한 클래스
			frame.setBackground(Color.blue);
		}
	}
	
	class ButtonEvent2 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			//이곳은 두번째 단추를 위한 클래스
			frame.setBackground(Color.red);
		}
	}

}
