package P_0607;

import java.awt.*;
public class Frame_01 {
	public Frame_01(){
		//������ �Լ� �ȿ����� this�� ����� �� �ְ�
		//�� ���п� ��� ����� ����� �� �ִ�.
		Frame f = new Frame();
		//Frame�� �ٸ� �����̳ʰ� ���� ����� �� �ִ�.
		
		f.setSize(400, 400);
		f.setVisible(true);
		//������ �̺�Ʈ�� ����� �ʾ����Ƿ� ���Ḧ��ų �� ����.
		//�ܼ�â�� ������ �����ؾ� �Ѵ�.
	}
	public static void main(String[] args) {
		//���� �Լ��� static �Լ��̹Ƿ� static ����� ����� �� �ִ�.
		//���� �ǹ������� main���� �ڵ����� �ʴ� ���� ��Ģ�̴�.
		//��� this�� �����ϴ� ������ �Լ����� �ڵ��� ������ ������ �Ѵ�.
		//��� ���α׷��� main���� ����ϹǷ� ������ ������ �Լ��� ȣ���ؾ� �Ѵ�.
		new Frame_01();
		//�� ���������� ���α׷� Ʋ����� �۾�
	}

}