package com.iedu.fileboard;

import java.io.File;
import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.iedu.common.IEDUMain;
import com.iedu.data.FileBoardData;
import com.iedu.sql.FileBoardDAO;
import com.iedu.util.StringUtil;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class BoardWriteProc implements IEDUMain {
	public String ieduExe(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 스트림 방식으로 제출된 내용은 req.getParameter()로 받지 못하고
		// 대신 스트림 방식으로만 받아야 한다.

		// 저장될 위치 찾는 방법
		// 1. 웹에서 사용할 위치 잡기
		// 웹에서 사용할 파일은 반드시 프로젝트 안에 있어야 하고
		// 실제로 서버는 눈에 보이는 폴더를 이용하는 것이 아니고
		// metadata 폴더를 이용하기 때문에.....
		// getRealPath()를 이용해서 알아야 한다.
		// String path = req.getServletContext().getRealPath("upload");
		// 2. 다운로드용 위치 잡기
		String path = "D:\\Upload";
		MultipartRequest mr = new MultipartRequest(req, path, 1024 * 1024 * 1024, "UTF-8", new DefaultFileRenamePolicy());
		// 이 클래스는
		// 1. 스트림 방식으로 파라메터를 받는 기능

		// 2. 파일 업로드 하는 기능
		// 생성자 함수
		// public MultipartRequest(request, saveDirectory, maxPostSize, policy)
		// 1. req

		// 2. 업로드된 파일을 저장할 서버의 위치를 지정한다.
		// 저장위치 잡는법
		// 1) 저장된 파일을 웹 페이지에서 직접 사용하는 경우(이미지,...)
		// 반드시 WebContent 밑에 위치를 잡아야 한다.
		// D:\javasource\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\work\Catalina\localhost\IEDUWeb\org\apache\jsp
		// -> 저장된 위치는 서버가 사용하는 위치에 저장된다.
		// 2) 저장된 파일을 오직 다운로드만 사용하는 경우(일반파일,...)
		// 서버의 아무 위치나 잡으면된다.
		// String path = "D:\\upload";

		// 3. 업로드 파일의 최대 크기를 지정

		// 4. 같은 이름의 파일이 존재할 경우 처리 방식
		// DefaultFileRenamePolicy
		// ->같은 이름의 파일이 존재하면 뒤에 번호를 붙여서 변경해서 저장

		// 업로드는 되었지만... 게시판을 완성하기 위해서는
		// 다른 내용도 받아야 한다.(데이터베이스에 기록해야 한다.)
		// 이것 역시 MultipartRequest 가 해결한다.

		// 제목과 본문을 받는다.
		String title = mr.getParameter("title");
		String body = mr.getParameter("body");
		// 세션에서 글쓴이 아이디를 받는다.
		HttpSession session = req.getSession();
		String id = (String) session.getAttribute("ID");
		// 이 내용을 이용해서 게시물에 등록한다.
		// DAO com.iedu.sql.FileBoardDAO.java
		FileBoardDAO dao = new FileBoardDAO();
		// 원글의 번호
		int no = dao.getNO();
		FileBoardData data= new FileBoardData();
		data.setNo(no);
		data.setBody(body);
		data.setId(id);;
		data.setTitle(title);
		dao.insertBoard(data);
		// 이 게시물에 같이 첩부된 파일의 정보를 데이터베이스 안에 기억한다.
		// 파일의 개수가 다르다.
		// 1. 넘어온 파일의 이름을 알아낸다.
		Enumeration en = mr.getFileNames();
		while(en.hasMoreElements()) {
			String name = (String) en.nextElement();
			// file1, file2
			System.out.println("이름= " + name);
			// 이제 각각의 파일의 실제 이름을 알아낸다.
			String oriName = mr.getOriginalFileName(name);
			// 실제 저장된 이름을 알아낸다.
			// 파일 폼만 만들고 파일을 첨부하지 않았을 경우를 대비
			if(!StringUtil.isNull(oriName)) {
				//	파일이 첨부 되었다면...
				//	실제 저장된 이름을 알아낸다.
				String saveName = mr.getFilesystemName(name);
				//	파일의 크기를 알아내기 위해서.....
				File fileInfo = mr.getFile(name);
				long len = fileInfo.length();
			
			// 이 정보를 데이터베이스에 저장하면 된다.
			// 저장할 정보를 데이터 빈 클래스로 묶어서
			FileBoardData data1 = new FileBoardData();
			data1.setNo(no);
			data1.setSaveName(saveName);
			data1.setOriName(oriName);
			data1.setPath(path);
			data1.setLength(len);
			// DAO 함수 호출
			dao.insertFileInfo(data1);
			}
		}
		dao.close();
		
		return "../IEDU/FileBoard/BoardWriteProc.jsp";
	}

}
