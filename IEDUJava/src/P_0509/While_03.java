package P_0509;

public class While_03 {
/*
 * 1~100������ ���� ����ϼ���
 */
	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		while(count<100){
			count = count + 1;
			sum = sum + count;
		}
		System.out.println("���� " + sum);
/*
 * 7�� �������� ����϶�	
 */
		int i = 0;
		int result = 0;
		System.out.println("������ 7��");
		while(i<9){
			i = i + 1;
			result = 7 * i;
			
			System.out.println(" 7 * " + i + " = " + result);
			
		}

/*
 * ù�� 1��
 * �������� ������ 2�踦 �����Ϸ��� �Ѵ�
 * ������ �� �ݾ��� 1����� �Ѵ� ���� ���� ����°�ϱ��?
 */
		int today = 1;
		int total = 0;
		int day = 0; //�ɸ� ������ ����� ����
		
		while(total<100000000){
			day = day + 1; //day += 1; day++;
			total = total + today;
			//������ ������ ���ؼ� ���� ���ݾ��� 2�����
			today = today * 2;
		}
		System.out.println("�� �ɸ� �ϼ��� " + day);
		System.out.println("�� ���ݾ��� " + total + "��");
	
	}

}