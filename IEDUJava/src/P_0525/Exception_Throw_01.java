package P_0525;

import java.io.FileInputStream;

public class Exception_Throw_01 {

	public static void main(String[] args) throws Exception {
		 FileInputStream fin = null;
		 //try{
			fin = new FileInputStream("D:\\javasource\\a.txt");
			//��� �о�� �� ������ �𸣹Ƿ� ���ѷ����� �ݺ��Ѵ�
			while(true){
				//���� ������ ����� �迭�� �غ��ϰ�
				byte[] buff = new byte[256];
				//���Ͽ��� �����͸� �д´�
				int len = fin.read(buff);
				//���� ����� ������ while����
				if(len < 0){
					break;
				}
				//���� ����� String���� �ٲپ ����Ѵ�
				String temp = new String(buff, 0, len);
				System.out.println(temp);
			}
		/* }
		 catch(Exception e){
			 
		 }*/
	}

}