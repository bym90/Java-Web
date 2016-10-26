<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP</title>
</head>
<body>
	<%
	
		// 클라이언트가 알려준 데이터를 받는다.
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		// 데이터베이스를 이용해서 로그인 처리를 해야 한다.
		// 처리했다고 가정
		boolean isSuccess=true;
		// 성공했다고 가정하면 클라이언트에게는 Main.jsp를 보여주기로 약속했다.
		if(isSuccess==true) {
			System.out.println("LoginProc가 실행되었다.");
			// ★
			// 그러면 서버가 클라이언트를 대신해서 Main.jsp를 요청해야한다.
			// 왜냐하면 Web의 원리는 파일을 보고싶으면 그 파일을 요청해야 하기 때문이다.
			// 다음 요청을 하면 먼저 데이터를 잊어버리기 때문에
			// 데이터를 다음 문서에서 사용하도록 하고자 하면
			// 반드시 다시 넘겨주어야 한다.
// 			pageContext.setAttribute("name", "홍길동");
			application.setAttribute("id", "나는 왕이다");
// 			session.setAttribute("id", "나는 왕이다");
// 			response.sendRedirect("Main.jsp");
			
// 			request.setAttribute("name", "홍길동");
			RequestDispatcher di = request.getRequestDispatcher("Main.jsp");
			di.forward(request, response);
		}
		else {
			// 그러면 서버는 클라이언트를 대신해서 다시 로그인 폼을 요청해야 한다.
			response.sendRedirect("LoginForm.jsp");
		}
	%>
 
</body>
</html>