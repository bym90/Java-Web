package P_0622;

// 이 클래스는 프로세서로 실행되는 클래스이다.
public class Thread_01 {

	public Thread_01() {
		// 프로세서가 실행되면 스레드를 실행할 수 있다.
		// 스레드가 필요한 시점이 되면
		// 1. New Born 상태로 만든다.
		MyThread011 t1 = new MyThread011();
		MyThread012 t2 = new MyThread012();
		
		// 2. Runable 상태로 전위시킨다.
		t1.start();
		t2.start();
		
		// 3. 이제는 cpu의 몫이 된다.
		for (int i = 0; i < 1000; i++) {
			int dap = 9 * i;
					System.out.println("\t\t9 * " + i + " = " + dap);
		}
	}

	public static void main(String[] args) {
		new Thread_01();

	}

}

// 스레드로 실행되는 프로그램을 만들어보자
class MyThread011 extends Thread{
	// 이 프로그램은 독립적인 프로그램이므로 진입점 함수가 있어야 한다.
	// 그 함수가 바로 run()함수이다.
	public void run(){
		// 이 안에서부터 출발하여 원하는 프로그램을 만들면 된다.
		for (int i = 0; i < 1000; i++) {
			int dap = 5 * i;
					System.out.println("5 * " + i + " = " + dap);
		}
	}
}
// 이것의 단점은 다른 클래스를 상속받지 못한다. 이미 Thread를 상속받은 상태여서
// 2개 이상의 클래스를 상속 받지 못한다.
class MyThread012 extends Thread{
	public void run(){
		for (int i = 0; i < 1000; i++) {
			int dap = 7 * i;
					System.out.println("\t7 * " + i + " = " + dap);
		}
	}
}