package P_0531;

import java.util.*;

public class ArrayList_03 {

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
		
		Collections.sort(list, new MySort03());
		
		int size = list.size();
		for (int i = 0; i < size; i++) {
			System.out.println(list.get(i));
		}
		//1. ���Ĺ���� ������ Ŭ������ �����
		//2. �� Ŭ������ �ݵ�� Comparator �������̽��� ��ӹ޾Ƽ� �����
		System.out.println();
		Collections.swap(list, 0, 2);
		
		for (int i = 0; i < size; i++) {
			System.out.println(list.get(i));
		}
		
		
	}

}

class MySort03 implements Comparator{
	//3. compare(T o1, T o2)�� �������̵� �Ѵ�
	//�� �Լ��� ������ ���ؼ� �ΰ��� �����͸� ���� ���ʰ� �Ǹ�
	//�ΰ��� �����͸� �˷��ָ鼭 �ٲ������� ���θ� ����� �Լ�
	public int compare(Object o1, Object o2){
		
		String temp1 = (String) o1;
		String temp2 = (String) o2;
		
		int diff = temp1.compareTo(temp2);
	
		return -diff;
		
	}
}