package LJY.LJY_BOOK.자바의정석.chapter6;
/**
 * 메소드가 호출되면서
 * 스택에 쌓이고 종료되는 시점을 알 수 있는 예제이다.
 *
 * 메인이 맨 처음 시작되었지만 맨 마지막에 닫히는 예제이다.
 *
 * @author nostalgia10
 *
 */
public class CallStackTest_263 {
	static void firstMethod(){
		System.out.println("firstMethod() 시작");
		secondMethod();
		System.out.println("firstMethod() 종료");
	}

	static void secondMethod(){
		System.out.println("secondMethod() 시작");
		finalMethod();
		System.out.println("finalMethod()  종료");
	}

	static void finalMethod(){
		System.out.println("finalMethod() 시작");
		System.out.println("finalMethod() 종료");
	}


	public static void main(String[] args) {
		System.out.println("main(String args[] 시작");

		firstMethod();

		System.out.println("main(String args[] 종료");
	}

}
