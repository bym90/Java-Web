package P_0524;
/*
 * ���� D:�� �ִ� ������ ����� ������
 * Ȯ���ڰ� exe�ΰ͸� ��� ���
 */
import java.io.*;
public class Interface_03 {

	public static void main(String[] args) {
		File f = new File("D:\\");
		//����� �˾Ƴ��� ���
		String[] list = f.list(new MyFilter08());
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
			
		}
		

	}

}

//JVM�� ����� listing �� �� Ư�� �Լ��� �ѹ��� �ڵ� ȣ���Ѵ�

class MyFilter08 implements FilenameFilter{
	public boolean accept(File dir, String name){
		System.out.println("���");
		if(name.endsWith("exe")){
			return true;
		}
		else{
			return false;
		}
	}
}
