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

	// 단추를 누르면 마치 파일을 복사한다고 가정하고
	// 복사 비율에 맞게끔 진행바가 변화되도록 해보자.
	class ButtonEvent implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			MyThread t = new MyThread(Progress_01.this);
			t.start();
		}
	}
}

// 아직 배우지 않았지만 스래드 처리를 해야할것 같다.
// 왜냐하면 이미 만들어진 폼은 자동 수정되지 못한다.
// 그러므로 백그라운드 작업을 통해서 변화되록 해야 한다.
class MyThread extends Thread {
	Progress_01 main;

	MyThread(Progress_01 m) {
		main = m;
	}

	public void run() {
		// 0%~100%까지 파일이 복사되고 있다고 가정하고
		for (int i = 0; i <= 100; i++) {
			main.bar.setValue(i);
			// 너무 속도가 빠르면 재미없으므로 속도를 조금 늦추자
			try {
				// 1초마다 한번씩 반복하세요.
				Thread.sleep(100);
			} 
			catch (Exception e1) {
			}
		}
	}
}