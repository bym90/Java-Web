package P_0527;

import java.util.regex.*;

/*
 * 교재 505페이지에 있는 소스분석
 */
public class Regular_Expression_01 {

	public static void main(String[] args) {
		//정규식 검사에 사용할 데이터를 몇개 준비
			String[] data = {"bat", "baby", "bonus", "cA", "ca", "co", "c.", "c0", "car", "combat", "count", "date", "disc"};
			
			Pattern p = Pattern.compile("c[a-z]*");
			// c[a-z]*의 의미는 c로 시작하고
			// 다음 글자부터는 소문자[a-z]만 와야하고 그뒤에는 몇개가 와도 됨(*)
			
			//각각의 데이터마다 정규식 검사를 실행한다
			for (int i = 0; i < data.length; i++) {
				Matcher m =	p.matcher(data[i]);
				//정규식 검사가 올바른 데이터만 출력
				if (m.matches()) {
					System.out.print(data[i] + ", ");
				}
			}   
	}

}
//문제1 아이디를 입력받는데 첫글자는 반드시 영문자로 입력받아야 한다
//정규식 검사 형식은 어떻게 되나요. 글자수 상관x
//[a-zA-z].*

//문제2 첫글자는 영문자로 입력받고, 다음 글자부터는 모든 글자를 허락하며 글자수가
//8~12글자 사이로 아이디를 만들어야 하면 정규식 검사 형식은 어떻게 되나요

//문제3 우리나라 우편번호(과거) 형식을 점검하는
//정규식 검사 형식은 어떻게 되나요

//문제4 비밀번호는 반드시 8글자 이상이어야 하는 경우
//정규식 검사 형식은 어떻게 되나요
