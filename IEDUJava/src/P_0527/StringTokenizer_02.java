package P_0527;

import java.util.*;

public class StringTokenizer_02 {

	public static void main(String[] args) {
		String str = "http://www.naver.com/kkk";
	    //���� �� ���ڿ��� / �� . �� �̿��ؼ� �и��ϰ��� �Ѵ�
				
		StringTokenizer token = new StringTokenizer(str, "./");
				
		while(token.hasMoreElements()){
			String data = token.nextToken();
			System.out.println(data);
		}
	}

}