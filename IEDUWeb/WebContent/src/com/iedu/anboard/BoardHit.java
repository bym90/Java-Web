package com.iedu.anboard;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.iedu.common.IEDUMain;
import com.iedu.sql.AnBoardDAO;

public class BoardHit implements IEDUMain {
	public String ieduExe(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 파라메터
		String strNo = req.getParameter("no");
		int no = Integer.parseInt(strNo);
		String strPage = req.getParameter("nowPage");
		int nowPage = Integer.parseInt(strPage);
		// 3개가 더 오기로 했으므로 릴레이를 위해서 받는다.
		String target = req.getParameter("target");
		String key = req.getParameter("key");
		String text = req.getParameter("text");
		// 데이터베이스
		AnBoardDAO dao = new AnBoardDAO();
		boolean isHit = false;
		// 조회수를 증가할지 여부를 판단할 변수
		// true이면 증가, false이면 증가x
		// 1. 이미 봤던 조회수를 알아낸다.
		// -> ID를 알아낸다
		HttpSession session = req.getSession();
		String id = (String) session.getAttribute("ID");
		// -> 이미보았던 글번호를 알아낸다.
		String already = dao.getHitNo(id);
		if(already.equals("NEW")) {
			// 이 친구는 처음온 친구! 그래서 조회수 증가
			isHit = true;
			// 다신에 다음에 올때는 이 번호를 증가하지 못하게
			// 데이터베이스에 기록을 해놓는다.
			dao.insertHitNo(id, "#" + no + "#");
		}
		else {
			// 이 번호 중에서 현재 볼 번호가 존재하는지 확인한다.
			int pos = already.indexOf("#" + no + "#");
			if(pos == -1){
				// 그 번호는 없어요...
				isHit = true;
				// 다음에 올때는 그 번호를 증가 못하게 데이터베이스에 기록해 놓는다.
				String temp = already + "#" + no + "#";
				dao.updateHitNo(id, temp);
			} 
			else {
				// 그 번호 있어요
				isHit = false;
			}
		}
		
		// 조회수 증가를 해야할지 말지를 데이터베이스를 이용해서 알아낸 후 처리한다
		if(isHit == true) {
			dao.updateHit(no);
		}
		dao.close();
		// 물론 조회수도 한번 증가하면 못하게 방지해야 하지만 내일 하기
		// 모델
		// 이 후에는 상세보기로 가야하는데
		// 상세보기를 하려면 no, nowPage를 알아야 한다.
		req.setAttribute("NO", no);
		req.setAttribute("NOWPAGE", nowPage);
		req.setAttribute("TARGET", target);
		req.setAttribute("KEY", key);
		req.setAttribute("TEXT", text);
		// 뷰
		return "../IEDU/AnBoard/BoardHit.jsp";
	}
}
