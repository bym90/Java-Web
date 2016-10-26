package com.iedu.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.iedu.data.FileBoardData;

import SQL.MyDBCP;

/*
 * 파일 게시판에서의 데이터베이스 처리를 위한 DAO
 */
public class FileBoardDAO {
	public Connection con;
	public Statement stmt;
	public PreparedStatement pstmt;
	public ResultSet rs;
	public MyDBCP db;
	// 생성자 함수에서 커넥션 풀에 있는 커넥션을 받아놓자.
	public FileBoardDAO() {
		db = new MyDBCP();
		con = db.getCON();
	}
	
	// 지금 등록할 게시물의 번호를 알아내기 위한 함수
	public int getNO() {
		String sql = FileBoardSQL.getSQL(FileBoardSQL.GET_MAXNO);
		int no = 0;
		try {
			stmt = db.getSTMT(con);
			rs = stmt.executeQuery(sql);
			rs.next();
			no = rs.getInt("MAXNO");
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return no;
	}
	
	// 게시물 등록하는 함수
	public void insertBoard(FileBoardData data) {
		String sql = FileBoardSQL.getSQL(FileBoardSQL.INSERT_BOARD);
		try {
			pstmt = db.getPSTMT(sql, con);
			pstmt.setInt(1, data.getNo());
			pstmt.setString(2, data.getId());
			pstmt.setString(3, data.getTitle());
			pstmt.setString(4, data.getBody());
			pstmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 파일 정보를 입력하는 함수
	public void insertFileInfo(FileBoardData data) {
		String sql = FileBoardSQL.getSQL(FileBoardSQL.INSERT_FILEINFO);
		try {
			pstmt = db.getPSTMT(sql, con);
			pstmt.setInt(1, data.getNo());
			pstmt.setString(2, data.getSaveName());
			pstmt.setString(3, data.getOriName());
			pstmt.setString(4, data.getPath());
			pstmt.setLong(5, data.getLength());
			pstmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 게시물 정보 꺼내는 함수
	public ResultSet selectList() {
		String sql = FileBoardSQL.getSQL(FileBoardSQL.GET_BOARDLIST);
		try {
			stmt = db.getSTMT(con);
			rs = stmt.executeQuery(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	// 상세보기 요청 함수
	public ResultSet selectView(int no) {
		String sql = FileBoardSQL.getSQL(FileBoardSQL.GET_BOARDVIEW);
		try {
			pstmt = db.getPSTMT(sql, con);
			pstmt.setInt(1, no);
			rs = pstmt.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	// 파일 목록꺼내기 함수
	public ResultSet selectFileList(int no) {
		String sql = FileBoardSQL.getSQL(FileBoardSQL.GET_FILELIST);
		try {
			pstmt = db.getPSTMT(sql, con);
			pstmt.setInt(1, no);
			rs = pstmt.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	// 다운로드 할 파일의 정보를 알아내는 함수
	public ResultSet getFileInfo(int no) {
		String sql = FileBoardSQL.getSQL(FileBoardSQL.GET_FILEINFO);
		try {
			pstmt = db.getPSTMT(sql, con);
			pstmt.setInt(1, no);
			rs = pstmt.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	public void close(){
		db.close(rs);
		db.close(stmt);
		db.close(pstmt);
		db.close(con);
	}
}
