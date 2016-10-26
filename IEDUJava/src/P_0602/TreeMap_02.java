package P_0602;
/*
 * 친구이름을 Map에 저장한 후
 * 친구이름을 이용해서 정렬하여 출력하라
 */
import java.util.*;
public class TreeMap_02 {

	public static void main(String[] args) {
		TreeMap map = new TreeMap();
		map.put("친구", "A");
		map.put("원수", "D");
		map.put("거래처", "F");
		map.put("웬수", "c");
		map.put("가족", "b");
		
		//나는 이름을 기준으로 정렬하기를 원한다
		Set set = map.entrySet();
		ArrayList list = new ArrayList(set);
		Collections.sort(list, new MySort02());
		
		for (int i = 0; i < list.size(); i++) {
			Map.Entry temp = (Map.Entry) list.get(i);
			System.out.println(temp.getKey() + " : " + temp.getValue());
		}
		
		
	}

}


//정렬 방식을 변견하기 위한 클래스를 만들어준다
class MySort02 implements Comparator{
	public int compare(Object o1, Object o2){
		//문제 비교대상인 o1과 o2는 원하는 형태로 형변환해서 사용해야 한다
		Map.Entry temp1 = (Map.Entry) o1;
		Map.Entry temp2 = (Map.Entry) o2;
		
		String name1 = (String) temp1.getValue();
		String name2 = (String) temp2.getValue();
		
		int diff = name1.compareTo(name2);
		return diff;
		
	}
	
	
}