package P_0509;

public class While_03 {
/*
 * 1~100까지의 합을 계산하세요
 */
	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		while(count<100){
			count = count + 1;
			sum = sum + count;
		}
		System.out.println("합은 " + sum);
/*
 * 7단 구구단을 출력하라	
 */
		int i = 0;
		int result = 0;
		System.out.println("구구단 7단");
		while(i<9){
			i = i + 1;
			result = 7 * i;
			
			System.out.println(" 7 * " + i + " = " + result);
			
		}

/*
 * 첫날 1원
 * 다음날은 전날의 2배를 저금하려고 한다
 * 저금의 총 금액이 1억원이 넘는 날은 과연 몇일째일까요?
 */
		int today = 1;
		int total = 0;
		int day = 0; //걸린 날수를 기억할 변수
		
		while(total<100000000){
			day = day + 1; //day += 1; day++;
			total = total + today;
			//다음날 저금을 위해서 오늘 저금액을 2배수로
			today = today * 2;
		}
		System.out.println("총 걸린 일수는 " + day);
		System.out.println("총 저금액은 " + total + "원");
	
	}

}
