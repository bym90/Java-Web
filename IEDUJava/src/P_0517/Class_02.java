package P_0517;
/*
 * Ŭ������ �ϳ� ����� ����� ����
 * ������ �ϳ��� ���Ͽ� �ϳ��� Ŭ������ ����� ���� ��Ģ�̴�
 * �츮�� ������ �׽�Ʈ�� �����̴ϱ� �ϳ��� ���Ͽ� �������� Ŭ������ �����
 * �׽�Ʈ �غ���
 */
public class Class_02 {

	public static void main(String[] args) {
		Test001 t = new Test001();

		t.num1 = 100;
		t.num2 = 200;

		t.calc();
		t.display();
	}
}


class Test001{
	int num1, num2;
	int sum;
	//��� ������ ���� ��������� �Ѵ�. ���� �ٸ� �Լ������� ���� ��� ����
	void calc(){
		sum = num1 + num2;
	}
	
	void display(){
		System.out.println("���� " + sum);
	}	
}