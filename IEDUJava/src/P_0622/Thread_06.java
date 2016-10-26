package P_0622;

/*
 * 하나의 스레드 프로그램을 이용해서 여러번 실행 할 수도 있다.
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
		// 이름은 아버지 클래스가 해결함으로 아버지 클래스의
		// 생성자를 강제로 호출
		super(name);
	}
	public void run() {
		// 스레드에 이름 부여
		for(int i = 0; i < 50; i++) {
			// 실핸하는 이 스레드의 이름을 알아내자.
			// Thread.currentThread() 현재 실행중인 스레드를 알아낸다.
			// getName() 스레드의 이름을 알아낸다.
			
			// 지금 어떤 스레드가 일을 하는지 알아내자.
			Thread work = Thread.currentThread();
			// 이 스레드의 이름을 알아내자.
			String name = work.getName();
			if(name.equals("A")){
				System.out.println("A가 일을 한다" + i);
			}
			else if(name.equals("B")){
				System.out.println("B가 일을 한다" + i);
			}
			try {
				Thread.sleep(150);
			}
			catch(Exception e) {}
		}
	}
}