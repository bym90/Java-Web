package P_0617;
/*
 * Person Ŭ������ ��°�� ���Ͽ� �����غ���.
 */
import java.io.*;
public class Test_02 {

	public Test_02() {
		FileOutputStream fout = null;
		ObjectOutputStream oout = null;
		// Ŭ������ �ܺ���ġ�� ������ ����� �߰��� ���� ��Ʈ��
		try {
			fout = new FileOutputStream("D:\\Class.txt");
			oout = new ObjectOutputStream(fout);
			// ������ Ŭ������ ������.
			Person p = new Person("ȫ�浿", 24, 170.1F, true);
			oout.writeObject(p);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				oout.close();
				fout.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Test_02();

	}

}