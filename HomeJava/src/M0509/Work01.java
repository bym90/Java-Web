package M0509;

public class Work01 {

	public static void main(String[] args) {
/* ����1
 * 1~100���� ���� ���ϵ� �� 10���� ���� ���� ���� ���ؼ� ����϶�
 * 10�������� ����ϰ� ����� ���� �� �� ���� ����� ������ 0���� �����Ѵ�		
 */
		// 1�� for��
		/* int sum = 0;
			for(int count = 1; count<=100; count++){
			sum = sum + count;
			
			if(count % 10 == 0){
				System.out.println("�� 10���� �� " + sum);
			}
		}
		System.out.println("������ " + sum);
		*/
		
		 //1�� while��
		 /* int sum = 0;
			int i = 0;
			while(i<100){
			i=i+1;
			if(i % 10 == 0){
				System.out.println("�� 10���� �� " + sum);
			}
			sum = sum + i;
			}
			System.out.println("������" + sum);
		 */


		
/* ����2
 * ���� ���̰� 7865M�̴�
 * �ѻ���� ����� �ϴµ� 1.52m/s �ӵ��� �ϰ�
 * �ѻ���� �ϻ��� �ϴµ� 1.83m/s �ӵ��� �Ѵ�
 * ���� ���ʵڿ� �λ���� �������ΰ�?		
 */
		// 2�� for��
		/*
		int second = 0;
		float up = 1.52F;
		float down = 30.0F;
		for(; true;){
			second = second + 1;
			up = up + 1.52F;
			down = down - 1.83F;
			if(down < up){
				break;
			}
		}
		System.out.println(second);	
	    */
	
		
		//2�� while��
		/*float up = 0.0F;
		float down = 7865.0F;
		int second = 0;
		while(true){
			second = second + 1;
			up = up + 1.52F;
			down = down - 1.83F;
			if(down < up){
				break;
			}
		}
		System.out.println(second);
		*/
	
		
		
/* ����3
 * 152m �����밡 �ִ�. �����̰� �����븦 �ö󰡴µ�
 * �ϰ��߿��� 0.82m �ӵ��� �ö󰡴µ�
 * ������ �Ǹ� 0.24m �ӵ��� �̲�������
 * ���� ���ϵڿ� �����̴� ������ ����⿡ ������ �� ������?
 * ��,������ ����⿡ �����ϸ� �̲������� ����
 */
		
	/* 3�� while��
	 * float height = 0.0F;
		int day = 0;
		while(true){
			day = day + 1;
			height = height + 0.82F;
			if(height > 152.0f){
				break;
			}
			height = height - 0.24F;
			
		}
		System.out.println("�����̴� " + day + "�� �ڿ� ����⿡ �����Ѵ�");
	*/
	
		//3�� for��
		/*int day = 0;
		for(float height = 0.0F; true; ){
			day = day + 1;
			height = height + 0.82F;
			if(height > 152){
				break;
			}
			height = height - 0.24F;
		}
		System.out.println("�����̴� " + day + "�� �ڿ� ����⿡ �����Ѵ�");
		 */
	
		
		
/* ����4
 * �� ���� �����ϰ� �߻��� �� �� ���� �ּ� ������� ���ϼ���
 * �ּ� ����� ���ϴ� ����
 * �� ���� ū������ �����Ͽ� ���Ѵ�� ��� �����ϸ鼭
 * �� �� ��η� ������ �������� ������ ���ڰ� �ּ� ������̴�
 * ��>5	8
 * 8 % 5		8 % 8 
 * 9 % 5		9 % 8 
 * 10 % 5		10 % 8 ....
 * 40 % 5		40 % 8			����� 40�̴�
 */
		//4�� for��
		/*
		int num1=(int)(Math.random()*(20 - 1 + 1)+ 1);
		int num2=(int)(Math.random()*(20 - 1 + 1)+ 1);
		int start = (num1 > num2) ? num1:num2;
			for(int i=start;;i++){
				int temp1 = i % num1;
				int temp2 = i % num2;
					if(temp1 == 0 && temp2 ==0){
						System.out.println("������ " + num1 + " " + num2);
						System.out.println("�ּҰ������ " + i);
						break;
					}
			}
		*/
		
		/*
		int num1=(int)(Math.random()*(20 - 1 + 1)+ 1);
		int num2=(int)(Math.random()*(20 - 1 + 1)+ 1);
		int start = (num1 > num2) ? num1:num2;
			for(;;){
				start = start + 1;
				int temp1 = start % num1;
				int temp2 = start % num2;
					if(temp1 == 0 && temp2 ==0){
						System.out.println("������ " + num1 + " " + num2);
						System.out.println("�ּҰ������ " + start);
						break;
					}
			}
		*/
		
		
		//4�� while��
		/*
		int num1=(int)(Math.random()*(20 - 1 + 1)+ 1);
		int num2=(int)(Math.random()*(20 - 1 + 1)+ 1);
		int start = (num1 > num2) ? num1:num2;
			while(true){
				start = start + 1;
				int temp1 = start % num1;
				int temp2 = start % num2;
				if(temp1 == 0 && temp2 ==0){
					System.out.println("������ " + num1 + " " + num2);
					System.out.println("�ּҰ������ " + start);
					break;
			}
		}
		*/
			
		
		
/* ���� 5
 * 9�� ���丮���� ���ϼ���
 * ��Ʈ ������ �ʱ�ȭ �����̴�
 */
		
		//5�� for��
		/*
		int result=1;
		int temp=0;
		 for(int i = 9; i > 0; i--){
			 temp=i;
			 result = result * temp;
			 temp=0;
		 }
		 System.out.println("9���丮���� " + result);
		*/
		
		//5�� while��
		/*
		int result = 1;
		int i = 9;
		int temp = 0;
			while(i>1){
				temp = i;
				result = result * temp;
				temp = 0;
				i--;
			}
			System.out.println("9���丮���� " + result);
		*/
		
		
		
		
		
	}

}