package LKY.test;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class test {
public static void main(String ar[]){

	    JFrame frame = new JFrame(); //������ �����

		// �����ӿ��� x������ ���� ����
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// â�ȿ��� �߾ӿ� �� ���� ���ϱ�
		JLabel label = new JLabel("�ڹ� ����");

		// â�ȿ� ���� �ֱ�
		frame.getContentPane().add(label);

		// ������ ���� ����
		frame.setTitle("Java Swing");
		// JFrame frame = new JFrame("Java Swing); ������ ����� �Բ� ��ü ����

		// ������ ������ ���ϱ�(����,����)
		frame.setSize(300, 100);
		// frame.pack(); ���뿡 ���� ������ ������ �ڵ�����

		// �������� �⺻������ ������ �ʰ� �Ǿ� �����Ƿ� ���̰� �ϴ� ����
		frame.setVisible(true);
}
}