package P_0504;

public class Case_01 {

	public static void main(String[] args) {
		
		switch(2){
		case 1:
			System.out.println("�ϳ�");
			break;
		case 2:
			System.out.println("��");
			break;
		case 3:
			System.out.println("��");
			break;
		default:	
			System.out.println("����");
			break;
		}
		
	
		
	/*
	 * 0~100������ ������ �Է¹޾� ������ ���ϴ� ���α׷��� �ۼ��϶�
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