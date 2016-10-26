package P_0520;

public class Overriding_02 {

	public static void main(String[] args) {
		Test013 t = new Test013();
		t.abc();

	}

}


class Test003{
	 void abc(){
		 System.out.println("나는 아버지의 abc함수이다");
	 }
}

class Test013 extends Test003{
	/*
	void abc(){
		이 함수는 오버라이딩
	}
	*/
		
		//이 함수는 오버라이딩이 아니다
		//매개변수가 다르므로 오버로딩이다. 그래서 에러가 안남
	void abc(int a){
		System.out.println("나는 아들의 abc함수이다.");
	}
	/*
	int abc(){
		System.out.println("나는 아들의 abc함수이다");
	}
	//원형이 다르고 오버라이딩이 아니다
	//매개변수가 같으므로 오버로딩도 아니다. 그래서 에러
	*/
	
	
}