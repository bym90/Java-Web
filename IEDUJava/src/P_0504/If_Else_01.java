package P_0504;

public class If_Else_01 {

	public static void main(String[] args) {
		/*
		 * 문제 - 랜덤하게 -50~50까지의 숫자를 발생한 후
		 * 절대값을 구하여 출력하라
		 */
			int num = (int)(Math.random()*(50 - (-50) + 1) + (-50));
			
			if(num != 0){
				num = -num;
			}
			//P0503-Work03과 비교
			System.out.println(num);
			
			
			
		/*
		 * 문제 - 사과가 50~100개 사이로 있다
		 * 이 사과를 바구니에 담는데 한 바구니에 8개씩 담을 수 있다.
		 * 사과를 바구니에 담을때 바구니는 몇개 필요한가?
		 */
		   int apple = (int)(Math.random()*(100 - 50 + 1) + 50);
		   int baguni = apple / 8;
			// 만약 8로 나눈후 남느것이 있으면 바구니가 한개 더 필요하다.
		   
		   if (apple % 8 != 0){
			    baguni = baguni + 1;
		   }
		   System.out.println("사과의 개수 =" + apple);
		   System.out.println("필요한 바구니 =" + baguni);
		   
		   
		   
		/*
		 * 문제 - 1~100사이의 숫자를 랜덤하게 발행한 후
		 * 그 숫자가 짝수이면 Even이라 출력하고
		 * 홀수이면 Odd라 출력하라   
		 */
		   int num2 = (int)(Math.random()*(100 - 1 + 1) + 1);
		   String result;
		   //제어문안에 syso가능!!
		   if (num2 % 2 == 0){
			  result = "Even";
		   }
		   else{
			  result = "Odd";
		   }
		   System.out.println("발생 숫자는 " + result);
			   
			
		   
		 /*
		  * 문제 - 문자 하나를 강제로 입력한 후
		  * 그 문자가  대문자이면 소문자로, 소문자이면 대문자로 변환하여 출력하라
		  * 단, 특수문자는 없다는 보장이 있다.
		  */
		    char ch = 'z';
		    
		    if(ch >= 'A' && ch <= 'Z'){
		    	ch = (char)(ch + 32);
		    }
		    else{
		    	ch = (char)(ch - 32);
		    }
		    
		    System.out.println("결과는 " + ch);
		    
	}

}
