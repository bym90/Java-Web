package QNA;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Common.QNAMain;

public class AnswerForm implements QNAMain {
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 파라메터가 하나 있으므로 받자.
		String strNo = request.getParameter("qno");
		// 필요하다면 원하는 형태로 형 변환해서 사용해도 된다.
		int qNO = Integer.parseInt(strNo);
		// 이 파라메터는 사용하기 위해서 받은것이 아니고 릴레이 시키기 위해서 받은것이다.
		
		request.setAttribute("QNO", qNO);
		return "../QNA/AnswerForm.jsp";
	}

}
