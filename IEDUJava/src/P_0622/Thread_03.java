package P_0622;

public class Thread_03 {

	public Thread_03() {
		// ���� ���ε� ���� ���� �ؾ������� ���ص� �������.
		// �����常 ���۽�Ű��.
		MyThread031 t1 = new MyThread031();
		MyThread032 t2 = new MyThread032();
//		t1.start();
//		t2.start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println("������ ���� �Ѵ�" + i);
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// ������ 100�� ���� �� �� �����尡 �ʿ��ϴ�.
		t1.start();
		t2.start();
	}

	public static void main(String[] args) {
		new Thread_03();

	}

}

class MyThread031 extends Thread{
	public void run(){
		for (int i = 0; i < 100; i++) {
			System.out.println("����" + i);
			// �ѹ� ���� �ϸ� 0.1�ʴ� �����ϰ� �ʹ�.
			// �����ϴ� ���߿� Block ���·� 0.1�� �������� �ȴ�.
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class MyThread032 extends Thread{
	public void run(){
		for (int i = 0; i < 100; i++) {
			System.out.println("\t����" + i);
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}