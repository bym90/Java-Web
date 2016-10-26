package P_0504;

public class Case_01 {

	public static void main(String[] args) {
		
		switch(2){
		case 1:
			System.out.println("하나");
			break;
		case 2:
			System.out.println("둘");
			break;
		case 3:
			System.out.println("셋");
			break;
		default:	
			System.out.println("많다");
			break;
		}
		
	
		
	/*
	 * 0~100사이의 점수를 입력받아 학점을 평가하는 프로그램을 작성하라
	 */
		int score = (int)(Math.random()*(100 - 0 + 1) + 0);
		char grade;
		int temp = score / 10;
			switch(temp){
			case 10:
			case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
				break;	
			default:
				grade = 'F';
		 
		 }
			System.out.println(grade);		

	}

}
