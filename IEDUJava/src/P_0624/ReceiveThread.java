package P_0624;

import javax.swing.JScrollBar;

//���� ������ �����ִ� �����͸� ���� �غ� ����.
//������ ���� ������ �����͸� ����¢ �𸣹Ƿ� �����͸� �޴� �κ���
//���������� ����Ǿ�� �Ѵ�.
//�׷��� �����͸� �޴� ���α׷��� ������ ���α׷��� ���� �����̴�.
class ReceiveThread extends Thread {
	RoomChatClient main;

	ReceiveThread(RoomChatClient m) {
		main = m;
	}

	public void nickProc(String msg) {
		// �����͸� �ڽ��� ������ ����ϰ� ���� ������ �� �ֵ��� �Ѵ�.
		main.nick = msg;
		main.nickC.roomBox.setEnabled(true);
	}

	public void enterProc(String msg) {
		// �����͸� �ڽ��� ������ ����ϰ�
		// ȭ���� ä�ù����� ��ȯ��Ų��.
		main.room = msg;
		main.card.show(main.mainP, "CHAT");
		main.setTitle(msg + "�Դϴ�.");

	}

	public void exitProc(String msg) {
		// ������ ������ �����·� �����ϰ�
		// ȭ���� ���� ȭ������ ��ȯ��Ų��.
		main.room = msg;
		main.card.show(main.mainP, "NICK");
		main.setTitle("����");
		// ���ݱ��� ��ȭ������ �����.
		main.chatC.area.setText("");
	}

	public void msgProc(String msg) {
		// ��ȭ������ ȭ�鿡 ����Ѵ�.
		main.chatC.area.append(msg + "\r\n");
		// ��ũ�ѹ� �ڵ� ������ ������ ����
		JScrollBar sbar = main.chatC.sp.getVerticalScrollBar();
		int max = sbar.getMaximum();
		sbar.setValue(max);
	}

	public void run() {
		// ����ؼ� ������ �ִ� �����͸� �ް� ó���Ѵ�.
		try {
			while (true) {
				// �����͸� ����.
				String temp = main.br.readLine();
				if (temp == null || temp.length() == 0) {
					break;
				}
				// ������ �� ���뿡�� �ǹ̸� �����ϴ� ��� ��ȣ�� �پ��ִ�.
				// �ϴ� ����� �и��س���.
				String protocol = temp.substring(0, 4);
				String msg = temp.substring(4);
				int intP = Integer.parseInt(protocol);
				switch (intP) {
				case 2101: // �г����� �߹޾Ҵ�
					nickProc(msg);
					break;
				case 2201: // �������� ����Ѵ�.
					enterProc(msg);
					break;
				case 2202: // �������� ����Ѵ�.
					exitProc(msg);
					break;
				case 2301: // ��ȭ�����̴�.
					msgProc(msg);
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			main.closeProc();
			System.exit(0);
		}

	}
}