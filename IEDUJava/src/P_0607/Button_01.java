package P_0607;

import java.awt.*;
public class Button_01 {

	public Button_01() {
		//���� �����̳ʸ� �ϳ� �غ��Ѵ�.
		Frame f = new Frame();
		//�����̳ʿ� �� ����(������Ʈ)�� �ʿ��� ��ŭ �غ��Ѵ�.
		Button b = new Button("��ư");
		
		
		//������Ʈ�� �ݵ�� �����̳ʿ� ���� �Ѵ�.
		f.add(b);
		
		//ȭ�鿡�� �����̳ʸ� ����ϸ� �ȴ�. �׷��� �� �ȿ� �ִ�
		//��� ������Ʈ�� ��µǰ� �ȴ�.
		f.setSize(400, 400);
		f.setVisible(true);
		
	}

	public static void main(String[] args) {
		new Button_01();
		

	}

}