package P_0602;

import java.util.*;
public class Enumeration_01 {

	public static void main(String[] args) {
		Hashtable map = new Hashtable();
		//Hashtable�� HashMap�� ���Ź����̴�
		map.put("1", "A");
		map.put("4", "b");
		map.put("2", "c");
		map.put("3", "d");
		map.put("5", "e");
		//Hashtable�� elements()�� �����͸� ������
		//Enumeration���� ��ȯ�ϴ� �Լ�
		Enumeration en = map.elements();
		while(en.hasMoreElements()){
			String name = (String) en.nextElement();
			System.out.println(name);
		}
		
		
	}

}