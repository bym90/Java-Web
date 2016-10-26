package QNA;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Common.QNAMain;

@WebServlet("*.kim")
public class QNADispatch extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// init에서 기억해 놓은 결과를 요청에서 사용해야 하므로
	// 전역 변수로 맵을 준비한다.
	public HashMap map = new HashMap();

	public QNADispatch() {
		super();
	}

	// 이 서블릿이 처음 요청될 때 딱 한번만 실행하는 함수를 필요로 한다.
	// 왜? 처음 실행될 때 이 Dispatch가 실행할 클래스를 다 new시키기로 약속했다.
	@Override
	public void init() throws ServletException {
		// 1. 사욜할 요청 내용과 필요한 클래스 이름을 Map으로 저장해 놓는다.
		HashMap tempMap = new HashMap();
		tempMap.put("/Login/LoginForm.kim", "Login.LoginForm");
		tempMap.put("/Login/LoginProc.kim", "Login.LoginProc");
		// 이후 계속해서 요청설계가 만들어지면 같은 방식으로 map에 기억하면된다.
		tempMap.put("/QNA/QNAList.kim", "QNA.QNAList");
		tempMap.put("/QNA/QuestionForm.kim", "QNA.QuestionForm");
		tempMap.put("/QNA/QuestionProc.kim", "QNA.QuestionProc");
		tempMap.put("/QNA/AnswerForm.kim", "QNA.AnswerForm");
    	tempMap.put("/QNA/AnswerProc.kim", "QNA.AnswerProc");
		

		// 2. 지금은 클래스이름을 입력해 놓은 상태다.
		// 나는 이 클래스를 미리 new 시켜서 입력해 놓을 예정이다.
		// 1) tempMap에 있는 내용을 하나씩 알아낸다.

		// key값만 이용해서 Set을 만든다.
		Set set = tempMap.keySet();
		Iterator iter = set.iterator();
		while (iter.hasNext()) {
			// Key 값을 하나씩 알아낸다.
			String key = (String) iter.next();
			// 뒤에 있는 클래스 이름을 알아낸다.
			String className = (String) tempMap.get(key);
			// 이 클래스는 String 으로 된 클래스 이므로 new 시킬 수 없다.
			// 물자열로 된 String을 실행 가능한 클래스로 변환해야 한다.
			// Class.forName();
			Class c = null;
			try {
				c = Class.forName(className);
				// 이제 실행 가능한 클래스가 되었으므로 new 시켜 놓는다.
				// new 시키니느 함수는 newInstance()
				Object obj = c.newInstance();
				// 이것이 실제로 new된 컨트롤러 클래스이다.
				// 이것을 요청이 있을때 마다 꺼내서 사용할 수 있도록
				// map에 기억해 놓는다.
				map.put(key, obj);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
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
		// 요청을 분석해서
		// 1. 전체 요청내용을 알아낸다.
		String full = request.getRequestURL().toString();
		// 2. 도메인 부분을 알아낸 후
		String domain = request.getContextPath();
		// 3. 1), 2)를 이용해서 실제 요청 내용을 알아낸다.
		int pos = full.indexOf(domain);
		int len = domain.length();
		String real = full.substring(pos + len);
		// 실행할 클래스를 선택한 후
		// 알려준 뷰를 기억할 변수를 미리 만들자
		String view = "";
		if (map.containsKey(real)) {
			// 요청 내용을 키 값으로 하여 꺼내면 실행할 클래스가 나올 것이다.
			// 가지고온 클래스는 각각 종류가 다른데 이것을 하나의 변수에
			// 기억해야 한다.
			// 그러므로 컨트롤러들을 다형성 구현을 해서(아버지 클래스를 통일해서)
			// 그 아버지 클래스로 받으면 된다.
			QNAMain control = (QNAMain) map.get(real);
			// 기억할 준비 = map.get(real);
			// 다형성 원리 복습
			// 하나의 변수로 여러개의 클래스를 사용할 수 있다.
			// 다형성 구현하지 않을 경웃
			// 밑에와 같이 뻘짓해야됨
			// if(real.equals("/Login/LoginForm.kim")) {
			// LoginForm f = (LoginForm) map.get(real);
			// }
			// else if(real.equals("/Login/LoginProc.kim")) {
			// LoginProc f = (LoginProc) map.get(real);
			// }
			// 그 클래스를 실행한다.
			// control.execute(request, response);
			// 뷰를 받는 이유?
			// 컨트롤러가 실행하는 도중에 결과에 따라 뷰가 달라질 수 있으므로
			// 컨트롤러가 어떤 뷰를 사용해야 되는지 알려줄 필요가 있다.
			view = control.execute(request, response);
		} else {
			// 키값이 없으면 준비된 요청이 아니므로 강제로 메인으로 보낸다.
			response.sendRedirect("http://localhost:8080/IEDUWeb");
			return;
		}
		// 뷰를 호출한다.
		// 뷰는 컨트롤러가 제공하는 모델을 받아야 하므로
		// 모든 데이터가 지워지는 Redirect 방식이 아닌
		// 데이터가 유지되는 forward 방식으로 처리해야한다.
		RequestDispatcher di = request.getRequestDispatcher(view);
		di.forward(request, response);
	}
}
