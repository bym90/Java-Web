package P_0525;

public class Finally_01 {

	public static void main(String[] args) {
		int a = 10;
		int b = 0; //������� �ɶ� 12356����
		int c = 0;
		System.out.println("1");
		
		try {
			System.out.println("2");
			b = a / b;
			System.out.println("3");
		} 
		catch (Exception e) {
			System.out.println("4");
			return;
		}
		finally{
			System.out.println("5");//������ return�� �ǵ� 
									//finally���� ������ ����
		}
		System.out.println("6");
			
		
	}

}