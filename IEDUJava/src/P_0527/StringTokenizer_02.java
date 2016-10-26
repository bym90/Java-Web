package P_0527;

import java.util.*;

public class StringTokenizer_02 {

	public static void main(String[] args) {
		String str = "http://www.naver.com/kkk";
	    //나는 이 문자열을 / 와 . 을 이용해서 분리하고자 한다
				
		StringTokenizer token = new StringTokenizer(str, "./");
				
		while(token.hasMoreElements()){
			String data = token.nextToken();
			System.out.println(data);
		}
	}

}
