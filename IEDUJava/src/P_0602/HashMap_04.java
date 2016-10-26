package P_0602;

/*
 * ģ���� ��ȭ��ȣ�� �����ϴ� ���α׷��� ������
 * ��, ģ���� �׷����� �з��ؼ� �����ϵ��� ����
 */
import java.util.*;

public class HashMap_04 {
	// ���ο� �׷��� ������ִ� �Լ�(�ϳ��� ������ �÷����� ������ִ� �Լ�)
	static void makeGroup(HashMap map, String group) {
		if (map.containsKey(group)) {
			return;
		}

		HashMap temp = new HashMap();
		map.put(group, temp);
	}

	// ���ο� ģ���� ����ϴ� �Լ�
	static void insertFriend(HashMap map, String group, String name, String tel) {
		// HashMap map ��ü�� �����ϴ� Map
		// String group ����� �׷�
		// String name, String tel ����� ����

		// ���� ����� �÷����� ������?? ���� ����� ����ؾ��Ѵ�
		makeGroup(map, group);

		// ����� �÷����� �˾Ƴ���
		HashMap temp = (HashMap) map.get(group);
		// �� �÷��ǿ� ���ο� ģ���� ����Ѵ�
		temp.put(name, tel);

	}

	// ģ���� ��ȭ��ȣ�� ������ �˷��ִ� �Լ�
	static void getInfo(HashMap map, String group, String name) {
		// HashMap map ��ü�� �����ϴ� Map
		// String group ���� ģ���� ���Ե� �׷�
		// String name ���� ģ���� �̸�
		// 1. �ش� �׷��� ã�ư���
		HashMap temp = (HashMap) map.get(group);
		// 2. �� �׷쿡�� ������ ��´�
		String tel = (String) temp.get(name);
	
		System.out.println("�̸� : " + name + "   �׷� : " + group + "   ��ȭ��ȣ : " + tel);

	}

	static void allInfo(HashMap map, String group) {
		HashMap temp = (HashMap) map.get(group);
		Set set = temp.entrySet();
		Iterator iter = set.iterator();
		while (iter.hasNext()) {
			Map.Entry temp2 = (Map.Entry) iter.next();
			System.out.println(temp2.getKey() + " : " + temp2.getValue());
			
		}
		
//		HashMap temp = (HashMap) map.get(group);
//		Set set = temp.keySet();
//		Iterator iter = set.iterator();
//		while(iter.hasNext()){
//			String key = (String) iter.next();
//			String data = (String) temp.get(key);
//			System.out.println(key + " : " + data);
//		}
		
	}

	static void getAll(HashMap map) {
//		Set set = map.entrySet();
//		Iterator iter = set.iterator();
//		while (iter.hasNext()) {
//			Map.Entry temp2 = (Map.Entry) iter.next();
//			System.out.println(temp2.getKey());
//			String str=(String)	temp2.getKey();
//			allInfo(map,str);
//		}

		Set set = map.keySet();
		Iterator iter = set.iterator();
		while (iter.hasNext()){
			String key = (String) iter.next();
			System.out.println(key);
			allInfo(map, key);
		}
		
	}

	public static void main(String[] args) {
		// ���� ���� ���� Ŭ������ �̿��ؼ� ģ���� �������
		HashMap mainMap = new HashMap();
		// ģ���� �������
		insertFriend(mainMap, "ģ��", "A", "010-0000-0001");
		insertFriend(mainMap, "ģ��", "B", "010-0000-0002");
		insertFriend(mainMap, "ģ��", "C", "010-0000-0003");
		insertFriend(mainMap, "�ŷ�ó", "D", "010-0000-0004");
		insertFriend(mainMap, "�ŷ�ó", "E", "010-0000-0005");
		insertFriend(mainMap, "�ŷ�ó", "F", "010-0000-0006");
		insertFriend(mainMap, "����", "G", "010-0000-0007");
		insertFriend(mainMap, "����", "H", "010-0000-0008");
		insertFriend(mainMap, "����", "I", "010-0000-0009");
		insertFriend(mainMap, "����", "J", "010-0000-0010");

		
		
//		getInfo(mainMap, "����", "H");
	allInfo(mainMap, "����");
	//getAll(mainMap);
	}

}

/*
 * ����1 Ư���׷��� �˷��ָ� �׷��� ��� ģ�� ������ ����ϴ� �Լ��� ����ÿ� static void getGroup(HashMap map,
 * String group){} 
 * ���� 2 ��ü�� ���� ����ϴ� �Լ��� ����ÿ� static void getAll(HashMap map){}
 */