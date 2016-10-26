package com.iedu.anboard;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iedu.common.IEDUMain;
import com.iedu.data.AnBoardData;
import com.iedu.sql.AnBoardDAO;

public class ModifyProc implements IEDUMain {
	public String ieduExe(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 파라메터
		String strNo = req.getParameter("no");
		String strPage = req.getParameter("nowPage");
		String title = req.getParameter("title");
		String body = req.getParameter("body");
		int no = Integer.parseInt(strNo);
		int nowPage = Integer.parseInt(strPage);
		
		// 데이터베이스
		// 1. 넘겨줄 데이터를 데이터 빈 클래스로 묶는다.
		AnBoardData data = new AnBoardData();
		data.setNo(no);
		data.setTitle(title);
		data.setBody(body);
		// 2. DAO를 이용해서 실행
		AnBoardDAO dao = new AnBoardDAO();
		dao.updateBoard(data);
		dao.close();
		
		// 모델
		req.setAttribute("NO", no);
		req.setAttribute("NOWPAGE", nowPage);
		// 뷰
		return "../IEDU/AnBoard/ModifyProc.jsp";
	}

}
