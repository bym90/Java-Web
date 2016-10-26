package P_0616;
/*
 * ���Ͽ� ������ ����� ����.
 */
import java.io.*;
public class FileOutputStream_01 {

	public FileOutputStream_01() {
		FileOutputStream fout = null;
		try {
			//1. ��Ʈ���� �����Ѵ�
			fout = new FileOutputStream("src/P_0616/OutputStream.txt");
			//2. ������ ��������
			//1) �ѱ��ڸ� ������
//			int ch = '!';
//			fout.write(ch);
			
			//2) �������ڸ� ��������.
//			String text = "Show me the money 5";
//			fout.write(text.getBytes());

			//3) ���� ���ڸ� ��������.
			String text = "Show me the money 5";
			fout.write(text.getBytes(), 5, 6);
			
			// ������ �ݵ�� �ݾ��־�� �Ѵ�.
			// �����ϸ� ���Ͽ��� ����ǹǷ� ������ �Ǿ����� �� �� ����.
			// �׷��� �ܼ�â�� �۾��� �������� �˷�����.
			System.out.println("����Ϸ�");
			fout.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				fout.close();
			}
			catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new FileOutputStream_01();

	}

}