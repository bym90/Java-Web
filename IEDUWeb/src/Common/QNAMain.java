package Common;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface QNAMain {
	// 다형성 구현을 하기 위해선느 아버지 클래스쪽에 함수가 존재해야 한다.
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException;
}
