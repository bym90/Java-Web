package P_0531;

import java.util.*;
public class Iterator_01 {
		static void getData(Iterator iter){
			while(iter.hasNext()){
			System.out.println(iter.next());
			}
		}
		//누군가가 이함수에게 Iterator를 주면 데이터를 꺼내서 사용하는 함수
	
	
	public static void main(String[] args) {
		//Vector v = new Vector();
		HashSet v = new HashSet();
		v.add("태연");
		v.add("서현");
		v.add("써니");
		v.add("효연");
		v.add("제시카");
		v.add("티파니");
		v.add("수영");
		v.add("윤아");
		v.add("유리");
	
		getData(v.iterator());
		
	}

}

//arraylist클래스 조사

