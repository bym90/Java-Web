package P_0519;
/*
 * ����1 MathŬ������ �ִ� �Լ� 3���̻� �����Ͽ�
 * �Լ��� �ǹ̸� �˾Ƴ��� �Լ��� ����ϴ� ���α׷��� ������
 * 
 * ����2 Integer Ŭ�������� static �Լ��� 2�� �̻� �����Ͽ�
 * �Լ��� �ǹ̸� �˾Ƴ��� �Լ��� ����ϴ� ���α׷��� ������
 * 
 * ���� 3 String Ŭ�������� static �Լ��� 1�� �̻� �����Ͽ�
 * �Լ��� �ǹ̸� �˾Ƴ��� �Լ��� ����ϴ� ���α׷��� ������ 
 */
public class Static_Math_01 {

	public static void main(String[] args) {
		//Math 1�� ���� ���̸� ���ϰ� �Ҽ����� ������
		//Math.ceil�� �ε����� �ּ��� doubleġ�� �����ִ� �Լ�
		/*
		int r=(int)(Math.random()*(100 - 1 + 1) + 1);
		double area = r * r * Math.PI;
		double result = Math.ceil(area);
		System.out.println(result);
		*/
		
		
		//Math 2�� ���� ���̰� 3, 4, ?�� �ﰢ���� ?���̸� ���Ͽ���
		//Math.hypot(x,y)�� sqrt(x^2 + y^2)���� �����ش�
		/*
		double x = 3;
		double y = 4;
		
	 	double z = Math.hypot(x, y);
				
		System.out.println(z);
		*/
		
		
		//Math 3�� 3�л��� 3������ ������ ����� ���ϰ�
		//����� ���ؼ� �л��� ���� ���� ����� ����϶�
		/*
		float [] avg = new float[3];
		float result = 0;
		int[][] score = new int[3][4];
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < (score[i].length - 1); j++) {
				score[i][j] = (int)	(Math.random()*(101));	
			}
		}
		
		System.out.println("�� �л��� �����");
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < (score[i].length - 1); j++) {
				score[i][(score[i].length - 1)] = 
						score[i][(score[i].length - 1)] + score[i][j];
			}	
			avg[i] = score[i][(score[i].length - 1)]/3.0F;
			System.out.println(avg[i]);
		}
		System.out.println("��պ� ����");
		for (int i = 0; i < score.length; i++) {
			result = Math.max(result, avg[i]);
			System.out.println(result);
		}

		System.out.println("���� ���� ����� "+result);
		*/
		
		
		/*
		//Integer 1��
		int a=400;
		int b=100;
		//Integer.compare(x,y) x>y�� 1��� x=y 0��� x<y -1���
		int result = Integer.compare(a, b);
		
		System.out.println(result);
		 */
		int sign = 0;
		int temp = 0;
		for (int i = 0; ; i++) {
		
			int a =(int)(Math.random()*(101));
			int b =(int)(Math.random()*(101));
		
			sign = Integer.compare(a, b);
			
			temp += sign;
			System.out.println(temp);
			if(temp==10){
				
				break;
			}
			
		}
		 	
		
		
		
		
		
		
		
		
		
		
	}

}


