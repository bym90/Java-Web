package P_0616;

/*
 * 파일에서 내용을 입력받아서 출력해보자.
 */
import java.io.*;
import java.util.*;
public class FileInputStream_01 {

	public FileInputStream_01() {
		FileInputStream fin = null;
		try {
			// 1. 외부장치와 연결하는 스트림을 생성한다.
			// 스트림 처리를 할 경우에는 외부장치와 스트림을 연결하는 것이 필수이다.
			// 즉, 타겟스트림을 만들어 주어야 한다.
			fin = new FileInputStream("src/P_0616/InputStream.txt");
			// 이제 연결이 되었으므로 앞에서 배운 방식을 이용해서 처리하면 된다.
			// 1) 한 글자만 읽어보자
//			int ch = fin.read();
//			System.out.println("읽은 내용은 = " + (char) ch);
			
			// 2) 여러 글자를 읽어보자
//			byte[] buff = new byte[256];
//			int len = fin.read(buff);
//			System.out.println("읽은 내용은 = " + new String(buff, 0, len));
			
			// 3) 여러 글자를 읽어보자.
			byte[] buff = new byte[256];
			Arrays.fill(buff, (byte)'A');
			int len = fin.read(buff, 20, 236);
			System.out.println("읽은 내용은 = " + new String(buff, 0 , len + 20));
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
