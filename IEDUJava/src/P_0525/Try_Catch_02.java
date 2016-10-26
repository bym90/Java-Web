package P_0525;

public class Try_Catch_02 {

	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		int c = 0;
		//try를 어디에 쓰느냐에 따라 출력여부가 결정된다
		try{
			c = a / b;			  //여기서 발생하는 예외는 0으로 나눈 예외가 된다
			System.out.println(c);//JVM은 0으로 나눈 예외는
								  //ArithmeticException으로 만든다
								  //즉 JVM ArithmeticException을 catch에게 던진다
		}
		catch(ArithmeticException e){
			c = 1;
		}
		//System.out.println(c);
	
	
	
	}

}
