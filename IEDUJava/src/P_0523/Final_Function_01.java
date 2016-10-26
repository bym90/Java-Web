package P_0523;

public class Final_Function_01 {

	public static void main(String[] args) {
		Test001 t = new Test001();
		t.a = 100;
		//t.b = 200; final 변수는 데이터를 바꾸지 못한다.
		//예를 들어 PI나 E

	}

}

class Test001 { //extends String{final 클래스라서 상속이 안된
	int a = 10;
	final int b = 20;
	
	void abc(){
		
	}
	final void xyz(){
		
	}

}

class Test011 extends Test001{
	void abc(){
		
	}
	/*
	void xyz(){
		final 함수는 오버라이드 시킬 수 없는 함수
		예를 들어 wait 함수
	}
	*/
}