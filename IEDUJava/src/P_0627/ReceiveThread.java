package P_0627;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.*;
import NetData.*;
//Ŭ���̾�Ʈ�� ������ ���� �����͸� ���� �𸣹Ƿ� �׻� ����ϰ�
//���� �� �������̴�.
//�׷��Ƿ� ������ �ִ� �����͸� �ޱ����� ���α׷��� ���� ����
//ó���Ұ��̴�.

public class ReceiveThread extends Thread {
	ChatClient main;

	public ReceiveThread(ChatClient m) {
		main = m;
	}

	public void loginProc(MainData data) {
		// �α��ο� �����ϸ� ȭ���� �г����� �Է��ϴ� ȭ������
		// ��ȯ������ �����̰�
		if (data.isSuccess == true) {
			main.card.show(main.mainP, "NICK");
		} else {
			// �α��� �����ϸ� �޼����� ������� �����̴�.
			JOptionPane.showMessageDialog(main, "�α��ο� �����߽��ϴ�");
		}
	}

	public void nickProc(MainData data) {
		// ���� ������ ����ϰ� ���� ������ �� �ֵ��� Ǯ���ش�.
		main.nick = data.cData.nick;
		main.nCard.roomBox.setEnabled(true);
		main.nCard.enterB.setEnabled(true);
	}

	public void enterProc(MainData data) {
		// ���� ������ �� �̸��� ������ְ�
		// ä���� �� �� �ֵ��� ȭ�� ��ȯ�Ѵ�.
		main.room = data.cData.room;
		main.card.show(main.mainP, "CHAT");
	}

	public void exitProc(MainData data) {
		// ���� ������ �����ְ�
		main.room = ""; // ���̰� ����...
		// �ٽ� �������� ��ȯ��Ų��.
		main.card.show(main.mainP, "NICK");
	}

	public void showMsg(MainData data) {
		// �ؽ�Ʈ ����� ���
		main.cCard.area.append(data.cData.msg + "\r\n");
		JScrollBar sbar = main.cCard.sp.getVerticalScrollBar();
		int max = sbar.getMaximum();
		sbar.setValue(max);
	}

	public void upProc(MainData data) {
		// �޽��� �ϳ��� �������.
		JOptionPane.showMessageDialog(main, "���� ���ε� ����");
	}

	public void listProc(MainData data) {
		// ����
		// ���� ������ ���� �״� ���̾�α׸� ���� �����̴�.
		main.dDlg = new DownloadDlg(main);
		// ����� ����� ��Ͽ� ����Ѵ�.
		main.dDlg.list.setListData(data.fData.files);
		main.dDlg.setSize(400, 400);
		main.dDlg.setVisible(true);
	}

	public void downProc(MainData data) {
		// ���
		// ������ ��ǻ�Ϳ� Ư�� ���� �ϳ��� ����� �ű⿡ �ٿ�ε� �ǵ��� ����Ѵ�.
		// �ݴ�� ����� ������ �Ѿ�� �����͸� �����ϸ� �ȴ�.
		// ��ġ ���
		File file = new File("D:\\��", data.fData.fileName);
		// ��Ʈ���� �̿��ؼ� ������ �����Ѵ�./
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
				// ���� ������ �� �������� �ǹ̸� �м��ؼ� �ű⿡
				// �´� �۾��� �����Ѵ�.
				switch (data.protocol) {
				case 2101: // �α��� ���� ����
					loginProc(data);
					break;
				case 2201: // �г��� ���� ����
					nickProc(data);
					break;
				case 2301: // ������
					enterProc(data);
					break;
				case 2302: // ������
					exitProc(data);
					break;
				case 2401: // ��ȭ
					showMsg(data);
					break;
				case 2501: // ���ε�
					upProc(data);
					break;
				case 2601: // ���� ���
					listProc(data);
					break;
				case 2602: // �ٿ�ε�
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