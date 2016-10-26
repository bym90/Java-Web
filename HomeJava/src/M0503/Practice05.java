package M0503;

public class Practice05 {

	public static void main(String[] args) {
		//연습문제 3-9
		char ch = 'z';
		boolean a = ('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z') || ('0' <= ch && ch <= '9');
		System.out.println(a);
	
		//연습문제 3-10
		char ch2 = 'B';
		char lowerCase = ('A' <= ch2 && ch2 <= 'Z') ? (char)(ch2+32) : ch2;
		
		System.out.println("ch2:"+ch2);
		System.out.println("ch to lowerCase:"+lowerCase);
		
		System.out.println('J' + "ava");
		
	}

}
