package com.iedu.sql;
/*
 * 답변형 게시판에서 사용할 질의 명령만 관리할 클래스이다.
 */
public class AnBoardSQL {
	// 일련번호 알아내기 1101
	// 이 번호에 별칭을 붙여주자.
	public static final int SELECT_MAXNO = 1101;
	// 데이터 입력 2101
	public static final int INSERT_BOARD = 2101;
	// 총 데이터 개수 구하기 1201
	public static final int GET_TOTAL = 1201;
	// 목록 보기 구하기 1301
	public static final int SELECT_LIST = 1301;
	// 조회수 증가 질의 3101
	public static final int UPDATE_HIT = 3101;
	// 상세보기 질의 1401
	public static final int SELECT_VIEW = 4101; 
	// Order 수정 질의 3201
	public static final int UPDATE_ORDER = 3201;
	// 비밀번호 확인 질의 1501
	public static final int CHECK_PASSWORD = 1501;
	// 게시물 수정 질의 3301
	public static final int UPDATE_BOARD = 3301;
	// 삭제 질의 3401
	public static final int DELETE_BOARD = 3401;
	// 좋아요 나빠요 처리 질의 3501
	public static final int GOODBAD_PROC = 3501;
	// 검색 질의 1601
	public static final int SELECT_SEARCH = 1601;
	// 
	public static final int SELECT_HITNO = 1701;
	public static final int INSERT_HITNO = 2701;
	public static final int UPDATE_HITNO = 3701;
	public static String getSQL(int code) {
		StringBuffer buff = new StringBuffer();
		switch(code){
		case SELECT_MAXNO:
			buff.append("SELECT	");
			buff.append("	NVL(MAX(ab_NO), 0) + 1 AS MAXNO ");
			buff.append("FROM ");
			buff.append("	AnBoard ");
			break;
		case INSERT_BOARD:
			buff.append("INSERT	");
			buff.append("INTO ");
			buff.append("	AnBoard ");
			buff.append("VALUES ");
			buff.append("	 (?,?,?,?,SYSDATE,?,0,0,0,'0',?,?,?) ");
			break;
		case GET_TOTAL:
			buff.append("SELECT ");
			buff.append("	COUNT(*) AS TOTAL ");
			buff.append("FROM ");
			buff.append("	AnBoard ");
			buff.append("WHERE ");
			buff.append("	ab_IsShow='0' ");
			break;
		case SELECT_LIST:
//			buff.append("SELECT ");
//			buff.append("	* ");
//			buff.append("FROM ");
//			buff.append("	(SELECT ");
//			buff.append("		rownum AS RNO, ");
//			buff.append("		NO, WRITER, TITLE, WDAY, HIT, LGROUP, LSTEP, LORDER ");
//			buff.append("	FROM ");
//			buff.append("		(select ");
//			buff.append("			rownum, ");
//			buff.append("			ab_no AS NO, ");
//			buff.append("			ab_Writer AS WRITER, ");
//			buff.append("			ab_Title AS TITLE, ");
//			buff.append("			ab_Date AS WDAY, ");
//			buff.append("			ab_Hit AS HIT, ");
//			buff.append("			ab_Group AS LGROUP, ");
//			buff.append("			ab_Step AS LSTEP, ");
//			buff.append("			ab_Order AS LORDER ");
//			buff.append("		FROM ");
//			buff.append("			AnBoard ");
//			buff.append("		WHERE ");
//			buff.append("			ab_IsShow = '0' ");
//			buff.append("		ORDER BY ");
//			buff.append("			ab_Group DESC, ab_ORDER ASC ");
//			buff.append("		))	");
//			buff.append("WHERE ");
//			buff.append("	RNO BETWEEN ? AND ? ");
			buff.append("SELECT ");
			buff.append("	* ");
			buff.append("FROM ");
			buff.append("	(SELECT ");
			buff.append("	a.*, ");
			buff.append("	ROW_NUMBER() OVER(ORDER BY ab_Group DESC, ab_Order ASC) AS RNUM ");
			buff.append("FROM ");
			buff.append("	AnBoard a ");
			buff.append("WHERE ");
			buff.append("	ab_IsShow = '0') ");
			buff.append("WHERE ");
			buff.append("	RNUM ");
			buff.append("BETWEEN ? AND ? ");
			break;
		case UPDATE_HIT:
			buff.append("UPDATE ");
			buff.append("	AnBoard ");
			buff.append("SET ");
			buff.append("	ab_Hit = ab_Hit + 1 ");
			buff.append("WHERE ");
			buff.append("	ab_No = ? ");
			break;
		case SELECT_VIEW:
			buff.append("SELECT ");
			buff.append("	ab_NO AS NO, ");
			buff.append("	ab_Writer AS WRITER,");
			buff.append("	ab_Title AS TITLE, ");
			buff.append("	ab_Body AS BODY, ");
			buff.append("	ab_Date AS WDAY, ");
			buff.append("	ab_Hit AS HIT, ");
			buff.append("	ab_Good AS GOOD, ");
			buff.append("	ab_Bad AS BAD, ");
			buff.append("	ab_Group AS LGROUP, ");
			buff.append("	ab_Step AS LSTEP, ");
			buff.append("	ab_Order AS LORDER ");
			buff.append("FROM ");
			buff.append("	AnBoard ");
			buff.append("WHERE ");
			buff.append(" ab_No = ? ");
			break;
		case UPDATE_ORDER:
			buff.append("UPDATE ");
			buff.append("	AnBoard ");
			buff.append("SET ");
			buff.append("	ab_Order = ab_Order + 1 ");
			buff.append("WHERE ");
			buff.append("	ab_GROUP = ? ");
			buff.append("	AND ");
			buff.append("	ab_Order >= ? ");
			break;
		case CHECK_PASSWORD:
			buff.append("SELECT ");
			buff.append("	COUNT(*) AS CNT ");
			buff.append("FROM ");
			buff.append("	AnBoard ");
			buff.append("WHERE ");
			buff.append("	ab_NO = ? ");
			buff.append("	AND ");
			buff.append("	ab_Password = ? ");
			break;
		case UPDATE_BOARD:
			buff.append("UPDATE ");
			buff.append("	AnBoard ");
			buff.append("SET ");
			buff.append("	ab_Title = ?, ");
			buff.append("	ab_Body = ? ");
			buff.append("WHERE ");
			buff.append("	ab_NO = ? ");
			break;
		case DELETE_BOARD:
			buff.append("UPDATE ");
			buff.append("	AnBoard ");
			buff.append("SET ");
			buff.append("	ab_IsShow = '1' ");
			buff.append("WHERE ");
			buff.append("	ab_NO = ? ");			
			break;
		case GOODBAD_PROC:
			buff.append("UPDATE ");
			buff.append("	AnBoard ");
			buff.append("SET ");
			// 이처럼 경우에 따라서 달라지는 질의 명령을 우리는 다이나믹 질의라고 표현
			// 이런 경우에는 다이나믹 질의가 들어갈 부분은 특수 문자로 기록해 놓고
			// 나중에 이 특수 문자를 원하는 질의 명령으로 바꾸어 사용한다.
			buff.append("	# ");
			buff.append("WHERE ");
			buff.append("	ab_NO = ? ");
			break;
		case SELECT_SEARCH:
			// 검색은 전체를 꺼낸 후 필요한 만큼 골라서 쓰는 방법으로 할 예정이다.
			buff.append("SELECT ");
			buff.append("	ab_NO AS NO,");
			buff.append("	ab_Writer AS WRITER, ");
			buff.append("	ab_Title AS TITLE, ");
			buff.append("	ab_Date AS WDAY, ");
			buff.append("	ab_Hit AS HIT, ");
			buff.append("	ab_Group AS LGROUP, ");
			buff.append("	ab_Step AS LSTEP, ");
			buff.append("	ab_Order AS LORDER ");
			buff.append("FROM ");
			buff.append("	AnBoard ");
			buff.append("WHERE ");
			buff.append("	ab_IsShow = '0' ");
			buff.append("	AND # ");
			buff.append("ORDER BY ");
			buff.append("	ab_Group DESC, ab_Order ASC ");
			break;
		case SELECT_HITNO:
			buff.append("SELECT ");
			buff.append("	ah_Hit AS HITS ");
			buff.append("FROM ");
			buff.append("		AnBoardHit ");
			buff.append("WHERE ");
			buff.append("		ah_ID = ? ");
			break;
		case INSERT_HITNO:
			buff.append("INSERT ");
			buff.append("INTO ");
			buff.append("		AnBoardHit ");
			buff.append("VALUES ");
			buff.append("		(?, ?) ");
			break;
		case UPDATE_HITNO:
			buff.append("UPDATE ");
			buff.append("	AnBoardHit ");
			buff.append("SET ");
			buff.append("	ah_Hit = ? ");
			buff.append("WHERE ");
			buff.append("		ah_ID = ? ");
			break;
		}
		return buff.toString();
	}

}
