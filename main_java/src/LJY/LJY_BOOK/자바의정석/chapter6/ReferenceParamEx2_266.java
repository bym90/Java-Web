package LJY.LJY_BOOK.자바의정석.chapter6;

public class ReferenceParamEx2_266 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {10};	//크기가 1인 배열
		System.out.println("main() : x = "+x[0] );

		change(x);
		System.out.println("After change(x)");
		System.out.println("main() : x "+x[0]);

	}

	static void change(int[] x){
		x[0] = 1500;
		System.out.println("change( : x "+ x[0]);
	}

}
