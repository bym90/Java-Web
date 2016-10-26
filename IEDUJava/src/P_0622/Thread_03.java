package P_0622;

public class Thread_03 {

	public Thread_03() {
		// 물론 메인도 뭔가 일을 해야하지만 안해도 상관없다.
		// 스레드만 동작시키자.
		MyThread031 t1 = new MyThread031();
		MyThread032 t2 = new MyThread032();
//		t1.start();
//		t2.start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println("메인이 일을 한다" + i);
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// 메인이 100번 일을 한 후 쓰레드가 필요하다.
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
			System.out.println("ㅋㅋ" + i);
			// 한번 일을 하면 0.1초는 쉬게하고 싶다.
			// 실행하는 도중에 Block 상태로 0.1초 내보내면 된다.
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
			System.out.println("\tㅎㅎ" + i);
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}