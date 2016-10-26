package P_0504;

public class If_Else_02 {
	/*   	
	 *      문자를 랜덤하게 발생한 후
	 * 		문자는	'A' ~ 'z'가 범위가 된다.
	 * 		그 문자가 대문자인지, 소문자인지, 특수문자인지를 출력하라
	 */
	public static void main(String[] args) {
		char	ch = (char)(Math.random() * ('z' - 'A' + 1) + 'A');
			//	노파심
			//		왜 (char)로 형 변환하나요?
			//		당근		char 변수에 기억할 예정이므로....
		String	result;

		if(ch >= 'A' && ch <= 'Z')
			result = "대문자입니다.";
		
		else if(ch >= 'a' && ch <= 'z') 
			result = "소문자입니다.";
		
		else 
			result = "특수문자입니다.";
		

		System.out.println(ch + " 는 " + result);

		
		
		/*
		 * 		0~100사이의 학생 점수를 랜덤하게 입력한 후
		 * 		이 학생의 학점을 판정하라.
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

		System.out.println("당신의 점수 = " + score);
		System.out.println("당신의 학점 = " + grade);	
	}

}
