package P_0617;

/*
 * ���Ͽ� 3���� ����� �̿��ؼ� �����͸� �����غ���.
 */
import java.io.*;

public class Char_Stream_01 {

	public Char_Stream_01() {
		// Ÿ���� ���Ͽ� �����ϴϱ� FileWriter�� Ÿ�� ��Ʈ���� �ɰ��̴�.
		FileWriter fw = null;
		try {
			File file = new File("src/P_0617/InputStream.txt");
			fw = new FileWriter(file);
			// �ѱ��ڸ� �������.
			// int ch = '��'; // charó���̹Ƿ� �ѱ۵� �Է� �����ϴ�.
			// fw.write(ch);

			// ���� ���ڸ� �������.
			String str = "��̴��Ӵ�5";
			// fw.write(str.toCharArray());

			// ���� ���ڸ� �������.
			fw.write(str.toCharArray(), 0, 6);
			// byte �迭�� ����Ʈ ������
			// char �迭�� ���ڼ� ������ ����ؼ� ����Ѵ�.

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Char_Stream_01();

	}

}