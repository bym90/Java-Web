package P_0531;

import java.util.*;
public class ArrayList_01 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("태연");
		list.add("서현");
		list.add("써니");
		list.add("효연");
		list.add("제시카");
		list.add("티파니");
		list.add("수영");
		list.add("윤아");
		list.add("유리");
		
		
		int size = list.size();
		for (int i = 0; i < size; i++) {
			System.out.println(list.get(i));
		}
		
		Collections.shuffle(list);
		System.out.println();
		System.out.println("섞은 후");
		for (int i = 0; i < size; i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		Collections.replaceAll(list, "유리", "유이");
		for (int i = 0; i < size; i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		Collections.reverse(list);
		for (int i = 0; i < size; i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		Collections.fill(list, "a");
		for (int i = 0; i < size; i++) {
			System.out.println(list.get(i));
		}
		
	
		
	}

}


//숙제 sort, swap, replaceall, fill, reverse 함수에 대해 조사
//사용예 프로그램 하나씩 만들기



