package M0503;

public class Work02 {
 /* 문자 하나를 입력한 후
	대문자이면 소문자로, 소문자이면 대문자로 출력하라.
	특수문자는 없는것으로 가정한다.
 */
	public static void main(String[] args) {
		char ch = 'D';
		char result = (ch >= 'A' && ch <= 'Z') 
				? (char)(ch+32) : (char)(ch-32);
				
				System.out.println(result);
		
		
	}

}
