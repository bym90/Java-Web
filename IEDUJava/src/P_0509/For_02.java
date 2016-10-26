package P_0509;

public class For_02 {
/*
 * 1~100까지 합을 구하라
 * 단, 매 10단위마다 중간 결과를 출력하라
 */
	public static void main(String[] args) {
		int sum = 0;
		for(int count = 1; count <= 100; count++){
			sum = sum + count;
			if(count % 10 == 0){
			System.out.println("1~ " + count + " 합은 " + sum);
			}
		}

/*
 * 어느 농장에서 닭과 개를 사육한다
 * 닭과 개는 모두 84마리가 있다
 * 근데 다리를 세어보니 196개입니다
 * 
 * 과연 닭과 개는 각각 몇마리인가요?		
 */
		int chicken = 0;
		int dog = 0;
		int leg = 0;
		for( ; chicken<=84; chicken++){
			dog = 84 - chicken;
			leg = chicken * 2 + dog * 4;
			if(leg == 196){
				System.out.println("닭은 " + chicken + "마리");
				System.out.println("개는 " + dog + "마리");
			}
		}


/*
 * 두 수를 랜덤하게 발생한 후 두수의 최대공약수를 구하세요
 * 최대공약수를 구하는 원리
 * 두 수 중에 작은수에서 시작해서 하나씪 감소해 나가면서(1까지)
 * 두 수가 모두 떨어지는 수가 바로 최대공약수이다.
 * 
 * 		27 18의 최대공약수
 * 		18/18의 나머지 27/18의 나머지
 * 		18/17의 나머지 27/17의 나머지
 * 		18/16의 나머지 27/16의 나머지....		
 */
		int num1 = (int)(Math.random()*(100 - 1 + 1) + 1);
		int num2 = (int)(Math.random()*(100 - 1 + 1) + 1);
		int start = (num1 < num2) ? num1:num2;
		for(int i=start; i>0; i--){
			int imsi1 = num1 % i;
			int imsi2 = num2 % i;
			if( imsi1 == 0 && imsi2 == 0){
				System.out.print("난수는 " + num1 + " " +num2);
				System.out.println("  최대공약수는 " + i);
				break;
			}
		}
		
		
	}

}
