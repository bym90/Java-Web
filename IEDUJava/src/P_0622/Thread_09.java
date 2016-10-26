package P_0622;

/*
 * 생산자 소비자 이론에 따른 동기화를 만들어보자
 * 
 * 가정
 * 원래 벡터안에는 데이터의 갯수가 한정이 없지만
 * 우리는 벡터 안에는 5개 이상 데이터를 입력하지 못한다고 가정하자.
 */
import java.util.*;

public class Thread_09 {
	Vector v;

	// 데이터를 생산하기 위한 함수를 만든다.
	synchronized void makeData() {
		int size = v.size();
		if (size >= 5) {
			System.out.println("생산할 분위기가 아니라서 자러간다");
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		int temp = (int) (Math.random() * 100);
		v.add(temp);
		System.out.println(temp + "생산함" + " 현재개수" + v.size());
		// 이제 하나의 물건이 생산되었으므로 다른 스레드가 일을 할 수
		// 있는 상태가 되었다.
		notify();
	}

	// 데이터를 소비하는 위한 함수를 만든다.
	synchronized void removeData() {
		int size = v.size();
		if (size <= 0) {
			System.out.println("소비할 분위기가 아니라서 자러간다");
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		int temp = (int) v.get(0);
		System.out.println("\t" + temp + "소비함" + " 현재개수" + v.size());
		v.remove(0);
		// 이 시점에 생산자가 일을 해도 되는 시점이 되었다.
		notify();
	}

	public Thread_09() {
		v = new Vector();
		MyThread091 t1 = new MyThread091(this);
		MyThread092 t2 = new MyThread092(this);
		t1.start();
		t2.start();
	}

	public static void main(String[] args) {
		new Thread_09();
	
	}

}

class MyThread091 extends Thread {
	Thread_09 main;

	MyThread091(Thread_09 m) {
		main = m;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			main.makeData();
			int time = (int) (Math.random() * (1000 - 500 + 1) + 500);
			try {
				Thread.sleep(time);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class MyThread092 extends Thread {
	Thread_09 main;

	MyThread092(Thread_09 m) {
		main = m;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			main.removeData();
			int time = (int) (Math.random() * (3000 - 500 + 1) + 500);
			try {
				Thread.sleep(time);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
