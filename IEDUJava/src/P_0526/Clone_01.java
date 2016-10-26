package P_0526;

public class Clone_01 {

	public static void main(String[] args) {
		Test031 t1 = new Test031(5, 10);
		//������ ���� clone()�� protected �Լ��̴�
		//			  �׷��Ƿ� ��� ������������ ����� �� �ִ�
		// 			  ���� �� �Լ��� ����ϴ� Ŭ���� Clone_01�̰�
		//			  �� Ŭ���� Test031 Ŭ�����ʹ� ���谡 ����
		Test031 t2 = null;
		try{
			t2 = (Test031)t1.clone();	
		}
		catch(Exception e) {
		}
		System.out.println(t2.a);
		System.out.println(t2.b);
		
	}

}

//� Ŭ������ clone �Լ��� �����ϱ� ���ؼ� Cloneable�̶�� �������̽��� ��ӹ޾ƾ� ��!

class Test031 implements Cloneable{
	int a, b;

	Test031(){

		a = 0;
		b = 0;
	}

	Test031(int a, int b){
	//���������� ���������� ��������� ��ġ�� �ٸ��Ƿ� ���� �̸��� ������ ���� �� �ִ�
	//�ٸ� ��ó�� ������ ������ �海�Ǹ� ���������� �켱 ����Ѵ�
	//�̷� ��� Ư�� ������ ���� ������ �����ϱ� ���ؼ��� this�� ���
		this.a = a;
		this.b = b;
	}
	
	public Object clone() throws CloneNotSupportedException{
		// �� �Լ��� ���� ���縦 ���ִ� �Լ��ε� �� ����� �ٲٰ� �;
		// �������̵� �ϴ°��� �ƴ϶� ������ ����ϱ� ���ؼ� �������̵� �� ��
		// ������ �������̵��� �� �̻� ����Ŭ������ ����� ���õǹǷ�
		// �����ڰ� ���� ���ϴ� ������ ����� �־�� �� ���̴�
		
		Object temp = super.clone();
		// �׷��� �ƹ����� �������縦 �ؼ� ����� �˷��� ���̴�
		return temp;
		
	}
	
	
}

	// clone �Լ��� ����� �� ���� ������ protected�̱� �����̴�
	// �׷��� ���� �� �Լ��� public�̸� ����� �� ���� ���̴�



