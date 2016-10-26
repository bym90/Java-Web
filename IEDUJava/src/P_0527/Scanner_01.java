package P_0527;
/*
 * 키보르를 이용해서 전화번호를 입력받고
 * 전화번호 형식이 올바른지 파악하세요
 */
import java.util.*;
import java.util.regex.*;

public class Scanner_01 {

	public static void main(String[] args) {
		
		
		/*Scanner scan = new Scanner(System.in);
		String tel = null;
		
		
		while(true){
		try{
			System.out.println("여기에 입력하세요");
			tel = scan.nextLine();
		}
		catch(Exception e){
			System.out.println("잘못된 데이터");
		}
		
		Pattern p = Pattern.compile("[0-9]{3}-[0-9]{3,4}-[0-9]{4}");
		Matcher m = p.matcher(tel);
		
		if(m.matches()){
			System.out.println("올바른 전화번호");
			break;
		}
		else{
			System.out.println("전화번호를 제대로 입력해주세요");
		}
		}*/
	
		
	/*while(true){
		Random ran = new Random(1);
		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		for (int i = 0; i < 1; i++) {
			num2 = ran.nextInt(100);
		}
		
	
		
		try{
			System.out.println("입력하세요");
			num1 = scan.nextInt();
		}
		catch(Exception e){
			System.out.println("숫자를 입력하세요");
		}

		
		if (num1 == num2) {
			System.out.println("맞음");
			break;
		}
		else{
			System.out.println("틀림");
			
			if (num1 > num2) {
				System.out.println("더 작은수를");
			}
			else{
				System.out.println("더 큰수를");
			}
		}
	}	*/
	
		int num1 = (int)(Math.random()*(9 - 1 + 1) + 1);
		int num2 = (int)(Math.random()*(9 - 1 + 1) + 1);
		
		while(true){
		
		Scanner scan = new Scanner(System.in);
		String data = null;
		
		int gob1 = 0;
		int gob2 = 0;
		
		System.out.println("입력하세요");
		data = scan.nextLine();
		
		String[] str = data.split("[*]");
		int[] intNum = new int[2];
	
		for (int i = 0; i < str.length; i++) {
			intNum[i] = Integer.parseInt(str[i]);
			
		}
			
		/*gob1 = intNum[0] * intNum[1];
		gob2 = num1 * num2;
		
		if (gob1 == gob2) {
			System.out.println("정답");
			break;
		}
		else{
			System.out.println("오답");
				
		}*/
		
		
		if(intNum[0]==num1){
			System.out.println("1번째 숫자가 맞음");
			if(intNum[1]==num2){
				System.out.println("2번째도 맞아서 정답");
				break;
			}
			else{
				System.out.println("2번째 숫자가 틀림");
				if(intNum[1]>num2){
					System.out.println("입력한 2번째 숫자가 더 크다");
				}
				else{
					System.out.println("입력한 2번째 숫자가 더 작다");
				}
			}
		}
		else{
			System.out.println("1번째 숫자가 틀림");
			if (intNum[0]>num1) {
				System.out.println("입력한 1번째 숫자가 더 크다");
			}
			else{
				System.out.println("입력한 1번째 숫자가 더 낮다");
			}
		}
		
		} 
		System.out.println(num1);
		System.out.println(num2);
		
		
		
		
	}


	

}

//숙제 랜덤하게 0~100사이의 숫자를 발생한 후 
//사용자가 정답을 맞추는 게임을 만드세요

//숙제 랜덤하게 2개의 숫자를 1~9사이로 발생한 후
//구구단 결과를 맞추는 게임을 만드세요
//힌트 ?*?=입력
//		정답 혹은 오답이라고 출력