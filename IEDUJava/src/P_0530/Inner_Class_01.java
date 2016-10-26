package P_0530;

public class Inner_Class_01 {

	public static void main(String[] args) {
		Outer01.Inner01 in = new Outer01.Inner01();
		in.a = 10;
		in.asd();
		
		Outer01 out = new Outer01();
		out.a = 20;
		out.asd();
	}

}

class Outer01{
	int a;
	void asd(){
		System.out.println("나는 바깥 클래스이다.");
		System.out.println("A = " + a);
		
	}
	static class Inner01{
		int a;
		void asd(){
			System.out.println("나는 안쪽 클래스이다.");
			System.out.println("A = " + a);
		}
	}
}