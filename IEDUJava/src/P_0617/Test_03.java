package P_0617;
/*
 * �տ��� ������ ������ �������.
 */
import java.io.*;
public class Test_03 {

	public Test_03() {
		FileInputStream fin = null;
		ObjectInputStream oin = null;
		//Ŭ������ ���� �� �ִ� ����� �߰��� ������Ʈ��
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