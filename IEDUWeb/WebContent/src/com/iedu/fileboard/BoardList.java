package com.iedu.fileboard;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iedu.common.IEDUMain;
import com.iedu.data.FileBoardData;
import com.iedu.sql.FileBoardDAO;

public class BoardList implements IEDUMain {
	public String ieduExe(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 데이터베이스
		FileBoardDAO dao = new FileBoardDAO();
		ResultSet rs = dao.selectList();
		ArrayList list = new ArrayList();
		try {
			while (rs.next()) {
				// 한줄의 데이터는 다시 데이터 빈으로 묶는다.
				FileBoardData data = new FileBoardData();
				data.setNo(rs.getInt("NO"));
				data.setId(rs.getString("WRITER"));
				data.setTitle(rs.getString("TITLE"));
				data.setDate(rs.getDate("WDAY"));
				list.add(data);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dao.close();
		}
		// 모델
		req.setAttribute("LIST", list);
		// 뷰
		return "../IEDU/FileBoard/BoardList.jsp";
	}
}
