package P_0502;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 10;
		/* 10이 리터럴 풀에 담길때는 int로 담긴다
		 * 그리고 리터럴 풀에 있는 데이터가 변수로 옮겨질때
		 * 정수이므로 자동 형 변환이 이루어진다. */
		
		/* float b = 3.14;
		 * 리터럴 풀에는 8바이트 데이터가 되므로
		 * 4바이트 변수에 기억할 수 없게 되는 것이다.
		 * 그래서 f를 붙여서 4바이트로 닮기게 만듬 */
		float b = 3.14F;
		
		System.out.println(a);
		System.out.println(b);
		
		long c = 10000000000L;
		/* 100억은 4바이트에 담길 수 없기 때문에
		 * 리터럴 풀의 크기를 8바이트로 전환*/
		/* int c = 10000000000L;
		 * 담길때 8바이트로 변환하고 4바이트 그릇으로 담기때문에 오류
		 * int c = 10L;
		 * 위와 똑같은 이유*/
		System.out.println(c);
		
		byte d = 10;
		/* byte e = d + 1; 오류
		*/
		byte e = (byte)(d + 1);
		System.out.println(d);
		System.out.println(e);
		
		int f = (int)3.54 + (int)2.57;
		System.out.println(f);
		double g = 3.14;
		/* float h = g 오류 */
		float h = (float)g;
		System.out.println(h);
		int i =(int)(3.57+2.54);
		System.out.println(i);
		
		/* long a = (long)1000000000; 오류
		 * 100억이 리터럴 풀에 담기기전에 int형인데 
		 * 이미 그 범위를 넘어섰으므로 기억하는 시점에서도 오류*/
	}

}
