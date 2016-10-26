package P_0503;
/*
 * 문제 - 문자 하나를 입력한 후 그 문자가 소문자이면 그대로 출력하고
 * 그 문자고 대문자이면 소문자로 바꾸어서 출력하라
 */
public class Decision_02 {

	public static void main(String[] args) {
		char ch = 'A'; //'a'
		char result = (ch >= 'A' && ch <= 'Z') ? 
			(char)(ch+32) : ch;
		
		
		System.out.println(result);
		
		char ch2 = 'B'; // "a", '%'
		char result2 = (ch2 >= 'A' && ch2 <= 'Z') 
		? (char)(ch2+32) : (ch2 >= 'a' && ch2 <='z')
				? (char)(ch2- 32) : ch;
				
				System.out.println(result2);
				
	}
}
