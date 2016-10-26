package P_0616;

/*
 * ���Ͽ��� ������ �Է¹޾Ƽ� ����غ���.
 */
import java.io.*;
import java.util.*;
public class FileInputStream_01 {

	public FileInputStream_01() {
		FileInputStream fin = null;
		try {
			// 1. �ܺ���ġ�� �����ϴ� ��Ʈ���� �����Ѵ�.
			// ��Ʈ�� ó���� �� ��쿡�� �ܺ���ġ�� ��Ʈ���� �����ϴ� ���� �ʼ��̴�.
			// ��, Ÿ�ٽ�Ʈ���� ����� �־�� �Ѵ�.
			fin = new FileInputStream("src/P_0616/InputStream.txt");
			// ���� ������ �Ǿ����Ƿ� �տ��� ��� ����� �̿��ؼ� ó���ϸ� �ȴ�.
			// 1) �� ���ڸ� �о��
//			int ch = fin.read();
//			System.out.println("���� ������ = " + (char) ch);
			
			// 2) ���� ���ڸ� �о��
//			byte[] buff = new byte[256];
//			int len = fin.read(buff);
//			System.out.println("���� ������ = " + new String(buff, 0, len));
			
			// 3) ���� ���ڸ� �о��.
			byte[] buff = new byte[256];
			Arrays.fill(buff, (byte)'A');
			int len = fin.read(buff, 20, 236);
			System.out.println("���� ������ = " + new String(buff, 0 , len + 20));
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				fin.close();
			}
			catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new FileInputStream_01();

	}

}