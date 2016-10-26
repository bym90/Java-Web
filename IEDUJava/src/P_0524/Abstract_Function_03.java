package P_0524;

public class Abstract_Function_03 {

	public static void main(String[] args) {
		//	추상 클래스는 스스로 new 될 수 없다.
		//  Test031	t = new Test031();
		//	new 시킬때는 사용자가 만든 클래스를 이용해서 new 시킨다.
		Test032	t = new Test032();
	}

}


abstract class Test031 {
	void abc() {
		
	}
	abstract void xyz();
}

class Test032 extends Test031 {
	void xyz() {
		//	기능을 만들어 주어라.
	}
}