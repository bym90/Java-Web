package P_0601;

import		java.util.*;
//�츮�� �л� ������ �����ϰ� 10�� �Է��� ��
//50�� ���ϸ� �̾ƺ���
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