package P_0509;

public class For_02 {
/*
 * 1~100���� ���� ���϶�
 * ��, �� 10�������� �߰� ����� ����϶�
 */
	public static void main(String[] args) {
		int sum = 0;
		for(int count = 1; count <= 100; count++){
			sum = sum + count;
			if(count % 10 == 0){
			System.out.println("1~ " + count + " ���� " + sum);
			}
		}

/*
 * ��� ���忡�� �߰� ���� �����Ѵ�
 * �߰� ���� ��� 84������ �ִ�
 * �ٵ� �ٸ��� ����� 196���Դϴ�
 * 
 * ���� �߰� ���� ���� ����ΰ���?		
 */
		int chicken = 0;
		int dog = 0;
		int leg = 0;
		for( ; chicken<=84; chicken++){
			dog = 84 - chicken;
			leg = chicken * 2 + dog * 4;
			if(leg == 196){
				System.out.println("���� " + chicken + "����");
				System.out.println("���� " + dog + "����");
			}
		}


/*
 * �� ���� �����ϰ� �߻��� �� �μ��� �ִ������� ���ϼ���
 * �ִ������� ���ϴ� ����
 * �� �� �߿� ���������� �����ؼ� �ϳ��� ������ �����鼭(1����)
 * �� ���� ��� �������� ���� �ٷ� �ִ������̴�.
 * 
 * 		27 18�� �ִ�����
 * 		18/18�� ������ 27/18�� ������
 * 		18/17�� ������ 27/17�� ������
 * 		18/16�� ������ 27/16�� ������....		
 */
		int num1 = (int)(Math.random()*(100 - 1 + 1) + 1);
		int num2 = (int)(Math.random()*(100 - 1 + 1) + 1);
		int start = (num1 < num2) ? num1:num2;
		for(int i=start; i>0; i--){
			int imsi1 = num1 % i;
			int imsi2 = num2 % i;
			if( imsi1 == 0 && imsi2 == 0){
				System.out.print("������ " + num1 + " " +num2);
				System.out.println("  �ִ������� " + i);
				break;
			}
		}
		
		
	}

}