package P_0503;
/*
 * ���� �����ڴ� �����ϰ� ���� ������ ��� ������ ����ȴ�.
 */
public class Variable_01 {

	public static void main(String[] args) {
		int a = 10;
		System.out.println(a+5);
		System.out.println(a);
		
		System.out.println(++a);
		System.out.println(a);
		
/*
 *  ���������ڴ� �ٸ������ڿ� ȥ�յ� ��� �켱������ ������.
 *  �׻� �����ؼ� ����!!
 */
		
		int b = 10;
		//int c = ++b; �̰�쿡�� 11
		int c = b++;
		System.out.println("B=" + b);
		System.out.println("C=" + c);
		
	}

}