package P_0531;

import java.util.*;
public class ArrayList_01 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("�¿�");
		list.add("����");
		list.add("���");
		list.add("ȿ��");
		list.add("����ī");
		list.add("Ƽ�Ĵ�");
		list.add("����");
		list.add("����");
		list.add("����");
		
		
		int size = list.size();
		for (int i = 0; i < size; i++) {
			System.out.println(list.get(i));
		}
		
		Collections.shuffle(list);
		System.out.println();
		System.out.println("���� ��");
		for (int i = 0; i < size; i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		Collections.replaceAll(list, "����", "����");
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


//���� sort, swap, replaceall, fill, reverse �Լ��� ���� ����
//��뿹 ���α׷� �ϳ��� �����


