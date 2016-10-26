package P_0622;

public class Thread_07 {
	// �� �ΰ��� �Լ��� �ΰ��� �����尡 ���� ����� ���� �Լ��̴�.
	// �����尡 ��������ϴ� �Լ��̹Ƿ� ����ȭ�� ���� ������
	// � �����尡 ����Ǿ����� �˾Ƴ� �� ����.
	synchronized void abc() {
		String name = Thread.currentThread().getName();
		System.out.println(name + "�����尡 abc��� ����");
		try {
			Thread.sleep(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
		name = Thread.currentThread().getName();
		System.out.println(name + "�����尡 abc��� ��");
	}

	synchronized void xyz() {
		String name = Thread.currentThread().getName();
		System.out.println(name + "�����尡 xyz��� ����");
		try {
			Thread.sleep(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
		name = Thread.currentThread().getName();
		System.out.println(name + "�����尡 xyz��� ��");
	}

	public Thread_07() {
		MyThread071 t1 = new MyThread071("A", this);
		MyThread072 t2 = new MyThread072("B", this);
		t1.start();
		t2.start();
	}

	public static void main(String[] args) {
		new Thread_07();

	}

}

class MyThread071 extends Thread {
	// ���� Ŭ������ ����� ����ϱ� ���ؼ� Ŭ���� ����� �õ��Ѵ�.
	Thread_07 main;

	public MyThread071(String name, Thread_07 m) {
		super(name);
		main = m;
	}

	public void run() {
		// �̰����� ���ʿ� �ִ� abc()�� ����� �����̴�.
		// �ֳĸ� ������� ���μ����� �޸𸮸� �����ϹǷ� �󸶵���
		// �Լ��� ������ ����� �� �ִ�.
//		main.abc();
		main.xyz();
	}
}

class MyThread072 extends Thread {
	Thread_07 main;

	public MyThread072(String name, Thread_07 m) {
		super(name);
		main = m;
	}

	public void run() {
		main.abc();
//		main.xyz();
	}
}