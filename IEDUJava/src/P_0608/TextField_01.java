package P_0608;
/*
 * ����
 * �ؽ�Ʈ �ʵ带 ����� ���´�
 */
import java.awt.*;
public class TextField_01 {
	
	public TextField_01() {
		Frame f = new Frame();
		//�ּ�ũ�⸣ ���������ؼ��� �ּ�ũ��� ��Ÿ���� ��ġ������ ��������
		f.setLayout(new FlowLayout());
		//�� ������ ��Ÿ���� ������ �۲��� �����ϴ� ���
		//Font Ŭ������ ������ �� �� Ŭ������ setFont()�� �̿��ؼ� ����Ѵ�.
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