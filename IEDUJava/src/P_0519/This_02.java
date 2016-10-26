package P_0519;

public class This_02 {

	public static void main(String[] args) {
		Test001 t = new Test001();
		t.setNum(100);
		System.out.println(t.a);

	}
}


class Test001{
	int a;
 
	void setNum(int a){
		/*
		 * 멤버변수와 지역변수는 같은 이름으로 만들어도 상관없다
		 * 만들어지는 위치가 다르기 때문
		 * 이 때 이 함수에서는 멤버 변수도 사용할 수 있고
		 * 					   지역 변수도 사용할 수 있다
		 * 변수는 자기에게 가장 가까운쪽을 선택한다라는 원리에 따라
		 * 지역변수를 사용하게 된다
		 */
		this.a = a;
		
	}
}