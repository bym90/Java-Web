package M0504;

public class Work01 {

	public static void main(String[] args) {
		/* 숙제1	
		 * 1~100사이의 랜덤한 숫자를 발생한 후 짝수인지 홀수인지를 판단하라
		 * 단, 반드시 1번 형식을 이용할것
		 */
		int num = (int)(Math.random()*(100-1+1)+1);
		String result = "홀수";
		if (num % 2 == 0){
			result = "짝수";
		}
			System.out.println(result);
		
		/* 숙제2
		 * 1~100사이 랜덤한 숫자 2개를 입력한 후 큰수와 작은수 순서대로 출력하라
		 * 단, 반드시 2번 형식을 이용할것
		 */
		int num2 = (int)(Math.random()*(100 - 1 + 1) + 1);
		int num3 = (int)(Math.random()*(100 - 1 + 1) + 1);
		if (num2 > num3){
			System.out.println(num2 + " 는  " + num3 + " 보다 크다");
		}
		else{
			System.out.println(num3 + " 는  " + num3 + " 보다 크다");
		}
		
		/* 숙제3
		 * 1~100사이 랜덤한 숫자를 발생한 후 
		 * 80이상이면 패스
		 * 60이상이면 대기
		 * 60이하이면 탈락이라고 출력하세요.
		 * 단, 반드시 3번 형식을 이용하세요.
		 */
		int num4 = (int)(Math.random()*(100 - 1 + 1) + 1);
		String result2;	
			if (num4 >= 80){
				result2 = "패스";
			}
			else if(num4 >= 60){
				result2 = "대기";
			}
			else{
				result2 = "탈락";
			}
			System.out.println(result2);
		
		
		/* 숙제4
		 * 1000~3000사이의 년도 하나를 랜덤하게 입력한 후
		 * 그 해가 윤년인지 평년인지를 판단하는 프로그램을 만드세요.
		 * 윤년은 4로 나누어 떨어지되 100으로 나누어 떨어지면 안되고
		 * 100으로 나누어 떨어지더라도 400으로 나누어 떨어지면 된다.
		 */
		int year = (int)(Math.random()*(3000 - 1000 + 1) + 1000);
		String result3;
		
			if (year % 4 == 0){
				
				if(year % 100 == 0){
					
					if(year % 400 == 0){
						result3 = "윤년";
					}
					else{
						result3 = "평년";
					}		
				}
				else{
					result3 = "윤년";
				}
			}
			else{
				result3 = "평년";
			}
				System.out.println(year + "년은 " + result3);

	}

}
