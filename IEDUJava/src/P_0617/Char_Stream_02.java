package P_0617;

/*
 * ���Ͽ� �ִ� ������ ����ϴ� ���α׷��� �ۼ��϶�
 * 3���� ������� �о��.
 */
import java.io.*;
import java.util.*;
public class Char_Stream_02 {

	public Char_Stream_02() {
		FileReader fr = null;
		try {
			fr = new FileReader("src/P_0617/InputStream.txt");
			// �� ���ڸ� �о��
//			char ch = (char)(fr.read());
//			System.out.println(ch);
			
			// ���� ���ڸ� �о��
			// ���� ����� ����� ������ �����.
//			char[] buff = new char[256];
//			int len = fr.read(buff);
//			String temp = new String(buff, 0, len);
//			System.out.println(temp);
			
			// ���� ���ڸ� �о��
			char[] buff = new char[256];
			Arrays.fill(buff, 'ȫ');
			// �� �迭�� 10��° ���������� ���������ͷ� ���ܵΰ� �ʹ�.
			int len = fr.read(buff, 10, 246);
			String temp = new String(buff, 0, len + 10);
			System.out.println(temp);
		} catch (Exception e) {
			e.printStackTrace();
		}
			finally {
				try {
					fr.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
	}

	public static void main(String[] args) {
		new Char_Stream_02();

	}

}