package P_0617;
/*
 * Person 클래스를 통째로 파일에 저장해보자.
 */
import java.io.*;
public class Test_02 {

	public Test_02() {
		FileOutputStream fout = null;
		ObjectOutputStream oout = null;
		// 클래스를 외부장치로 보내는 기능이 추가된 필터 스트림
		try {
			fout = new FileOutputStream("D:\\Class.txt");
			oout = new ObjectOutputStream(fout);
			// 내보낼 클래스를 만들자.
			Person p = new Person("홍길동", 24, 170.1F, true);
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
