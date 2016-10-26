package P_0603;

import java.util.*;
public class Stack_01 {

	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		s.push("A");
		s.push("B");
		s.push("C");
		
		String a = s.pop();
		System.out.println(a);
		String b = s.pop();
		System.out.println(b);
		

	}

}
