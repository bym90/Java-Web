package P_0523;

public class Final_Function_01 {

	public static void main(String[] args) {
		Test001 t = new Test001();
		t.a = 100;
		//t.b = 200; final ������ �����͸� �ٲ��� ���Ѵ�.
		//���� ��� PI�� E

	}

}

class Test001 { //extends String{final Ŭ������ ����� �ȵ�
	int a = 10;
	final int b = 20;
	
	void abc(){
		
	}
	final void xyz(){
		
	}

}

class Test011 extends Test001{
	void abc(){
		
	}
	/*
	void xyz(){
		final �Լ��� �������̵� ��ų �� ���� �Լ�
		���� ��� wait �Լ�
	}
	*/
}