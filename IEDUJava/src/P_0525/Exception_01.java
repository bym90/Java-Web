package P_0525;

public class Exception_01 {

	public static void main(String[] args) {
		int a = 5;
		int b = 0; //b�� 0�̶�� ����
		int c = 0;
		//��ó�� �����Ͱ� �߸��� ���� ���������� �۵��ϵ���
		//���α׷� �������ִ°��� ����ó���� �Ѵ�
		if (b == 0) {
			c=1;
		}
		else{
			c=a/b;
		}
		System.out.println(c);
	}

}