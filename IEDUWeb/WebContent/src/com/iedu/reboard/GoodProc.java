package com.iedu.reboard;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.iedu.common.IEDUMain;
import com.iedu.sql.ReBoardDAO;

public class GoodProc implements IEDUMain {
	public String ieduExe(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 파라메터 받기
		String strNo = req.getParameter("rbno");
		int rbno = Integer.parseInt(strNo);
		String strPage = req.getParameter("nowPage");
		int nowPage = Integer.parseInt(strPage);
		// 이번에는 컬렉션을 이용해서 처리햅 ㅗㄹ 예정이다.
		// 역시 약속 PREGOOD이라는 키값으로 지금 까지 추천한 글의 번호를
		// ArrayList를 이용해서 기억할 예정이다.
		boolean isGood = false;
		// 1. 세션 알아내기
		HttpSession session = req.getSession();
		// 2. 지금까지 본 글을 알아낸다.
		ArrayList preList = (ArrayList) session.getAttribute("PREGOOD");
		if (preList == null || preList.size() == 0) {
			// 게시판에 처음 온 사람
			isGood = false;
			// 대신에 세션에 지금 본글을 입력해 놓는다.
			ArrayList temp = new ArrayList();
			temp.add(rbno);
			session.setAttribute("PREGOOD", temp);
		} else {
			if (preList.contains(rbno)) {
				// 이미 추천했잖아
				isGood = true;
			} else {
				// 지금 글을 추천한 적이 없다.
				isGood = false;
				preList.add(rbno);
			}
		}
		// 데이터베이스에서 추천수 증가하기
		if (isGood == false) {
			ReBoardDAO dao = new ReBoardDAO();
			dao.updateGood(rbno);
			dao.close();
		}
		// 뷰에서 필요한 데이터 모델로 보내기
		// 뷰에서는 보여줄 내용이 없고 다시 상세보기로 가야하니까...
		// 뷰에서 사용할 파라메터 2개를 보내자.
		req.setAttribute("RBNO", rbno);
		req.setAttribute("NOWPAGE", nowPage);
		// 뷰 부르기
		return "../IEDU/ReBoard/GoodProc.jsp";
	}
}
