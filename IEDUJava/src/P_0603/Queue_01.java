package P_0603;

import java.util.*;
public class Queue_01 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.offer("A");
		list.offer("B");
		list.offer("C");
		
		String a = list.poll();
		System.out.println(a);
		String b = list.poll();
		System.out.println(b);

	}

}
