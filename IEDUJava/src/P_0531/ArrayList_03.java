package P_0531;

import java.util.*;

public class ArrayList_03 {

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
		
		Collections.sort(list, new MySort03());
		
		int size = list.size();
		for (int i = 0; i < size; i++) {
			System.out.println(list.get(i));
		}
		//1. 정렬방식을 변경할 클래스를 만든다
		//2. 이 클래스는 반드시 Comparator 인터페이스를 상속받아서 만든다
		System.out.println();
		Collections.swap(list, 0, 2);
		
		for (int i = 0; i < size; i++) {
			System.out.println(list.get(i));
		}
		
		
	}

}

class MySort03 implements Comparator{
	//3. compare(T o1, T o2)를 오버라이드 한다
	//이 함수는 정렬을 위해서 두개의 데이터를 비교할 차례가 되면
	//두개의 데이터를 알려주면서 바꿀지말지 여부를 물어보는 함수
	public int compare(Object o1, Object o2){
		
		String temp1 = (String) o1;
		String temp2 = (String) o2;
		
		int diff = temp1.compareTo(temp2);
	
		return -diff;
		
	}
}