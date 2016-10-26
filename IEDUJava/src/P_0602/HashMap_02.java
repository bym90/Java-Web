package P_0602;

/*
 * 5삭람의 이름을 Map에 기억한 후 Set으로 변환하여 모두 출력하라
 * 
 * Mapt 자체로는 한번에 한개만 꺼낼수 있다
 */
import java.util.*;

public class HashMap_02 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("1", "b");
		map.put("2", "d");
		map.put("3", "c");
		map.put("4", "a");
		map.put("5", "f");

		// Set으로 변환하자
		// 이렇게 하면 Map이 가지고 있는 두개의 데이터가 Map.Entry라는 클래스로
		// 묶여서 Set으로 변환되더라
		Set set = map.entrySet();
		// 데이터를 꺼내기 위해서 Iterator로 변환
		Iterator iter = set.iterator();
		while (iter.hasNext()) {
			// 그래서 꺼낼때는 Map.Entry로 꺼내야한다
			Map.Entry temp = (Map.Entry) iter.next();
			System.out.println(temp.getKey() + " : " + temp.getValue());
		}

	}
	
	

}
