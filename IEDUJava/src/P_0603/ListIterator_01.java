package P_0603;

import java.util.*;
public class ListIterator_01 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		for (int i = 0; i < 10; i++) {
			list.add((int)(Math.random()*100));
		}
		
		ListIterator iter = list.listIterator();
		while(iter.hasNext()){
			int num = (int) iter.next();
			System.out.print(num + " ");
		}
		
		//�ٽ� �������
		System.out.println();
		System.out.println("����");
		while(iter.hasPrevious()){
			int num = (int) iter.previous();
			System.out.print(num + " ");
		}
		
	}

}