package P_0616;
/*
 * 파일에 내용을 기록해 보자.
 */
import java.io.*;
public class FileOutputStream_01 {

	public FileOutputStream_01() {
		FileOutputStream fout = null;
		try {
			//1. 스트림을 생성한다
			fout = new FileOutputStream("src/P_0616/OutputStream.txt");
			//2. 내용을 내보낸다
			//1) 한글자만 보내자
//			int ch = '!';
//			fout.write(ch);
			
			//2) 여러글자를 내보내자.
//			String text = "Show me the money 5";
//			fout.write(text.getBytes());

			//3) 여러 글자를 내보내자.
			String text = "Show me the money 5";
			fout.write(text.getBytes(), 5, 6);
			
			// 파일은 반드시 닫아주어야 한다.
			// 실행하면 파일에만 저장되므로 실행이 되었는지 알 수 없다.
			// 그래서 콘솔창에 작업이 끝났음을 알려주자.
			System.out.println("저장완료");
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
