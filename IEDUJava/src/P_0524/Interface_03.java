package P_0524;
/*
 * 문제 D:에 있는 파일의 목록을 구하자
 * 확장자가 exe인것만 골라서 출력
 */
import java.io.*;
public class Interface_03 {

	public static void main(String[] args) {
		File f = new File("D:\\");
		//목록을 알아내는 기능
		String[] list = f.list(new MyFilter08());
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
			
		}
		

	}

}

//JVM이 목록을 listing 할 때 특정 함수를 한번씩 자동 호출한다

class MyFilter08 implements FilenameFilter{
	public boolean accept(File dir, String name){
		System.out.println("출력");
		if(name.endsWith("exe")){
			return true;
		}
		else{
			return false;
		}
	}
}

