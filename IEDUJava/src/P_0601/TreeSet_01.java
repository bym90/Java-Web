package P_0601;

import java.util.*;
public class TreeSet_01 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add("ȫ�浿");
		set.add("�ھ���");
		set.add("�嵶��");
		set.add("ȫ�浿");
		
		Iterator iter = set.iterator();
		
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}

}
