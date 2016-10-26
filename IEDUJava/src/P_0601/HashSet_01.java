package P_0601;
/*
 * HashSet의 특징을 알아보자
 */
import java.util.*;
public class HashSet_01 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("홍길동");
		set.add("장독대");
		set.add("박아지");
		set.add("홍길동");
		
		int size = set.size();
		System.out.println("크기 = " + size);
		//중복데이터는 삭제
		
		//데이터 받기
		//Iterator는 한번 사용하면 데이터가 없어진다
		Iterator iter = set.iterator();
		System.out.println("한번");
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		System.out.println("두번");
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		

	}

}
