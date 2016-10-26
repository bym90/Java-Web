package P_0530;
/*
 * 	오늘 날짜와 현재 시간을 알아보자.
 */
import java.util.*;
public class Date_01 {

	public static void main(String[] args) {
		Date d = new Date();
		
		//알아보고 싶은 내용을 꺼낸다 getXXX
		int year = d.getYear() + 1900;
		//이 함수의 년도는 1900년 이후부터 계산
		//그러므로 1900을 더해야 정확한 년도가 나옴
		int month = d.getMonth() + 1;
		//월은 1월을 0으로 하여 알려준다
		//즉 12월은 11월이라 알려준다
		//이 외의 것은 일반적인 방식으로 알려준다
		int day = d.getDate();
		
		int yo = d.getDay();
		
		System.out.println(year + "년" + month + "월" + day + "일");
		System.out.println(yo);
	}

}

//숙제 getday()에 대하여 조사하고 사용예를 만드세요
//요일을 나타내는 함수 0 sunday부터 시작