package Login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Common.QNAMain;

public class LoginForm implements QNAMain {

	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 이 컨트롤러는 필요가 없는 컨트롤러이다.
		// 이유는 폼을 보여달라는 요청이므로 폼만 만들어서 제공하면 되고
		// 뭔가를 처리할 필요는 전혀 없다.
		// 그러므로 직접 jsp문서를 요청해도 상관이 없다.
		// 굳이 이렇게 한 이유는 MVC의 흐름을 설명하기 위해서
		// 이렇게 컨트롤러를 실행하도록 한 것이다.
		return "../Login/LoginForm.jsp";
	}

}
