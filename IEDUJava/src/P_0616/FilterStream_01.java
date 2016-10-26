package P_0616;
/*
 * Ư���� ������ ���Ͽ� ��������.
 * ��, ���� ��Ʈ���� �������.
 */
import java.io.*;
public class FilterStream_01 {

	public FilterStream_01() {
		String text = "Show Me The Money 5";
		// null�� �Է��� ����
		// ���������� �ʱ�ȭ�� �ȵǹǷ�
		FileOutputStream fout = null;
		BufferedOutputStream bout = null;
		try {
			// ��Ʈ�� ����
			// 1) Ÿ�� ��Ʈ���� ���� �����ؾ� �Ѵ�.
			fout = new FileOutputStream("src/P_0616/FilterStream_01.txt");
			// 2) �ʿ��ϴٸ� ���ͽ�Ʈ���� �������ش�.
			bout = new BufferedOutputStream(fout);
			// ��Ʈ���� �ݵ�� ����� ����� �������� �ݾ��ִ°��� ��Ģ�̴�.
			// �ֳ��ϸ� ���α׷��� �ܺ���ġ�� ����� �Ŀ��� �� �ܺ���ġ��
			// ������ �������� �־�� CPU�� �� �� �ӵ��� ��������.
			bout.write(text.getBytes());
			// ���۰� ���� �ʾƵ� �������ش�.
//			bout.flush();
			System.out.println("�Ϸ�");
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			try {
				//close()�ȿ��� flush����� ���Ե��ִ�.
				bout.close();
				fout.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new FilterStream_01();

	}

}