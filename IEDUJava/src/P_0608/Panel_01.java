package P_0608;

import java.awt.*;
public class Panel_01 {

	public Panel_01() {
		Frame f = new Frame();
		
		Button b1 = new Button("1��");
		Button b2 = new Button("2��");
		//���� 2���� ���ÿ� �Ʒ��� ����ֱ� ���ؼ� ������ �ؾ��Ѵ�.
		Panel p = new Panel();
		p.add(b1);
		p.add(b2);
		
		f.add(p, "South");
		
		f.setSize(400, 400);
		f.setVisible(true);
		
	}

	public static void main(String[] args) {
		new Panel_01();

	}

}