package P_0526;

import java.nio.ShortBuffer;

public class String_Homework_01 {



	public static void main(String[] args) {
		    String s = "aBcdefghijk";
		    String s1 = "Abcdefghijk";
		
		
		  /*System.out.println(s.charAt(3));
			System.out.println(s.codePointAt(0));
			System.out.println(s1.codePointAt(0));
			System.out.println(s.codePointBefore(3));
			System.out.println(s.codePointCount(2, 4));
			System.out.println(s.compareTo(s1));
			System.out.println(s.equals(s1));
			System.out.println(s.compareToIgnoreCase(s1));
			System.out.println(s.concat(s1));*/
			System.out.println(s.contains(s1));
			System.out.println(s.contentEquals(s1));
			char[] data = {'A','b'};
			String tmp = s.copyValueOf(data);
			System.out.println(tmp);
			
			
			/*String001 str001 = new String001();
			str001.length("Bae");*/
			String a = "123A ";
			StringBuffer s2 = new StringBuffer(a);
			System.out.println(s2.capacity());
	}


	

}


//숙제 String 클래스가 가지고 있는 함수 중 최소 5~10정도를 선택해서
//그 의미를 알아내고 그 함수를 사용하는 예제 프로그램을 만드세요

/*class String001{
	
	void length(){
		
	}
	void length(String a){
		
		System.out.println(a.length());
		
	}
	
}*/