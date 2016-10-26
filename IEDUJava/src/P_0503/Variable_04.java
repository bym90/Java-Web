package P_0503;
public class Variable_04 {

	public static void main(String[] args) {
		
		/*int a = 10;
		int b = 20;
		boolean c = ++a > 10 && ++b > 10;
		System.out.println("C = " + c);
		System.out.println("A = " + a);
		System.out.println("B = " + b);
		*/
		
			int a = 10;
			int b = 20;
			boolean c = a++ > 10 && ++b > 10;
			System.out.println("C = " + c);
			System.out.println("A = " + a);
			System.out.println("B = " + b);
			//앞의 조건이 틀리므로 뒤에 조건을 절삭
	}

}
