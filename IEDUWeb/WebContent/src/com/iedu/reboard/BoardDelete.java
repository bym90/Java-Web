package com.iedu.reboard;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iedu.common.IEDUMain;
import com.iedu.sql.ReBoardDAO;

public class BoardDelete implements IEDUMain {
	public String ieduExe(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 파라메터 받기
		String strNo = req.getParameter("rbno");
		int rbno = Integer.parseInt(strNo);
		// 데이터베이스
		ReBoardDAO dao = new ReBoardDAO();
		dao.deleteBoard(rbno);
		dao.close();
		// 뷰
		return "../IEDU/ReBoard/BoardDelete.jsp";
	}
}
