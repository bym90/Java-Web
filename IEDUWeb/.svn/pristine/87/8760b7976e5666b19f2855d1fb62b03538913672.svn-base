package com.iedu.reboard;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iedu.common.IEDUMain;
import com.iedu.data.ReBoardData;
import com.iedu.sql.ReBoardDAO;

public class BoardModifyProc implements IEDUMain {
	public String ieduExe(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 1. 파라메터 받기
		String strNo = req.getParameter("rbno");
		int rbno = Integer.parseInt(strNo);
		String strPage = req.getParameter("nowPage");
		int nowPage = Integer.parseInt(strPage);
		req.setAttribute("NOWPAGE", nowPage);
		String title = req.getParameter("title");
		String body = req.getParameter("body");
		
		// 2. 데이터베이스 수정
		// 넘길 데이터를 데이터 빈 클래스로 묶고
		ReBoardData data = new ReBoardData();
		data.setTitle(title);
		data.setBody(body);
		ReBoardDAO dao = new ReBoardDAO();
		dao.boardModify(rbno, data);
		dao.close();
		
		// 다음 작업을 위해서 필요한 rbno를 모델로 전달한다.
		req.setAttribute("RBNO", rbno);
		return "../IEDU/ReBoard/BoardModifyProc.jsp";
	}

}
