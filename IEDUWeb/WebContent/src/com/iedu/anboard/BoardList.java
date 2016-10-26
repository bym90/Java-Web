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

public class BoardList implements IEDUMain {
	public String ieduExe(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 파라메터
		// 선택 파라메터는 없는 경우에는 어떻게 처리할지를 반드시 만들어 놓아야 한다.
		String strPage = req.getParameter("nowPage");
		int nowPage = 0;
		if (StringUtil.isNull(strPage)) {
			nowPage = 1;
		} else {
			nowPage = Integer.parseInt(strPage);
		}

		// 페이지 나눔 기능 만들고
		// 1) 총 데이터 개수를 알아야 한다.
		AnBoardDAO dao = new AnBoardDAO();
		int total = dao.getTotal();
		// 2) 페이지 정보를 계산한다.
		PageInfo pInfo = new PageInfo(nowPage, total);

		// 데이터베이스에서 목록 가지고 오기
		// 1) 현재 페이지에서 보여줄 내용이 몇번부터 몇번까지인지 알아야 된다.
		// (nowPage - 1) * 5 + 1
		// 1페이지면 1~5	 (1-1)*5 + 1 = 1 		1+5-1=5
		// 2페이지면 6~10 	 (2-1)*5 + 1 = 6 		6+5-1=10
		// 3페이지면 11~15   (3-1)*5 + 1 = 11 		11+5-1=15
		int start = (pInfo.getNowPage() - 1) * pInfo.getPageList() + 1;
		int end = start + pInfo.getPageList() - 1;
		ResultSet rs = dao.getList(start, end);
		// 모델 처리
		// 모델은 한줄의 데이터를 데이터 빈 클래스로 묶은 후
		// 이것을 컬렉션으로 묶어서 알려주자.
		ArrayList list = new ArrayList();
		try {
			while (rs.next()) {
				// 한줄의 데이터는 데이터 빈 클래스로 묶자.
				AnBoardData	data = new AnBoardData();
				data.setNo(rs.getInt("ab_No"));
				data.setWriter(rs.getString("ab_Writer"));
				data.setTitle(rs.getString("ab_Title"));
				data.setDate(rs.getDate("ab_Date"));
				data.setHit(rs.getInt("ab_Hit"));
				data.setGroup(rs.getInt("ab_Group"));
				data.setStep(rs.getInt("ab_Step"));
				data.setOrder(rs.getInt("ab_Order"));
				//	이 한줄의 결과를 준비된 컬렉션에 넣는다.
				list.add(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		dao.close();
		// 모델로 알려주자.
		req.setAttribute("LIST", list);
		req.setAttribute("PINFO", pInfo);

		// 뷰만 불러주자
		return "../IEDU/AnBoard/BoardList.jsp";
	}
}
