package P_0622;

public class Thread_07 {
	// 이 두개의 함수는 두개의 스레드가 같이 사용할 공용 함수이다.
	// 스레드가 공동사용하는 함수이므로 동기화가 되지 않으면
	// 어떤 스레드가 실행되었는지 알아낼 수 없다.
	synchronized void abc() {
		String name = Thread.currentThread().getName();
		System.out.println(name + "스레드가 abc사용 시작");
		try {
			Thread.sleep(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
		name = Thread.currentThread().getName();
		System.out.println(name + "스레드가 abc사용 끝");
	}

	synchronized void xyz() {
		String name = Thread.currentThread().getName();
		System.out.println(name + "스레드가 xyz사용 시작");
		try {
			Thread.sleep(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
		name = Thread.currentThread().getName();
		System.out.println(name + "스레드가 xyz사용 끝");
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
	// 위쪽 클래스의 멤버를 사용하기 위해서 클래스 통신을 시도한다.
	Thread_07 main;

	public MyThread071(String name, Thread_07 m) {
		super(name);
		main = m;
	}

	public void run() {
		// 이곳에서 위쪽에 있는 abc()를 사용할 예정이다.
		// 왜냐면 스레드는 프로세스와 메모리를 공유하므로 얼마든지
		// 함수나 변수를 사용할 수 있다.
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