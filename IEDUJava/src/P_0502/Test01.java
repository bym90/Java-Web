package P_0502;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 10;
		/* 10�� ���ͷ� Ǯ�� ��涧�� int�� ����
		 * �׸��� ���ͷ� Ǯ�� �ִ� �����Ͱ� ������ �Ű�����
		 * �����̹Ƿ� �ڵ� �� ��ȯ�� �̷������. */
		
		/* float b = 3.14;
		 * ���ͷ� Ǯ���� 8����Ʈ �����Ͱ� �ǹǷ�
		 * 4����Ʈ ������ ����� �� ���� �Ǵ� ���̴�.
		 * �׷��� f�� �ٿ��� 4����Ʈ�� ���� ���� */
		float b = 3.14F;
		
		System.out.println(a);
		System.out.println(b);
		
		long c = 10000000000L;
		/* 100���� 4����Ʈ�� ��� �� ���� ������
		 * ���ͷ� Ǯ�� ũ�⸦ 8����Ʈ�� ��ȯ*/
		/* int c = 10000000000L;
		 * ��涧 8����Ʈ�� ��ȯ�ϰ� 4����Ʈ �׸����� ��⶧���� ����
		 * int c = 10L;
		 * ���� �Ȱ��� ����*/
		System.out.println(c);
		
		byte d = 10;
		/* byte e = d + 1; ����
		*/
		byte e = (byte)(d + 1);
		System.out.println(d);
		System.out.println(e);
		
		int f = (int)3.54 + (int)2.57;
		System.out.println(f);
		double g = 3.14;
		/* float h = g ���� */
		float h = (float)g;
		System.out.println(h);
		int i =(int)(3.57+2.54);
		System.out.println(i);
		
		/* long a = (long)1000000000; ����
		 * 100���� ���ͷ� Ǯ�� �������� int���ε� 
		 * �̹� �� ������ �Ѿ���Ƿ� ����ϴ� ���������� ����*/
	}

}