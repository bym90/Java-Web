package P_0520;

public class Super_Function_01 {

	public static void main(String[] args) {
		Test082	t = new Test082();

	}

}

class Test081 {
	Test081() {
		System.out.println("나는 아버지의 디폴트 생성자");
	}
	Test081(int a) {
		System.out.println("나는 아버지의 int 생성자");
	}
}
class Test082 extends Test081 {
	Test082() {
		super(5);
	}
}