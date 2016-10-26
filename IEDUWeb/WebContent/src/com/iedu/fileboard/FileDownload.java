package com.iedu.fileboard;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iedu.common.IEDUMain;
import com.iedu.data.FileBoardData;
import com.iedu.sql.FileBoardDAO;

public class FileDownload implements IEDUMain {
	public String ieduExe(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String strNo = req.getParameter("no");
		int no = Integer.parseInt(strNo);
		// 데이터베이스
		FileBoardDAO dao = new FileBoardDAO();
		ResultSet rs = dao.getFileInfo(no);
		FileBoardData data = new FileBoardData();
		try {
			rs.next();
			data.setNo(rs.getInt("NO"));
			data.setSaveName(rs.getString("SNAME"));
			data.setOriName(rs.getString("ONAME"));
			data.setPath(rs.getString("PATH"));
			data.setLength(rs.getLong("LEN"));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dao.close();
		}
		// 이파일은 클라언트에게 파일의 내용을 스트림 방식으로 보내주어야 한다.
		try {
			// 1. 다운로드 시킬 파일을 File클래스로 만든닫.
			File file = new File(data.getPath(), data.getSaveName());
			// 3. 파일은 먼저 클라이언트에게 파일의 형태를(contentType)을 알려주어야 한다.
			//	  1) 현재 contentType을 삭제 한다.
			resp.reset();
			resp.setContentType("application/octet-stream");
			// 4. 클라이언트에게 어떤 파일을 다운로드할지를 알려주어야 한다.
			// 	  이때는 파일의 이름을 아무렇게나 쓰면 된다.
			//	  즉, 서버가 가진 파일이름이 아닌 클라이언트가 사용할 이름을 알려준다.
			resp.setHeader("Content-Disposition", "attachment; filename = " + data.getOriName());
			// ------------다운로드 준비 끝!
			// 실제 다운로드 작업
			// 다운로드 작업은 스트림 방식으로 처리한다.
			// 서버의 파일의 내용을 읽어서
			// 클라이언트에게 전송하면 된다.
			// 1. 서버의 파일을 읽을 준비를 한다.
			FileInputStream fin = new FileInputStream(file);
			// 2. 클라이언트에게 전송할 준비를 한다.
			ServletOutputStream oout = resp.getOutputStream();
			// 3. 서버에서 읽어서 클라이언트에게 보낸다.
			while(true) {
				byte[] buff = new byte[1024*10];
				int len = fin.read(buff, 0, 1024*10);
				if(len < 0) {
					break;
				}
				oout.write(buff, 0, len);
			}
			oout.flush();
			oout.close();
			fin.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 다운로드는 뷰를 보여주는 것이 아니고
		// 다운로드만 시켜주는 것이다.
		// 그런데 우리가 만든 dispatch는 컨트롤러 다음에 뷰가 오도록 약속했으므로
		// 필요없는 뷰를 불러서 에러가 난다.
		return "../IEDU/FileBoard/FileDownload.jsp";
	}

}
