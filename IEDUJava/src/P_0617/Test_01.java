package P_0617;
/*
 * 그림 파일 하나를 복사를 해보자
 */
import java.io.*;
public class Test_01 {

	public Test_01() {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("src/P_0617/유정.jpg");
			fw = new FileWriter("src/P_0617/유정이.jpg");
			//기계어 처리에 사용 불가능하므로 복사가 되지않는다.
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
