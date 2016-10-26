package LJY.LJY_BOOK.자바의정석.chapter6;

public class MethodTest {
	int result;
	int add(int x , int y){
			result = x + y;
		return result;
	}

	int multiply(int x, int y){
			result = x * y;
		return result;
	}

	public static void main(String[] args) {

		MethodTest m = new MethodTest();
		m.add(5, 6);

		System.out.println(m.result);

		m.multiply(5, 6);
		System.out.println(m.result);



	}

}
