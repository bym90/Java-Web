package com.iedu.sql;

/*
 *  이 클래스가 하는 일은 질의명령을 모아서 관리하고 필요하면
 *  질의 명령을 제공하는 클래스이다.
 */
public class ReBoardSQL {
	public static String getSQL(int code) {
		// static을 시키는 이유은 new시키기 귀찮아서
		// 게시판 목록 꺼내기 질의명령 1101 한다.
		// 게시판 입력 질의명령의 코드값 2101 으로 한다.
		// 총 데이터 개수 질의명령 3101 한다
		// 데이터 상세보기 질의 명령 4101
		// 조회수 증가 질의 명령 5101
		// 댓글 입력 질의 명령 6101
		// 데이터 꺼내는 질의명령 7101
		// 게시물 수정 질의 8101
		// 댓글 수정 질의 9101
		// 추천수 증가 질의 1102
		// 댓글 삭제 질의 2102
		// 원글 삭제 질의 3102
		// code는 각각의 질의명령 마다 번호를 붙여서
		// 내가 필요한 질의 명령의 번호를 알려주면 그 번호에 해당하는
		// 질의명령을 알려주기 위한 값이다.
		StringBuffer buff = new StringBuffer();
		switch (code) {
		case 1101:
			// 원래 페이지 나눔기능이 있는 목록 검색은
			// 1. 전체를 꺼낸 후 그 페이지에 필요한것만 보내는방식
			// 장점 - 질의 명령이 간단하다.
			// 단점 - 데이터가 모두 나오므로 메모리 누수 현상이 생긴다.
			// 2. 처음부터 꺼낼때 그 페이지에서 필요한 것만 꺼내는 방식
			// 장점 - 메모리 누수가 없다.
			// 단점 - 질의명령이 매우 복잡하다.
			buff.append("SELECT ");
			buff.append("  rb_No as NO, ");
			buff.append("  rb_Title as TITLE, ");
			buff.append("  rb_Writer as WRITER, ");
			buff.append("  rb_Date as WDAY, ");
			buff.append("  rb_Hit as HIT ");
			buff.append("FROM ");
			buff.append("  ReBoard ");
			buff.append("WHERE");
			buff.append("  rb_IsShow = '0' ");
			buff.append("ORDER BY rb_No desc ");
			break;
		case 2101:
			buff.append("INSERT ");
			buff.append("INTO ");
			buff.append("REBOARD ");
			buff.append("VALUES ");
			buff.append("((SELECT NVL(MAX(rb_NO),0) + 1 FROM REBOARD), ");
			buff.append("?,?,?, SYSDATE, 0, 0, '0') ");
			break;
		// 다른질의 명령이 필요하면
		// case 코드값...
		case 3101:
			buff.append("SELECT ");
			buff.append("	COUNT(*) AS TOTAL ");
			buff.append("FROM ");
			buff.append("	ReBoard ");
			buff.append("WHERE ");
			buff.append("	rb_IsShow = '0' ");
			break;
		case 4101:
			buff.append("SELECT ");
			buff.append("	rb_No AS NO, ");
			buff.append("	rb_Title AS TITLE, ");
			buff.append("	rb_Writer AS WRITER, ");
			buff.append("	rb_Body AS BODY, ");
			buff.append("	rb_Date AS WDAY, ");
			buff.append("	rb_Hit AS HIT, ");
			buff.append("	rb_ReCommend AS GOOD ");
			buff.append("FROM ");
			buff.append("	ReBoard ");
			buff.append("WHERE ");
			buff.append("	rb_No = ? ");
			break;
		case 5101:
			buff.append("UPDATE ");
			buff.append("	ReBoard ");
			buff.append("SET ");
			buff.append("	rb_Hit = rb_Hit + 1 ");
			buff.append("WHERE ");
			buff.append("	rb_No = ? ");
			break;
		case 6101:
			buff.append("INSERT ");
			buff.append("INTO ");
			buff.append("	Reply ");
			buff.append("VALUES ");
			buff.append("	((SELECT NVL(MAX(rp_NO), 0) + 1 FROM Reply), ");
			buff.append("	?,?,?,SYSDATE, '0') ");
			break;
		case 7101:
			buff.append("SELECT ");
			buff.append("	rp_NO AS NO, ");
			buff.append("	rp_Writer AS WRITER, ");
			buff.append("	rp_Body AS BODY, ");
			buff.append("	rp_Date AS WDAY ");
			buff.append("FROM ");
			buff.append("	Reply ");
			buff.append("WHERE ");
			buff.append("	rb_NO = ? ");
			buff.append("	AND	rp_IsShow = '0' ");
			break;
		case 8101:
			buff.append("UPDATE ");
			buff.append("	ReBoard ");
			buff.append("SET ");
			buff.append("	rb_Title = ?, ");
			buff.append("	rb_Body = ? ");
			buff.append("WHERE ");
			buff.append("	rb_no = ? ");
			break;
		case 9101:
			buff.append("UPDATE ");
			buff.append("	Reply ");
			buff.append("SET ");
			buff.append("	rp_Body = ? ");
			buff.append("WHERE ");
			buff.append("	rp_NO = ? ");
			break;
		case 1102:
			buff.append("UPDATE ");
			buff.append("	ReBoard ");
			buff.append("SET ");
			buff.append("	rb_ReCommend = rb_ReCommend + 1 ");
			buff.append("WHERE ");
			buff.append("	rb_No = ? ");
			break;
		case 2102:
			buff.append("UPDATE ");
			buff.append("	Reply ");
			buff.append("SET ");
			buff.append(" rp_IsShow = '1' ");
			buff.append("WHERE ");
			buff.append("	rp_No = ? ");
			break;
		case 3102:
			buff.append("UPDATE ");
			buff.append("	ReBoard ");
			buff.append("SET ");
			buff.append("	rb_IsShow = '1' ");
			buff.append("WHERE ");
			buff.append("	rb_No = ? ");
			break;
		}

		return buff.toString();
	}

}
