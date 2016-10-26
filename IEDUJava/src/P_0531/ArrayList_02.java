package P_0531;

import java.util.*;
public class ArrayList_02 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Girls02("태연"));
		list.add(new Girls02("서현"));
		list.add(new Girls02("써니"));
		list.add(new Girls02("효연"));
		list.add(new Girls02("제시카"));
		list.add(new Girls02("티파니"));
		list.add(new Girls02("수영"));
		list.add(new Girls02("윤아"));
		list.add(new Girls02("유리"));
		
		Collections.sort(list);
		
		int size = list.size();
		for (int i = 0; i < size; i++) {
			Girls02 temp = (Girls02) list.get(i);
			//오브젝트는 원하는 형태로 형변환 해야된다
			System.out.println(temp.name);
		}
		
		
		
	}

}

class Girls02{
	String name;
	Girls02() {}
	Girls02(String n) {
		name = n;
	}
}