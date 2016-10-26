package P_0603;
/*
 * �տ��� ���� ������ ������ �о Map���� �������
 */
import java.util.*;
import java.io.*;
public class Properties_02 {

	public static void main(String[] args) {
		Properties pro = new Properties();
		//���Ͽ� ����� InputStream�� �����
		FileInputStream fin = null;
		try{
			fin = new FileInputStream("src/P_0603/Sample2.txt");
			pro.load(fin);
		}
		catch(Exception e){
			System.out.println("���� = " + e);
		}
		Set set = pro.entrySet();
		Iterator  iter = set.iterator();
		while(iter.hasNext()){
			Map.Entry temp = (Map.Entry) iter.next();
			System.out.println(temp.getKey() + " : " + temp.getValue());
		}
	}

}