package P_0627;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.*;
import NetData.*;
//클라이언트도 서버가 언제 데이터를 줄지 모르므로 항상 대기하고
//있을 수 없을것이다.
//그러므로 서버가 주는 데이터를 받기위한 프로그램을 따로 만들어서
//처리할것이다.

public class ReceiveThread extends Thread {
	ChatClient main;

	public ReceiveThread(ChatClient m) {
		main = m;
	}

	public void loginProc(MainData data) {
		// 로그인에 성공하면 화면을 닉네임을 입력하는 화면으로
		// 전환시켜줄 예정이고
		if (data.isSuccess == true) {
			main.card.show(main.mainP, "NICK");
		} else {
			// 로그인 실패하면 메세지를 출력해줄 예정이다.
			JOptionPane.showMessageDialog(main, "로그인에 실패했습니다");
		}
	}

	public void nickProc(MainData data) {
		// 가진 정보에 기억하고 방을 선택할 수 있도록 풀어준다.
		main.nick = data.cData.nick;
		main.nCard.roomBox.setEnabled(true);
		main.nCard.enterB.setEnabled(true);
	}

	public void enterProc(MainData data) {
		// 나의 정보에 방 이름을 기록해주고
		// 채팅을 할 수 있도록 화면 전환한다.
		main.room = data.cData.room;
		main.card.show(main.mainP, "CHAT");
	}

	public void exitProc(MainData data) {
		// 나의 정보를 지워주고
		main.room = ""; // 차이가 뭔지...
		// 다시 대기방으로 전환시킨다.
		main.card.show(main.mainP, "NICK");
	}

	public void showMsg(MainData data) {
		// 텍스트 에리어에 출력
		main.cCard.area.append(data.cData.msg + "\r\n");
		JScrollBar sbar = main.cCard.sp.getVerticalScrollBar();
		int max = sbar.getMaximum();
		sbar.setValue(max);
	}

	public void upProc(MainData data) {
		// 메시지 하나만 출력하자.
		JOptionPane.showMessageDialog(main, "파일 업로드 성공");
	}

	public void listProc(MainData data) {
		// 할일
		// 나는 응답이 오면 그대 다이얼로그를 만들 예정이다.
		main.dDlg = new DownloadDlg(main);
		// 응답온 결과를 목록에 출력한다.
		main.dDlg.list.setListData(data.fData.files);
		main.dDlg.setSize(400, 400);
		main.dDlg.setVisible(true);
	}

	public void downProc(MainData data) {
		// 약속
		// 여러분 컴퓨터에 특정 폴더 하나를 만들고 거기에 다운로드 되도록 약속한다.
		// 반대로 약속한 폴더에 넘어온 데이터를 저장하면 된다.
		// 위치 잡기
		File file = new File("D:\\매", data.fData.fileName);
		// 스트림을 이용해서 파일을 저장한다./
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream(file);
			fout.write(data.fData.buff);
		} catch (Exception e) {
		} finally {
			try {                                                                                                                                  
				fout.close();
			} catch (Exception e) {
			}
		}
	}

	public void run() {
		try {
			while (true) {
				MainData data = (MainData) main.ois.readObject();
				if (data == null) {
					break;
				}
				// 역시 서버가 준 데이터의 의미를 분석해서 거기에
				// 맞는 작업을 진행한다.
				switch (data.protocol) {
				case 2101: // 로그인 성공 여부
					loginProc(data);
					break;
				case 2201: // 닉네임 성공 여부
					nickProc(data);
					break;
				case 2301: // 방입장
					enterProc(data);
					break;
				case 2302: // 방퇴장
					exitProc(data);
					break;
				case 2401: // 대화
					showMsg(data);
					break;
				case 2501: // 업로드
					upProc(data);
					break;
				case 2601: // 파일 목록
					listProc(data);
					break;
				case 2602: // 다운로드
					downProc(data);
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			main.closeProc();
		}

	}
}