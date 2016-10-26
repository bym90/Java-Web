package Guest;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.do")
public class GuestDispatch extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public GuestDispatch() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		service(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		service(request, response);
	}

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 클라이언트의 요청을 분석하는 작업을 한다.
		// 1) 클라이언트가 서버에게 뭐라고 요청했는지 알아보자
		String url = request.getRequestURL().toString();
		System.out.println(url);
		// 2) 도메인 부분으로 빠지는 내용을 알아보자.
		String domain = request.getContextPath();
		System.out.println(domain);
		// 3) 공통사항을 제외한 나머지 요청 내용을 분석할 수 있다.
		int pos = url.indexOf(domain);
		int len = domain.length();
		String real = url.substring(pos + len);
		System.out.println(real);

		// 이제 요청에 따라서 필요한 컨트롤러를 실행하도록 한다.
		String view = "";
		if (real.equals("/Guest/GuestList.do")) {
			GuestList list = new GuestList();
			view = list.getList(request, response);
		} else if (real.equals("/Guest/GuestWrite.do")) {
			GuestWrite write = new GuestWrite();
			view = write.writeProc(request, response);
		}
		else {
			// 만약에 클라이언트가 약속된 요청이 아닌 다른 요청을 했을 경우
			response.sendRedirect("http://localhost:8080/IEDUWeb");
			return;
			// 강제로 메인 페이지가 보이도록 한다.
		}

		// 뷰문서를 작성하도록한다.
		// 뷰문서는 jsp문서로 만들어야 하므로 jsp문서가 실행되도록 해야한다.
		// 우리는 이미 어떤 요청이 있을때 다른 jsp 문서를 실행하는 방법을 배웠다.
		// 1. redirect
		// 현재 요청을 잊는다.(데이터도 같이 잊어버린다.)
		// 2. forward
		// 현재 요청을 유지한다.(데이터를 잊어버리지 않는다.)
		RequestDispatcher di = request.getRequestDispatcher(view);
		di.forward(request, response);
	}
}
