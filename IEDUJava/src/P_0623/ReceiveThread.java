package P_0623;

import javax.swing.*;

//������ �ִ� ������ �޴� ������ �Ҹ�Ȯ�ϴ�.
//�׷��Ƿ� ��ȭ������ �޴� ���α׷��� ���������� ����Ǿ�� �Ѵ�.
class ReceiveThread extends Thread {
	// �� Ŭ���� ���� ���� ���� Ŭ������ ����� �ʿ䰡 �ִ�.
	ChatClient main;
	public ReceiveThread(ChatClient m){
		main = m;	
	}
	
	public void run(){
		// ����ؼ� ��ȭ������ �޴´�.
		try {
			while(true){
				String msg = main.br.readLine();
				// �� ��ȭ ������ Area�� ����ϸ�ȴ�.
				main.area.append(msg + "\r\n");
				//readLine �ٹٲ� ��ȣ�� �����ϱ� ������ \r\n�� ���δ�.
				
				// ��ũ�ѹٸ� �ڵ����� ��������
				// 1. ���ι��� ��ũ�ѹٸ� �����ϴ� Ŭ������ ���ϰ�
				JScrollBar sbar = main.sp.getVerticalScrollBar();
				// 2. ������ ��ũ�ѹ��� ������ ��ġ�� �˾Ƴ���.
				int mx = sbar.getMaximum();
				// 3. ���ι��� ��ũ�ѹٸ� �� ��ġ�� ������.
				sbar.setValue(mx);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.exit(0);
		}
	}
	
}

