package P_0503;
/*
 * ���� - ���� �ϳ��� �Է��� �� �� ���ڰ� �ҹ������� �ƴ����� �Ǵ��Ͽ� ����϶�
 */
public class Decision_01 {

	public static void main(String[] args) {
		char ch = 'a'; //'A'
			/*
			 * ���ڰ� �ҹ��ڰ� �Ǳ� ���ؼ��� �� ���ڴ� 'a'~'z'���̿� �־�� �ҹ�
			 */
			String result = (ch >= 'a' && ch <= 'z') ? 
				"�ҹ���" : "�빮��";
			
			System.out.println(result);
	}

}