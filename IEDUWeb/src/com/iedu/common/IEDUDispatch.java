package com.iedu.common;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 이제부터 만든느 모든 실습 요청은 확장자는 bmw로 붙이기로 한다.
@WebServlet("*.bmw")
public class IEDUDispatch extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
		// 만들어진 실행 클래스를 저장할 Map을 준비한다.
		// 이 Map은 요청이 있으면 사용할 Map이므로 전역으로 준비한다.
		HashMap	map = new HashMap();
		
    public IEDUDispatch() {
        super();
    }
    
    @Override
    public void init() throws ServletException {
    	// 이 서블리싱 처믕 실행되는 순간 딱 한번만 실행하는 함수이다.
    	// 생성자 함수의 역할을 한다.
    	// 1. 파일에 있는 내용을 읽어들인다.
    	Properties prop = new Properties();
//    	String fileName = "D:/javasource/IEDUWeb/src/com/iedu/common/IEDUReqeustMap.prop";
    	String fileName = this.getClass().getResource("/com/iedu/common/IEDUReqeustMap.prop").getPath();
    	FileInputStream fin = null;
    	try {
    		// 2. 파일에 연결된 스크림을 생성한다.
			fin = new FileInputStream(fileName);
			// 3. 이 파일에서 데이터를 읽어서 Map으로 만든다.
			prop.load(fin);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fin.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
    	// 파일에서 읽은 클래스 일므은 단순히 문자열에 불과하다.
    	// 이제 문자열로 된 클래스이름을 이용해서 실행 가능한 클래스로 바꿔야한다.
    	
    	// Properties는 Map이므로 Map을 처리하는 방식을 이용해서
    	// 저장된 내용을 하나씩 꺼낸다.
    	Set set = prop.keySet(); // 키 값만 Set으로 변환하고
    	Iterator iter = set.iterator(); // Iterator로 변환한 후
    	while(iter.hasNext()){ // 하나씩 꺼낸다
    		String key = (String) iter.next();
    		String className = prop.getProperty(key);
    		// 키값에 대한 데이터(클래스이름)을 꺼낸다.
    		try {
				// 문자열로 된 클래스이름을 이용해서 실제 클래스를 만든다.
    			Class cl = Class.forName(className);
    			// 실행 가능하도록 new 시켜놓는다.
    			Object obj = cl.newInstance();
    			map.put(key, obj);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}
	
	// 두 방식 모두 하나의 함수로 처리할 예정이다.
	public void service (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 클라이언트가 요청한 내용을 분석하여
		// 1) 전체 요청을 알아내고
		String full = request.getRequestURL().toString();
		// http://localhost:8080/IEDUWeb/Login/LoginForm.kim
		// 2) 도메인 부분을 알아낸 후
		String domain = request.getContextPath();
		// IEDUWeb
		// 3) 1)과 2)를 이용하여 요청내용을 알아낸다.
		int pos = full.indexOf(domain);
		int len = domain.length();
		String real = full.substring(pos+len);
		// 그 요청에 맞는 컨트롤러를 찾아서
		// 혹시 잘못된 요청일 수도 있으므로
		String view = "";
		if(map.containsKey(real)){
			// 등록된 요청이다.
			// 이 요청을 해결할 컨트롤러를 구한다.
			Object obj = map.get(real);
			// 그 컨트롤러를 실행하고
			IEDUMain main = (IEDUMain) obj;
			view = main.ieduExe(request, response);
			
		}
		else {
			// 등록되지 않은 요청이다.
			// 메인페이지로 강제 이주
//			response.sendRedirect("http://localhost:8080/IEDUWeb");
			String temp = full.substring(0, pos + domain.length());
			response.sendRedirect(temp);
			return;
		}
		// 뷰를 부른다.
		RequestDispatcher di = request.getRequestDispatcher(view);
		di.forward(request, response);
	}

}
