package P_0607;

import java.awt.*;
public class Frame_02 extends Frame{
	
//Ŭ������ ����ϴ� ����� �ΰ����� �ִµ�
//1. new�� ���Ѽ� ����ϴ� ��� has A
//2. ��ӹ޾Ƽ� ����ϴ� ��� is A
	public Frame_02() {
		//� Ŭ������ �ʿ��� ������ �Ǹ� �� ������ Ŭ������ new���Ѽ� ����ϴ� ���
//		Frame f = new Frame();
//		
//		f.setSize(300, 400);
//		f.setVisible(true);
		
		//is A����� Ŭ������ ����ϴ� ���
		//4��°�ٿ� extends Frame�� ��������ν� �� Ŭ������ Frame�� ���� ��� �����
		//�����ؼ� ����� �� �ִ�.
		//���� �������Լ��� ȣ���ߴٴ� ���� �ƹ��� Ŭ������ �����ڵ�
		//ȣ��Ǿ��ٴ� �ǹ��̴�.(�ƹ��� Ŭ������ Frame�� �̹� �������)
		//�׷��Ƿ� �̹� Frame�� �����Ǿ���.
		this.setSize(400, 400);
		this.setVisible(true);
		
	}

	public static void main(String[] args) {
		new Frame_02();

	}

}