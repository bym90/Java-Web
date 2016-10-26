package P_0607;

import java.awt.*;
/*
 * ���� 5���� �Է��غ���
 */
public class FlowLayout_01 extends Frame{

	public FlowLayout_01() {
		//�̹� Frame�� �غ�Ǿ� �ִ�.
		//��ġ ������ ���쵵�� �Ѵ�.
		//1. ������ ��ġ������ �����Ѵ�.
		FlowLayout lay = new FlowLayout(FlowLayout.LEFT, 10, 10);
		//2. �����̳ʿ� ��ġ������ ��ġ�Ѵ�.
		this.setLayout(lay);
		//�ʿ��� ���� �����Ѵ�.
		String[] title = {"A", "B", "C", "D", "E"};
		Button[] btn = new Button[5];
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new Button(title[i]);
		}
		
		//������ �ݵ�� �����̳ʿ� �־���Ѵ�.
		for (int i = 0; i < btn.length; i++) {
			this.add(btn[i]);
		}
		
		setSize(400, 400);
		setVisible(true);
		
		
	}

	public static void main(String[] args) {
		new FlowLayout_01();

	}

}