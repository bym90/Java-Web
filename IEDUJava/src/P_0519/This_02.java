package P_0519;

public class This_02 {

	public static void main(String[] args) {
		Test001 t = new Test001();
		t.setNum(100);
		System.out.println(t.a);

	}
}


class Test001{
	int a;
 
	void setNum(int a){
		/*
		 * ��������� ���������� ���� �̸����� ���� �������
		 * ��������� ��ġ�� �ٸ��� ����
		 * �� �� �� �Լ������� ��� ������ ����� �� �ְ�
		 * 					   ���� ������ ����� �� �ִ�
		 * ������ �ڱ⿡�� ���� ��������� �����Ѵٶ�� ������ ����
		 * ���������� ����ϰ� �ȴ�
		 */
		this.a = a;
		
	}
}