package P_0609;

import java.awt.*;
public class UserSize_01 {

	public UserSize_01() {
		Frame f = new Frame();
		f.setLayout(new FlowLayout());
		
		Button b = new Button("1��"){
			public Dimension getPreferredSize(){
//				Dimension dim = new Dimension(100, 20);
//				return dim;
				//���� ����ũ��� ���� ũ�� �״�� ����ϰ�
				//	   ����ũ��� 100���� �ϰ��ʹ�
				//����
				//���� ũ�⸦ �˾Ƴ���
				Dimension dim = super.getPreferredSize();
				//��ӹ޾����� �ƹ����� ũ��
				int		width = dim.width;
				int		height = dim.height;
				return new Dimension(width, 100);
			}
		};
		f.add(b);
		
		f.setSize(400, 400);
		f.setVisible(true);
		
	}

	public static void main(String[] args) {
		new UserSize_01();

	}

}

//������ �ּ�ũ�⸦ ����ڰ� �����ؼ� ����ϴ� ���
//1. �ʿ��� ������ ��ӹ��� Ŭ������ �����Ѵ�.
//class MyButton extends Button{
//	//2. getPreferredSize()�� �������̵� �Ѵ�.
//	public Dimension getPreferredSize(){
//		//3. �ּ�ũ��� ���� ũ�⸦ Dimension Ŭ������ ����
//		//	 ��ȯ�Ѵ�.
//		Dimension dim = new Dimension(100, 20);
//		return dim;
//	}
//}