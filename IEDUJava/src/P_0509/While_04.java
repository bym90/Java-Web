package P_0509;

public class While_04 {
/*
 * Ƽ�ڿ� �ҳ�Ÿ�� �ڵ��� ���ָ� �Ѵ�
 * Ƽ�ڴ� 1.35m/s �� �����ϰ�
 * �ҳ�Ÿ�� 1.84m/s �� �����Ѵ�
 * 
 * Ƽ�ڴ� ó�� ����Ҷ� 1000m�տ��� ����ϵ��� �Ѵ�
 * 
 * ���� ���� �� �� �ڿ� �ҳ�Ÿ�� Ƽ�ڸ� ���������?
 */
	public static void main(String[] args) {
		float tico = 1000.0F; //Ƽ���� ���� ��ġ
		float sonata = 0.0F; //�ҳ�Ÿ�� ���� ��ġ
		int second = 0; //�ɸ� �ʸ� ����� ����
		while(sonata < tico){
			second = second + 1;
			tico = tico + 1.35F;
			sonata = sonata + 1.84F;
		}
		System.out.println(second + "�ʿ� �ҳ�Ÿ�� Ƽ�ڸ� ��������");

/*
 * �������� �Ǽ�, �� �������� 2844m�̴�
 * �ϰ��ð����� �Ϸ翡 28.5m�� �Ǽ��� �� �ִ�
 * ������ �̷ΰ��� ������ �ĵ��� ���� 14.1m�� �սǵȴ�		
 * ���� ���� �ڿ� �������� �ϼ��� ���ΰ�?
 * ��, �ϼ��� �Ǹ� �ϰ��� ������ �ĵ��� �սǵ��� �ʴ´�

		float bangpa = 0.0F;
		int day=0;
		while(bangpa < 2844.0F){
			day = day + 1;
			bangpa = bangpa + 28.5F;
			bangpa = bangpa - 14.1F;
		}
		 * System.out.println("�� �ɸ� �� ���� " + day + "��");
		 * ������ �ݺ� ���� ���߿� �ݺ� ������ ������ �ʿ䰡 �ִ� �浵 �ִ�
		 * �̷� ��찡 �߻��ϸ� ���ǽ��� true�� �־ ���ѷ����� ������
		 */
		
		float bangpa = 0.0F;
		int day=0;
		while(true){
			day = day + 1;
			bangpa = bangpa + 28.5F;
			if(bangpa >= 2844.0F){
				break;
			}
			bangpa = bangpa - 14.1F;
		}
		System.out.println("�� �ɸ� �� ���� " + day + "��");
	}

}