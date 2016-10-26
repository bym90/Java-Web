package P_0518;

public class Constructor_01 {

	public static void main(String[] args) {
		System.out.println("1");
		Test041		t;
		System.out.println("2");
		t = new Test041(3);
		System.out.println("3");
	}
}

class Test041 {
	Test041(){}
	Test041(int a){
		System.out.println("나는 생성자 함수이다.");
	}
}