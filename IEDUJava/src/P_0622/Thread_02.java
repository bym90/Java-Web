package P_0622;

public class Thread_02 {

	public Thread_02() {
		// �����尡 �ʿ��� ������ �Ǹ�
		MyThread021 temp1 = new MyThread021();
		MyThread022 temp2 = new MyThread022();
		// ��������� �Ϲ� Ŭ������ new��Ų���̴�.
		// 1. new Born ��Ų��
		Thread t1 = new Thread(temp1);
		Thread t2 = new Thread(temp2);
		// 2. Runnable�� ������Ų��.
		t1.start();
		t2.start();
		for (int i = 0; i < 1000; i++) {
			System.out.println("\t\t����");
		}
	}

	public static void main(String[] args) {
		new Thread_02();

	}

}

class MyThread021 implements Runnable{
	public void run(){
		// ������ 1000�� ���
		for (int i = 0; i < 1000; i++) {
			System.out.println("�ȳ�");
		}
	}
}

class MyThread022 implements Runnable{
	public void run(){
		for (int i = 0; i < 1000; i++) {
			System.out.println("\t�߰�");
		}
	}
}