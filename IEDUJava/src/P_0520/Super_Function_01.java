package P_0520;

public class Super_Function_01 {

	public static void main(String[] args) {
		Test082	t = new Test082();

	}

}

class Test081 {
	Test081() {
		System.out.println("���� �ƹ����� ����Ʈ ������");
	}
	Test081(int a) {
		System.out.println("���� �ƹ����� int ������");
	}
}
class Test082 extends Test081 {
	Test082() {
		super(5);
	}
}