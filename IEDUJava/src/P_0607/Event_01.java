package P_0607;

import java.awt.*;
import java.awt.event.*;
/*
 * ���߸� �ΰ� ����� �� �� �ϳ����� �̺�Ʈ�� ����Ͽ�
 * "A"�� ����ϵ��� �϶�
 */
public class Event_01 implements ActionListener{
		Frame f;
		TextArea t;
	public Event_01() {
		Frame f = new Frame();
		TextArea t = new TextArea(10, 10);
		
		Button b1 = new Button("1��");
		Button b2 = new Button("2��");
		//1�� ���߸� �̺�Ʈ�� ó���ϵ��� ����ϰ� �ʹ�.
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
		//�� �ȿ� �̺�Ʈ�� �߻��ϸ� �ϰ� ���� �ൿ�� �ڵ��ض�
		System.out.println("A");
	}

}

//class ButtonEvent implements ActionListener{
//	public void actionPerformed(ActionEvent e){
//		//�� �ȿ� �̺�Ʈ�� �߻��ϸ� �ϰ� ���� �ൿ�� �ڵ��ض�
//		System.out.println("A");
//	}
//}