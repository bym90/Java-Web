package P_0602;

import java.util.*;
public class Enumeration_01 {

	public static void main(String[] args) {
		Hashtable map = new Hashtable();
		//Hashtable은 HashMap의 과거버전이다
		map.put("1", "A");
		map.put("4", "b");
		map.put("2", "c");
		map.put("3", "d");
		map.put("5", "e");
		//Hashtable의 elements()는 데이터만 꺼내서
		//Enumeration으로 변환하는 함수
		Enumeration en = map.elements();
		while(en.hasMoreElements()){
			String name = (String) en.nextElement();
			System.out.println(name);
		}
		
		
	}

}
