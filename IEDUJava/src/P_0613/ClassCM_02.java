package P_0613;

/*
 * ���߸� �ϳ� ����� �� ���߸� Ŭ���ϸ� ������ �ٲٴ� ���α׷��� �ۼ��ϼ���
 * ��, �̺�Ʈ Ŭ������ ���� Ŭ������ �����ϼ���.
 */
import java.awt.*;
import java.awt.event.*;
import GUI.*;

// frame�̶�� ������ MyEvent02���� ����ϱ�����
//�� Ŭ������ �ؿ� Ŭ������ ���� ����� �ؾ��Ѵ�
//1. ���� �����Ǵ� Ŭ������ �״�� new ��Ų��.
//2. ������ �����Ǵ� Ŭ������ new��Ű�鼭 �ڽ��� �ּҸ� �˷��ش�.
public class ClassCM_02 {
	CFrame frame;

	public ClassCM_02() {
		frame = new CFrame();
		frame.setLayout(new FlowLayout());
		Button b = new Button("Click");
		b.addActionListener(new MyEvent02(this));// 2�� �κ�
		frame.add(b);
		frame.setSize(400, 400);
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		new ClassCM_02();

	}

}

class MyEvent02 implements ActionListener {
	// 3. ������ �����Ǵ� Ŭ������ ������ �Լ��� �̿��ؼ� �Ѿ���� �ּҸ�
	// ���� �غ� �Ѵ�.
	ClassCM_02 main;
	MyEvent02(){}
	MyEvent02(ClassCM_02 cc){
		main = cc;
	}
	public void actionPerformed(ActionEvent e) {
		// ���� ���ϱ�
		int red = (int) (Math.random() * (255 - 0 + 1) + 1);
		int blue = (int) (Math.random() * (255 - 0 + 1) + 1);
		int green = (int) (Math.random() * (255 - 0 + 1) + 1);
		Color c = new Color(red, blue, green);
		main.frame.setBackground(c);
	}
}