package P_0617;

/*
 * 파일에 3가지 방식을 이용해서 데이터를 저장해보자.
 */
import java.io.*;

public class Char_Stream_01 {

	public Char_Stream_01() {
		// 타겟을 파일에 저장하니까 FileWriter가 타겟 스트림이 될것이다.
		FileWriter fw = null;
		try {
			File file = new File("src/P_0617/InputStream.txt");
			fw = new FileWriter(file);
			// 한글자만 기록하자.
			// int ch = '쇼'; // char처리이므로 한글도 입력 가능하다.
			// fw.write(ch);

			// 여러 글자를 기록하자.
			String str = "쇼미더머니5";
			// fw.write(str.toCharArray());

			// 여러 글자를 기록하자.
			fw.write(str.toCharArray(), 0, 6);
			// byte 계열은 바이트 단위로
			// char 계열은 글자수 단위로 계상해서 사용한다.

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
