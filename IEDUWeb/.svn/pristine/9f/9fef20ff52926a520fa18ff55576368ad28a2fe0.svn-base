package com.iedu.anboard;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iedu.common.IEDUMain;
import com.iedu.data.AnBoardData;
import com.iedu.sql.AnBoardDAO;

public class ModifyForm implements IEDUMain {
	public String ieduExe(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 파라메터
		String strNo = req.getParameter("no");
		String strPage = req.getParameter("nowPage");
		String pw = req.getParameter("password");

		int no = Integer.parseInt(strNo);
		int nowPage = Integer.parseInt(strPage);
		// 데이터베이스에서 비밀번호가 맞는지 확인한다.
		AnBoardDAO dao = new AnBoardDAO();
		boolean isCheck = dao.checkPassword(no, pw);
		// 수정을 하기 위해서는 당연히 현재 내용을 보여주어야 한다.
		// 현재 내용을 데이터베이스에서 알아와야 한다.
		ResultSet rs = dao.selectView(no);
		AnBoardData data = new AnBoardData();
		try {
			rs.next();
			// 꺼낸 결과를 데이터빈에 묶어서 뷰에게 준다.
			data.setTitle(rs.getString("TITLE"));
			data.setBody(rs.getString("BODY"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		dao.close();
		
		// 이 결과를 뷰에게 알려준다.
		req.setAttribute("CHECK", isCheck);
		req.setAttribute("NO", no);
		req.setAttribute("NOWPAGE", nowPage);
		req.setAttribute("DATA", data);


		return "../IEDU/AnBoard/ModifyForm.jsp";
	}
}
