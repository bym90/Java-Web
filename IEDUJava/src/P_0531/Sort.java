package P_0531;

import java.util.*;

public class Sort {

	public static void main(String[] args) {
		ArrayList li = new ArrayList();
		li.add(1);
		li.add(3);
		li.add(51);
		li.add(4);
		li.add(7);
		li.add(2);
		li.add(99);
		li.add(10);

		Collections.sort(li, new MySort001());
		
		int size = li.size();
		for (int i = 0; i < size; i++) {
			System.out.println(li.get(i));
		}
		
	}

}

class MySort001 implements Comparator{
	public int compare(Object o1, Object o2){
		
		int temp1 = (int) o1;
		int temp2 = (int) o2;
		
		int diff = temp1 - temp2;
	
		return -diff; 
	}
}