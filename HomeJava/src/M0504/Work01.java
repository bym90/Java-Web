package M0504;

public class Work01 {

	public static void main(String[] args) {
		/* ����1	
		 * 1~100������ ������ ���ڸ� �߻��� �� ¦������ Ȧ�������� �Ǵ��϶�
		 * ��, �ݵ�� 1�� ������ �̿��Ұ�
		 */
		int num = (int)(Math.random()*(100-1+1)+1);
		String result = "Ȧ��";
		if (num % 2 == 0){
			result = "¦��";
		}
			System.out.println(result);
		
		/* ����2
		 * 1~100���� ������ ���� 2���� �Է��� �� ū���� ������ ������� ����϶�
		 * ��, �ݵ�� 2�� ������ �̿��Ұ�
		 */
		int num2 = (int)(Math.random()*(100 - 1 + 1) + 1);
		int num3 = (int)(Math.random()*(100 - 1 + 1) + 1);
		if (num2 > num3){
			System.out.println(num2 + " ��  " + num3 + " ���� ũ��");
		}
		else{
			System.out.println(num3 + " ��  " + num3 + " ���� ũ��");
		}
		
		/* ����3
		 * 1~100���� ������ ���ڸ� �߻��� �� 
		 * 80�̻��̸� �н�
		 * 60�̻��̸� ���
		 * 60�����̸� Ż���̶�� ����ϼ���.
		 * ��, �ݵ�� 3�� ������ �̿��ϼ���.
		 */
		int num4 = (int)(Math.random()*(100 - 1 + 1) + 1);
		String result2;	
			if (num4 >= 80){
				result2 = "�н�";
			}
			else if(num4 >= 60){
				result2 = "���";
			}
			else{
				result2 = "Ż��";
			}
			System.out.println(result2);
		
		
		/* ����4
		 * 1000~3000������ �⵵ �ϳ��� �����ϰ� �Է��� ��
		 * �� �ذ� �������� ��������� �Ǵ��ϴ� ���α׷��� ���弼��.
		 * ������ 4�� ������ �������� 100���� ������ �������� �ȵǰ�
		 * 100���� ������ ���������� 400���� ������ �������� �ȴ�.
		 */
		int year = (int)(Math.random()*(3000 - 1000 + 1) + 1000);
		String result3;
		
			if (year % 4 == 0){
				
				if(year % 100 == 0){
					
					if(year % 400 == 0){
						result3 = "����";
					}
					else{
						result3 = "���";
					}		
				}
				else{
					result3 = "����";
				}
			}
			else{
				result3 = "���";
			}
				System.out.println(year + "���� " + result3);

	}

}