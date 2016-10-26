package com.iedu.anboard;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.iedu.common.IEDUMain;
import com.iedu.data.AnBoardData;
import com.iedu.sql.AnBoardDAO;

public class AnWriteProc implements IEDUMain {
	public String ieduExe(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// 파라메터
	String strNo = req.getParameter("no");
	String strPage = req.getParameter("nowPage");
	String title = req.getParameter("title");
	String body = req.getParameter("body");
	String pw = req.getParameter("password");
	int no = Integer.parseInt(strNo);
	int nowPage = Integer.parseInt(strPage);
	
	// 글쓴 사람은 세션에서 알아내기로 했다.
	HttpSession session = req.getSession();
	String id = (String) session.getAttribute("ID");
	
	// 데이터베이스
	// 0. 지금 입력할 글의 일련번호를 알아낸다.
	// => 이것도 이미 글쓰기에서 만들어 놓았다.
	AnBoardDAO dao = new AnBoardDAO();
	int nowNo = dao.getMaxNo();
	// 1. 원글의 정보를 알아낸다.
	// => 상세보기에서 이미 정보를 알아내는 명령이 있으므로 재사용한다.
	ResultSet rs = dao.selectView(no);
	int group = 0;
	int step = 0;
	int order = 0;
	try {
		rs.next();
		group = rs.getInt("LGROUP");
		step = rs.getInt("LSTEP");
		order = rs.getInt("LORDER");
		rs.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
	step = step + 1;
	order = order + 1;
	// 2. 자신과 같거나 높은 order는 1씩 증가시킨다.
	dao.updateOrder(order, group);
	// 3. 자신을 등록한다.
	// => 등록하는 기능도 이미 글쓰기에서 만들어 놓았다.
	AnBoardData data = new AnBoardData();
	data.setNo(nowNo);
	data.setWriter(id);
	data.setTitle(title);
	data.setBody(body);
	data.setPassword(pw);
	data.setGroup(group);
	data.setStep(step);
	data.setOrder(order);
	
	dao.insertBoard(data);
	dao.close();
	
	// 모델
	// 파라메터 릴레이할 nowPage를 알려준다.
	req.setAttribute("NOWPAGE", nowPage);
	
	// 뷰
		return "../IEDU/AnBoard/AnWriteProc.jsp";
	}

}
