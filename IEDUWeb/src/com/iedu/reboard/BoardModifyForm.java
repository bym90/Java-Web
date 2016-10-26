package com.iedu.reboard;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iedu.common.IEDUMain;
import com.iedu.data.ReBoardData;
import com.iedu.sql.ReBoardDAO;

public class BoardModifyForm implements IEDUMain {
	public String ieduExe(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 1. 넘어온 파라메터 받기
		String strNo = req.getParameter("rbno");
		int rbno = Integer.parseInt(strNo);
		String strPage = req.getParameter("nowPage");
		int nowPage = Integer.parseInt(strPage);
		req.setAttribute("NOWPAGE", nowPage);
		
		// 2. 수정하려면 현재 글을 보여주어야 한다.
		//	  그러므로 데이터베이스에서 현재 글을 알아내서 보여주어야 한다.
		ReBoardDAO dao = new ReBoardDAO();
		ResultSet rs = dao.getView(rbno);
		// 이 결과를 뷰에게 알려주기 위해서 데이터 빈 클래스로 묶기
		ReBoardData data = new ReBoardData();
		try {
			rs.next();
			data.setNo(rs.getInt("NO"));
			data.setTitle(rs.getString("TITLE"));
			data.setWriter(rs.getString("WRITER"));
			data.setBody(rs.getString("BODY"));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dao.close();
		}
		
		// 3. 뷰에게 필요한 데이터를 알려주자
		req.setAttribute("DATA", data);
		return "../IEDU/ReBoard/BoardModifyForm.jsp";
	}
}
