package P_0602;
/*
 * 알파벳 'A' ~ 'J'까지를 랜덤하게 100개를 발생한 후
 * 각각의 알파벳 문자가 몇개씩 발생되었는지를 처리하는 프로그램을 만들어라
 */
import java.util.*;
public class TreeMap_03 {

	public static void main(String[] args) {
		TreeMap map = new TreeMap();
		//문자르 100번 발생한다
		for (int i = 0; i < 100; i++) {
			char ch = (char)(Math.random()*('J' - 'A' + 1) + 'A');
			//이 문자가 이미 키값으로 등록되었는지를 알아보자
			if(map.containsKey(ch)){
				//이미 발생된적이 있는 문자이다
				//현재 몇개인지 알아낸다
				int temp = (int) map.get(ch);
				// + 1을 해야한다
				temp = temp + 1;
				map.put(ch, temp);
				//map의 특징은 키값이 중복되면 기존의 키값을 버린다
			}
			else{
				//지금 처음 발생한 문자이다
				map.put(ch, 1);
			}
		}
		
		Set keys = map.keySet();
		Iterator iter = keys.iterator();
		while(iter.hasNext()){
			char key = (char) iter.next();
			int value = (int) map.get(key);
			System.out.println(key + " == " + value);
		}
		
		
		
	}

}
