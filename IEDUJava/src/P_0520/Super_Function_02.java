package P_0520;

public class Super_Function_02 {

	public static void main(String[] args) {
		
	}

}

class Test091 {
	Test091(int a) {
		System.out.println("���� �ƹ����� int �������̴�.");
	}
}


//Test091�� �ʿ��ѵ�
//default �����ڰ� �����Ƿ� ������� ���ϰ� �� �����̴�
//�̷� ��쿡 �ٷ� super()�� ����ϴ� ���̴�
class Test092 extends Test091{
	Test092() {
		super(5);
	}
}