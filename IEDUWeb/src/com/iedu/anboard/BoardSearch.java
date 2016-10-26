package com.iedu.anboard;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iedu.common.IEDUMain;
import com.iedu.data.AnBoardData;
import com.iedu.sql.AnBoardDAO;
import com.iedu.util.PageInfo;
import com.iedu.util.StringUtil;

public class BoardSearch implements IEDUMain {
	public String ieduExe(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String strPage = req.getParameter("nowPage");
		// 선택항목은 오지 않았을 경우를 대비해서 처리해 주어야 한다.
		int nowPage = 0;
		if (StringUtil.isNull(strPage)) {
			nowPage = 1;
		} else {
			nowPage = Integer.parseInt(strPage);
		}
		// 필수 항목 역시 필요에 따라서는 왔는지 오지 않았는지를 점검
		String strKey = req.getParameter("key");
		int key = Integer.parseInt(strKey);
		String text = req.getParameter("text");

		// 데이터베이스
		AnBoardDAO dao = new AnBoardDAO();
		ResultSet rs = dao.selectSearch(key, text);
		// 페이지 이동 기능을 만들기 위해서는 현재 페이지와 총 데이터의 개수가 필요하다.
		// 여기서도 총 데이터의 개수를 구하는 질의를 다시 만들어서 처리해도된다.
		// 이때 역시 마찬가지로 조건식이 달라진다.
		// 즉, 검색 결과가 총 몇개인지를 알아야 하므로
		// 총 데이터의 개수를 구할때도 같은 검색 조건을 제시해 주어야 한다.
		// 편법 나온 결과의 개수를 구하면 된다.
		int total = 0;
		try {
			// rs의 가상 레코드 포인터를 마지막으로 이동한다.
			rs.last();
			// 그 장소의 위치값을 구한다.
			total = rs.getRow();
			// 가상 레코드 포인터를 원상 복구한다.
			rs.beforeFirst();
		} catch (Exception e) {
			e.printStackTrace();
		}

		PageInfo pInfo = new PageInfo(nowPage, total);
		
		// 검색 결과는 여러개가 있으므로
		ArrayList list = new ArrayList();
		try {
			// 이것은 모든 결과를 다 꺼낸것이고 우리는 그페이지에서 필요한 갯수만 구해야한다.
			// 1. 이전페이지에서 보여야할 내용은 Skip 시킨다.
			for(int i = 0; i < (pInfo.getNowPage() - 1)*pInfo.getPageList(); i++) {
				rs.next();
			}
			// 2. 현재페이지에서 보여야할 내용만 꺼낸다.
			for(int i = 0; i < pInfo.getPageList() && rs.next(); i++){
//			while (rs.next()) {
				// 한줄의 데이터는 데이터 빈으로 묶는다.
				AnBoardData data = new AnBoardData();
				data.setNo(rs.getInt("NO"));
				data.setWriter(rs.getString("WRITER"));
				data.setTitle(rs.getString("TITLE"));
				data.setDate(rs.getDate("WDAY"));
				data.setHit(rs.getInt("HIT"));
				data.setGroup(rs.getInt("LGROUP"));
				data.setStep(rs.getInt("LSTEP"));
				data.setOrder(rs.getInt("LORDER"));
				// 이것을 컬렉션에 넣는다
				list.add(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		dao.close();
		// 모델
		req.setAttribute("LIST", list);
		req.setAttribute("PINFO", pInfo);
		// 밑의 두가지는 페이지 이동할때 검색 종류와 검색 데이터가 필요하다.
		req.setAttribute("KEY", key);
		req.setAttribute("TEXT", text);
		// 뷰
		return "../IEDU/AnBoard/BoardSearch.jsp";
	}

}
