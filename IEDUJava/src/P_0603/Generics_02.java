package P_0603;
/*
 * ArrayList에 문자열만 입력하는 컬렉션으로 만들어서 사용하자
 */
import java.util.*;
public class Generics_02 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("홍길동");
		String name = list.get(0);
		System.out.println(name);
		
		ArrayList list1 = new ArrayList();
		list1.add("홍길동");
		String name2 = (String) list1.get(0);
		System.out.println(name);
		
		

	}

}
