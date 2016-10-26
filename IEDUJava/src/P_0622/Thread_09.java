package P_0622;

/*
 * ������ �Һ��� �̷п� ���� ����ȭ�� ������
 * 
 * ����
 * ���� ���;ȿ��� �������� ������ ������ ������
 * �츮�� ���� �ȿ��� 5�� �̻� �����͸� �Է����� ���Ѵٰ� ��������.
 */
import java.util.*;

public class Thread_09 {
	Vector v;

	// �����͸� �����ϱ� ���� �Լ��� �����.
	synchronized void makeData() {
		int size = v.size();
		if (size >= 5) {
			System.out.println("������ �����Ⱑ �ƴ϶� �ڷ�����");
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		int temp = (int) (Math.random() * 100);
		v.add(temp);
		System.out.println(temp + "������" + " ���簳��" + v.size());
		// ���� �ϳ��� ������ ����Ǿ����Ƿ� �ٸ� �����尡 ���� �� ��
		// �ִ� ���°� �Ǿ���.
		notify();
	}

	// �����͸� �Һ��ϴ� ���� �Լ��� �����.
	synchronized void removeData() {
		int size = v.size();
		if (size <= 0) {
			System.out.println("�Һ��� �����Ⱑ �ƴ϶� �ڷ�����");
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		int temp = (int) v.get(0);
		System.out.println("\t" + temp + "�Һ���" + " ���簳��" + v.size());
		v.remove(0);
		// �� ������ �����ڰ� ���� �ص� �Ǵ� ������ �Ǿ���.
		notify();
	}

	public Thread_09() {
		v = new Vector();
		MyThread091 t1 = new MyThread091(this);
		MyThread092 t2 = new MyThread092(this);
		t1.start();
		t2.start();
	}

	public static void main(String[] args) {
		new Thread_09();
	
	}

}

class MyThread091 extends Thread {
	Thread_09 main;

	MyThread091(Thread_09 m) {
		main = m;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			main.makeData();
			int time = (int) (Math.random() * (1000 - 500 + 1) + 500);
			try {
				Thread.sleep(time);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class MyThread092 extends Thread {
	Thread_09 main;

	MyThread092(Thread_09 m) {
		main = m;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			main.removeData();
			int time = (int) (Math.random() * (3000 - 500 + 1) + 500);
			try {
				Thread.sleep(time);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}