package P_0531;

import java.util.*;
public class Vector_01 {

	public static void main(String[] args) {
		Vector v = new Vector();
		int len = v.capacity();
		System.out.println("기본 = "+ len);
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(5);
		v.add(6);
		v.add(7);
		v.add(8);
		v.add(9);
		v.add(10);
		v.add(11);
		len = v.capacity();
		System.out.println("추가후 = "+ len);
		
	}

}

//기타함수 2~3개 조사