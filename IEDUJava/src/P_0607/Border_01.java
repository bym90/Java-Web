package P_0607;

import java.awt.*;
public class Border_01 extends Frame {

	public Border_01() {
		BorderLayout lay = new BorderLayout();
		setLayout(lay);
		//7,8 �ּ�ó���ص� dafault�� BorderLayout�� �ȴ�.
		//������ ���� ��ġ�� ���������� ������ �ڵ������� Center�� �ȴ�
		
		Button b1 = new Button("A");
		Button b2 = new Button("B");
		Button b3 = new Button("C");
		Button b4 = new Button("D");
		Button b5 = new Button("E");
		Button b6 = new Button("F");
		
		//�����̳ʿ� ������ �ִµ� ��ġ������ Border�̹Ƿ� 
		//������ �����ؼ� �־���Ѵ�.
		
		add(b1, "East");
		add("South", b2);
		add(b3, BorderLayout.NORTH);
		add(BorderLayout.WEST, b4);
		add(b5);
//		add(b6, "Center");
		
		setSize(300, 300);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new Border_01();

	}

}