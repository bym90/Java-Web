package P_0513;

public class Bit_01 {

	public static void main(String[] args) {
		
		/*
		int a = 10;
		int b = 7;
		
		int c = a & b;
		System.out.println(c);
		
		int d =a | b;
		System.out.println(d);
		
		int e = a >> 2;
		System.out.println(e);
		
		int f = a << 2;
		System.out.println(f);	
		*/
		
		
		
/*
 * 난수를 발생하고 난수가 10의 배수이면 멈추도록 한다		
 */
			int num=(int)(Math.random()*101);
			System.out.println(num);
			
			if(num % 10 == 0){
				System.exit(0);
			}
			System.out.println(num);
			
		
		
		
		
	}

}
