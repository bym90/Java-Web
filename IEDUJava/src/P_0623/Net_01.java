package P_0623;

import java.net.InetAddress;

/*
 * ����ǻ���� �ּҸ� �˾ƺ���
 */
import java.net.*;
public class Net_01 {

	public Net_01() {
		InetAddress ipa = null;
		try {
			ipa = InetAddress.getLocalHost();
			// 1.��ǻ�� �ּҸ� �˾ƺ���.
			String ip = ipa.getHostAddress();
			System.out.println("IP�ּ�" + ip);
			String domain = ipa.getHostName();
			System.out.println("�������ּ� " + domain);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Net_01();

	}

}