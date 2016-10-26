package P_0503;
/*
 * 증감 연산자는 유일하게 대입 연산이 없어도 스스로 변경된다.
 */
public class Variable_01 {

	public static void main(String[] args) {
		int a = 10;
		System.out.println(a+5);
		System.out.println(a);
		
		System.out.println(++a);
		System.out.println(a);
		
/*
 *  증감연산자는 다른연산자와 혼합된 경우 우선순위를 따진다.
 *  항상 주의해서 쓸것!!
 */
		
		int b = 10;
		//int c = ++b; 이경우에는 11
		int c = b++;
		System.out.println("B=" + b);
		System.out.println("C=" + c);
		
	}

}
