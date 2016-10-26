package P_0616;

/*
 * 그림 파일을 준비한 후 이 파일을 복사해 보자.
 */
import java.io.*;

public class PrintStream_02 {

	public PrintStream_02() {
		// 스트림은 두개가 있어야 한다.
		// 왜냐하면 스트림을 단 방향이므로 데이터를 주는 방향 따로
		// 데이터를 받는 방향 따로 만들어야 한다.
		FileInputStream fin = null;
		FileOutputStream fout = null;
		try {
			// 스트림 개설
			// 스트림은 단방향이므로 들어오고 나가는 작업이 필요하면
			// 스트림도 두개 있어야 한다.
			fin = new FileInputStream("src/P_0616/이수현.png");
			fout = new FileOutputStream("src/P_0615/이수현.png");
			// 복사의 원리
			// 한쪽에서 데이터를 읽어서 그 내용 그대로 다른쪽에 써주면 된다.
			// 몇번 반복해야 종료될지 모르므로 반복분
			while (true) {
				byte[] buff = new byte[1024];
				int len = fin.read(buff);
				if (len == -1) {
					break;
				}
				fout.write(buff, 0, len);
			}
			System.out.println("복사 끝");
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
//숙제 가운데 TextArea를 만들고 아래쪽에 단추 두개를 만든 후
//1번 단추를 클릭하면 파일을 선택하여 그 파일을 읽어오도록 하고
//2번 단추를 클릭하면 현재 TextArea에 있는 내용을 파일에 저장하도록 한다.