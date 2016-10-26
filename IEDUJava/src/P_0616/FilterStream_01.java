package P_0616;
/*
 * 특정한 내용을 파일에 저장하자.
 * 단, 필터 스트림을 사용하자.
 */
import java.io.*;
public class FilterStream_01 {

	public FilterStream_01() {
		String text = "Show Me The Money 5";
		// null을 입력한 이유
		// 지역변수는 초기화가 안되므로
		FileOutputStream fout = null;
		BufferedOutputStream bout = null;
		try {
			// 스트림 개설
			// 1) 타겟 스트림이 먼저 존재해야 한다.
			fout = new FileOutputStream("src/P_0616/FilterStream_01.txt");
			// 2) 필요하다면 필터스트림과 연결해준다.
			bout = new BufferedOutputStream(fout);
			// 스트림은 반드시 사용이 종료된 시점에서 닫아주는것이 원칙이다.
			// 왜냐하면 프로그램은 외부장치를 사용한 후에는 그 외부장치와
			// 연결을 단절시켜 주어야 CPU가 좀 더 속도가 높아진다.
			bout.write(text.getBytes());
			// 버퍼가 차지 않아도 내보내준다.
//			bout.flush();
			System.out.println("완료");
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			try {
				//close()안에는 flush기능이 포함되있다.
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
