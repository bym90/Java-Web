package P_0524;
/*
 * ���߸� �ϳ� ����� ���߸� Ŭ���ϸ� hello�� �������
 */
import java.awt.*;
import java.awt.event.*;
public class Interface_04 {

	public static void main(String[] args) {
		Frame f = new Frame("��ȭ����");
		Button b = new Button("Click");

		b.addActionListener(new MyEvent09());//�������� : ������Ʈ�� ������ ������� �ʾƵ� �Ǽ� ����x	
		f.add(b);								//������ �ʿ䰡 �����Ƿ� �ּҿ� ���x
												//�� ������ ������� �ʾƵ� ������Ʈ ����
		
		f.setSize(400, 400);
		f.setVisible(true);
		
	}

}

class MyEvent09 implements ActionListener{
	public void actionPerformed(ActionEvent e){
		System.out.println("hello");
	}
}