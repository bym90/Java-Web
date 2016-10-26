package P_0525;
import java.io.*;
public class Exception_Cause_01 {
	static void asd(){
		qwe();
	}
	
	static void zxc(){
		int a = 8;
		int b = 0;
		int c = 0;
		try {
			c = a/b;
		} catch (Exception e) {
			//System.out.println(e);
			try{
			FileWriter fout = new FileWriter("D:\\javasource\\¿¡·¯.txt");	
			e.printStackTrace(new PrintWriter(fout));
			fout.flush();
			}
			catch(Exception e1){}
		}
	}
	
	static void  qwe(){
		zxc();
	}
	
	
	public static void main(String[] args) {
		asd();

	}

}
