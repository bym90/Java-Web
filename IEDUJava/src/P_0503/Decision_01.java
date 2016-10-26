package P_0503;
/*
 * 문제 - 문자 하나를 입력한 후 그 문자가 소문자인지 아닌지를 판단하여 출력하라
 */
public class Decision_01 {

	public static void main(String[] args) {
		char ch = 'a'; //'A'
			/*
			 * 문자가 소문자가 되기 위해서는 그 문자는 'a'~'z'사이에 있어야 소문
			 */
			String result = (ch >= 'a' && ch <= 'z') ? 
				"소문자" : "대문자";
			
			System.out.println(result);
	}

}
