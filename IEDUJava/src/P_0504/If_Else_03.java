package P_0504;

public class If_Else_03 {

	public static void main(String[] args) {
		/*
		 * 랜덤한 숫자 3개를 발생한 후
		 * 크기 순서대로 출력하라
		 */
		int num1 = (int)(Math.random()*(100+1-1)+1);
		int num2 = (int)(Math.random()*(100+1-1)+1);
		int num3 = (int)(Math.random()*(100+1-1)+1);
		
		int max, cen, min;
		//1과 2 비교
		if(num1 > num2){
			//3과 1 비교
			if(num1 > num3){
				max = num1;
				//2와 3비교
				if(num2 > num3){
					cen = num2;
					min = num3;
				}
				else{
					cen = num3;
					min = num2;
				}
			
			}
			//1보다 3이 큰경우
			else{
				max = num3;
				cen = num1;
				min = num2;
			}
		}  
		
		
		else{	
			//1보다 2가 큰 경우 2와 3비교
			if(num2 > num3){
				max = num2;
				//2보다 3이 큰경우  1과 3비교
				if(num1 > num3){
					cen = num1;
					min = num3;
				}
				else{
					cen = num3;
					min = num1;
				}
			}
			//2보다 3이 큰경우
			else{
				max = num3;
				cen = num2;
				min = num1;
			}
			
		}
		System.out.println("첫번째 숫자는 " + num1 + "  두번째 숫자는 " +  num2 + "  세번째 숫자는 " + num3);
		System.out.println("순서정렬시  " + max + "   " + cen + "    " + min);
			
			
	}		
}