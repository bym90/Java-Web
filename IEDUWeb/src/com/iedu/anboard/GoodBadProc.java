package com.iedu.anboard;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iedu.common.IEDUMain;
import com.iedu.sql.AnBoardDAO;

public class GoodBadProc implements IEDUMain {
	public String ieduExe(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String strNo = req.getParameter("no");
		String strPage = req.getParameter("nowPage");
		String strFlag = req.getParameter("flag");
		int no = Integer.parseInt(strNo);
		int nowPage = Integer.parseInt(strPage);
		int flag = Integer.parseInt(strFlag);
		// 데이터베이스
		AnBoardDAO dao = new AnBoardDAO();
		dao.goodBadProc(no, flag);
		dao.close();

		// 뷰에서는 다시 상세보기로 가야할 것이므로 거기에 필요한 데이터를
		// 모델로 전달하자.
		req.setAttribute("NO", no);
		req.setAttribute("NOWPAGE", nowPage);
		
		return "../IEDU/AnBoard/GoodBadProc.jsp";
	}

}
