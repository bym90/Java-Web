package P_0503;

public class Variable_03 {

	public static void main(String[] args) {
		String str1 = new String ("Hong");
		String str2 = new String ("Hong");
		/*
		 * String str1 = "Hong" �� ���� ����
		       ���ͷ� ������ ����  �����Ͱ� ���͵� �ٽ� ���������ʾ� ���� �ּҸ� ���⶧���� ����
		   String str1 = new String ("Hong") �� ���� �ٸ���
		   Heap ������ ���� �����Ͱ� ���͵� �ٽ� �����ϹǷ� �ٸ��ּ� ���� ���⶧���� �ٸ���
		 */
		if(str1 == str2){
			System.out.println("����");
			}
			else {System.out.println("�ٸ���");
			}
		/*
		 * if(str1.eqauls(str2)){
			System.out.println("����");
			}
			else {System.out.println("�ٸ���");
			}
			���� new String ("Hong")�̵�  "Hong"�̵� ������� ����
		 */
	    
		int a = 10;
		int b = 20;
		int c = 30;
		boolean d = a > b && b == c;
		System.out.println(d);
	   }

	}

