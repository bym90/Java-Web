package P_0525;

public class Try_Catch_02 {

	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		int c = 0;
		//try�� ��� �����Ŀ� ���� ��¿��ΰ� �����ȴ�
		try{
			c = a / b;			  //���⼭ �߻��ϴ� ���ܴ� 0���� ���� ���ܰ� �ȴ�
			System.out.println(c);//JVM�� 0���� ���� ���ܴ�
								  //ArithmeticException���� �����
								  //�� JVM ArithmeticException�� catch���� ������
		}
		catch(ArithmeticException e){
			c = 1;
		}
		//System.out.println(c);
	
	
	
	}

}