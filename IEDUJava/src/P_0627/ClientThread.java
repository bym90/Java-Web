package P_0627;

import NetData.*;
import java.io.*;
import java.net.*;
import java.sql.*;
import java.util.*;

public class ClientThread extends Thread {
	// �ʼ�����(��ź���)
	public ChatServer main;
	public Socket socket;
	public ObjectInputStream ois;
	public ObjectOutputStream oos;
	// ���ú���(��������)
	String ip;
	String name;
	String nick;
	String room;

	// ������ �Լ����� ����� �غ� �ؾ��ϴµ� ������ �����
	// ��Ŭ������ ������ Ŭ�����̹Ƿ� ������ü�� ���� ���ƾ��Ѵ�.
	public ClientThread(ChatServer m, Socket s) throws Exception {
		main = m;
		socket = s;
		// ��Ʈ�� �����
		InputStream is = socket.getInputStream();
		OutputStream os = socket.getOutputStream();

		oos = new ObjectOutputStream(os);
		ois = new ObjectInputStream(is);

		// �ʿ��� ������ �غ��Ѵ�.
		InetAddress addr = socket.getInetAddress();
		ip = addr.getHostAddress();
		name = "�̸�";
		nick = "�г���";
		room = "����";
	}

	public void loginProc(MainData data) {
		boolean isSuccess = false;
		try {
			main.loginS.setString(1, data.id);
			main.loginS.setString(2, data.pw);
			main.rs = main.loginS.executeQuery();
			if (main.rs.next()) {
				isSuccess = true; // ȸ���Դϴ�.
				name = main.rs.getString("name");
			} else {
				isSuccess = false; // ��ȸ���Դϴ�.
			}
		} catch (Exception e) {
		} finally {
			main.db.close(main.rs);
		}
		// �����Ѵ�.
		// ���� ���� Ŭ������ �����.
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
		// �̻���� ������ �г��� ������ ����ϰ�
		nick = data.cData.nick;
		// �� �޾Ҵٰ� �����ϴ�.
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
		// ������ ����Ѵ�
		room = data.cData.room;
		// ����Ѵٰ� ����
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
		// �����ʱ�ȭ
		room = "����";
		// ����Ѵٰ� �����Ѵ�.
		MainData rData = new MainData();
		rData.protocol = 2302;
		rData.isSuccess = true;
		ChatData temp = new ChatData();
		temp.room = data.cData.room; // �̰� ���� �����͸� �����°ǰ�?

		try {
			oos.writeObject(rData);
		} catch (Exception e) {
		}
	}

	public void sendMsg(MainData data) {
		String msg = "[" + name + "]" + data.cData.msg;

		// ������ ���� �� �Ҽ��� ��� ģ������ ������ �ؾ� �Ѵ�.
		// ������ Ŭ������ �����.
		MainData rData = new MainData();
		rData.protocol = 2401;
		ChatData temp = new ChatData();
		temp.msg = msg;
		rData.cData = temp;

		synchronized (main.clientList) {
			int size = main.clientList.size();
			for (int i = 0; i < size; i++) {
				// �ѻ���� ������
				ClientThread t = (ClientThread) main.clientList.get(i);
				// ������ �Ҽ����� �˾ƺ���
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
		// ����
		// �Ѿ�� �����͸� �̿��ؼ� ������ ��ġ�� ���
		File file = new File("D:\\Upload", data.fData.fileName);
		// �����͸� ��Ʈ���� �̿��ؼ� �����Ѵ�.
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
		// �� �޾Ҵٰ� �����Ѵ�.
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
		// ���� D:\\Upload ������ �ִ� ������ �̸��� ��� Ŭ���̾�Ʈ����
		// �����ϰ� �ʹ�.
		File file = new File("D:\\Upload");
		String[] list = file.list();
		// Ŭ���̾�Ʈ���� �ش�
		MainData rData = new MainData();
		rData.protocol = 2601;
		FileData temp = new FileData();
		temp.files = list;
		rData.fData = temp;
		// ������
		try {
			oos.writeObject(rData);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void downProc(MainData data) {
		// ����
		// ���ε�� �ݴ�� ���������� ������ ������ �о

		File file = new File("D:\\Upload", data.fData.fileName);
		long size = file.length();
		byte[] buff = new byte[(int) size]; // �̰� �� �̷��� �Ѱ���?
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

		// �� ������ Ŭ���̾�Ʈ���� ������.
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
				// ��ö�� �޴´�. Ŭ���̾�Ʈ�� Ŭ������ ��ä�� �ָ鼭 ��û
				// �׷��Ƿ� �������� Ŭ������ ��ä�� �޾ƾ��Ѵ�.
				MainData data = (MainData) ois.readObject();
				if (data == null) {
					break;
				}
				// Ŭ���̾�Ʈ�� ������ ��û������ �˾Ƽ� �ذ����ָ�ȴ�.
				switch (data.protocol) {
				case 1101: // �α���
					loginProc(data);
					break;
				case 1201: // �г���
					nickProc(data);
					break;
				case 1301: // ������
					enterProc(data);
					break;
				case 1302: // ������
					exitproc(data);
					break;
				case 1401: // ��ȭ
					sendMsg(data);
					break;
				case 1501: // ���ε�
					upProc(data);
					break;
				case 1601: // ���� ���
					listProc(data);
					break;
				case 1602: // �ٿ�ε�
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