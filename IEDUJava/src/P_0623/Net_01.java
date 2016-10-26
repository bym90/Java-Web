package P_0623;

import java.net.InetAddress;

/*
 * 내컴퓨터의 주소를 알아보자
 */
import java.net.*;
public class Net_01 {

	public Net_01() {
		InetAddress ipa = null;
		try {
			ipa = InetAddress.getLocalHost();
			// 1.컴퓨터 주소를 알아보자.
			String ip = ipa.getHostAddress();
			System.out.println("IP주소" + ip);
			String domain = ipa.getHostName();
			System.out.println("도메인주소 " + domain);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Net_01();

	}

}
