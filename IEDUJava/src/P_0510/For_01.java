package P_0510;

public class For_01 {

	public static void main(String[] args) {
			/*
			for(int i = 0; i < 3; i++){ //0, 1, 2로 3번 반복
				
				for(int j = 0; j < 2; j++){ // 0, 1로 2번 반복
					System.out.println("I = " + i + "J = " + j );
				}
			}
			*/
			/*
			int i = 0;
			int j = 0;	
			for(; i < 3; i++){
			
				for(; j < 2; j++){
					System.out.println("I = " + i + "J = " + j );
				}
			}
			*/
		
		
		
/*
 * 5단 구구단을 출력하라		
 */
			/*
			int dan = 5;
			int dap = 0;
				
			for(int i = 1; i < 10; i++){
				dap =  dan * i;
				System.out.println(dan + " * " + i + " = " + dap);
			}
			*/
		
			/*
			int dap = 0;
			for(int dan = 2; dan < 10; dan++){
				for(int i = 1; i < 10; i++){
					dap =  dan * i;
					System.out.println(dan + " * " + i + " = " + dap);
			}
			}
			*/
		
		
		
/*
 *  *****의 모양을 만드세요
 *  단, 한번에 *는 한개만 출력하라		
 */		
		/*
		for(int j = 0; j < 5; j++){	
			for(int i = 0; i < 5; i++){
				System.out.println("*");
			}
			System.out.println();
		}
		*/
		
		
		
/*
 * *
 * **
 * ***
 * ****
 * *****의 모양을 만드세요		
 */
			/*
			for(int j = 0; j < 5; j++){
				for(int i = 0; i < (j + 1); i++){
					System.out.print("*");
				}
				System.out.println();
			}
			*/
		    //숙제1 반대 모양을 만들어라
		
		
		
/*
 * (1) + (1 + 2) + (1 + 2 + 3) +
 * ...(1 + 2 + 3 ... 100)의 합을 계산하라		
 */
			
			/*
			int		sum = 0;		//	결과를 기억할 변수
		
			//	전체적으로 100번 반복해야 한다.
				for(int i = 0; i < 5; i++) {
			//	한번 반복할때마다 
			//	위에서 말한 원리대로 반복 횟수를 조절하면서 반복해야 한다.
					for(int j = 1; j <= (i + 1); j++) {
						sum = sum + j;
					}
				}
			System.out.println("결과  = " + sum);
			*/
		

/*
 * 서기 1000~3000사이에 있는 윤년만 출력하세요
 */
			/*
			int year = 2000;
			String result = "평년";
			
			if(year % 4 == 0){
				result = "윤년";
				if(year % 100 == 0){
					result = "평년";
						if(year % 400 == 0){
							result="윤년";
						}
					}
				}
			System.out.println(result);
			*/
		
		/*
		for(int year = 1000; year <= 3000; year++) {
			String	result = "평년";
			if(year % 4 == 0) {
				result = "윤년";
				if(year % 100 == 0) {
					result = "평년";
					if(year % 400 == 0) {
						result = "윤년";
					}
				}
			}
			//문자열이 같음을 질문할 경우에는 .equals()를 이용하라
			if(result.equals("윤년")) {
				System.out.println(year + "가 윤년이다.");
			}
		}
		*/
		
		
		
/*
 * 2x + 4y = 10라는 방정식을 풀어라
 * 단, x, y는 정수 0~10사이에 해가 있다
 * 푸는 원리
 * 	모든 경우의 수를 다 대입하여 결과가 만족하는지 알아본다
 */
			/*
			for(int x = 0; x <= 10; x++){
				for(int y = 0; y <= 10; y++){
					int dapt=2 * x + 4 * y;
					if(dapt == 10){ //if(2*x+4*y==10)도 가능					
						System.out.println("X= " + x + "Y= " + y);
					}
				}
			}
			*/
			
		
		
/* 숙제2
 * 2g 추가 5개, 3g 추가 4개, 5g 추가 3개 있다
 * 이 추를 이용하여 무게 17g ~ 21g 사이를 만드는 경우의 수를 구하세요
 * 힌트 2, 3, 5g의 모든 경우의 수를 다 대입하여 원하는 무게가 되었는지 확인한다
 */	
			/*
			int dap = 0;
			for(int x=0; x<=5; x++){
				for(int y=0; y<=4; y++){
					for(int z=0; z<=3; z++){
						int result=2*x + 4*y + 3*z;
							if(result>=17 && result<=21){
								dap = dap + 1;
								System.out.println("X= " + x + " Y= " + y + " Z= " + z);
								System.out.println(result);
							}
								
					}
				}
			}
			System.out.println(dap);
			*/
			
			
/* 숙제3
 * 두개의 주사위를 던져서 두 주사위의 합이 6이 되는 모든 경우의 수를 구하세요
 */
			int count=0;
		
			for(int x=1; x<=6; x++){
				for(int y=1; y<=6; y++){
					int result=x+y;
						if(result==6){
							count=count+1;
							System.out.println("X는 " +x+ " Y는 " +y);
						}
				}
			}
			System.out.println("경우의 수는 " + count);
		
		
		
		
		
		
	}

}
