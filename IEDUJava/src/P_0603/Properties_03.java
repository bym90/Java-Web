package P_0603;
/*
 * Properties가 기억하고 있는 데이터를 직접 외부장치로 내보내보자
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
			System.out.println("에러 = " + e);
		}
		System.out.println("저장완료");
		

	}

}
