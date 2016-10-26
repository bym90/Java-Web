package com.iedu.util;

import java.text.SimpleDateFormat;
import java.sql.Date;

/*
 * 이 클래스는 출력을 이쁘게하기 위해서 도와주는 기능을 가진 클래스이다.
 */
public class StringUtil {
	// 필요한 기능을 생각해서 하나씩 만들어 나간다.
	// 줄바꿈 기호를 <br>로 변환하는 기능을 만들어보자.
	public static String changeBR(String temp){
		if(temp != null) {
			temp = temp.replaceAll("\r\n", "<br>");
		}
		return temp;
	}
	
	// 날짜를 "yyyy-MM-dd"의 형태로 변환해서 사용하는 기능을 만들어 보자.
	public static String dateForm(Date date){
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String result = format.format(date.getTime());
		return result;
	}
	
	// 제목등을 출력할때 너무 길면 잘라서 출력할 필요가 있을 것이다.
	// 내용을 자르고 옆에...을 붙여주는 기능을 만들어 보자.
	public static String splitString(String temp, int count) {
		// temp 자를내용
		// count 글자수
		if(temp != null){
			if(temp.length() > count){
				temp = temp.substring(0, count) + " ... ";
			}
		}
		return temp;
	}
	
	// String이 NULL인지 아닌지를 확인해주는 함수
	public static boolean isNull(String temp) {
		if(temp == null || temp.length() == 0) {
			return true;
		}
		else {
			return false;
		}
	}
}
