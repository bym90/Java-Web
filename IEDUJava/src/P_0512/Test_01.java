package P_0512;

public class Test_01 {
	//복사해준 주소를 b가 기억한다
	static void abc(int[] b){
	 System.out.println(b[0]);
	} 
	//Heap 영역에는 데이터가 소멸되지 않으므로 주소만 알고있으면 언제든지 사용할 수 있다
	
	public static void main(String[] args) {
		
		
		int[] a={1,2};
		abc(a);
		
		//{
		//	int[] b={3,4};	
		//}
		//System.out.println(b[0]); 스택에 있는 3과4를 쓰지못해서 오류
		System.out.println(a[0]);

	}

}
