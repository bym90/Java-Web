package LJY.LJY_BOOK.자바의정석.chapter6;

public class MyMath_254 {
	long add(long a, long b){
		return a+b;
	}

	long subtract(long a, long b){
		return a-b;
	}

	long multiply(long a, long b){
		return a*b;
	}

	long divide(long a, long b){
		return a/b;
	}


	public static void main(String[] args) {
		MyMath_254 mm = new MyMath_254();

		long result1 = mm.add(5L, 7L);
		long result2 = mm.subtract(5L, 7L);
		long result3 = mm.multiply(5L, 7L);
		long result4 = mm.divide(5L, 7L);


		System.out.println(mm.subtract(1, 9));



		System.out.println("add결과 : "+result1);
		System.out.println("subtract결과 : "+result2);
		System.out.println("multiply결과 : "+result3);
		System.out.println("divide결과 : "+result4);



	}

}
