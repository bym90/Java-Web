package P_0622;

// �� Ŭ������ ���μ����� ����Ǵ� Ŭ�����̴�.
public class Thread_01 {

	public Thread_01() {
		// ���μ����� ����Ǹ� �����带 ������ �� �ִ�.
		// �����尡 �ʿ��� ������ �Ǹ�
		// 1. New Born ���·� �����.
		MyThread011 t1 = new MyThread011();
		MyThread012 t2 = new MyThread012();
		
		// 2. Runable ���·� ������Ų��.
		t1.start();
		t2.start();
		
		// 3. ������ cpu�� ���� �ȴ�.
		for (int i = 0; i < 1000; i++) {
			int dap = 9 * i;
					System.out.println("\t\t9 * " + i + " = " + dap);
		}
	}

	public static void main(String[] args) {
		new Thread_01();

	}

}

// ������� ����Ǵ� ���α׷��� ������
class MyThread011 extends Thread{
	// �� ���α׷��� �������� ���α׷��̹Ƿ� ������ �Լ��� �־�� �Ѵ�.
	// �� �Լ��� �ٷ� run()�Լ��̴�.
	public void run(){
		// �� �ȿ������� ����Ͽ� ���ϴ� ���α׷��� ����� �ȴ�.
		for (int i = 0; i < 1000; i++) {
			int dap = 5 * i;
					System.out.println("5 * " + i + " = " + dap);
		}
	}
}
// �̰��� ������ �ٸ� Ŭ������ ��ӹ��� ���Ѵ�. �̹� Thread�� ��ӹ��� ���¿���
// 2�� �̻��� Ŭ������ ��� ���� ���Ѵ�.
class MyThread012 extends Thread{
	public void run(){
		for (int i = 0; i < 1000; i++) {
			int dap = 7 * i;
					System.out.println("\t7 * " + i + " = " + dap);
		}
	}
}