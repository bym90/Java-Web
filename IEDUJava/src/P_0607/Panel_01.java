package P_0607;

import java.awt.*;

public class Panel_01 {

	public Panel_01() {
		//�г��� ������ ȭ�鿡 ������ ���Ѵ�.
		//�ݵ�� �ٸ� �����̳ʿ� ���Խ��Ѽ� �ٸ� �����̳ʰ� ���ö�
		//���� �������� �ؾ��Ѵ�.
		Frame f = new Frame();
		Panel p = new Panel();
		
		p.setBackground(Color.red);
	
		f.add(p);
		
		f.setSize(400, 400);
		f.setVisible(true);
		
	}

	public static void main(String[] args) {
		new Panel_01();

	}

}