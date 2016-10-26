package P_0622;

import java.util.*;

public class Thread_08 {
	// 다음에 만들 두개의 스레드가 공통으로 사용할 변수이다.
	Vector v;

	public Thread_08() {
		v = new Vector();
		MyThread081 t1 = new MyThread081(this);
		MyThread082 t2 = new MyThread082(this);
		t1.start();
		t2.start();
	}

	public static void main(String[] args) {
		new Thread_08();

	}

}

class MyThread081 extends Thread {
	Thread_08 main;

	MyThread081(Thread_08 m) {
		main = m;
	}

	public void run() {
		// 첫번쨰 스레드에서는 벡터에 데이터를 입력하도록 하자.
		// 10개의 데이터를 다 입력완료할때까지 꺼내지 못하게 하고 싶다.
		synchronized (main.v) {
			for (int i = 0; i < 10; i++) {
				int temp = (int) (Math.random() * 100);
				main.v.addElement(temp);
				System.out.println(temp + "입력함");
				// 한번 입력하면 조금 쉬었다가 입력하도록 조절하자
				int time = (int) (Math.random() * (3000 - 500 + 1) + 500);
				try {
					Thread.sleep(time);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}

class MyThread082 extends Thread {
	Thread_08 main;

	MyThread082(Thread_08 m) {
		main = m;
	}

	public void run() {
		// 두번째 스레드는 벡터의ㅣ 내용을 꺼내서 출력한다.
		for (int i = 0; i < 10; i++) {
			int temp = (int) main.v.get(0);
			System.out.println("\t" + temp + "출력함");
			// 꺼낸 데이터를 지우자
			main.v.removeElementAt(0);
			// 한번 입력하면 조금 쉬었다가 입력하도록 조절하자
			int time = (int) (Math.random() * (3000 - 500 + 1) + 500);
			try {
				Thread.sleep(time);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}