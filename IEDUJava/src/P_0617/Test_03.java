package P_0617;
/*
 * 앞에서 저장한 내용을 출력하자.
 */
import java.io.*;
public class Test_03 {

	public Test_03() {
		FileInputStream fin = null;
		ObjectInputStream oin = null;
		//클래스를 읽을 수 있는 기능이 추가된 보조스트림
		try {
			fin = new FileInputStream("D:\\Class.txt");
			oin = new ObjectInputStream(fin);
			
			Person temp = (Person) oin.readObject();
			System.out.println(temp.name);
			System.out.println(temp.age);
			System.out.println(temp.height);
			System.out.println(temp.gender);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Test_03();

	}

}
