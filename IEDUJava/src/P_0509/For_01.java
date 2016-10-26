package P_0509;

public class For_01 {
/*
 * 1~100까지 합을 계산하라
 */
	public static void main(String[] args) {
		int sum = 0 ;
		for(int count =1; count<=100; count++){
				sum = sum + count;
		}
		System.out.println("합은 " + sum);
		
/*
 * Hello 10번 출력하라
 */
		int i = 0;
		for( ; ; ){
			i = i + 1;
			System.out.println("Hello");
			if(i == 10){
				break;
			}
		}
	
	}
	
}
