package M0509;

public class Work01 {

	public static void main(String[] args) {
/* 숙제1
 * 1~100까지 합을 구하되 매 10단위 마다 합을 따로 구해서 출력하라
 * 10단위마다 출력하고 출력이 끝난 후 총 합을 기억할 변수를 0으로 세팅한다		
 */
		// 1번 for문
		/* int sum = 0;
			for(int count = 1; count<=100; count++){
			sum = sum + count;
			
			if(count % 10 == 0){
				System.out.println("매 10단위 합 " + sum);
			}
		}
		System.out.println("총합은 " + sum);
		*/
		
		 //1번 while문
		 /* int sum = 0;
			int i = 0;
			while(i<100){
			i=i+1;
			if(i % 10 == 0){
				System.out.println("매 10단위 합 " + sum);
			}
			sum = sum + i;
			}
			System.out.println("총합은" + sum);
		 */


		
/* 숙제2
 * 산의 높이가 7865M이다
 * 한사람은 등산을 하는데 1.52m/s 속도로 하고
 * 한사람은 하산을 하는데 1.83m/s 속도로 한다
 * 과연 몇초뒤에 두사람은 만날것인가?		
 */
		// 2번 for문
		/*
		int second = 0;
		float up = 1.52F;
		float down = 30.0F;
		for(; true;){
			second = second + 1;
			up = up + 1.52F;
			down = down - 1.83F;
			if(down < up){
				break;
			}
		}
		System.out.println(second);	
	    */
	
		
		//2번 while문
		/*float up = 0.0F;
		float down = 7865.0F;
		int second = 0;
		while(true){
			second = second + 1;
			up = up + 1.52F;
			down = down - 1.83F;
			if(down < up){
				break;
			}
		}
		System.out.println(second);
		*/
	
		
		
/* 숙제3
 * 152m 전봇대가 있다. 달팽이가 전봇대를 올라가는데
 * 일과중에는 0.82m 속도로 올라가는데
 * 저녁이 되면 0.24m 속도로 미끄러진다
 * 과연 몇일뒤에 달팽이는 전봇대 꼭대기에 안주할 수 있을까?
 * 단,전봇대 꼭대기에 도착하면 미끄러짐이 없다
 */
		
	/* 3번 while문
	 * float height = 0.0F;
		int day = 0;
		while(true){
			day = day + 1;
			height = height + 0.82F;
			if(height > 152.0f){
				break;
			}
			height = height - 0.24F;
			
		}
		System.out.println("달팽이는 " + day + "일 뒤에 꼭대기에 안주한다");
	*/
	
		//3번 for문
		/*int day = 0;
		for(float height = 0.0F; true; ){
			day = day + 1;
			height = height + 0.82F;
			if(height > 152){
				break;
			}
			height = height - 0.24F;
		}
		System.out.println("달팽이는 " + day + "일 뒤에 꼭대기에 안주한다");
		 */
	
		
		
/* 숙제4
 * 두 수를 랜덤하게 발생한 후 두 수의 최소 공배수를 구하세요
 * 최소 공배수 구하는 원리
 * 두 수중 큰수부터 시작하여 무한대로 계속 증가하면서
 * 두 수 모두로 나누어 떨어지는 최초의 숫자가 최소 공배수이다
 * 예>5	8
 * 8 % 5		8 % 8 
 * 9 % 5		9 % 8 
 * 10 % 5		10 % 8 ....
 * 40 % 5		40 % 8			결과는 40이다
 */
		//4번 for문
		/*
		int num1=(int)(Math.random()*(20 - 1 + 1)+ 1);
		int num2=(int)(Math.random()*(20 - 1 + 1)+ 1);
		int start = (num1 > num2) ? num1:num2;
			for(int i=start;;i++){
				int temp1 = i % num1;
				int temp2 = i % num2;
					if(temp1 == 0 && temp2 ==0){
						System.out.println("난수는 " + num1 + " " + num2);
						System.out.println("최소공배수는 " + i);
						break;
					}
			}
		*/
		
		/*
		int num1=(int)(Math.random()*(20 - 1 + 1)+ 1);
		int num2=(int)(Math.random()*(20 - 1 + 1)+ 1);
		int start = (num1 > num2) ? num1:num2;
			for(;;){
				start = start + 1;
				int temp1 = start % num1;
				int temp2 = start % num2;
					if(temp1 == 0 && temp2 ==0){
						System.out.println("난수는 " + num1 + " " + num2);
						System.out.println("최소공배수는 " + start);
						break;
					}
			}
		*/
		
		
		//4번 while문
		/*
		int num1=(int)(Math.random()*(20 - 1 + 1)+ 1);
		int num2=(int)(Math.random()*(20 - 1 + 1)+ 1);
		int start = (num1 > num2) ? num1:num2;
			while(true){
				start = start + 1;
				int temp1 = start % num1;
				int temp2 = start % num2;
				if(temp1 == 0 && temp2 ==0){
					System.out.println("난수는 " + num1 + " " + num2);
					System.out.println("최소공배수는 " + start);
					break;
			}
		}
		*/
			
		
		
/* 숙제 5
 * 9의 팩토리얼을 구하세요
 * 힌트 변수의 초기화 문제이다
 */
		
		//5번 for문
		/*
		int result=1;
		int temp=0;
		 for(int i = 9; i > 0; i--){
			 temp=i;
			 result = result * temp;
			 temp=0;
		 }
		 System.out.println("9팩토리얼은 " + result);
		*/
		
		//5번 while문
		/*
		int result = 1;
		int i = 9;
		int temp = 0;
			while(i>1){
				temp = i;
				result = result * temp;
				temp = 0;
				i--;
			}
			System.out.println("9팩토리얼은 " + result);
		*/
		
		
		
		
		
	}

}
