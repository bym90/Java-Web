package M0503;

public class Practice04 {

	public static void main(String[] args) {
		//�������� 3-5
		int num = 333;
		System.out.println(num/10*10+1);
		
		//�������� 3-6
		int num2 = 24;
		System.out.println(num2/10*10+10-num2);
		
		int num3 = 50;
		System.out.println(10 - num3%10);
		
		//�������� 3-7
		int fahrenheit = 100;
		float celcius = (int)((5/9f * (fahrenheit - 32)) * 100 + 0.5) / 100f;
		System.out.println("ȭ�� :" + fahrenheit);
		System.out.println("���� :" + celcius);
		
		//�������� 3-8
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a + b);
		
		char ch = 'A';
		ch = (char)(ch+2);
		
		float f = 3/2f;
		long l = 3000 * 3000 * 3000L;
		
		float f2 = 0.1f;
		double d = 0.1d;
		//���� �߾ȵǳ�
		boolean result = (float)d == f2;
		
		System.out.println("c = "+c);
		System.out.println("ch = "+ch);
		System.out.println("f = "+f);
		System.out.println("l = "+l);
		System.out.println(f2);
		System.out.println(d);
		System.out.println("result = "+result);
		
	}

}