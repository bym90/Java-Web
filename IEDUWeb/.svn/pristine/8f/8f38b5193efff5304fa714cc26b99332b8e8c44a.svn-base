package com.iedu.anboard;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iedu.common.IEDUMain;
import com.iedu.sql.AnBoardDAO;

public class DeleteProc implements IEDUMain {
	public String ieduExe(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 파라메터
		String strNo = req.getParameter("no");
		String strPage = req.getParameter("nowPage");
		String pw = req.getParameter("password");
		int no = Integer.parseInt(strNo);
		int nowPage = Integer.parseInt(strPage);
		
		// 비밀번호가 맞는지 확인
		AnBoardDAO dao = new AnBoardDAO();
		boolean isCheck = dao.checkPassword(no, pw);
		if(isCheck) {
			// 삭제한다.
			dao.deleteBoard(no);
		}
		// 모델
		req.setAttribute("CHECK", isCheck);
		req.setAttribute("NO", no);
		req.setAttribute("NOWPAGE", nowPage);
		return "../IEDU/AnBoard/DeleteProc.jsp";
	}

}
