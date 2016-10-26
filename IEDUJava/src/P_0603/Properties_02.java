package P_0603;
/*
 * 앞에서 만든 파일의 내용을 읽어서 Map으로 기억하자
 */
import java.util.*;
import java.io.*;
public class Properties_02 {

	public static void main(String[] args) {
		Properties pro = new Properties();
		//파일에 연결된 InputStream을 만든다
		FileInputStream fin = null;
		try{
			fin = new FileInputStream("src/P_0603/Sample2.txt");
			pro.load(fin);
		}
		catch(Exception e){
			System.out.println("에러 = " + e);
		}
		Set set = pro.entrySet();
		Iterator  iter = set.iterator();
		while(iter.hasNext()){
			Map.Entry temp = (Map.Entry) iter.next();
			System.out.println(temp.getKey() + " : " + temp.getValue());
		}
	}

}
