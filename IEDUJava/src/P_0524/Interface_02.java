package P_0524;

public class Interface_02 {

	public static void main(String[] args) {
		//Inter07 in = new Inter07();
		//�������̽��� ������ new��ų�� ����
		Inter07 in = new MyClass07();
		//������ �̿�
		MyClass07 in1 = new MyClass07();
		//�״�� ���
		in.asd();
		
	}

}

interface Inter07{
	void asd();
}

class MyClass07 implements Inter07{
	public void asd(){
		//���������ڰ� �ٴ� �������� �������̵� �� �� ���⶧����
		//public ���������ڸ� ������Ѵ�
		System.out.println("���� �Լ���");
	}
}