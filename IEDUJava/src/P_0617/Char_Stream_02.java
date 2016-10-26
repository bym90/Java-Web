package P_0617;

/*
 * 파일에 있는 내용을 출력하는 프로그램을 작성하라
 * 3가지 방법으로 읽어보자.
 */
import java.io.*;
import java.util.*;
public class Char_Stream_02 {

	public Char_Stream_02() {
		FileReader fr = null;
		try {
			fr = new FileReader("src/P_0617/InputStream.txt");
			// 한 글자만 읽어보자
//			char ch = (char)(fr.read());
//			System.out.println(ch);
			
			// 여러 글자를 읽어보자
			// 읽은 결과를 기억할 변수를 만든다.
//			char[] buff = new char[256];
//			int len = fr.read(buff);
//			String temp = new String(buff, 0, len);
//			System.out.println(temp);
			
			// 여러 글자를 읽어보자
			char[] buff = new char[256];
			Arrays.fill(buff, '홍');
			// 이 배열의 10번째 이전공간은 원래데이터로 남겨두고 싶다.
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
