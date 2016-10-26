package P_0525;

public class Try_Catch_01 {

	public static void main(String[] args) {
		int a=5;
		int b=0;
		int c=0;
		try{
			c=a/b;
		}
		catch(Exception e){
			c=1;
		}
		System.out.println(c);
	}
}

