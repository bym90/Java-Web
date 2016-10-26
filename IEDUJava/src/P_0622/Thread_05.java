package P_0622;

/*
 * 메인과 스레드를 동시에 작업을 시키도록 한다.
 * 메인이 종료되면 스레드도 같이 종료되도록 한다.
 */
public class Thread_05 {

	public Thread_05() {
		// 이미 메인은 Runnable 상태에 들어와 있으므로
		// 이제 스레드를 Runnable상태로 넣는다.
		MyThread051 t = new MyThread051();
		t.start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println("메인이 일을 한다.");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// 이 부분이 실행된다느느 의미는 for 명령이 끝났다는 의미이고
		// 그러면 메인이 할 일이 끝났다는 의미이다.
		// 그러므로 스레드도 같이 끝내야 한다.
//		t.stop();
		// run() 함수가 스스로 종료되도록 해야 한다
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
		System.out.println("스레드가 일을 한다.");
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
	}
}