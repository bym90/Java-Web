package P_0607;

import java.awt.*;

public class Dialog_01 {

	public Dialog_01() {
		//Dialog�� ����� ���ؼ��� �ٸ� �����̳ʰ� �켱 �����ؾ� �Ѵ�.
		Frame f = new Frame();
		Dialog d = new Dialog(f);
		
		d.setSize(400, 400);
		d.setVisible(true);
		
	}

	public static void main(String[] args) {
		new Dialog_01();

	}

}