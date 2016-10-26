package P_0607;

import java.awt.*;
import java.awt.event.*;
/*
 * 단추를 두개 만들고 그 중 하나에만 이벤트를 등록하여
 * "A"를 출력하도록 하라
 */
public class Event_01 implements ActionListener{
		Frame f;
		TextArea t;
	public Event_01() {
		Frame f = new Frame();
		TextArea t = new TextArea(10, 10);
		
		Button b1 = new Button("1번");
		Button b2 = new Button("2번");
		//1번 단추만 이벤트를 처리하도록 등록하고 싶다.
		b1.addActionListener(this);
		//b1.addActionListener(new ButtonEvent());
		
		f.add("North", b1);
		f.add("South", b2);
		
		f.setSize(300, 300);
		f.setVisible(true);
		
	}

	public static void main(String[] args) {
		new Event_01();
	}
	
	public void actionPerformed(ActionEvent e){
		//이 안에 이벤트가 발생하면 하고 싶은 행동을 코딩해라
		System.out.println("A");
	}

}

//class ButtonEvent implements ActionListener{
//	public void actionPerformed(ActionEvent e){
//		//이 안에 이벤트가 발생하면 하고 싶은 행동을 코딩해라
//		System.out.println("A");
//	}
//}
