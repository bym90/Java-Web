package P_0603;

import java.util.*;
public class For_02 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add((int)(Math.random()*10));
		}
		
		int sum = 0;
		for(int temp : list){
			sum = sum + temp;
		}
		
		System.out.println("гу =" + sum);
		
		
	}

}
