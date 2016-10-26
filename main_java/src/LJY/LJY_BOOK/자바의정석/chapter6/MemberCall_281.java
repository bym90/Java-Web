package LJY.LJY_BOOK.자바의정석.chapter6;

public class MemberCall_281 {
	int iv = 10;
	static int cv =20;

	int iv2= cv;
//	static int cv2= iv;	//Cannot make a static reference to the non-static field iv
						// 에러. 클래스메서드에서 인스턴스변수를 사용불가
	static int cv2 = new MemberCall_281().iv;	//객체를 생성한 후에야 인스턴스변수 사용가능.

	static void staticMethod1(){
		System.out.println(cv);
//		System.out.println(iv);	//Cannot make a static reference to the non-static field iv

		MemberCall_281 c = new MemberCall_281();
		System.out.println(c.iv);	//객체를 생성한 후에야 인스턴스변수의 참조가능
	}

	void instanceMethod1(){	//인스턴스 메서드
		System.out.println(cv);
		System.out.println(iv);	//인스턴스메서드에서는 인스턴스변수를 바로 사용가능
	}

	static void staticMethod(){	//클래스 메소드
		staticMethod1();
//		instanceMethod(); //The method instanceMethod() is undefined for the type MemberCall_281
							//에러. 클래스메서드에서는 인서튼서메서드 호출 할 수 없음
		MemberCall_281 c = new MemberCall_281();
		c.instanceMethod1(); 	//인스턴스를 생성한 후에 호출가능
	}

	void instanceMethod2(){	//인스턴스메서드에서는 인스턴스메서드와 클래스메서드 모두 호출 가능
		staticMethod1();
		instanceMethod1();
	}

	public static void main(String[] args) {


	}

}
