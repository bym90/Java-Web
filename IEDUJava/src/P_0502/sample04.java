package P_0502;

public class sample04 {
/* 정수에 데이터를 기억한 후 실제 메모리에 기억된 내용을 확인하자
 */
	public static void main(String[] args) {
	 /* 자바는 10진수, 8진수, 16진수만 사용하는 것을 원칙으로 하는데
	  * 2진수로 보여줄 수는 있다.
	  */
		int a = 10;
		String bin = Integer.toBinaryString(a);
	 /* toHexString(int i) 16진수 모양
	  * toOctalString(int i) 8진수 모양
	  */
		
		System.out.println(bin);
		
	}

}
