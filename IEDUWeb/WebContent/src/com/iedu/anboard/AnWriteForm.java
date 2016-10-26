package com.iedu.anboard;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.iedu.common.IEDUMain;

public class AnWriteForm implements IEDUMain {
	public String ieduExe(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 파라메터
		String strNo = req.getParameter("no");
		int no = Integer.parseInt(strNo);
		String strPage = req.getParameter("nowPage");
		int nowPage = Integer.parseInt(strPage);
		// 세션이 없으면 답글도 못쓰므로 처리해 주어야 한다.
//		HttpSession session = req.getSession();
//		String id = (String) session.getAttribute("ID");
//		boolean isLogin = true;
//		if(id == null || id.length() == 0){
//			isLogin=false;
//		}
//		
//		req.setAttribute("ISLOGIN", isLogin);
		// 뷰 부르기
		// 이때 답글쓰기폼은 원본글의 번호를 알아야 한다.
		// 그러므로 원본글 번호를 알려주도록 한다.
		req.setAttribute("NO", no);
		req.setAttribute("NOWPAGE", nowPage);
		return "../IEDU/AnBoard/AnWriteForm.jsp";
	}
}
