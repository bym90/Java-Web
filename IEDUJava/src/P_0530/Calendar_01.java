package P_0530;

import java.util.*;
public class Calendar_01 {

	public static void main(String[] args) {
		Calendar car = Calendar.getInstance();
		
		int year = car.get(Calendar.YEAR);
		int month = car.get(Calendar.MONTH) + 1;//월은 1월을 0부터 시작
		int day = car.get(Calendar.DATE);
		
		System.out.println(year + "년" + month + "월" + day + "일");
		
	}

}


//숙제 531 539페이지까지 소스를 모두 분석하여 그안에서 사용된 함수 조사