package P_0504;

public class If_Else_01 {

	public static void main(String[] args) {
		/*
		 * ���� - �����ϰ� -50~50������ ���ڸ� �߻��� ��
		 * ���밪�� ���Ͽ� ����϶�
		 */
			int num = (int)(Math.random()*(50 - (-50) + 1) + (-50));
			
			if(num != 0){
				num = -num;
			}
			//P0503-Work03�� ��
			System.out.println(num);
			
			
			
		/*
		 * ���� - ����� 50~100�� ���̷� �ִ�
		 * �� ����� �ٱ��Ͽ� ��µ� �� �ٱ��Ͽ� 8���� ���� �� �ִ�.
		 * ����� �ٱ��Ͽ� ������ �ٱ��ϴ� � �ʿ��Ѱ�?
		 */
		   int apple = (int)(Math.random()*(100 - 50 + 1) + 50);
		   int baguni = apple / 8;
			// ���� 8�� ������ �������� ������ �ٱ��ϰ� �Ѱ� �� �ʿ��ϴ�.
		   
		   if (apple % 8 != 0){
			    baguni = baguni + 1;
		   }
		   System.out.println("����� ���� =" + apple);
		   System.out.println("�ʿ��� �ٱ��� =" + baguni);
		   
		   
		   
		/*
		 * ���� - 1~100������ ���ڸ� �����ϰ� ������ ��
		 * �� ���ڰ� ¦���̸� Even�̶� ����ϰ�
		 * Ȧ���̸� Odd�� ����϶�   
		 */
		   int num2 = (int)(Math.random()*(100 - 1 + 1) + 1);
		   String result;
		   //����ȿ� syso����!!
		   if (num2 % 2 == 0){
			  result = "Even";
		   }
		   else{
			  result = "Odd";
		   }
		   System.out.println("�߻� ���ڴ� " + result);
			   
			
		   
		 /*
		  * ���� - ���� �ϳ��� ������ �Է��� ��
		  * �� ���ڰ�  �빮���̸� �ҹ��ڷ�, �ҹ����̸� �빮�ڷ� ��ȯ�Ͽ� ����϶�
		  * ��, Ư�����ڴ� ���ٴ� ������ �ִ�.
		  */
		    char ch = 'z';
		    
		    if(ch >= 'A' && ch <= 'Z'){
		    	ch = (char)(ch + 32);
		    }
		    else{
		    	ch = (char)(ch - 32);
		    }
		    
		    System.out.println("����� " + ch);
		    
	}

}