package P_0519;

public class Static_01 {

	public static void main(String[] args) {
		//b��� ������ �̹� static ������ �ִ�
		
		Test002.b=20;
		System.out.println("����� " + Test002.b);
		
		
		Test002 t1 = new Test002();
		Test002 t2 = new Test002();
		
		t1.a=10;
		t2.a=20;
		System.out.println("T1.A��" + t1.a);
		System.out.println("T2.A��" + t2.a);
		t1.b=30;
		t2.b=40;
		System.out.println("T1.B��" + t1.b);
		System.out.println("T2.B��" + t2.b);
		
		
		
/*		int radius=(int)(Math.random()*(100 - 1 + 1) + 1);
		double area = radius * radius * Math.PI;
		//PI�� Static �����̱⶧���� new�� �ʿ����
		System.out.println(area);
*/	
		
	}
}

class Test002{
	int a;
	static int b;
}