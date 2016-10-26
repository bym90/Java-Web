package P_0531;

import java.util.*;
public class ArrayList_04 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		for(int i = 0; i < 10; i++) {
			int temp = (int)(Math.random() * 100);
			list.add(temp);
		}
		
		Collections.sort(list, new MySort04());
		for(int i = 0; i < 10; i++) {
			System.out.println(list.get(i));
		}
		
	}

}

class MySort04 implements Comparator {
	public int compare(Object o1, Object o2) {
		//	이 안에서 비교 대상에 따라 0, 양수, 음수를 반환하면 된다.
		int	temp1 = (int) o1;
		int	temp2 = (int) o2;
		
		int	diff = temp1 - temp2;
		
		return diff;
	}
}
