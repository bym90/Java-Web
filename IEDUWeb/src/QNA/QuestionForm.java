package QNA;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Common.QNAMain;

public class QuestionForm implements QNAMain {
	
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 역시 단순히 폼을 보여주는 요청이므로 굳이 컨트롤러까지 필요없다.
		// 컨트롤러는 뭔가 실행할 내용이 있을때 사용하는 것이다.
		return "../QNA/QuestionForm.jsp";
	}

}
