package P_0524;

public class Interface_01 {

	public static void main(String[] args) {
		System.out.println(Inter.num);
		
		//Inter.num = 200; 

	}

}

interface Inter{
	void asd();//���������� �߻��Լ��� �ȴ�
	abstract void zxc();//���������� ������ �������
	
	//coid lma(){} �Ϲ��Լ� ���� ���� �Ұ�
	
	int num = 100; //���������� public static final ����
					//�Ϲ� ������ ������ ����
}