package P_0608;

/*
 * ���߸� �ΰ� ����� �ϳ��� ������ �Ķ������� ������ ĥ�ϰ�
 * �ٸ� �ϳ��� ������ ���������� ������ ĥ�϶�.
 */
import java.awt.*;
import java.awt.event.*;

public class Event_01 {
	public Frame frame;

	public Event_01() {
		frame = new Frame("��ȭ����");
		frame.setLayout(new BorderLayout());

		Button b1 = new Button("�Ķ���");
		Button b2 = new Button("������");
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
	
	//�̺�Ʈ Ŭ������ �����Ѵ�.
	class ButtonEvent1 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			//�̰��� ù��° ���߸� ���� Ŭ����
			frame.setBackground(Color.blue);
		}
	}
	
	class ButtonEvent2 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			//�̰��� �ι�° ���߸� ���� Ŭ����
			frame.setBackground(Color.red);
		}
	}

}