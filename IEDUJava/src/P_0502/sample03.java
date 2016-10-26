package P_0502;

public class sample03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float num = 315.2512F;
		int intNum;
		float floatNum;
		
		intNum = (int)num;
		floatNum = num - intNum;
		
		System.out.println("정수 부분 =" + intNum);
		System.out.println("실수 부분 =" + floatNum);
		
	}

}
