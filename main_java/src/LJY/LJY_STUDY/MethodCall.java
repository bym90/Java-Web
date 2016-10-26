package LJY.LJY_STUDY;

public class MethodCall {
	static int a;		//클래스(Static) 변수
	int b;		//인스턴스 필드
	static void setA(int i){ //클래스(Static) 메소드
		a = i;
	}

	void setB(int i) { //인스턴스 메소드
		b = i;
	}
	public static void main(String[] args) {
		MethodCall obj1 = new MethodCall();		//객체 생성
		MethodCall obj2 = new MethodCall();		//객체 생성

		setA(10);
		System.out.println("setA :"+a);

		obj1.setA(20);
		System.out.println("setA :"+a);
		System.out.println("setA :"+obj1.a);

//		MethodCall.setb(50);
//		The method setb(int) is undefined for the type MethodCall



		obj1.setB(30);
		obj2.setB(40);
		System.out.println("obj1.setB :"+obj1.b);
		System.out.println("obj2.setB :"+obj1.b);





	}

}
