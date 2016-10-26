package P_0614;

import java.awt.event.*;
import javax.swing.*;
import GUI.*;

public class Progress_01 {
	JProgressBar bar;

	public Progress_01() {
		CJFrame f = new CJFrame();

		bar = new JProgressBar(JProgressBar.HORIZONTAL, 0, 100);
		bar.setStringPainted(true);
		JButton b = new JButton("Click");
		b.addActionListener(new ButtonEvent());
		f.add("North", bar);
		f.add("South", b);

		f.setSize(400, 400);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new Progress_01();

	}

	// ���߸� ������ ��ġ ������ �����Ѵٰ� �����ϰ�
	// ���� ������ �°Բ� ����ٰ� ��ȭ�ǵ��� �غ���.
	class ButtonEvent implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			MyThread t = new MyThread(Progress_01.this);
			t.start();
		}
	}
}

// ���� ����� �ʾ����� ������ ó���� �ؾ��Ұ� ����.
// �ֳ��ϸ� �̹� ������� ���� �ڵ� �������� ���Ѵ�.
// �׷��Ƿ� ��׶��� �۾��� ���ؼ� ��ȭ�Ƿ� �ؾ� �Ѵ�.
class MyThread extends Thread {
	Progress_01 main;

	MyThread(Progress_01 m) {
		main = m;
	}

	public void run() {
		// 0%~100%���� ������ ����ǰ� �ִٰ� �����ϰ�
		for (int i = 0; i <= 100; i++) {
			main.bar.setValue(i);
			// �ʹ� �ӵ��� ������ ��̾����Ƿ� �ӵ��� ���� ������
			try {
				// 1�ʸ��� �ѹ��� �ݺ��ϼ���.
				Thread.sleep(100);
			} 
			catch (Exception e1) {
			}
		}
	}
}