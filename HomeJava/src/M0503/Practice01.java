package M0503;

public class Practice01 {

	public static void main(String[] args) {
		int i=5, j=5;
			System.out.println(i++);
			System.out.println(++j);
			System.out.println("i = " + i + ", j =" + j);
			
	   byte a = 10;
	   byte b = 20;
	   byte c = (byte)(a + b);
	   System.out.println(c);
	   
	   //연습문제2-5 
	   System.out.println("1"+"2");
	   System.out.println(true + "");
	   System.out.println('A'+'B');
	   System.out.println('1'+2);
	   System.out.println('1'+'2');
	   System.out.println('J'+"ava");
	   //오류 System.out.println(true + null);
	}

}
