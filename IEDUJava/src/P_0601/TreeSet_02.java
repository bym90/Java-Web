package P_0601;
/*
 * 10사람의 이름을 입력해놓고 내림차순 정렬하여 보관해보자
 */
import java.util.*;
public class TreeSet_02 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet(new MySort02());
		
		set.add("a");
		set.add("d");
		set.add("h");
		set.add("z");
		set.add("b");
		set.add("t");
		set.add("Y");
		set.add("P");
		set.add("L");
		set.add("E");
		
		System.out.println(set);
	
		
	}

}

//정렬 방식을 변경하기 위해서는
//Comparator 인터페이스를 상속받은 클래스를 생성하고
//그안에 it compare(T o1, T o2)를 오버라이드 한후
//0, 양수, 음수를 반환함으로써 정렬방식을 정할 수 있다

class MySort02 implements Comparator{
	@Override
	public int compare(Object o1, Object o2){
		String temp1 = (String) o1;
		String temp2 = (String) o2;
		
		int diff = temp1.compareTo(temp2);
		
		return -diff;
		
	}
}
