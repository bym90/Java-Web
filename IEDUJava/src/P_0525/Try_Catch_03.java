package P_0525;

public class Try_Catch_03 {

	public static void main(String[] args) {
		int[] num = {1,2,3,4,5};
		int b = (int)(Math.random()*(10 - 0 + 1) + 0);
		int c = 0;
		try {
			int temp = (int)(Math.random()*(5 - 0 + 1) + 0);
			c = num[temp]/b; //�� �κп��� 2���� ����
							
		} 
		catch (ArithmeticException e) {
			System.out.println("0 ����");
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("�迭 ����");
		}
		catch (Exception e){
			//���� 3���� ���ܰ� �߻��� ��� catch
			//�̰� ������ �� ��� ����
			//���ܴ� ������������ ���������� ��ߵȴ�
		}
		System.out.println(c);
		
		
		
		
	}

}