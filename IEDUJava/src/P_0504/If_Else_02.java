package P_0504;

public class If_Else_02 {
	/*   	
	 *      ���ڸ� �����ϰ� �߻��� ��
	 * 		���ڴ�	'A' ~ 'z'�� ������ �ȴ�.
	 * 		�� ���ڰ� �빮������, �ҹ�������, Ư������������ ����϶�
	 */
	public static void main(String[] args) {
		char	ch = (char)(Math.random() * ('z' - 'A' + 1) + 'A');
			//	���Ľ�
			//		�� (char)�� �� ��ȯ�ϳ���?
			//		���		char ������ ����� �����̹Ƿ�....
		String	result;

		if(ch >= 'A' && ch <= 'Z')
			result = "�빮���Դϴ�.";
		
		else if(ch >= 'a' && ch <= 'z') 
			result = "�ҹ����Դϴ�.";
		
		else 
			result = "Ư�������Դϴ�.";
		

		System.out.println(ch + " �� " + result);

		
		
		/*
		 * 		0~100������ �л� ������ �����ϰ� �Է��� ��
		 * 		�� �л��� ������ �����϶�.
		 */
		int	score = (int)(Math.random() * (100 - 0 + 1) + 0);
		char grade;
		
		if(score >= 90) {
			grade = 'A';
		}
		else if(score >= 80) {
			grade = 'B';
		}
		else if(score >= 70) {
			grade = 'C';
		}
		else  if(score >= 60) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}

		System.out.println("����� ���� = " + score);
		System.out.println("����� ���� = " + grade);	
	}

}