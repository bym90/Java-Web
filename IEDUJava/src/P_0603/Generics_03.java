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
			//17�� �� ������ �ذ��ϱ� ���� 15���� ���ʸ������� ����
			//set�� ���ʸ� ������ �ص� �÷����� �ٲ�� ���ʸ� ������ �ٽ� ������Ѵ�.
			System.out.println(name);
		}
		
	}

}