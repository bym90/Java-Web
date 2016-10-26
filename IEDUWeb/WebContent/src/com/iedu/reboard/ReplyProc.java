package com.iedu.reboard;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iedu.common.IEDUMain;
import com.iedu.data.ReBoardData;
import com.iedu.sql.ReBoardDAO;

public class ReplyProc implements IEDUMain {
	public String ieduExe(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 파라메터 받기
		String strPage = req.getParameter("nowPage");
		int nowPage = Integer.parseInt(strPage);
		req.setAttribute("NOWPAGE", nowPage); 
		
		String strNo = req.getParameter("rbno");
		int rbno = Integer.parseInt(strNo);
		String writer = req.getParameter("writer");
		String body = req.getParameter("body");
		// 데이터베이스에 입력
		// 입력하기 전에 입력할 데이터는 데이터 빈 클래스로 묶어서 알려주기로 했으므로
		ReBoardData data = new ReBoardData();
		data.setNo(rbno);
		data.setWriter(writer);
		data.setBody(body);
		ReBoardDAO dao = new ReBoardDAO();
		dao.insertReply(data);
		dao.close();
		// 뷰에서 남은 처리를 하기 위해서는 글번호를 알려주어야 한다.
		req.setAttribute("RBNO", rbno);
		
		// 뷰를 부른다
		return "../IEDU/ReBoard/ReplyProc.jsp";
	}


}
