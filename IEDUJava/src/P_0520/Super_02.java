package P_0520;

public class Super_02 {
	public static void main(String[] args) {
		Test073 t = new Test073();
		t.xyz();
	}
}

class Test071 {
	void abc() {
		System.out.println("나는 할아버지");
	}
}
class Test072 extends Test071 {
	void abc() {
		System.out.println("나는 아버지");
	}
}
class Test073 extends Test072 {
	void xyz() {
		super.abc();// 아버지까지는 사용할 수 있으나
		 //	할아버지까지는 사용불가
		 // super.super.abc(); 불가
		 // super는 오직 한단계 상위까지만 지칭
	}
	void abc() {
		System.out.println("나는 아들");
	}
}

