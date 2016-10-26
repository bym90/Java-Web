package P_0527;
/*
 * 문제
 * 한줄에 3개의 숫자를 공백을 이용해서 키보드로 입력한 후
 * 입력 32 42 87 공백이 있으므로 String으로 입력 받아야 한다
 * 3개의 숫자를 더한 결과를 출력하세요
 */
import java.util.*;
import java.io.*;
import java.util.regex.*;
public class Scanner_02 {

	public static void main(String[] args) {
		/*Scanner scan = new Scanner(System.in);
		String data = null;
		
		System.out.println("입력하세요");
		data = scan.nextLine();
		
		//입력받은 숫자를 공백으로 중심으로 나누어 놓아야 한다
		String[] nums = data.split(" ");
		int[] intNum = new int[3];
		int sum=0;
		for (int i = 0; i < nums.length; i++) {
			intNum[i] = Integer.parseInt(nums[i]);
			sum += intNum[i];
		}
		System.out.println("결과 = " + sum);*/
		
		
		
		//숙제
		Scanner scan = new Scanner(System.in);
		String data = null;
		System.out.println("입력하세요");
		data = scan.nextLine();
		
		String[] a = new String[data.length()];
	
		int[] intnum = new int[data.length()];
	
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = data.substring(i, i+1);
			
			Pattern p = Pattern.compile("[0-9]");
			
			for (int j = 0; j < a.length; j++) {
				Matcher m = p.matcher(a[i]);
				if (m.matches()) {
					intnum[i] = Integer.parseInt(a[i]);
				}
			}
			
			sum += intnum[i];
		}	
		
		System.out.println("결과 = " + sum);
	}

}


//getNumericValue();
//숙제 ""안에 숫자로만 구성된 문자열을 입력한 후 각 자리수의
//숫자를 모두 더한 결과를 출력하세요
//예 "12345" 1+2+3+4+5
//format