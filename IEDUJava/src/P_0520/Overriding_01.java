package P_0520;

public class Overriding_01 {
	public static void main(String[] args) {
		Test012	t = new Test012();
		t.abc();
		t.xyz();
	}
}

class Test002{
	void abc(){
		System.out.println("���� �ƹ����� abc �Լ��̴�");
	}
}

class Test012 extends Test002{
		//������ �۾��� �� �� �ִ�.
	void xyz(){
		System.out.println("���� �Ƶ��� xyz �Լ��̴�");
		//�ƹ��� Ŭ������ ���� �Լ��� ����� ������ ���� ������ ������ �� �ִ�.
		//�Լ��� �������̵��̶�� �Ѵ�
	}
	
	void abc(){
		System.out.println("���� �Ƶ��� abc �Լ��̴�.");
	}
	
	
}