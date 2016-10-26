package P_0518;

public class Overlaoding_01 {

	public static void main(String[] args) {
		Test011	t = new Test011();
		t.abc(3.14);
	}
}

class Test011 {
	void abc() {
		System.out.println("1번 함수");
	}
	void abc(int a) {
		System.out.println("2번 함수");
	}
	void abc(float a) {
		System.out.println("3번 함수");
	}
	void abc(double a) {
		System.out.println("4번 함수");
	}
	void abc(int a, float b) {
		System.out.println("5번 함수");
	}
}