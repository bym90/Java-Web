package Login;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Common.QNAMain;
import SQL.MyJDBC;

public class LoginProc implements QNAMain {

	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 클라이언트가 보내준 데이터를 받는다.
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		// 데이터베이스를 이용해서 회원 유무를 판단한다.
		MyJDBC db = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		// 회원인지 아닌지를 기억할 변수를 하나 준비한다.
		boolean isMember = false;
		try {
			db = new MyJDBC();
			con = db.getCON();
			String sql = "SELECT * FROM LOGINMEMBER WHERE id=? and pw=?";
			pstmt = db.getPSTMT(sql, con);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);

			rs = pstmt.executeQuery();
			if (rs.next()) {
				// 회원이고
				isMember = true;
				// 이 회원의 정보를 세션에 기억해서다음 요청을 할 때
				// 이 회원을 구분할 수 있도록 하자.
				// 컨트롤러는 세션이 내장객체가 아니다. 만들어서 써야한다.
				HttpSession session = request.getSession();
				session.setAttribute("ID", id);
				session.setAttribute("NICK", rs.getString("nick"));
			} else {
				// 회원이 아니다.
				isMember = false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}

		// 뷰에게 넘겨줄 데이터가 있으면 넘겨준다.(모델이라고 한다.)
		request.setAttribute("ISMEMBER", isMember);

		return "../Login/LoginProc.jsp";
	}

}
