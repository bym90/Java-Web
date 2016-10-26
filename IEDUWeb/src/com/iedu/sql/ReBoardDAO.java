package com.iedu.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.iedu.data.ReBoardData;

import SQL.MyJDBC;

/*
 * 이 클래스가 할일은 어떤 컨트롤러가 데이터베이스 작업이 필요하면
 * 그 작업을 대신 해주기 위해서 만든 클래스
 */
public class ReBoardDAO {
	// 생성자 함수를 이용해서 데이터 베이스를 사용할 준비를 한다.
	public MyJDBC db;
	public Connection con;
	public Statement stmt;
	public PreparedStatement pstmt;
	public ResultSet rs;

	public ReBoardDAO() {
		db = new MyJDBC();
		con = db.getCON();
	}

	// 이 사이에 각각의 컨트롤러가 필요한 작업을 대신할 함수를 제작한다.
	// 1. 게시물 등록을 대신 할 함수
	public void insertBoard(ReBoardData data) {
		// 매개변수로 데이터베이스 작업에 필요한 정보를 줘야한다.
		// 1) 질의명령 만들고
		// 질의명령은 그 내용에 따라 짧을 수도 있고, 길수도 있다.
		// 그래서 질의 명령만 제공하는 전담 클래스를 다시 만들어서
		// 질의 명령을 제공하도록 하자.
		String sql = ReBoardSQL.getSQL(2101);
		// 2) PreparedStatement 만들고
		pstmt = db.getPSTMT(sql, con);
		// 3) 질의 명령 ?를 채우고
		try {
			pstmt.setString(1, data.getTitle());
			pstmt.setString(2, data.getWriter());
			pstmt.setString(3, data.getBody());
			// 4) 실행
			pstmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 2. 게시물 목록 꺼내기 함수
	public ResultSet getList() {
		// 1. Statement 만들고
		stmt = db.getSTMT(con);
		// 2. 질의명령 만들어서
		String sql = ReBoardSQL.getSQL(1101);
		// 질의를 실행하고
		try {
			rs = stmt.executeQuery(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 그 결과를 반환한다.
		return rs;
	}

	public int getTotal() {
		// 1. statement 만들어서
		stmt = db.getSTMT(con);
		// 2. 질의명령 실행하고
		String sql = ReBoardSQL.getSQL(3101);
		int total = 0;
		// 3. 결과 알아내서
		try {
			rs = stmt.executeQuery(sql);
			rs.next();
			total = rs.getInt("TOTAL");
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 4. 알려준다
		return total;
	}

	// 상세보기 처리를 위한 작업
	public ResultSet getView(int rbno) {
		// 1. 질의 명령 만들고
		String sql = ReBoardSQL.getSQL(4101);
		// 2. 스테이트먼트 만들고
		pstmt = db.getPSTMT(sql, con);
		// 3. 실행해서
		try {
			pstmt.setInt(1, rbno);
			rs = pstmt.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 4. 알려준다.
		return rs;
	}

	// 조회수 증가 처리를 위한 함수
	public void updateHit(int rbno) {
		// 1. 질의 명령
		String sql = ReBoardSQL.getSQL(5101);
		// 2. 스테이트먼트 생성
		pstmt = db.getPSTMT(sql, con);
		// 3. 실행
		try {
			pstmt.setInt(1, rbno);
			pstmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 댓글 입력함수
	public void insertReply(ReBoardData data) {
		// 입력할 데이터를 알려줘야한다.
		// 나는 데이터빈 클래스로 묶어서 알려줄 예정이다.
		// 1. 질의 명령
		String sql = ReBoardSQL.getSQL(6101);
		// 2. 스테이트먼트 생성
		pstmt = db.getPSTMT(sql, con);
		// 3. 실행
		try {
			pstmt.setInt(1, data.getNo());
			pstmt.setString(2, data.getBody());
			pstmt.setString(3, data.getWriter());
			pstmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 댓글을 알아내는 함수를 제작한다
	public ResultSet getReply(int rbno) {
		// 매개변수 댓글이 달린 원글의 번호를 알려준다.
		// 1. 질의명령
		String sql = ReBoardSQL.getSQL(7101);
		// 2. 스테이트먼트 생성
		pstmt = db.getPSTMT(sql, con);
		// 3. 실행
		try {
			pstmt.setInt(1, rbno);
			rs = pstmt.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 알려준다.
		return rs;
	}
	
	// 본문 수정
	public void boardModify(int rbno, ReBoardData data) {
		// 1. 질의명령
		String sql = ReBoardSQL.getSQL(8101);
		// 2. 스테이트먼트 생성
		pstmt = db.getPSTMT(sql, con);
		// 3. 실행
		try {
			pstmt.setString(1, data.getTitle());
			pstmt.setString(2, data.getBody());
			pstmt.setInt(3, rbno);
			pstmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 답글 수정
	public void modifyReply(int rpno, String body) {
		//	1. 질의명령
		String	sql = ReBoardSQL.getSQL(9101);
		//	2. 스테이트먼트 생성
		pstmt = db.getPSTMT(sql, con);
		//	3. 실행
		try {
			pstmt.setString(1, body);
			pstmt.setInt(2, rpno);
			pstmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 추천수 증가 요청 처리
	public void updateGood(int rbno) {
		// 1. 질의명령
		String sql = ReBoardSQL.getSQL(1102);
		// 2. 스테이트먼트 생성
		pstmt = db.getPSTMT(sql, con);
		// 3. 실행
		try {
			pstmt.setInt(1, rbno);
			pstmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 댓글 삭제 요청 처리
	public void deleteReply(int rpno) {
		// 1. 질의명령
		String sql = ReBoardSQL.getSQL(2102);
		// 2. 스테이트먼트 생성
		pstmt = db.getPSTMT(sql, con);
		// 3. 실행
		try {
			pstmt.setInt(1, rpno);
			pstmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 원글 삭제 요청 처리
	public void deleteBoard(int rbno) {
		// 1. 질의명령
		String sql = ReBoardSQL.getSQL(3102);
		// 2. 스테이트먼트 생성
		pstmt = db.getPSTMT(sql, con);
		// 3. 실행
		try {
			pstmt.setInt(1, rbno);
			pstmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// 마무리는 닫는 것으로 한다.
	public void close() {
		db.close(rs);
		db.close(stmt);
		db.close(pstmt);
		db.close(con);
	}
}
