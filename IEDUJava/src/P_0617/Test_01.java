package P_0617;
/*
 * �׸� ���� �ϳ��� ���縦 �غ���
 */
import java.io.*;
public class Test_01 {

	public Test_01() {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("src/P_0617/����.jpg");
			fw = new FileWriter("src/P_0617/������.jpg");
			//���� ó���� ��� �Ұ����ϹǷ� ���簡 �����ʴ´�.
			while (true) {
				char[] buff = new char[1024];
				int len = fr.read(buff);
				if(len == -1){
					break;
				}
				fw.write(buff, 0, len);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				fw.close();
				fr.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Test_01();

	}

}