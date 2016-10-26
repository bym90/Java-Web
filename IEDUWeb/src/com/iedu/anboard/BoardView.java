package com.iedu.anboard;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iedu.common.IEDUMain;
import com.iedu.data.AnBoardData;
import com.iedu.sql.AnBoardDAO;

public class BoardView implements IEDUMain {
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
		ResultSet rs = dao.selectView(no);
		AnBoardData data = new AnBoardData();
		try {
			rs.next();
			// 꺼낸 결과를 데이터 빈 클래스로 묶자
			data.setNo(rs.getInt("NO"));
			data.setWriter(rs.getString("WRITER"));
			data.setTitle(rs.getString("TITLE"));
			data.setBody(rs.getString("BODY"));
			data.setDate(rs.getDate("WDAY"));
			data.setHit(rs.getInt("HIT"));
			data.setGood(rs.getInt("GOOD"));
			data.setBad(rs.getInt("BAD"));

		} catch (Exception e) {
			e.printStackTrace();
		}
		dao.close();
		// 모델
		req.setAttribute("DATA", data);
		req.setAttribute("NOWPAGE", nowPage);
		req.setAttribute("TARGET", target);
		req.setAttribute("KEY", key);
		req.setAttribute("TEXT", text);
		// 뷰
		return "../IEDU/AnBoard/BoardView.jsp";
	}
}
