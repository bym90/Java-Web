package P_0510;

public class For_01 {

	public static void main(String[] args) {
			/*
			for(int i = 0; i < 3; i++){ //0, 1, 2�� 3�� �ݺ�
				
				for(int j = 0; j < 2; j++){ // 0, 1�� 2�� �ݺ�
					System.out.println("I = " + i + "J = " + j );
				}
			}
			*/
			/*
			int i = 0;
			int j = 0;	
			for(; i < 3; i++){
			
				for(; j < 2; j++){
					System.out.println("I = " + i + "J = " + j );
				}
			}
			*/
		
		
		
/*
 * 5�� �������� ����϶�		
 */
			/*
			int dan = 5;
			int dap = 0;
				
			for(int i = 1; i < 10; i++){
				dap =  dan * i;
				System.out.println(dan + " * " + i + " = " + dap);
			}
			*/
		
			/*
			int dap = 0;
			for(int dan = 2; dan < 10; dan++){
				for(int i = 1; i < 10; i++){
					dap =  dan * i;
					System.out.println(dan + " * " + i + " = " + dap);
			}
			}
			*/
		
		
		
/*
 *  *****�� ����� ���弼��
 *  ��, �ѹ��� *�� �Ѱ��� ����϶�		
 */		
		/*
		for(int j = 0; j < 5; j++){	
			for(int i = 0; i < 5; i++){
				System.out.println("*");
			}
			System.out.println();
		}
		*/
		
		
		
/*
 * *
 * **
 * ***
 * ****
 * *****�� ����� ���弼��		
 */
			/*
			for(int j = 0; j < 5; j++){
				for(int i = 0; i < (j + 1); i++){
					System.out.print("*");
				}
				System.out.println();
			}
			*/
		    //����1 �ݴ� ����� ������
		
		
		
/*
 * (1) + (1 + 2) + (1 + 2 + 3) +
 * ...(1 + 2 + 3 ... 100)�� ���� ����϶�		
 */
			
			/*
			int		sum = 0;		//	����� ����� ����
		
			//	��ü������ 100�� �ݺ��ؾ� �Ѵ�.
				for(int i = 0; i < 5; i++) {
			//	�ѹ� �ݺ��Ҷ����� 
			//	������ ���� ������� �ݺ� Ƚ���� �����ϸ鼭 �ݺ��ؾ� �Ѵ�.
					for(int j = 1; j <= (i + 1); j++) {
						sum = sum + j;
					}
				}
			System.out.println("���  = " + sum);
			*/
		

/*
 * ���� 1000~3000���̿� �ִ� ���⸸ ����ϼ���
 */
			/*
			int year = 2000;
			String result = "���";
			
			if(year % 4 == 0){
				result = "����";
				if(year % 100 == 0){
					result = "���";
						if(year % 400 == 0){
							result="����";
						}
					}
				}
			System.out.println(result);
			*/
		
		/*
		for(int year = 1000; year <= 3000; year++) {
			String	result = "���";
			if(year % 4 == 0) {
				result = "����";
				if(year % 100 == 0) {
					result = "���";
					if(year % 400 == 0) {
						result = "����";
					}
				}
			}
			//���ڿ��� ������ ������ ��쿡�� .equals()�� �̿��϶�
			if(result.equals("����")) {
				System.out.println(year + "�� �����̴�.");
			}
		}
		*/
		
		
		
/*
 * 2x + 4y = 10��� �������� Ǯ���
 * ��, x, y�� ���� 0~10���̿� �ذ� �ִ�
 * Ǫ�� ����
 * 	��� ����� ���� �� �����Ͽ� ����� �����ϴ��� �˾ƺ���
 */
			/*
			for(int x = 0; x <= 10; x++){
				for(int y = 0; y <= 10; y++){
					int dapt=2 * x + 4 * y;
					if(dapt == 10){ //if(2*x+4*y==10)�� ����					
						System.out.println("X= " + x + "Y= " + y);
					}
				}
			}
			*/
			
		
		
/* ����2
 * 2g �߰� 5��, 3g �߰� 4��, 5g �߰� 3�� �ִ�
 * �� �߸� �̿��Ͽ� ���� 17g ~ 21g ���̸� ����� ����� ���� ���ϼ���
 * ��Ʈ 2, 3, 5g�� ��� ����� ���� �� �����Ͽ� ���ϴ� ���԰� �Ǿ����� Ȯ���Ѵ�
 */	
			/*
			int dap = 0;
			for(int x=0; x<=5; x++){
				for(int y=0; y<=4; y++){
					for(int z=0; z<=3; z++){
						int result=2*x + 4*y + 3*z;
							if(result>=17 && result<=21){
								dap = dap + 1;
								System.out.println("X= " + x + " Y= " + y + " Z= " + z);
								System.out.println(result);
							}
								
					}
				}
			}
			System.out.println(dap);
			*/
			
			
/* ����3
 * �ΰ��� �ֻ����� ������ �� �ֻ����� ���� 6�� �Ǵ� ��� ����� ���� ���ϼ���
 */
			int count=0;
		
			for(int x=1; x<=6; x++){
				for(int y=1; y<=6; y++){
					int result=x+y;
						if(result==6){
							count=count+1;
							System.out.println("X�� " +x+ " Y�� " +y);
						}
				}
			}
			System.out.println("����� ���� " + count);
		
		
		
		
		
		
	}

}