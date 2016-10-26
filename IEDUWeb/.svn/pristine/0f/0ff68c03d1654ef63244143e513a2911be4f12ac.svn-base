<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*, SQL.*" %> 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP</title>
</head>
<body>
	<%
		// 클라이언트가 보내준 정보를 받는다.
		String id = request.getParameter("ID");
		String pw = request.getParameter("PW");
		// 데이터베이스를 이용해서 로그인 처리를 한다.
		MyJDBC db = new MyJDBC();
		Connection con = db.getCON();
		String sql = "select * from LoginMember where id=? and pw=?";
		PreparedStatement pstmt = db.getPSTMT(sql, con);
		pstmt.setString(1, id);
		pstmt.setString(2, pw);
		ResultSet rs = pstmt.executeQuery();
		// 만약 회원이라면 rs가 존재할 것이고, 회원이 아니라면 rs가 존재하지 않을것이다.
		if(rs.next()){
			// 회원이이 판정났다.
			// 이 회원의 정보를 수첩에 기록해 놓자. 필요하다고 생각하는 정보 기록
			// 수첩은 내부적으로 이미 만들어져 있음. 이 수첩에 필요한 정보를 기록하면 된다.
			String nick = rs.getString("NICK");
			// 이 수첩의 패기처분 기한을 정하자.
			session.setMaxInactiveInterval(60*10);
			
			session.setAttribute("ID", id);
			session.setAttribute("NICK", nick);
		}
		else{
			// 아니면 수첩에 기록할 필요가 없다.
		}
		// 이제 로그인 처리가 끝났으므로 뭔가를 보여주어야 하는데
		// 결과물 대신에 다시 메인 페이지를 보여주고 싶다.
		response.sendRedirect("MainForm.jsp");
	%>
 
</body>
</html>