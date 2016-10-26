package QNA;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Common.QNAMain;
import SQL.MyJDBC;

// 이것에 컨트롤러 역할을 하기 위해서는 우리는 QNAMain을 상속 받아서
// 만들기로 약속했다.
public class QNAList implements QNAMain {
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 파라메터는 없기때문에 받을 것은 없고 데이터베이스에서 질문목록을 꺼내서
		// 뷰에게 목록을 출력해달라고 부탁하면 된다.
		MyJDBC db = null;
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		// 한줄의 데이터를 여러번 반속해서 기억할 컬렉션을 준비
		ArrayList list = new ArrayList();
		try {
			db = new MyJDBC();
			con = db.getCON();
			stmt = db.getSTMT(con);
			StringBuffer buff = new StringBuffer();
			buff.append("SELECT q.q_NO AS qNO, q.q_title AS qTitle, ");
			buff.append("q.q_Writer AS qWriter, q.q_Question AS qQuestion, ");
			buff.append("q.q_Date AS qDate, a.a_NO AS aNO, a.a_Writer AS aWriter, ");
			buff.append("a.a_Answer AS aAnswer, a.a_Date AS aDate ");
			buff.append("FROM Question q, Answer a ");
			buff.append("WHERE q.q_NO = a.q_NO(+) ");
			String sql = buff.toString();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				// 한줄씩 데이터를 꺼내서 뷰에게 전달할 준비를 한다.
				// 한줄의 데이터는 여러개가 존재하고 있다.
				// 이것을 어떻게 하면 잘 묶어서 편하게 전달할 수 있을까?....
				// 클래스안에 이 데이터를 담을 수있는 변수를 만들고
				// 클래스로 기억하면 될 것이다.
				// 우리도 이 내용을 기억할 QNA.QNAData.java 클래스를 만들고
				// 이 안에 데이터를 묶어보자.
				
				// 이 줄을 기억할 데이터 빈 클래스를 준비하고
				QNAData data = new QNAData();
				// 이 클래스의 변수에 데이터베이스에서 가지고 온 내용을 기억한다.
				data.qNO = rs.getInt("qNO");
				data.qWriter = rs.getString("qWriter");
				data.qTitle = rs.getString("qTitle");
				data.qQuestion = rs.getString("qQuestion");
				data.qQuestion = data.qQuestion.replaceAll("\r\n", "<br>");
				data.qDate =rs.getDate("qDate");
				data.aNO = rs.getInt("aNO");
				data.aWriter = rs.getString("aWriter");
				data.aAnswer = rs.getString("aAnswer");
				data.aDate = rs.getDate("aDate");
				// 이렇게 하면 한 줄의 데이터는 기억했다
				// 문제는 질문이 여러줄이라는 것이다.
				// 한줄의 데이터를 다시 여러번 기억해 놓아야 한다.
				list.add(data);
			}
			// 이렇게 하면 q_no가 같은것이 조인되어서 나온다. 답변이 없으면 a.q_NO 없으므로
			// 이것은 조인에서 제외된다. 그러므로 outer join을 써야한다.
		} catch (Exception e) {
			System.out.println("질문 목록 검색 에러");
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
		// 뷰에서는 목록의 내용을 알면 출력할 수 있을 것이다.
		// 그러므로 뷰에 전달할 모델은 list가 된다.
		request.setAttribute("LIST", list);
		// 뷰만 호출하자
		return "../QNA/QNAList.jsp";
	}
}
