package com.iedu.reboard;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iedu.common.IEDUMain;
import com.iedu.data.ReBoardData;
import com.iedu.sql.ReBoardDAO;

public class BoardWriteProc implements IEDUMain {
	public String ieduExe(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 넘어온 데이터 받기
		// 원래 POST 방식으로 넘어온 내용 중에서 한글이 존재하면...
		// request.setCharacterEncoding("UTF-8"); 로하면 된다.
		// 이 작업은 한 글처리를 할 모든 컨트롤러에 해야 하므로 조금은 불편
		// 한글 처리를 서버의 환경설정부분에 해주면
		// 모든 컨트롤러에서 자동적으로 한글처리가 되므로 편리할 것이다.
		// 방법 서버가 가지고 있는 web.xml 파일에 filter처리를 하면 된다.
		String writer = req.getParameter("writer");
		String title = req.getParameter("title");
		String body = req.getParameter("body");
		
		// 데이터 베이스에 이 데이터를 insert 시킨다.
		// 1. 먼저 DAO에 넘겨줄 데이터를 빈으로 묶는다.
		ReBoardData data = new ReBoardData();
		data.setWriter(writer);
		data.setTitle(title);
		data.setBody(body);
		
		// DAO를 만들어서 처리한다.
		ReBoardDAO dao = new ReBoardDAO();
		dao.insertBoard(data);
		dao.close();
		
		// 오늘은 DAO 클래스를 만들어서 이것을 이용하도록 하자.
		// DAO 클래스란 Data Access Object의 약자로
		// 오직 데이터베스만 관리하는 클래스를 따로 만들어서 사용한다는 개년임다.
		// 실무에서는 클래스를 분산시켜서 자신의 담당업무만 처리하도록 하는 것이 원칙
		
		// 컨트롤러는 파라메터를 받고 이것을 모델로 만드는것에 집중을 하고
		// 데이터베이스 작업은 DAO클래스에 일임을 하도록 하는 것이 원칙
		// 이렇게 하면 데이터베이스에 문제가 생기면 DAO만 바라보면 되도록 해서
		// 프로그램의 유지보수에 편리성을 구하는 것이다.
		
		// 3. 뷰를 부른다.
		
		
		return "../IEDU/ReBoard/BoardWriteProc.jsp";
	}
}
