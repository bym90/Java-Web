package com.iedu.reboard;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iedu.common.IEDUMain;
import com.iedu.sql.ReBoardDAO;

public class ReplyModifyProc implements IEDUMain {
	public String ieduExe(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 1. 파라메터 받기
		String strRP = req.getParameter("rpno");
		int rpno = Integer.parseInt(strRP);
		String strRB = req.getParameter("rbno");
		int rbno = Integer.parseInt(strRB);
		String strPage = req.getParameter("nowPage");
		int nowPage = Integer.parseInt(strPage);
		String body = req.getParameter("body");
		// 2. 데이터베이스
		ReBoardDAO	dao = new ReBoardDAO();
		dao.modifyReply(rpno, body);
		dao.close();
		// 3. 모델로 필요한 정보를 준다.
		req.setAttribute("RBNO", rbno);
		req.setAttribute("NOWPAGE", nowPage);
		// 4. 뷰 부른다.
		return "../IEDU/ReBoard/ReplyModifyProc.jsp";
	}

}
