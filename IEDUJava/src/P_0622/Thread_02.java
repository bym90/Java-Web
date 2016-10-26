package P_0622;

public class Thread_02 {

	public Thread_02() {
		// 스레드가 필요한 시점이 되면
		MyThread021 temp1 = new MyThread021();
		MyThread022 temp2 = new MyThread022();
		// 여기까지는 일반 클래스를 new시킨것이다.
		// 1. new Born 시킨다
		Thread t1 = new Thread(temp1);
		Thread t2 = new Thread(temp2);
		// 2. Runnable로 전위시킨다.
		t1.start();
		t2.start();
		for (int i = 0; i < 1000; i++) {
			System.out.println("\t\t하이");
		}
	}

	public static void main(String[] args) {
		new Thread_02();

	}

}

class MyThread021 implements Runnable{
	public void run(){
		// 내용을 1000번 출력
		for (int i = 0; i < 1000; i++) {
			System.out.println("안녕");
		}
	}
}

class MyThread022 implements Runnable{
	public void run(){
		for (int i = 0; i < 1000; i++) {
			System.out.println("\t잘가");
		}
	}
}