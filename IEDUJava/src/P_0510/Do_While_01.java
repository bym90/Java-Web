package P_0510;

public class Do_While_01 {

	public static void main(String[] args) {
/*
 * 1~10���� ���丮���� ���غ���
 */
		/*
		long result = 1;	//����� ����� ����
		int count = 0;	//ī��Ʈ ��ų ����
		do{
			count = count + 1;
			result = result * count;
		}while(count < 10);
		*/
		/*
		long result = 1;
		int count = 1;
		do{
			result = result * count;
			count = count + 1;
			
		}while(count <= 10);
		System.out.println("�� = " + result);
		*/
		
		

/*
 * 7882m ���� �ִ�
 * �� ����� 1.52m/s �ö󰡰�
 * �ٸ� ����� 1.83m/s���� �����´�
 * ���� �λ���� ���ʵڿ� �����ұ�?		
 */
		/*
		float up = 0.0F;
		float down = 7822.0F;
		int second = 0;
		do{
			second++;
			up=up + 1.52F;
			down = down - 1.83F;
		}while(up < down);
		int second2 = second % 60;
		int minute = second / 60;
		System.out.println(minute + "�� " + second2 + "��");
		System.out.println("����� " + second + "��");
		*/
		
	}

}