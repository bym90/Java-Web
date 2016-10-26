package P_0627;

import NetData.*;
import java.io.*;
import java.net.*;
import java.sql.*;
import java.util.*;

public class ClientThread extends Thread {
	// 필수변수(통신변수)
	public ChatServer main;
	public Socket socket;
	public ObjectInputStream ois;
	public ObjectOutputStream oos;
	// 선택변수(정보변수)
	String ip;
	String name;
	String nick;
	String room;

	// 생성자 함수에서 통신할 준비를 해야하는데 문제가 생기면
	// 이클래스는 못쓰는 클래스이므로 생성자체를 하지 말아야한다.
	public ClientThread(ChatServer m, Socket s) throws Exception {
		main = m;
		socket = s;
		// 스트림 만든다
		InputStream is = socket.getInputStream();
		OutputStream os = socket.getOutputStream();

		oos = new ObjectOutputStream(os);
		ois = new ObjectInputStream(is);

		// 필요한 정보를 준비한다.
		InetAddress addr = socket.getInetAddress();
		ip = addr.getHostAddress();
		name = "이름";
		nick = "닉네임";
		room = "대기방";
	}

	public void loginProc(MainData data) {
		boolean isSuccess = false;
		try {
			main.loginS.setString(1, data.id);
			main.loginS.setString(2, data.pw);
			main.rs = main.loginS.executeQuery();
			if (main.rs.next()) {
				isSuccess = true; // 회원입니다.
				name = main.rs.getString("name");
			} else {
				isSuccess = false; // 비회원입니다.
			}
		} catch (Exception e) {
		} finally {
			main.db.close(main.rs);
		}
		// 응답한다.
		// 응답 역시 클래스로 만든다.
		MainData rData = new MainData();
		rData.protocol = 2101;
		rData.isSuccess = isSuccess;
		try {
			oos.writeObject(rData);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void nickProc(MainData data) {
		// 이사람의 보내준 닉네임 정보를 기억하고
		nick = data.cData.nick;
		// 잘 받았다고 응답하다.
		MainData rData = new MainData();
		rData.protocol = 2201;
		rData.isSuccess = true;
		ChatData temp = new ChatData();
		temp.nick = nick;
		rData.cData = temp;
		try {
			oos.writeObject(rData);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterProc(MainData data) {
		// 정보에 기억한다
		room = data.cData.room;
		// 허락한다고 응답
		MainData rData = new MainData();
		rData.protocol = 2301;
		rData.isSuccess = true;
		ChatData temp = new ChatData();
		temp.room = room;
		rData.cData = temp;
		try {
			oos.writeObject(rData);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void exitproc(MainData data) {
		// 정보초기화
		room = "대기방";
		// 허락한다고 응답한다.
		MainData rData = new MainData();
		rData.protocol = 2302;
		rData.isSuccess = true;
		ChatData temp = new ChatData();
		temp.room = data.cData.room; // 이건 어디로 데이터를 보내는건가?

		try {
			oos.writeObject(rData);
		} catch (Exception e) {
		}
	}

	public void sendMsg(MainData data) {
		String msg = "[" + name + "]" + data.cData.msg;

		// 지금은 같은 방 소속인 모든 친구에게 응답을 해야 한다.
		// 응답할 클래스를 만든다.
		MainData rData = new MainData();
		rData.protocol = 2401;
		ChatData temp = new ChatData();
		temp.msg = msg;
		rData.cData = temp;

		synchronized (main.clientList) {
			int size = main.clientList.size();
			for (int i = 0; i < size; i++) {
				// 한사람씩 꺼낸다
				ClientThread t = (ClientThread) main.clientList.get(i);
				// 같은방 소속인지 알아본다
				if (this.room.equals(t.room)) {
					try {
						t.oos.writeObject(rData);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}

	}

	public void upProc(MainData data) {
		// 할일
		// 넘어온 데이터를 이용해서 파일의 위치를 잡고
		File file = new File("D:\\Upload", data.fData.fileName);
		// 데이터를 스트림을 이용해서 저장한다.
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream(file);
			fout.write(data.fData.buff);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		// 잘 받았다고 응답한다.
		MainData rData = new MainData();
		rData.protocol = 2501;
		rData.isSuccess = true;
		try {
			oos.writeObject(rData);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void listProc(MainData data) {
		// 나는 D:\\Upload 폴더에 있는 파일의 이름을 모두 클라이언트에게
		// 전송하고 싶다.
		File file = new File("D:\\Upload");
		String[] list = file.list();
		// 클라이언트에게 준다
		MainData rData = new MainData();
		rData.protocol = 2601;
		FileData temp = new FileData();
		temp.files = list;
		rData.fData = temp;
		// 보낸다
		try {
			oos.writeObject(rData);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void downProc(MainData data) {
		// 할일
		// 업로드와 반대로 서버에서는 파일의 내용을 읽어서

		File file = new File("D:\\Upload", data.fData.fileName);
		long size = file.length();
		byte[] buff = new byte[(int) size]; // 이거 왜 이렇게 한거지?
		FileInputStream fin = null;
		try {
			fin = new FileInputStream(file);
			fin.read(buff);
		} catch (Exception e) {
		} finally {
			try {
				fin.close();
			} catch (Exception e) {
			}
		}

		// 그 내용을 클라이언트에게 보낸다.
		MainData rData = new MainData();
		rData.protocol = 2602;
		FileData temp = new FileData();
		temp.fileName = data.fData.fileName;
		temp.buff = buff; 
		rData.fData = temp;

		try {
			oos.writeObject(rData);
		} catch (Exception e) {
		}
	}

	public void run() {
		try {
			while (true) {
				// 요철을 받는다. 클라이언트는 클래스를 통채로 주면서 요청
				// 그러므로 받을때도 클래스를 통채로 받아야한다.
				MainData data = (MainData) ois.readObject();
				if (data == null) {
					break;
				}
				// 클라이언트가 무엇을 요청헀는지 알아서 해결해주면된다.
				switch (data.protocol) {
				case 1101: // 로그인
					loginProc(data);
					break;
				case 1201: // 닉네임
					nickProc(data);
					break;
				case 1301: // 방입장
					enterProc(data);
					break;
				case 1302: // 방퇴장
					exitproc(data);
					break;
				case 1401: // 대화
					sendMsg(data);
					break;
				case 1501: // 업로드
					upProc(data);
					break;
				case 1601: // 파일 목록
					listProc(data);
					break;
				case 1602: // 다운로드
					downProc(data);
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ois.close();
				oos.close();
				socket.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			main.clientList.remove(this);
		}
	}

}
