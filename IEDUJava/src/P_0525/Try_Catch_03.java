package P_0525;

public class Try_Catch_03 {

	public static void main(String[] args) {
		int[] num = {1,2,3,4,5};
		int b = (int)(Math.random()*(10 - 0 + 1) + 0);
		int c = 0;
		try {
			int temp = (int)(Math.random()*(5 - 0 + 1) + 0);
			c = num[temp]/b; //이 부분에서 2가지 에러
							
		} 
		catch (ArithmeticException e) {
			System.out.println("0 에러");
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("배열 에러");
		}
		catch (Exception e){
			//만약 3가지 예외가 발생할 경우 catch
			//이게 맨위로 갈 경우 에러
			//예외는 좁은범위부터 넓은범위로 써야된다
		}
		System.out.println(c);
		
		
		
		
	}

}
