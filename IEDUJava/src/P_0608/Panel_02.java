package P_0608;

import java.awt.*;
public class Panel_02 extends Frame {

	public Panel_02() {
		Button b1 = new Button("1��");
		Button b2 = new Button("2��");
		Button b3 = new Button("3��");
		
		Panel p1 = new Panel(new GridLayout(3, 1, 10, 10));
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		//Panel�� ��ġ������ ������ ������ Flow�� �ȴ�
		Panel p2 = new Panel();
		p2.add(p1);
		
		this.add("West", p2);
		this.setSize(400, 400);
		this.setVisible(true);
		
	}

	public static void main(String[] args) {
		new Panel_02();

	}

}

//���� ������ ��ȭ���� 2~3���� �����Ͽ� �� ��� �״�� ���鵵�� �غ���.