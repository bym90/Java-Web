package Guest;

import javax.servlet.ServletException;
import javax.servlet.http.*;

import java.io.IOException;
import java.sql.*;
import SQL.*;

public class GuestList {
	public String getList(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		// 반환값이 String인 이유?
		// 이 컨트롤러가 실행된 후에는 다음 작업은 이 컨트롤러가 만든 데이터를
		// 이용해서 뷰가 실행되어야 한다.
		// 물론 뷰는 하나로 고정시킬 수 있다. 이때는 반환값이 필요하지 않는다.
		// 하지만... 컨트롤러가 실행되는 도중에 뷰가 달라질 수도 있다.
		// 예> 에러가 발생하면 에러 페이지를 보여주어야 한다던지..
		// 	   로그인 여부에 따라서 보여줄 페이지가 달라질 수 있다.
		// 이런 경우에는 뷰를 지정하지 못할 수도 있다.
		// 그래서 컨트롤러가 실행된 후 뷰를 결정해서 알려줄 목적으로
		// 반환값을 String(뷰이름)으로 정했다.
		
		// 당연히 이 클래스는 클라이언트가 전달한 데이터를 이용해서 작업을 할 필요가 있다.
		// 그래서 클라이언트가 전달한 데이터를 이용할 수 있도록 Request를 받아오자.
		// 반드시 받을 필요가 있는것은 아니다.
		
		// 목록을 보여줄 수 있도록 뭔가 작업을 해야하는데... 오늘은 그냥 보여준다 치고
		// 마무리는 뷰 문서를 지정해서 결과를 보여주도록 한다.
		
		// 먼저 데이터베이스에서 목록보기에 필요한 데이터를 꺼낸다.
		MyJDBC db = null;
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		int[] num = null;
		String[] body = null;
		String[] writer = null;
		String[] date = null;
		
		try {
			db = new MyJDBC();
			con = db.getCON();
			stmt = db.getSTMT(con);
			// 질의 명령 만든다.
			String sql = "SELECT * FROM Guest ORDER BY g_NO desc";
			rs = stmt.executeQuery(sql);
			// 이 결과를 뷰에게 전달해야한다.
			// 전달하는 방식은 배열로 만들어서
			//				   컬렉션으로 만들어서
			// 배열의 갯수를 알아야 하므로
			// 먼저 가상의 레코드 포인터를 제일 아래로 내린다.
			rs.last();
			// 이 위치가 어디인지를 알아낸다.
			int pos = rs.getRow();
			// 여기까지는 배열을 만들기 위해서 배열의 방이 몇개가 필요한지 알아내기 위해서 처리한 것이다.
			// 데이터는 다시 처음부터 꺼내야하므로 
			rs.beforeFirst();
			num = new int[pos];
			body = new String[pos];
			writer = new String[pos];
			date = new String[pos];
			for (int i = 0; i < pos; i++) {
				rs.next();
				num[i] = rs.getInt("g_No");
				body[i] = rs.getString("g_body");
				// HTML은 원칙적으로 줄바꿈을 인정하지 않는다.
				// 오직 <br>태그가 있어야만 줄바꿈이 된다.
				// 유일하게 TextArea만 줄바꿈(\r\n)이 되는 공간이다.
				// 그러므로 텍스트 에리어에서 입력한 내용을 HTML에 출력하면
				// 한줄로 붙어서 나온다.
				// 해결방법
				// 줄바꿈 기호를 <br>로 변경해야 한다.
				body[i] = body[i].replaceAll("\r\n", "<br>");
				writer[i] = rs.getString("g_Writer");
				date[i] = rs.getString("g_Date");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
			// 그 데이터를 뷰에게 전달하기 위해서 모델로 만든다.
			// 모델은 컨트롤러가 만든 데이터 중에서 
			// 뷰에서 사용할 데이터를 부르는 용어가 모델이다.
			// 모델은 request.setAttribute("키값", 데이터);의 형태로 만들면 된다.
			req.setAttribute("no", num);
			req.setAttribute("body", body);
			req.setAttribute("writer", writer);
			req.setAttribute("date", date);
		}
		// 그 데이터를 뷰에게 전달하기 위해서 모델로 만든다.
		// 뷰를 호출한다.
		
		return "../Guest/GuestList.jsp";
	}
}
