package P_0518;

public class Overloading_02 {

	public static void main(String[] args) {
		Test021	t = new Test021();
		
//		int	hap = t.add(5, 6);
		int[] data = {5, 4, 7, 5, 9};
		int hap = t.add(data);
		System.out.println(hap);
	}
}

class Test021 {
	//	두개의 숫자를 더하는 함수
	int add(int a, int b) {
		System.out.println("두 숫자 더하기 실행");
		int sum = a + b;
		return sum;
	}
	//	배열 전체를 더하는 함수
	int	add(int[] a) {
		System.out.println("배열 더하기 실행");
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		return sum;
	}
}
