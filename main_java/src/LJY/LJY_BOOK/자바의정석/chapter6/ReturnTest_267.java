package LJY.LJY_BOOK.자바의정석.chapter6;

public class ReturnTest_267 {
	int add(int a, int b){
		return a+b;
	}

	void add(int a, int b, int[] result){
		result[0] = a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnTest_267 r = new ReturnTest_267();

		int result = r.add(3,5);
		System.out.println(result);

		int[] result2= {0};	//배열을 생성하고 result2[0]의 값을 0으로 초기화
		r.add(6,7,result2);	// 배열을 add메서드의 매겨변수로 전달

		System.out.println(result2[0]);

	}

}
