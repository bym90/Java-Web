package P_0519;

public class Static_01 {

	public static void main(String[] args) {
		//b라는 변수가 이미 static 영역에 있다
		
		Test002.b=20;
		System.out.println("결과는 " + Test002.b);
		
		
		Test002 t1 = new Test002();
		Test002 t2 = new Test002();
		
		t1.a=10;
		t2.a=20;
		System.out.println("T1.A는" + t1.a);
		System.out.println("T2.A는" + t2.a);
		t1.b=30;
		t2.b=40;
		System.out.println("T1.B는" + t1.b);
		System.out.println("T2.B는" + t2.b);
		
		
		
/*		int radius=(int)(Math.random()*(100 - 1 + 1) + 1);
		double area = radius * radius * Math.PI;
		//PI는 Static 변수이기때문에 new가 필요없음
		System.out.println(area);
*/	
		
	}
}

class Test002{
	int a;
	static int b;
}
