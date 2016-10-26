package P_0527;

import java.util.*;

public class StringTokenizer_01 {

	public static void main(String[] args) {
		// 먼저 문자열 준비
		String str = "a b c d e f";
		
		StringTokenizer token = new StringTokenizer(str);
		
		// 이 분리된 내용은 반드시 순서대로만 꺼냄
		
		int count = token.countTokens();
		
		//꺼낸 데이터를 기억할 다른 변수를 만들어 놓고
		String[] temp = new String[count];
		
		
		for (int i = 0; i < count; i++) {
			String data = token.nextToken();
			temp[i] = data;
			System.out.println(data);
		}
		
		System.out.println("다시 사용합니다");
		/*for (int i = 0; i < count; i++) {
			String data = token.nextToken();
			System.out.println(data);
		} 다시 사용불가한 클래스
		*/
		for (int i = 0; i < count; i++) {
			System.out.println(temp[i]);
		}
		//만얀 재사용을 원한다면 데이터를 다른변수에 기억해놓아야 함

	}

}
