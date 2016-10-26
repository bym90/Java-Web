package P_0525;

public class Finally_01 {

	public static void main(String[] args) {
		int a = 10;
		int b = 0; //정상실행 될때 12356순서
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
			System.out.println("5");//위에서 return이 되도 
									//finally안은 무조건 실행
		}
		System.out.println("6");
			
		
	}

}
