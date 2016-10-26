package P_0601;
/*
 * 중복데이터 저장하지 않는다
 * 문제 로또복권 예상번호 만들어보자
 */
import java.util.*;
public class HashSet_02 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		// 몇번 시도해야 6개의 번호가 완성될지 모르므로 무한반복
		while(true){
			int temp = (int)(Math.random()*(45 - 1 + 1) + 1);
			set.add(temp);
			if(set.size() == 6){
				break;
			}
		}

		//원래 결과는 Iterator로 처리해야 한다
		//편법 Set을 단순히 출력하면 내부적으로 toString()를 오버라이드 해서
		//데이터를 출력하는 기능으로 만들어 놓았다
		//단순히 데이터만 보고싶으면 출력만 해도 된다
		System.out.println(set);
		//이것은 컬렉션에 있는 데이터를 사용하는 것이 아니고 단순히 내용만
		//확인하기 위한 편법!!!
		
		
	}

}
