package P_0616;

/*
 * �� �Ѽ��� ���Ͽ� �����غ���.
 */
import java.io.*;

public class PrintStream_01 {

	public PrintStream_01() {
		FileOutputStream fout = null;
		PrintStream ps = null;
		try {
			// ���� Ÿ�� ��Ʈ���� �����Ѵ�.
			fout = new FileOutputStream("src/P_0616/PrintStream_01");
			// ���Ϳ� �����Ѵ�.
			ps = new PrintStream(fout);
			// ps = new Print("src/P_0616/PrintStream_01"); ����
			ps.println("�ð��� ���Ӿ��� �帣�� �׿� ���� �� �� ���� ������");
			ps.println();
			ps.println("���������� �޷��� ���������� ����� ���� �� ������");
			ps.println("���� �ƴ��ϰ� �Ұž� �� ������ ���� �ִ� �տ�����");
			ps.println("���� ���̰� �� ���� ������ ������ �ʴ� �̷��� °����");
			ps.println();
			ps.println("�� ���� ���� ���� ������ �ؾ� �ϳ� �� �ش��� ù ��°");
			ps.println("�⵵ �� ��°�� ���� ��� �� ��°�� ���� �� �� ��²");
			ps.println("�ǽ� ���� �ϰ� �� �Ͼ� �׸��� ��������� Just wait");
			ps.println("�׳��� �ð��� ���� �����Դ� �����ϰ� �ൿ��");
			System.out.println("�Ϸ�");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				fout.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new PrintStream_01();

	}

}