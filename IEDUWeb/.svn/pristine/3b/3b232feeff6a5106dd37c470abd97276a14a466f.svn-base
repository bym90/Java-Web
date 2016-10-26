package QNA;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Common.QNAMain;
import SQL.MyJDBC;

public class QuestionProc implements QNAMain {

	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		// 1. 넘어온 데이터 받는다.
		String title = request.getParameter("title");
		String body = request.getParameter("body");
		// 참고	기록을 하려면 세션에 있는 id가 필요하다.
		HttpSession session = request.getSession();
		String id = (String) session.getAttribute("ID");
		
		// 2. 데이터베이스에 기록
		MyJDBC db = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			db = new MyJDBC();
			con = db.getCON();
			String sql = "INSERT INTO Question VALUES((SELECT NVL(MAX(q_No),0) + 1 FROM Question), ?, ?, ?, SYSDATE)";
			pstmt = db.getPSTMT(sql, con);
			pstmt.setString(1, title);
			pstmt.setString(2, id);
			pstmt.setString(3, body);
			pstmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			db.close(pstmt);
			db.close(con);
		}
		return "../QNA/QuestionProc.jsp";
	}
}
