package P_0531;

import java.util.*;
public class ArrayList_02 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Girls02("�¿�"));
		list.add(new Girls02("����"));
		list.add(new Girls02("���"));
		list.add(new Girls02("ȿ��"));
		list.add(new Girls02("����ī"));
		list.add(new Girls02("Ƽ�Ĵ�"));
		list.add(new Girls02("����"));
		list.add(new Girls02("����"));
		list.add(new Girls02("����"));
		
		Collections.sort(list);
		
		int size = list.size();
		for (int i = 0; i < size; i++) {
			Girls02 temp = (Girls02) list.get(i);
			//������Ʈ�� ���ϴ� ���·� ����ȯ �ؾߵȴ�
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