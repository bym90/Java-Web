package P_0503;

public class Random_Number_01 {

	public static void main(String[] args) {
		int num = 10; // -10
		int result;
		result = num > 0 ? num : -num;
		System.out.println(result);
		
		int num2 = -10;
		int result2;
		result2 = num2 > 0 ? num : -num;
		System.out.println(result2);
		
		
		int a = (int)(Math.random()*(100 - 0 +1) + 0);
		String result3 = (a % 2 == 0) ? "Even" : "Odd";
		System.out.println("발생 숫자 = " + a);
		System.out.println("결과 = " + result3);
		
		/*Tip 난수 발생 방법
		 *명령어 Math.random();
		 *문제 위의 결과는 0~1사이의 소수가 double형태로 탄생
		 *그러므로 우리가 원하는 범위의 난수를 발생하기 위한 공식
		 *(int)(Math.random()*(큰수 - 작은수 +1) + 작은수)
		 *예> 50~100사이의 난수를 발생하자
		 *(int)(Math.random()*(100 - 50 + 1) + 50)
		 */
	}

}
