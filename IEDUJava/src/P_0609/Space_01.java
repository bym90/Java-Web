package P_0609;

import java.awt.*;
public class Space_01 extends Frame{

	public Space_01() {
		Button b = new Button("Click");
		
		Panel SouthP = new Panel(){
			public Dimension getPreferredSize(){
				return new Dimension(100, 100);
			}
		};
		
		Panel NorthP = new Panel(){
			public Dimension getPreferredSize(){
				return new Dimension(100, 100);
			}
		};
		//�ϳ��� ���� ����ϸ� �ȵȴ�.
		//������ �ʿ��� �����ٸ� �ٸ����� ����ؾ��Ѵ�.
		
//		this.add("South", SouthP);
//		this.add("North", SouthP);
		//�Ʒ��� ������ ������ �ʴ� ������
		//���� ������ �α��� ���� ���Ѵ�.
		
		this.add("South", SouthP);
		this.add("North", NorthP);

		
		this.add(b);
		
		this.setSize(400, 400);
		this.setVisible(true);
		
	}

	public static void main(String[] args) {
		new Space_01();

	}

}