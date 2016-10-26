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

public class AnswerProc implements QNAMain {
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		// 넘어온 파라메터 받기
		String strNo = request.getParameter("qno");
		int qno = Integer.parseInt(strNo);
		String body = request.getParameter("body");
		
		HttpSession session = request.getSession();
		String id = (String) session.getAttribute("ID");
		// 데이터베이스에 기록하기
		MyJDBC db = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			db = new MyJDBC();
			con = db.getCON();
			String sql = "INSERT INTO Answer VALUES((SELECT NVL(MAX(a_NO), 0) + 1 FROM ANSWER), ?, ?, ?, SYSDATE)";
			pstmt = db.getPSTMT(sql, con);
			pstmt.setInt(1, qno);
			pstmt.setString(2, id);
			pstmt.setString(3, body);
			
			pstmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			db.close(pstmt);
			db.close(con);
		}
		// 뷰 부르기
		return "../QNA/AnswerProc.jsp";
	}
}
