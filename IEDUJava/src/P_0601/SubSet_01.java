package P_0601;

import java.util.*;
public class SubSet_01 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("car");
		set.add("Car");
		set.add("disc");
		set.add("dance");
		set.add("dZZZZ");
		set.add("dzzzz");
		set.add("elephant");
		set.add("elevator");
		set.add("fan");
		set.add("flower");
		
		//문제 나는 이중에서 b보다 크고 d보다 작은 문자열만 뽑아서 
		//	   새로운 TreeSet을 만들고싶다
		
		TreeSet set1 = (TreeSet) set.subSet("b", "d" + "b");
		System.out.println(set1);
		
	}

}
