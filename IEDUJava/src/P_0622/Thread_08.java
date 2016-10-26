package P_0622;

import java.util.*;

public class Thread_08 {
	// ������ ���� �ΰ��� �����尡 �������� ����� �����̴�.
	Vector v;

	public Thread_08() {
		v = new Vector();
		MyThread081 t1 = new MyThread081(this);
		MyThread082 t2 = new MyThread082(this);
		t1.start();
		t2.start();
	}

	public static void main(String[] args) {
		new Thread_08();

	}

}

class MyThread081 extends Thread {
	Thread_08 main;

	MyThread081(Thread_08 m) {
		main = m;
	}

	public void run() {
		// ù���� �����忡���� ���Ϳ� �����͸� �Է��ϵ��� ����.
		// 10���� �����͸� �� �Է¿Ϸ��Ҷ����� ������ ���ϰ� �ϰ� �ʹ�.
		synchronized (main.v) {
			for (int i = 0; i < 10; i++) {
				int temp = (int) (Math.random() * 100);
				main.v.addElement(temp);
				System.out.println(temp + "�Է���");
				// �ѹ� �Է��ϸ� ���� �����ٰ� �Է��ϵ��� ��������
				int time = (int) (Math.random() * (3000 - 500 + 1) + 500);
				try {
					Thread.sleep(time);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}

class MyThread082 extends Thread {
	Thread_08 main;

	MyThread082(Thread_08 m) {
		main = m;
	}

	public void run() {
		// �ι�° ������� �����Ǥ� ������ ������ ����Ѵ�.
		for (int i = 0; i < 10; i++) {
			int temp = (int) main.v.get(0);
			System.out.println("\t" + temp + "�����");
			// ���� �����͸� ������
			main.v.removeElementAt(0);
			// �ѹ� �Է��ϸ� ���� �����ٰ� �Է��ϵ��� ��������
			int time = (int) (Math.random() * (3000 - 500 + 1) + 500);
			try {
				Thread.sleep(time);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}