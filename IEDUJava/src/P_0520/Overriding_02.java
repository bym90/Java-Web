package P_0520;

public class Overriding_02 {

	public static void main(String[] args) {
		Test013 t = new Test013();
		t.abc();

	}

}


class Test003{
	 void abc(){
		 System.out.println("���� �ƹ����� abc�Լ��̴�");
	 }
}

class Test013 extends Test003{
	/*
	void abc(){
		�� �Լ��� �������̵�
	}
	*/
		
		//�� �Լ��� �������̵��� �ƴϴ�
		//�Ű������� �ٸ��Ƿ� �����ε��̴�. �׷��� ������ �ȳ�
	void abc(int a){
		System.out.println("���� �Ƶ��� abc�Լ��̴�.");
	}
	/*
	int abc(){
		System.out.println("���� �Ƶ��� abc�Լ��̴�");
	}
	//������ �ٸ��� �������̵��� �ƴϴ�
	//�Ű������� �����Ƿ� �����ε��� �ƴϴ�. �׷��� ����
	*/
	
	
}