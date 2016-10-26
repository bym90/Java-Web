package P_0520;

public class Super_01 {

	public static void main(String[] args) {
		Test015 t=new Test015();
		t.xyz();
	}

}


class Test005{
	void abc(){
	 System.out.println("나는 아버지의 abc 함수이다");
	}
}

class Test015 extends Test005{
	void xyz(){
		System.out.println("나는 아들의 xyz 함수이다");
		//abc(); //abc 함수는 오버라이드 되었으므로 내가 만든 함수가 실행된다
		//이런 경우에 만약 한번만 아버지의 abc가 필요하다면
		//이처럼 상위 클래스의 멤버가 필요하다면
		//상위 클래스의 멤버임을 밝혀주면된다
		//슈퍼는 오직 한단계 상위만을 지정
		super.abc();
	}
	/*
	void abc(){
		System.out.println("나는 아들의 abc 함수이다");
	}*/
}
