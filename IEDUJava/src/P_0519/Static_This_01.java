package P_0519;

public class Static_This_01 {
	public static void main(String[] args) {

	}
}

class Test003{
	int a;
	static int b;
	
	void abc(){
		a=20;
		b=10;
	}
	static void xyz(){
		//a=20; static �Լ������� �Ϲ��Լ� ���x
		b=10;
	}
}