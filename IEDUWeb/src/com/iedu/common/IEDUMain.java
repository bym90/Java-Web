package com.iedu.common;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface IEDUMain {
	// 다형성 구현을 위해서 상위 클래스의 역할을 할 클래스를 제작했다.
	// 다형성 구현은 계층 추적을 하는데
	// 아버지 클래스에 실행 함수가 존재해야 한다.
	public String ieduExe(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException;
	
	// 참고로 이제부터 만든 모든 컨트롤러는 이 인터페이스를 상속받아서 만들어야 하며
	// ideuExe함수도 반드시 오버라이드 해놓아야 한다.
}
