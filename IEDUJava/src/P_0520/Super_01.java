package P_0520;

public class Super_01 {

	public static void main(String[] args) {
		Test015 t=new Test015();
		t.xyz();
	}

}


class Test005{
	void abc(){
	 System.out.println("���� �ƹ����� abc �Լ��̴�");
	}
}

class Test015 extends Test005{
	void xyz(){
		System.out.println("���� �Ƶ��� xyz �Լ��̴�");
		//abc(); //abc �Լ��� �������̵� �Ǿ����Ƿ� ���� ���� �Լ��� ����ȴ�
		//�̷� ��쿡 ���� �ѹ��� �ƹ����� abc�� �ʿ��ϴٸ�
		//��ó�� ���� Ŭ������ ����� �ʿ��ϴٸ�
		//���� Ŭ������ ������� �����ָ�ȴ�
		//���۴� ���� �Ѵܰ� �������� ����
		super.abc();
	}
	/*
	void abc(){
		System.out.println("���� �Ƶ��� abc �Լ��̴�");
	}*/
}