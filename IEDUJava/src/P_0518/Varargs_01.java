package P_0518;

public class Varargs_01 {

	public static void main(String[] args) {
		Test031	t = new Test031();
		
		int	hap = t.add(5, 6, 7, 8, 5, 3, 6, 7, 5, 7);
		System.out.println("결과 = " + hap);
	}
}


class Test031 {
	int add(int ... nums) { //(int ... nums, int c) 가변인자 뒤에는 변수가 오지 못한다
		//	이 함수 안에서는 nums 라는 변수는 배열 변수가 되어진다
		//	그러므로 마치 배열변수를 사용하듯이 사용하면 된다
		int		sum = 0;
		for(int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		return sum;
	}
}