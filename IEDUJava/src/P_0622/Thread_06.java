package P_0622;

/*
 * �ϳ��� ������ ���α׷��� �̿��ؼ� ������ ���� �� ���� �ִ�.
 */
public class Thread_06 {

	public Thread_06() {
		MyThread061	t1 = new MyThread061("A");
		MyThread061	t2 = new MyThread061("B");
		t1.start();
		t2.start();
	}

	public static void main(String[] args) {
		new Thread_06();

	}

}


class MyThread061 extends Thread {
	public MyThread061(String name){
		// �̸��� �ƹ��� Ŭ������ �ذ������� �ƹ��� Ŭ������
		// �����ڸ� ������ ȣ��
		super(name);
	}
	public void run() {
		// �����忡 �̸� �ο�
		for(int i = 0; i < 50; i++) {
			// �����ϴ� �� �������� �̸��� �˾Ƴ���.
			// Thread.currentThread() ���� �������� �����带 �˾Ƴ���.
			// getName() �������� �̸��� �˾Ƴ���.
			
			// ���� � �����尡 ���� �ϴ��� �˾Ƴ���.
			Thread work = Thread.currentThread();
			// �� �������� �̸��� �˾Ƴ���.
			String name = work.getName();
			if(name.equals("A")){
				System.out.println("A�� ���� �Ѵ�" + i);
			}
			else if(name.equals("B")){
				System.out.println("B�� ���� �Ѵ�" + i);
			}
			try {
				Thread.sleep(150);
			}
			catch(Exception e) {}
		}
	}
}