package M0503;

public class Work02 {
 /* ���� �ϳ��� �Է��� ��
	�빮���̸� �ҹ��ڷ�, �ҹ����̸� �빮�ڷ� ����϶�.
	Ư�����ڴ� ���°����� �����Ѵ�.
 */
	public static void main(String[] args) {
		char ch = 'D';
		char result = (ch >= 'A' && ch <= 'Z') 
				? (char)(ch+32) : (char)(ch-32);
				
				System.out.println(result);
		
		
	}

}