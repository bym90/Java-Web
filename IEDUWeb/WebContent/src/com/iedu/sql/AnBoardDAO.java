package com.iedu.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.iedu.data.AnBoardData;

import SQL.MyJDBC;

/*
 * 답변형 게시판의 데이터베이스 처리를 위한 DAO클래스
 */
public class AnBoardDAO {
	// 생성자 함수에서 데이터베이스에 접속까지 실행하도록 한다.
	MyJDBC db;
	Connection con;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;

	// 생성자 함수에서 데이터베이스에 접속까지 실행하도록 한다.
	public AnBoardDAO() {
		db = new MyJDBC();
		con = db.getCON();
	}

	// 1. 지금 입력할 게시물의 일련번호를 알아낼 함수를 따로 만들자.
	// 이유는 일련번호가 여러곳에서 사용되기 때문이다.
	public int getMaxNo() {
		// 질의 명령
		String sql = AnBoardSQL.getSQL(AnBoardSQL.SELECT_MAXNO);
		// 실행
		stmt = db.getSTMT(con);
		int result = 0;
		try {
			rs = stmt.executeQuery(sql);
			rs.next();
			result = rs.getInt("MAXNO");
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 결과
		return result;
	}

	// 2. 게시물을 입력하는 함수
	public void insertBoard(AnBoardData data) {
		// 매개 변수로는 실행할 때 필요한 데이터를 받아야 한다.
		// 데이터빈 클래스로 받기로 하자.
		// com.iedu.data.AnBoardData.java
		// 질의 명령
		String sql = AnBoardSQL.getSQL(AnBoardSQL.INSERT_BOARD);
		pstmt = db.getPSTMT(sql, con);
		// 실행
		try {
			pstmt.setInt(1, data.getNo());
			pstmt.setString(2, data.getWriter());
			pstmt.setString(3, data.getTitle());
			pstmt.setString(4, data.getBody());
			pstmt.setString(5, data.getPassword());
			pstmt.setInt(6, data.getGroup());
			pstmt.setInt(7, data.getStep());
			pstmt.setInt(8, data.getOrder());
			pstmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	// 3. 총 데이터 개수 구하기 함수
	public int getTotal() {
		// 질의
		String sql = AnBoardSQL.getSQL(AnBoardSQL.GET_TOTAL);
		stmt = db.getSTMT(con);
		int total = 0;
		// 실행
		try {
			rs = stmt.executeQuery(sql);
			rs.next();
			total = rs.getInt("TOTAL");
			rs.close(); // 컨트롤러에서 ResultSet을 사용할 경우에는 닫아주지 않고
						// 반대의 경우에는 닫아준다.
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 결과 반환
		return total;
	}
	
	// 4. 목록 가져오기 처리 함수
	public ResultSet getList(int start, int end) {
		// 질의
		String sql = AnBoardSQL.getSQL(AnBoardSQL.SELECT_LIST);
		pstmt = db.getPSTMT(sql, con);
		// 실행
		try {
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			rs = pstmt.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 결과반환
		return rs;
	}
	
	// 5. 조회수 증가 처리 함수
	public void updateHit(int no) {
		// 질의
		String sql = AnBoardSQL.getSQL(AnBoardSQL.UPDATE_HIT);
		pstmt = db.getPSTMT(sql, con);
		// 실행
		try {
			pstmt.setInt(1, no);
			pstmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 6. 상세보기 질의 요청
	public ResultSet selectView(int no) {
		// 질의
		String sql = AnBoardSQL.getSQL(AnBoardSQL.SELECT_VIEW);
		pstmt = db.getPSTMT(sql, con);
		// 실행
		try {
			pstmt.setInt(1, no);
			rs = pstmt.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 반환
		return rs;
	}
	
	// 7. 자신보다 높은 오더를 수정하는 함수
	public void updateOrder(int order, int group) {
		// order는 현재 입력할 게시물의 Order
		// group는 현재 게시물의 그룹
		// 질의
		String sql = AnBoardSQL.getSQL(AnBoardSQL.UPDATE_ORDER);
		pstmt = db.getPSTMT(sql, con);
		// 실행
		try {
			pstmt.setInt(1, group);
			pstmt.setInt(2, order);
			pstmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 8. 수정을 위한 비밀번호가 맞는지 확인하는 함수
	public boolean checkPassword(int no, String pw) {
		// 질의
		String sql = AnBoardSQL.getSQL(AnBoardSQL.CHECK_PASSWORD);
		pstmt = db.getPSTMT(sql, con);
		// 결과를 알려줄 변수
		boolean isCheck = false;
		// 실행
		try {
			pstmt.setInt(1, no);
			pstmt.setString(2, pw);
			rs = pstmt.executeQuery();
			rs.next();
			int result = rs.getInt("CNT");
			if(result == 1) {
				isCheck = true;
			}
			else {
				isCheck = false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isCheck;
	}
	
	// 9. 수정 요청 처리 함수
	public void updateBoard(AnBoardData data){
		// 질의
		String sql = AnBoardSQL.getSQL(AnBoardSQL.UPDATE_BOARD);
		pstmt = db.getPSTMT(sql, con);
		// 실행
		try {
			pstmt.setString(1, data.getTitle());
			pstmt.setString(2, data.getBrbody());
			pstmt.setInt(3, data.getNo());
			pstmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 10. 삭제 요청 처리함수
	public void deleteBoard(int no) {
		// 질의
		String sql =  AnBoardSQL.getSQL(AnBoardSQL.DELETE_BOARD);
		pstmt = db.getPSTMT(sql, con);
		// 실행
		try {
			pstmt.setInt(1, no);
			pstmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 11. 좋아요 나빠요 요청 처리함수
	public void goodBadProc(int no, int flag) {
		// 질의
		String sql = AnBoardSQL.getSQL(AnBoardSQL.GOODBAD_PROC);
		if(flag == 1){
			sql = sql.replaceAll("#", "ab_Good = ab_Good + 1");
		}
		else{
			sql = sql.replaceAll("#", "ab_Bad = ab_Bad + 1");
		}
		pstmt = db.getPSTMT(sql, con);
		// 실행
		try {
			pstmt.setInt(1, no);
			pstmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 12. 검색 요청 처리 함수
	public ResultSet selectSearch(int key, String text) {
		// 질의
		String sql = AnBoardSQL.getSQL(AnBoardSQL.SELECT_SEARCH);
		switch(key) {
		case 1:
			sql = sql.replaceAll("#", "ab_Writer = ? ");
			break;
		case 2:
			sql = sql.replaceAll("#", "ab_Title LIKE ? ");
			break;
		case 3: 
			sql = sql.replaceAll("#", "ab_Body LIKE ? ");
			break;
		case 4:
			sql = sql.replaceAll("#", "(ab_Title LIKE ? OR ab_Body LIKE ?) ");
			break;
		}
		
		// 실행
		pstmt = db.getPSTMT(sql, con);
		// 실행을 할때 ?를 채운느 방식과 ?의 개수가 다르다.
		String temp = "%" + text + "%"; // Like를 채울 데이터를 만든다.
		try {
			if(key == 1) {
				// ? 부분에 text를 직접입력해야 하는 경우
				pstmt.setString(1, text);
			}
			else if (key == 2 || key ==3) {
				// ? 부분에 "%"를 붙인 데이터를 입력해야 하는 경우
				pstmt.setString(1, temp);
			}
			else {
				// ? 2개인 경우
				pstmt.setString(1, temp);
				pstmt.setString(2, temp);
			}
			rs = pstmt.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 반환
		return rs;
	}
	
	// 현재 봤던 조회번호를 알아내는 함수
	public String getHitNo(String id) {
		String sql = AnBoardSQL.getSQL(AnBoardSQL.SELECT_HITNO);
		pstmt = db.getPSTMT(sql, con);
		String result = "";
		try {
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				// 먼저 봤던 글번호가 존재
				result = rs.getString("HITS");
			}
			else {
				// 이사람은 처음온 손님
				result = "NEW";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	// 처음 온 사람은 데이터베이스에 기록이 없으므로 데이터베이스에
	// 처음으로 입력해 주는 함수
	public void insertHitNo(String id, String nos) {
		String sql = AnBoardSQL.getSQL(AnBoardSQL.INSERT_HITNO);
		pstmt = db.getPSTMT(sql, con);
		try {
			pstmt.setString(1, id);
			pstmt.setString(2, nos);
			pstmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// 데이터베이스에 방문한 기록이 있고 새로운 글을 보면 
	//그 글번호를 다시 입력해주는 함수
	public void updateHitNo(String id, String nos) {
		String sql = AnBoardSQL.getSQL(AnBoardSQL.UPDATE_HITNO);
		pstmt = db.getPSTMT(sql, con);
		try {
			pstmt.setString(1, nos);
			pstmt.setString(2, id);
			pstmt.execute();
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// 마무리를 위해서 자원을 닫는 함수를 만든다.
	public void close() {
		db.close(rs);
		db.close(pstmt);
		db.close(stmt);
		db.close(con);
	}
}
