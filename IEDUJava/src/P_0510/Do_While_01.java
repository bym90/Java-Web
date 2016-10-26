package P_0510;

public class Do_While_01 {

	public static void main(String[] args) {
/*
 * 1~10까지 팩토리얼을 구해보자
 */
		/*
		long result = 1;	//결과를 기억할 변수
		int count = 0;	//카운트 시킬 변수
		do{
			count = count + 1;
			result = result * count;
		}while(count < 10);
		*/
		/*
		long result = 1;
		int count = 1;
		do{
			result = result * count;
			count = count + 1;
			
		}while(count <= 10);
		System.out.println("답 = " + result);
		*/
		
		

/*
 * 7882m 산이 있다
 * 한 사람은 1.52m/s 올라가고
 * 다른 사람은 1.83m/s으로 내려온다
 * 과연 두사람은 몇초뒤에 조우할까?		
 */
		/*
		float up = 0.0F;
		float down = 7822.0F;
		int second = 0;
		do{
			second++;
			up=up + 1.52F;
			down = down - 1.83F;
		}while(up < down);
		int second2 = second % 60;
		int minute = second / 60;
		System.out.println(minute + "분 " + second2 + "초");
		System.out.println("결과는 " + second + "초");
		*/
		
	}

}
