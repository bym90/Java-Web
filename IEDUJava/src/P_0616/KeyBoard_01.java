package P_0616;

/*
 * 키보드를 이용해서 문자를 입력받아서 출력하자.
 */
import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class KeyBoard_01 {

	public KeyBoard_01() {
		try {
			// 1. 한문자만 읽어서 출력하자.
			   System.out.print("여기에 입력 : ");
//		       int ch = System.in.read();
//			// read는 한 문자만 읽는 함수
//			// 참고 System.in만 다른것으로 사용하면
//			// 다른 외부장치에서 데이터를 읽어들이면
//			// 
//			System.out.println("당신이 입력한 문자 : " + (char) ch);
			
			
			// 2. 여러문자를 동시에 읽어서 출력하자.
			//    입력 받은 결과를 기억할 byte[]을 준비해 놓아야 한다.
//			byte[] buff = new byte[256];
//			// 준비된 배열의 수 만큼만 읽을 수 있다.
//			int len = System.in.read(buff);
//			// 반환값은 실제 입력된 바이트 수가 기억되고
//			// 입력된 내용은 byte[] buff가 기억한다.
//			System.out.println("입력한 길이 = " + len);
//			System.out.println("입력한 내용 = " + new String(buff, 0 , len));
			
			   
			// 3. 동시에 여러문자를 읽어서 출력하자.
			byte[] buff = new byte[256];
			// 이 배열안에 특정 문자로 채워볼 예정이다.
			Arrays.fill(buff, (byte)'Z');
			int len = System.in.read(buff, 10, 246);
			// 준비된 byte[] 중에서 10번방부터 입력받으세요.
			// 246byte만 입력받으세요.
			System.out.println("입력한 길이 = " + len);
			System.out.println("입력한 내용 = " + new String(buff, 0 , len + 10));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new KeyBoard_01();

	}

}
