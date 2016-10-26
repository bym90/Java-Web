package P_0526;

public class Clone_01 {

	public static void main(String[] args) {
		Test031 t1 = new Test031(5, 10);
		//오류난 이유 clone()은 protected 함수이다
		//			  그러므로 상속 받은곳에서만 사용할 수 있다
		// 			  지금 이 함수를 사용하는 클래스 Clone_01이고
		//			  이 클래스 Test031 클래스와는 관계가 없다
		Test031 t2 = null;
		try{
			t2 = (Test031)t1.clone();	
		}
		catch(Exception e) {
		}
		System.out.println(t2.a);
		System.out.println(t2.b);
		
	}

}

//어떤 클래스가 clone 함수를 실행하기 위해서 Cloneable이라는 인터페이스를 상속받아야 함!

class Test031 implements Cloneable{
	int a, b;

	Test031(){

		a = 0;
		b = 0;
	}

	Test031(int a, int b){
	//지역변수와 전역변수는 만들어지는 위치가 다르므로 같은 이름의 변수를 만들 수 있다
	//다만 이처럼 지역과 전역이 충돈되면 지역변수를 우선 사용한다
	//이런 경우 특정 변수를 전역 변수로 명시하기 위해서는 this를 사용
		this.a = a;
		this.b = b;
	}
	
	public Object clone() throws CloneNotSupportedException{
		// 이 함수는 깊은 복사를 해주는 함수인데 그 기능을 바꾸고 싶어서
		// 오버라이딩 하는것이 아니라 접근을 허용하기 위해서 오버라이딩 한 것
		// 하지만 오버라이딩을 한 이상 상위클래스의 기능이 무시되므로
		// 개발자가 직접 원하는 내용을 만들어 주어야 할 것이다
		
		Object temp = super.clone();
		// 그러면 아버지가 깊은복사를 해서 결과를 알려줄 것이다
		return temp;
		
	}
	
	
}

	// clone 함수를 사용할 수 없는 이유가 protected이기 때문이다
	// 그러면 만약 이 함수가 public이면 사용할 수 있을 것이다




