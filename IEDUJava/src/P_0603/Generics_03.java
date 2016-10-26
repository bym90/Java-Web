package P_0603;

import java.util.*;

public class Generics_03 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");

		Iterator<String> iter = set.iterator();
		while(iter.hasNext()){
			String name = iter.next();
			//17번 줄 오류를 해결하기 위해 15번에 제너릭선언을 해줌
			//set에 제너릭 선언을 해도 컬렉션이 바뀌면 제너릭 선언을 다시 해줘야한다.
			System.out.println(name);
		}
		
	}

}
