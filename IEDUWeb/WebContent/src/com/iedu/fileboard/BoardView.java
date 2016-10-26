package com.iedu.fileboard;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iedu.common.IEDUMain;
import com.iedu.data.FileBoardData;
import com.iedu.sql.FileBoardDAO;

public class BoardView implements IEDUMain {
	public String ieduExe(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String strNo = req.getParameter("no");
		int no = Integer.parseInt(strNo);
		
		FileBoardDAO dao = new FileBoardDAO();
		ResultSet rs = dao.selectView(no);
		// 결과를 기억할 데이터 빈 클래스 준비
		FileBoardData data1 = new FileBoardData();
		ArrayList fileList = new ArrayList();
		try {
			rs.next();
			data1.setNo(rs.getInt("NO"));
			data1.setId(rs.getString("WRITER"));
			data1.setTitle(rs.getString("TITLE"));
			data1.setBody(rs.getString("BODY"));
			data1.setDate(rs.getDate("WDAY"));
			rs.close();
			// 이 게시물에 첨부된 파일의 목록도 알아내야 한다.
			rs = dao.selectFileList(no);
			while(rs.next()){
				FileBoardData data2 = new FileBoardData();
				data2.setNo(rs.getInt("NO"));
				data2.setSaveName(rs.getString("SNAME"));
				data2.setOriName(rs.getString("ONAME"));
				data2.setPath(rs.getString("PATH"));
				data2.setLength(rs.getLong("LEN"));
				fileList.add(data2);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dao.close();
		}
		// 이 게시물에 첨부된 파일의 목록도 알아내야 된다.
		req.setAttribute("DATA", data1);
		req.setAttribute("FLIST", fileList);
		return "../IEDU/FileBoard/BoardView.jsp";
	}

}
