package P_0524;

public class Interface_02 {

	public static void main(String[] args) {
		//Inter07 in = new Inter07();
		//인터페이스는 스스로 new시킬수 없다
		Inter07 in = new MyClass07();
		//다형성 이용
		MyClass07 in1 = new MyClass07();
		//그대로 사용
		in.asd();
		
	}

}

interface Inter07{
	void asd();
}

class MyClass07 implements Inter07{
	public void asd(){
		//접근지정자가 줄는 방향으로 오버라이딩 할 수 없기때문에
		//public 접근지정자를 써줘야한다
		System.out.println("나는 함수다");
	}
}