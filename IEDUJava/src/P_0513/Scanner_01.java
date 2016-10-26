package P_0513;
//이 프로그램에서 사용할 부품이 어디 소속인지 알려줘야 한다
//import java.util.*;

//하나만 사용할 경우 import java.util.Scanner;

public class Scanner_01 {

	public static void main(String[] args) {
		//부품을 사용하기 위해서 오브젝트로 만들어 놓아야 한다
		/*
		Scanner scan = new Scanner(System.in);
		
		System.out.print("당신의 국어 점수 = ");
		int kor = scan.nextInt();
		
		System.out.println("당신이 입력한 국어 점수 = " + kor);
		*/
		
		
		/*
		String a = "123";
		String b = "456";
		System.out.println(a + b);
		int c = Integer.parseInt(a);
		int d = Integer.parseInt(b);
		System.out.println(c + d);
		*/
		
		
		
		/*
		Scanner	scan = new Scanner(System.in);
		
		String	a, b;
		
		System.out.print("첫번째 숫자 = ");
		a = scan.nextLine();
		System.out.print("두번째 숫자 = ");
		b = scan.nextLine();
		
		int	hap = Integer.parseInt(a) + Integer.parseInt(b);
		System.out.printf("결과 = %5d", hap);
		*/
		
		
		
/*
 * 컴퓨터가 숫자 하나를 기억하도록 하고 그 숫자를 맞추는 게임을 만들어보자
 * 단, 숫자가 다르면 힌트(작다, 크다)를 주도록 한다
 * 컴퓨터가 숫자 하나느 기억하도록 해야한다
 * 
 * 몇번만에 정답으 맞췄는지 같이 출력하자
 * 
 * 숙제 10번 시도에도 정답이 나오지 않으면 게임을 강제로 종료한다
 */
		/*
		Scanner scan = new Scanner(System.in);
		
		int computer = (int)(Math.random()*(100 - 1 + 1) + 1);
		int count = 0;//횟수를 기억할 변수
		
		//몇번에 걸쳐서 입력해야 숫자를 맞출지 모르므로
		while(true){
			//키보드를 이용해서 예측 숫자를 입력하도록 한다
			count++;
			System.out.print("당신이 예측한 숫자 = ");
			int guess = scan.nextInt();
				
			//이 숫자가 맞았는지 확인한다
				if(computer == guess){
					System.out.println(count + "번 만에 정답입니다 ^^");
					break;
				}
				if(count == 10){
					System.out.println("10번 만에 맞추지 못해서 게임이 종료됩니다");
					break;
				}
				//힌트를 주도록 하자
				if(computer > guess){
					System.out.println("UP!!!");
				}
				else{
					System.out.println("DOWN!!!");
				}
	
		}
		*/
		
		
		
/*
 *  5글자로 구성된 숫자적 문자를 기억한 후
 *  "12345"
 *  각자리의 숫자의 합을 구하세요		
 */
		/*
		String str="75196";
		int sum=0;//합을 기억할 장소
		for(int i=0; i<5; i++){
			char ch =str.charAt(i);
			int num = ch - '0';
			sum = sum + num;
			
		}
		
		System.out.printf("총 합은 %d\n", sum);
		*/
		
		
		
		/*
		int a = 4;
		String result = Integer.toBinaryString(a);
		
		System.out.println(result);
		*/
		
		
		
/*
 * 특정 숫자를 2진수로 표현하라
 * 단, 실제 메모리에 있는 내용대로 출력하라 (무효숫자도 다 출력하라)
 */
/*
 * 원리-사람 이름이 있는데 이름 앞에 *표를 붙여서 반드시 20글자로 만드세요
 * Hong #################Hong이런식
 * 일단 "#"을 20개를 이름앞에 붙인다
 * 이 중에서 뒤에서 20개만 꺼내면 된다.
 * 앞에 몇글자를 뺀 나머지를 꺼내면 된다.
 */
		int a=4;
		String result = Integer.toBinaryString(a);
		
		String temp = "00000000000000000000000000000000" + result;
		temp = temp.substring(result.length());
		System.out.println("12345678901234567890123456789012");
		System.out.println(temp);
		
		
		
		
		
	}

}
