package P_0517;

public class Class_01 {

	public static void main(String[] args) {
		
		String str = new String("Hong Gil Dong");
		//글자수를 알아내는 방법 변수.length();
		int len = str.length(); //함수
		System.out.println("길이는 " + len);
		
		
		//str이 가진 데이터중 0번째 글자가 무엇인지 궁금		
		char ch = str.charAt(0);
		System.out.println("0번째 글자는 " + ch);
		
		
	}

}
