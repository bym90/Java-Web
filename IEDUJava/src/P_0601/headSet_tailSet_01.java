package P_0601;

import		java.util.*;
//우리반 학생 성적을 랜덤하게 10개 입력한 후
//50점 이하만 뽑아보자
public class headSet_tailSet_01 {

	public static void main(String[] args) {
		TreeSet		set = new TreeSet();
		for(int i = 0; i < 10; i++) {
			set.add((int)(Math.random() * 100));
		}

		TreeSet	set1 = (TreeSet) set.tailSet(50);
		
		System.out.println(set);
		System.out.println(set1);

	}

}
