package P_0503;
/*
 * ���� - ���� �ϳ��� �Է��� �� �� ���ڰ� �ҹ����̸� �״�� ����ϰ�
 * �� ���ڰ� �빮���̸� �ҹ��ڷ� �ٲپ ����϶�
 */
public class Decision_02 {

	public static void main(String[] args) {
		char ch = 'A'; //'a'
		char result = (ch >= 'A' && ch <= 'Z') ? 
			(char)(ch+32) : ch;
		
		
		System.out.println(result);
		
		char ch2 = 'B'; // "a", '%'
		char result2 = (ch2 >= 'A' && ch2 <= 'Z') 
		? (char)(ch2+32) : (ch2 >= 'a' && ch2 <='z')
				? (char)(ch2- 32) : ch;
				
				System.out.println(result2);
				
	}
}