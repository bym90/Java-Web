package P_0602;

import java.util.*;
public class TreeMap_01 {

	public static void main(String[] args) {
		TreeMap map = new TreeMap();
		map.put("이름", "A");
		map.put("전화번호", "010-0000-0000");
		map.put("이메일", "@naver.com");
		map.put("주소", "경기도");
		map.put("주민번호", "000000-1111111");
		
		Set set = map.entrySet();
		Iterator iter = set.iterator();
		while(iter.hasNext()){
			Map.Entry temp = (Map.Entry) iter.next();
			System.out.println(temp);
		}
		


	}

}
