package P_0607;

import java.awt.*;
public class GridLayout_01 {

	public GridLayout_01() {
		Frame f = new Frame();
		//�� �����̳ʿ� ���� ��ġ������ �����.
		GridLayout lay = new GridLayout(2, 3, 10, 10);
		f.setLayout(lay);
		
		String[] title = {"A", "B", "C", "D", "E", "F"};
		Button[] btn = new Button[6];
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new Button(title[i]);
		}
		
		for (int i = 0; i < 4; i++) {//���� 5�� 6�� ����
			f.add(btn[i]);
		}
		
		f.add(new Label(""));
		f.add(new Label(""));
		//���ڸ� �����ֱ����� ��ĭ�� �־��ش�.
		
		f.setSize(300, 300);
		f.setVisible(true);
		
	}

	public static void main(String[] args) {
		new GridLayout_01();

	}

}