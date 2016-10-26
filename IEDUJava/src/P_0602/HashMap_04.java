package P_0602;

/*
 * 친구의 전화번호를 관리하는 프로그램을 만들어보자
 * 단, 친구는 그룹으로 분류해서 관리하도록 하자
 */
import java.util.*;

public class HashMap_04 {
	// 새로운 그룹을 만들어주는 함수(하나의 독립된 컬렉션을 만들어주는 함수)
	static void makeGroup(HashMap map, String group) {
		if (map.containsKey(group)) {
			return;
		}

		HashMap temp = new HashMap();
		map.put(group, temp);
	}

	// 새로운 친구를 등록하는 함수
	static void insertFriend(HashMap map, String group, String name, String tel) {
		// HashMap map 전체를 관리하는 Map
		// String group 등록할 그룹
		// String name, String tel 등록할 내용

		// 아직 등록할 컬렉션이 없으면?? 먼저 만들고 사용해야한다
		makeGroup(map, group);

		// 등록할 컬렉션을 알아낸다
		HashMap temp = (HashMap) map.get(group);
		// 그 컬렉션에 새로운 친구를 등록한다
		temp.put(name, tel);

	}

	// 친구의 전화번호를 꺼내서 알려주는 함수
	static void getInfo(HashMap map, String group, String name) {
		// HashMap map 전체를 관리하는 Map
		// String group 꺼낼 친구가 포함된 그룹
		// String name 꺼낼 친구의 이름
		// 1. 해당 그룹을 찾아간다
		HashMap temp = (HashMap) map.get(group);
		// 2. 그 그룹에서 정보를 얻는다
		String tel = (String) temp.get(name);
	
		System.out.println("이름 : " + name + "   그룹 : " + group + "   전화번호 : " + tel);

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
		// 이제 위에 만든 클래스를 이용해서 친구를 등록하자
		HashMap mainMap = new HashMap();
		// 친구를 등록하자
		insertFriend(mainMap, "친구", "A", "010-0000-0001");
		insertFriend(mainMap, "친구", "B", "010-0000-0002");
		insertFriend(mainMap, "친구", "C", "010-0000-0003");
		insertFriend(mainMap, "거래처", "D", "010-0000-0004");
		insertFriend(mainMap, "거래처", "E", "010-0000-0005");
		insertFriend(mainMap, "거래처", "F", "010-0000-0006");
		insertFriend(mainMap, "가족", "G", "010-0000-0007");
		insertFriend(mainMap, "가족", "H", "010-0000-0008");
		insertFriend(mainMap, "가족", "I", "010-0000-0009");
		insertFriend(mainMap, "가족", "J", "010-0000-0010");

		
		
//		getInfo(mainMap, "가족", "H");
	allInfo(mainMap, "가족");
	//getAll(mainMap);
	}

}

/*
 * 숙제1 특정그룹을 알려주면 그룹의 모든 친구 정보를 출력하는 함수를 만드시오 static void getGroup(HashMap map,
 * String group){} 
 * 숙제 2 전체를 몽땅 출력하는 함수를 만드시오 static void getAll(HashMap map){}
 */
