package P_0602;
/*
 *  5사람을 입력한 후 몽땅 꺼내서 출력하자
 */
import java.util.*;
public class HashMap_03 {

	public static void main(String[] args) {
		//실제 패키지 경로를 사용하는 시점에서 써도된다
		//단점 매번 사용할 때마다 기록해주어야 한다
		java.util.HashMap map = new java.util.HashMap();
		
		map.put("1", "A");
		map.put("2", "B");
		map.put("3", "C");
		map.put("4", "D");
		map.put("5", "E");

		//키값만 Set으로 변환하자
		//이 안에는 키값만 Set으로 변환되있므로
		Set set = map.keySet();
		Iterator iter = set.iterator();
		
		while(iter.hasNext()){
			String key = (String) iter.next();
			//키값을 알았으므로 데이터를 꺼낼 수 있다
			String data = (String) map.get(key);
			System.out.println(key + " : " + data);
		}
		
	
	}

}
