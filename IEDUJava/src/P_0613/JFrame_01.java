package P_0613;

/*
 * Swing Frame�� ������.
 */
import javax.swing.*;

public class JFrame_01 {

	public JFrame_01() {
		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		frame.setVisible(true);
		// AWT�� ������
		// 1. x ���߸� ������ �̺�Ʈ�� �ڵ� �ɷ��ִ�.
		// ���� setVisible(false)�� ó���ȴ�.
		// ��
		// JFrame�� x ���� ������ ����Ǵ� �̺�Ʈ �ٲٱ�
		// ����Լ� setDefaultCloseOperation(int operation)
		// DO_NOTHING_ON_CLOSE
		// HIDE_ON_CLOSE
		// DISPOSE_ON_CLOSE
		// EXIT_ON_CLOSE
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new JFrame_01();

	}

}