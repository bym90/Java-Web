package P_0524;

public class Abstract_Function_05 {

	public static void main(String[] args) {
		Grand051 g = new Father051();
		
		//������ ���� ����ϴ� ���� ���۷��� �� ������ ����Ѵ�.
		//System.out.println(g.a);
		
        //�Լ��� �̿��ؼ� ������ ����ϴ� ��쿡�� 
		//���� �Լ��� �����ϴ� ���� ������ ����Ѵ�
		g.abc();

	}

}

class Grand051{
	int a = 10;
	void abc(){
		System.out.println("�Ҿƹ���" + a);
	}
}

class Father051 extends Grand051{
	int a = 20;
}

class Son051 extends Father051{
	int a = 30;
	void abc(){
		System.out.println("�Ƶ�" + a);
	}
}