package P_0503;

public class Random_Number_01 {

	public static void main(String[] args) {
		int num = 10; // -10
		int result;
		result = num > 0 ? num : -num;
		System.out.println(result);
		
		int num2 = -10;
		int result2;
		result2 = num2 > 0 ? num : -num;
		System.out.println(result2);
		
		
		int a = (int)(Math.random()*(100 - 0 +1) + 0);
		String result3 = (a % 2 == 0) ? "Even" : "Odd";
		System.out.println("�߻� ���� = " + a);
		System.out.println("��� = " + result3);
		
		/*Tip ���� �߻� ���
		 *���ɾ� Math.random();
		 *���� ���� ����� 0~1������ �Ҽ��� double���·� ź��
		 *�׷��Ƿ� �츮�� ���ϴ� ������ ������ �߻��ϱ� ���� ����
		 *(int)(Math.random()*(ū�� - ������ +1) + ������)
		 *��> 50~100������ ������ �߻�����
		 *(int)(Math.random()*(100 - 50 + 1) + 50)
		 */
	}

}