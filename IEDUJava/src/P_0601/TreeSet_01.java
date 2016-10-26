package P_0601;

import java.util.*;
public class TreeSet_01 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add("홍길동");
		set.add("박아지");
		set.add("장독대");
		set.add("홍길동");
		
		Iterator iter = set.iterator();
		
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}

}
