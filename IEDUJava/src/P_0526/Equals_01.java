package P_0526;

public class Equals_01 {

	public static void main(String[] args) {
		Test011 t1 = new Test011(10);
		Test011 t2 = new Test011(10);
		
		if(t1.equals(t2)){ //현재까지는 주소를 비교하는 기능
			System.out.println("같은 클래스이다");
		}
		else{
			System.out.println("다른 클래스이다");
		}
	}

}
class Test011{
	int num;
	Test011(){ // new Test011()
		num=0;
	}
	Test011(int n){	 // new Test011(5)
		num=n;
	}
	public boolean equals(Object obj){
		// 이 함수의 반환값이 boolean인데 비교해서 같은 클래스이면 true로 반환
		// 다른 클래스이면 false 반환
		
		// 비교를 하려면 오브젝트가 두개 있어야 한다
		
		// 하나는 매개변수인 obj가 기억가는 것이 확실하다
		
		// 이 함수를 사용하는 입장에서 살펴보자
		// t1.equals(t2)의 방식으로 사용할 것이다
		
		// 멤버함수를 호출하는 주소는 this가 기억한다
		// 그러므로 this에 다른 오브젝트(t1)가 기억될 것이다
		// 그러므로 매개변수인 obj안에는 t2가 기억될 것이다
		
		// 다형성 구현을 위해서 레퍼런스에 함수가 존재해야한다
		// obj는 Object이므로 Object안에 내가 필요한 변수나 함수가 있어야 한다
		// 시작위치에 원하는 것이 없으면 문제가 생김 => 계층추적원리에 의해서
		// 계층추적이 되지 않으므로 시작 위치(레퍼런스)를 바꿔주어야 한다
		
		Test011 temp = (Test011) obj;
		// 무엇을 비교할지 생각
		// 나는 이 클래스에서 num변수의 값이 같은지 비교하고 싶다
		if(this.num == temp.num){
			return true;
		}
		else{
			return false;
		}
		
		
		
	}
}



