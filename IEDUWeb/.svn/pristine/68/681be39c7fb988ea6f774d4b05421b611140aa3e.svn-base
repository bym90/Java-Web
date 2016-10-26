package Guest;

import javax.servlet.ServletException;
import javax.servlet.http.*;

import java.io.IOException;
import java.sql.*;
import SQL.*;

public class GuestWrite {
	public String writeProc(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		// 한글이 들어올 수 있으므로 한글 엔코딩 처리를 해주어야 한다.
		req.setCharacterEncoding("UTF-8");
		System.out.println("글쓰기 등록이 요청되었다.");
		// 클라이언트가 알려준 데이터를 받는다.
		String writer = req.getParameter("writer");
		String body = req.getParameter("body");
		// 이 데이터를 데이터베이스에 등록을 한다.
		MyJDBC db = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			db = new MyJDBC();
			con = db.getCON();
			String sql = "INSERT INTO Guest VALUES((SELECT NVL(MAX(g_NO), 0) + 1 FROM Guest), ?, ?, sysdate)";
			pstmt = db.getPSTMT(sql, con);
			pstmt.setString(1, body);
			pstmt.setString(2, writer);
			pstmt.execute();	
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			db.close(pstmt);
			db.close(con);
		}
		
		
		// 현재 요청
		// http://localhost:8080/IEDUWeb/Guest/GuestWrite.do
		// 뷰 문서 요청
		// http://localhost:8080/IEDUWeb/Guest/GuestWrite.jsp
		// 를 비교해서 상대 주소를 알아낸다.
		return "../Guest/GuestWrite.jsp";
	}
}
