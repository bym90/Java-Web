package P_0711;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 서블릿은 문서를 만든 위치가 요청 방식이 되는 것이 아니고
 * 	URL Pattern을 어떻게 지정하는가에 따라 요청 방식이 결정된다.
 */
@WebServlet("/LoginProc.iedu")
public class LoginProc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginProc() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		myService(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		myService(request, response);
	}
	
	public void myService(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 한글이 입력될 상황을 대비해서 들어오는 한글을 깨지지 않도록 한다.
		req.setCharacterEncoding("EUC-KR");
		// 응답할때 문서의 형태와 한글 엔코딩 형태를 지정한다.
		resp.setContentType("text/html; charset=EUC-KR");
		// 클라이언트가 준 데이터를 받자
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		// 결과를 응답하자.
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<p>당신의 id는"+id+"입니다!!</p>");
		out.println("<p>당신의 pw는"+pw+"입니다!!</p>");
		out.println("<table><tr><td>아이디</td></tr></table>");
		out.println("</body>");
		out.println("</html>");
	}

}
