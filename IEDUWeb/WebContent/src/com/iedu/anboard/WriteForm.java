package com.iedu.anboard;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.iedu.common.IEDUMain;

public class WriteForm implements IEDUMain {
	public String ieduExe(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 폼제공 컨트롤러는 할 일은 거의 없으므로
		// 다만 우리는 로그인을 한 사람에게만 글쓰기 권한을 주고 싶다면...
		// 물론 뷰에서는 로그인을 한 사람에게만 글쓰기 단추를 보여주는 방법도있지만
		// 컨트롤러에서 처리하는 방법도 있다.
		// 즉, 컨트롤러가 세션이 있는지 여부를 판단해서
		// 처리하도록 하면 된다.
		// 다만, 실무에서는 두가지 모두 같이 사용하는 것을 원칙으로 한다.
		// 즉, 실무에서는 각 단계마다 모두 세션 여부를 판단해서 처리함을 원칙으로 한다.

		// 참고로 세션뿐만 아니라 파라메터도 혹시나 잘못 들어오면 문제가 되는
		// 파라메터가 있다면 뷰에서 무결성해서 보내야 하고
		// 컨트롤러에서도 다시 체크해야한다.

		HttpSession session = req.getSession();
		String id = (String) session.getAttribute("ID");
		boolean isLogin = true;
		if (id == null || id.length() == 0) {
			isLogin = false;
		}

		req.setAttribute("ISLOGIN", isLogin);

		return "../IEDU/AnBoard/WriteForm.jsp";
	}

}
