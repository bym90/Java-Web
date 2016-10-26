package P_0601;

import java.util.*;
public class HashSet_03 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		for (int i = 0; i < 10; i++) {
			int temp = (int)(Math.random() * 100);
			set.add(temp);
		}
		
		System.out.println(set);
		ArrayList list = new ArrayList(set);
		
		Collections.sort(list);
		System.out.println(list);
		

	}

}
