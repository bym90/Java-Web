package P_0518;

public class Overlaoding_01 {

	public static void main(String[] args) {
		Test011	t = new Test011();
		t.abc(3.14);
	}
}

class Test011 {
	void abc() {
		System.out.println("1�� �Լ�");
	}
	void abc(int a) {
		System.out.println("2�� �Լ�");
	}
	void abc(float a) {
		System.out.println("3�� �Լ�");
	}
	void abc(double a) {
		System.out.println("4�� �Լ�");
	}
	void abc(int a, float b) {
		System.out.println("5�� �Լ�");
	}
}