package P_0520;

public class Overriding_01 {
	public static void main(String[] args) {
		Test012	t = new Test012();
		t.abc();
		t.xyz();
	}
}

class Test002{
	void abc(){
		System.out.println("나는 아버지의 abc 함수이다");
	}
}

class Test012 extends Test002{
		//알파의 작업을 할 수 있다.
	void xyz(){
		System.out.println("나는 아들의 xyz 함수이다");
		//아버지 클래스가 가진 함수의 기능이 목적과 같지 않으면 변경할 수 있다.
		//함수의 오버라이딩이라고 한다
	}
	
	void abc(){
		System.out.println("나는 아들의 abc 함수이다.");
	}
	
	
}