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
		
		//���� ���� ���߿��� b���� ũ�� d���� ���� ���ڿ��� �̾Ƽ� 
		//	   ���ο� TreeSet�� ������ʹ�
		
		TreeSet set1 = (TreeSet) set.subSet("b", "d" + "b");
		System.out.println(set1);
		
	}

}