package com.iedu.anboard;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.iedu.common.IEDUMain;
import com.iedu.data.AnBoardData;
import com.iedu.sql.AnBoardDAO;

public class WriteProc implements IEDUMain {
	public String ieduExe(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 파라메터 받기
		String title = req.getParameter("title");
		String body = req.getParameter("body");
		String pw = req.getParameter("password");
		// 데이터베이스 기록하기
		// DAO에게 일임을 하도록 한다.
		// com.iedu.sql.AnBoardDAO.java.로 만들기로 한다.
		// 참고 원래 데이터 베이스 접근 방식도 바꿔서 알려주어야 한다.
		// (Connection Pool를 이용하는 방식)
		// 1. 세션에서 글쓴이 알아내고
		HttpSession session = req.getSession();
		String id = (String) session.getAttribute("ID");
		// 2. 일련번호 알아내고
		AnBoardDAO dao = new AnBoardDAO();
		int maxno = dao.getMaxNo();
		// 3. 데이터빈 클래스로 묶어서
		AnBoardData data = new AnBoardData();
		data.setNo(maxno);
		data.setTitle(title);
		data.setBody(body);
		data.setPassword(pw);
		data.setWriter(id);
		data.setGroup(maxno);
		data.setStep(0);
		data.setOrder(0);
		// 4. 데이터베이스에 입력
		dao.insertBoard(data);
		dao.close();
		// 뷰 부르기
		return "../IEDU/AnBoard/WriteProc.jsp";
	}

}
