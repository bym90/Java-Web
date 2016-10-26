package P_0711;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
//@WebServlet("*.iedu") 잠시 LoginProc을 위해 주석
// 이 어노테이션은 
// 다른 예> @WebServlet("/main/main.nhn")
// http://localhost:8080/IEDUWeb/main/main.nhn"에 실행된 클래스이다.

// 어노테이션에는 두가지 목적이 있는데
// 선언: 뭔가를 선언하는 목적이 있다.
// 		@Override, @WebServlet
// 실행: 뭔가를 실행하는 목적이 있다.

public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    // 이들 함수는 반드시 만들어야 하는 함수는 아니고
    // 혹시 필요하지 않다면 만들지 않아도 된다.
    // 초기화 함수를 제작하자
    public void init() {
    	System.out.println("Init Method");
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet Service Method");
		myService(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost Service Method");
		myService(request, response);
	}
	
	// 나만의 서비스 함수를 따로 만들고
	public void myService(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		// JSP에서는 <%@ contentType에 의해서 한글 엔코딩 방식이 지정되지만
		// 서블릿은 그런 절차가 없다.
		// 역시 강제로 한글 엔코딩 방식도 지정해 주어야 한다.
		// 명령 resp.setCharacterEncoding()
			resp.setContentType("text/html; charset=EUC-KR");
//			resp.setCharacterEncoding("EUC-KR");
		
		// 뭔가를 출력하기 위해서는 out이라는 내장객체를 사용해야 한다.
		// resp.getWriter()가 out을 만들어주는 함수이다.
		PrintWriter out = resp.getWriter();
		// JSP는 HTML이 기본이므로 출력문서를 만드는 경우에는 HTML식으로
		// 만들면된다. 하지만 servlet은 자바클래스이므로 HTML을 사용할 수 없다.
		// 그래서 일일이 HTML태그를 출력하는 방식으로 제작해야 한다.
		
		out.println("<html>");
		out.println("<body>");
		out.println("<b>안녕~! 서블릿이야</b>");
		out.println("</body>");
		out.println("</html>");
		// 참고 필요하다면 세션도 준비해야 한다.
		// HttpSession session = req.getSession();
		
		// 결론
		// JSP는 <%@를 이용해서 환경 설정을 해주고 있지만
		// 서블릿은 그런 절차가 없기 때문에
		// 반드시 강제로 필요한 환경설정을 해야한다.
	}
	
	// 마무리 함수도 제작한다
	public void destroy(){
		
	}
	
}
	