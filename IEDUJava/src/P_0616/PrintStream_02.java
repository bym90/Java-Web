package P_0616;

/*
 * �׸� ������ �غ��� �� �� ������ ������ ����.
 */
import java.io.*;

public class PrintStream_02 {

	public PrintStream_02() {
		// ��Ʈ���� �ΰ��� �־�� �Ѵ�.
		// �ֳ��ϸ� ��Ʈ���� �� �����̹Ƿ� �����͸� �ִ� ���� ����
		// �����͸� �޴� ���� ���� ������ �Ѵ�.
		FileInputStream fin = null;
		FileOutputStream fout = null;
		try {
			// ��Ʈ�� ����
			// ��Ʈ���� �ܹ����̹Ƿ� ������ ������ �۾��� �ʿ��ϸ�
			// ��Ʈ���� �ΰ� �־�� �Ѵ�.
			fin = new FileInputStream("src/P_0616/�̼���.png");
			fout = new FileOutputStream("src/P_0615/�̼���.png");
			// ������ ����
			// ���ʿ��� �����͸� �о �� ���� �״�� �ٸ��ʿ� ���ָ� �ȴ�.
			// ��� �ݺ��ؾ� ������� �𸣹Ƿ� �ݺ���
			while (true) {
				byte[] buff = new byte[1024];
				int len = fin.read(buff);
				if (len == -1) {
					break;
				}
				fout.write(buff, 0, len);
			}
			System.out.println("���� ��");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new PrintStream_02();

	}

}
//���� ��� TextArea�� ����� �Ʒ��ʿ� ���� �ΰ��� ���� ��
//1�� ���߸� Ŭ���ϸ� ������ �����Ͽ� �� ������ �о������ �ϰ�
//2�� ���߸� Ŭ���ϸ� ���� TextArea�� �ִ� ������ ���Ͽ� �����ϵ��� �Ѵ�.