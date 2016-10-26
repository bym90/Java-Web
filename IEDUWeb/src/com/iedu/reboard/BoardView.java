package com.iedu.reboard;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.iedu.common.IEDUMain;
import com.iedu.data.ReBoardData;
import com.iedu.sql.ReBoardDAO;

public class BoardView implements IEDUMain {
	public String ieduExe(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 할일
		// 1. 넘어온 파라메터 받는다.
		String strPage = req.getParameter("nowPage");
		int nowPage = Integer.parseInt(strPage);
		req.setAttribute("NOWPAGE", nowPage);
		
		String strNo = req.getParameter("rbno");
		int rbno = 0;
		try {
			rbno = Integer.parseInt(strNo);
		} catch (Exception e) {
			// 혹시라도 숫자로 변화시키지 못하면 잘못된 것이므로....
			// 거기에 맞는 조치를 해야한다.
			// 예> 메인으로 내보내던지............
		}

		// 2. 이 번호를 이용해서 데이터베이스에서 글의 내용을 꺼낸다.
		ReBoardDAO dao = new ReBoardDAO();
		// 글 내용을 꺼내기전에 상세보기를 하고 있으므로 조회수를 증가해 놓아야 한다.
		// 1. session을 이용하는 방법
		// 	 session에 이사람이 본 글 번호를 기억해 놓고
		//   같은 글을 다시 보면 조회수 증가를 방지하는 방식
		//   장점 간단하게 처리할 수 있다.
		//   단점 세션이 없어지면 다시 조회수가 증가된다.
		// 2. 데이터베이스를 이용하는 방법
		//	 데이터베이스 안에 이 사람이 본 글 번호를 기억해 놓고
		//   같은 글을 다시 보면 조회수 증가를 방지하는 방식
		//   장점 한번 본들은 절대로 조회수 증가가 되지 않는다.
		//   단점 작업하기가 약간 까탈스럽다.
		/*
		 * 세션을 이용하는 방법
		 * 1. String을 이용하는 방법
		 * 2. 컬렉션을 이용하는 방법
		 * ==> 이미 본 글 번호를 누가 기억하는가에 따른 분류
		 * 
		 * 원리 1> 조회수를 증가하기 전에 이미 본 조회수인지를 세션에서 알아내서
		 * 		2> 본글이면 그냥 넘어가고
		 * 		3> 보지않은 글이면 조회수를 증가하고 세션에 글 번호를 입력해 놓는다.
		 */
		// 1. 세션을 이용해야 하므로 세션을 받아온다.
		HttpSession session = req.getSession();
		// 봤는지 안봤는지 결과를 기억할 변수
		boolean isShow = false;
		// 2. 이 세션안에 이미본 조회수 번호를 알아낸다.
		// 약속 "PRENO"의 키값으로 이미본 글 번호를 기억해 놓기로 한다.
		String preno = (String) session.getAttribute("PRENO");
		if(preno == null || preno.length() == 0) {
			// 이 사람은 아직 한번도 글을 본 적이 없는 사람
			isShow = false;
			// 대신 처음본 글이면 세션에 글 번호를 기억해 놓는다.
			session.setAttribute("PRENO", "#" + rbno);
			// 앞에 #을 붙인 이유?
			// 본 글 번호는 누적해서 입력해놓을 예정이다.
			// 예> 이 사람이 10을 보고 17을 보면
			// "1017" 이렇게 저장해놓을 예정 -> "#10#17"
		}
		else {
			// 글을 본적이 있는 사람
			// 이 내용중에서 현재 글번호가 있는지 확인
			int pos = preno.indexOf("#" + rbno);
			if(pos == -1) {
				// 그런 번호 없는데...
				isShow = false;
				// 대신 다시 세션에 이 글번호를 넣어준다.
				session.setAttribute("PRENO", preno + "#" + rbno);
			}
			else {
				// 있는데...
				isShow = true;
			}
		}
		// 글 내용을 꺼내기 전에 상세보기를 하고 있으므로 조회수를 증가해 놓아야 한다.
		// DAO에 부탁
		if(isShow == false) {
			dao.updateHit(rbno);
		}
		ResultSet rs = dao.getView(rbno);

		// 3. 이 내용을 뷰에게 전달할 준비를 한다.
		// 데이터 빈 클래스로 데이터를 묶어서 전달하기로 한다.
		ReBoardData data = new ReBoardData();
		try {
			rs.next();
			data.setNo(rs.getInt("NO"));
			data.setTitle(rs.getString("TITLE"));
			data.setWriter(rs.getString("WRITER"));
			data.setBody(rs.getString("BODY"));
			data.setDate(rs.getDate("WDAY"));
			data.setHit(rs.getInt("HIT"));
			data.setGood(rs.getInt("GOOD"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 이 글에 달린 댓글도 같이 꺼내서 뷰에게 준다.
		// 댓글은 데이터베이스에서 꺼내야 하므로
		rs = dao.getReply(rbno);
		// 이제 댓글이 여러개 있을 수 있으므로 이것을 뷰에게 한번에 넘길 수 있게 컬렉션으로 묶는다.
		ArrayList rList = new ArrayList();
		try {
			while(rs.next()){
				// 한줄의 데이터는 역시 여러개가 존재하므로 데이터 빈 클래스로 묶자
				ReBoardData rdata = new ReBoardData();
				rdata.setNo(rs.getInt("NO"));
				rdata.setWriter(rs.getString("WRITER"));
				rdata.setBody(rs.getString("BODY"));
				rdata.setDate(rs.getDate("WDAY"));
				
				// 한줄의 데이터가 묶였으면 컬렉션에 넣는다.
				rList.add(rdata);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dao.close();
		}

		// 4. 뷰에게 데이터(모델)를 준다.
		req.setAttribute("DATA", data);
		req.setAttribute("RLIST", rList);

		// 5. 뷰를 불러온다.
		return "../IEDU/ReBoard/BoardView.jsp";
	}
}
