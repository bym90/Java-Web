package P_0525;

import java.io.FileInputStream;

public class Exception_Throw_01 {

	public static void main(String[] args) throws Exception {
		 FileInputStream fin = null;
		 //try{
			fin = new FileInputStream("D:\\javasource\\a.txt");
			//몇번 읽어야 다 읽을지 모르므로 무한루프를 반복한다
			while(true){
				//읽은 내용을 기억할 배열을 준비하고
				byte[] buff = new byte[256];
				//파일에서 데이터를 읽는다
				int len = fin.read(buff);
				//읽은 결과가 없으면 while종료
				if(len < 0){
					break;
				}
				//읽은 결과를 String으로 바꾸어서 출력한다
				String temp = new String(buff, 0, len);
				System.out.println(temp);
			}
		/* }
		 catch(Exception e){
			 
		 }*/
	}

}
