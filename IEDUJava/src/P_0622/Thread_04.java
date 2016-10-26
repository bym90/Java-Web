package P_0622;

public class Thread_04 {

	public Thread_04() {
		// Runnable�� ���� ������� ���� new�� ��Ų��.
		MyThread041 temp1 = new MyThread041();
		MyThread042 temp2 = new MyThread042();
		// ���� ���������� ó���� ���� �ʾҴ�.
		// New Born ����
		Thread t1 = new Thread(temp1);
		Thread t2 = new Thread(temp2);
		// Runnable ���·� �����Ѵ�.
		t1.start();
		t2.start();
	}

	public static void main(String[] args) {
		new Thread_04();

	}

}

class MyThread041 implements Runnable{
	public void run(){
		for (int i = 0; i < 500; i++) {
			System.out.println("\t����" + i);
			// �� ���α׷��� �ڽſ��� �־��� �ð��� ���� �ʾҾ
			// �����ΰ� Run���¿��� Runnable���·� ���� �� �ִ�.
			Thread.yield();
		}
	}
}

class MyThread042 implements Runnable{
	public void run(){
		for (int i = 0; i < 500; i++) {
			System.out.println("����" + i);
		}
	}
}