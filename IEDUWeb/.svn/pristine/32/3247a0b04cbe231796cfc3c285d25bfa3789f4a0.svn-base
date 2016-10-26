package com.iedu.ajax;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iedu.common.IEDUMain;

import SQL.MyJDBC;

public class AjaxNews02 implements IEDUMain {
	public String ieduExe(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		System.out.println("나 실행되니");
		// 파라메터
		String strKind = req.getParameter("kind");
		int kind = Integer.parseInt(strKind);
		// 데이터베이스
		MyJDBC db = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		// 제목이 여러개가 나오므로 컬렉션에 묶자
		ArrayList list = new ArrayList();
		try {
			db = new MyJDBC();
			con = db.getCON();
			String sql = "SELECT * FROM News WHERE n_Kind = ? ";
			pstmt = db.getPSTMT(sql, con);
			pstmt.setInt(1, kind);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String title = rs.getString("n_Title");
				list.add(title);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
		
		// 모델
		req.setAttribute("TITLE", list);
		// 뷰
		// HTML 방식으로 응답하는 뷰
//		return "../Ajax/AjaxNews02.jsp";
		// xml 방식으로 응답하는 뷰
//		return "../Ajax/AjaxNewsXML.jsp";
		// JSON 방식으로 응답하는 뷰
		return "../Ajax/AjxaNewsJSON.jsp";
		}

}
