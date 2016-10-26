package P_0622;

/*
 * ���ΰ� �����带 ���ÿ� �۾��� ��Ű���� �Ѵ�.
 * ������ ����Ǹ� �����嵵 ���� ����ǵ��� �Ѵ�.
 */
public class Thread_05 {

	public Thread_05() {
		// �̹� ������ Runnable ���¿� ���� �����Ƿ�
		// ���� �����带 Runnable���·� �ִ´�.
		MyThread051 t = new MyThread051();
		t.start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println("������ ���� �Ѵ�.");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// �� �κ��� ����ȴٴ��� �ǹ̴� for ������ �����ٴ� �ǹ��̰�
		// �׷��� ������ �� ���� �����ٴ� �ǹ��̴�.
		// �׷��Ƿ� �����嵵 ���� ������ �Ѵ�.
//		t.stop();
		// run() �Լ��� ������ ����ǵ��� �ؾ� �Ѵ�
		t.isStop = true;
		
	}

	public static void main(String[] args) {
		new Thread_05();
		
	}

}

class MyThread051 extends Thread{
	boolean isStop = false;
	public void run(){
		while(isStop == false){
		System.out.println("�����尡 ���� �Ѵ�.");
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
	}
}