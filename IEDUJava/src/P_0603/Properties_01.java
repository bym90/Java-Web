package P_0603;
/*
 * 일단 Properties가 Map이라는것을 증명하자
 */
import java.util.*;
public class Properties_01 {

	public static void main(String[] args) {
		Properties pro = new Properties();
		
		pro.setProperty("이름", "홍길동");
		pro.getProperty("나이", "27");
		
		String name = pro.getProperty("이름");
		System.out.println(name);
		
	}

}
