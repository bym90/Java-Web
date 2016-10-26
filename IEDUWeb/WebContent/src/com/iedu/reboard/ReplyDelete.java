package com.iedu.reboard;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iedu.common.IEDUMain;
import com.iedu.sql.ReBoardDAO;

public class ReplyDelete implements IEDUMain {
	public String ieduExe(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 파라메터 받기
		String strRP = req.getParameter("rpno");
		int rpno = Integer.parseInt(strRP);
		String strRB = req.getParameter("rbno");
		int rbno = Integer.parseInt(strRB);
		String strPage = req.getParameter("nowPage");
		int nowPage = Integer.parseInt(strPage);
		// 데이터베이스
		ReBoardDAO dao = new ReBoardDAO();
		dao.deleteReply(rpno);
		dao.close();
		// 모델
		// 댓글이 삭제되면 다시 상세보기로 가야하므로...
		req.setAttribute("RBNO", rbno);
		req.setAttribute("NOWPAGE", nowPage);
		// 뷰
		return "../IEDU/ReBoard/ReplyDelete.jsp";
	}
}
