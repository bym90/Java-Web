package P_0603;
/*
 * Properties�� ����ϰ� �ִ� �����͸� ���� �ܺ���ġ�� ����������
 */
import java.util.*;
import java.io.*;
public class Properties_03 {

	public static void main(String[] args) {
		Properties pro = new Properties();
		
		pro.setProperty("name", "A");
		pro.setProperty("age", "27");
		pro.setProperty("address", "seoul");
		pro.setProperty("tel", "010-0000-0000");
		
		FileOutputStream fout = null;
		try{
			fout = new FileOutputStream("src/P_0603/Sample3.xml");
			pro.storeToXML(fout, "Comment A");
		}
		catch(Exception e){
			System.out.println("���� = " + e);
		}
		System.out.println("����Ϸ�");
		

	}

}