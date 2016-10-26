package P_0523;

public class Polymorphism_01 {

	public static void main(String[] args) {
		//아버지가 아들을 관리하는것은 상관없음
		//Father001 f = new Son001();
		//f.abc();
		
		//실제 이용하는 인스턴스는 Father이므로 아들이 아버지를 관리하는것은 안됨
		//Son001 s = (Son001) new Father001();
		//s.abc();
	
		/*Son001  s1 = new Son001();
		Father001 f = s1;
		Son001 s2 = (Son001) f;
		
		s2.abc();*/
	}

}

class Father001{
	void abc(){
		System.out.println("나는 아버지");
	}
}

class Son001 extends Father001{
	void xyz(){
		System.out.println("나는 아들");
	}
	void abc(){
		System.out.println("나는 아버지");
	}
}