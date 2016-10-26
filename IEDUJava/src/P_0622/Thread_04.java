package P_0622;

public class Thread_04 {

	public Thread_04() {
		// Runnable로 만든 스레드는 먼저 new를 시킨다.
		MyThread041 temp1 = new MyThread041();
		MyThread042 temp2 = new MyThread042();
		// 아직 스레드적인 처리는 되지 않았다.
		// New Born 상태
		Thread t1 = new Thread(temp1);
		Thread t2 = new Thread(temp2);
		// Runnable 상태로 전위한다.
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
			System.out.println("\t여기" + i);
			// 이 프로그램이 자신에게 주어진 시간이 되지 않았어도
			// 스스로가 Run상태에서 Runnable상태로 나올 수 있다.
			Thread.yield();
		}
	}
}

class MyThread042 implements Runnable{
	public void run(){
		for (int i = 0; i < 500; i++) {
			System.out.println("저기" + i);
		}
	}
}