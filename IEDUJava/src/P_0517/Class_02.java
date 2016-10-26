package P_0517;
/*
 * 클래스를 하나 만들고 사용해 보자
 * 원래는 하나의 파일에 하나의 클래스만 만드는 것이 원칙이다
 * 우리는 간단한 테스트를 목적이니깐 하나의 파일에 여러개의 클래스를 만들어
 * 테스트 해보자
 */
public class Class_02 {

	public static void main(String[] args) {
		Test001 t = new Test001();

		t.num1 = 100;
		t.num2 = 200;

		t.calc();
		t.display();
	}
}


class Test001{
	int num1, num2;
	int sum;
	//멤버 변수는 전역 변수라고도 한다. 따라서 다른 함수에서도 변수 사용 가능
	void calc(){
		sum = num1 + num2;
	}
	
	void display(){
		System.out.println("합은 " + sum);
	}	
}
