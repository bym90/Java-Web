package P_0526;

public class Equals_01 {

	public static void main(String[] args) {
		Test011 t1 = new Test011(10);
		Test011 t2 = new Test011(10);
		
		if(t1.equals(t2)){ //��������� �ּҸ� ���ϴ� ���
			System.out.println("���� Ŭ�����̴�");
		}
		else{
			System.out.println("�ٸ� Ŭ�����̴�");
		}
	}

}
class Test011{
	int num;
	Test011(){ // new Test011()
		num=0;
	}
	Test011(int n){	 // new Test011(5)
		num=n;
	}
	public boolean equals(Object obj){
		// �� �Լ��� ��ȯ���� boolean�ε� ���ؼ� ���� Ŭ�����̸� true�� ��ȯ
		// �ٸ� Ŭ�����̸� false ��ȯ
		
		// �񱳸� �Ϸ��� ������Ʈ�� �ΰ� �־�� �Ѵ�
		
		// �ϳ��� �Ű������� obj�� ��ﰡ�� ���� Ȯ���ϴ�
		
		// �� �Լ��� ����ϴ� ���忡�� ���캸��
		// t1.equals(t2)�� ������� ����� ���̴�
		
		// ����Լ��� ȣ���ϴ� �ּҴ� this�� ����Ѵ�
		// �׷��Ƿ� this�� �ٸ� ������Ʈ(t1)�� ���� ���̴�
		// �׷��Ƿ� �Ű������� obj�ȿ��� t2�� ���� ���̴�
		
		// ������ ������ ���ؼ� ���۷����� �Լ��� �����ؾ��Ѵ�
		// obj�� Object�̹Ƿ� Object�ȿ� ���� �ʿ��� ������ �Լ��� �־�� �Ѵ�
		// ������ġ�� ���ϴ� ���� ������ ������ ���� => �������������� ���ؼ�
		// ���������� ���� �����Ƿ� ���� ��ġ(���۷���)�� �ٲ��־�� �Ѵ�
		
		Test011 temp = (Test011) obj;
		// ������ ������ ����
		// ���� �� Ŭ�������� num������ ���� ������ ���ϰ� �ʹ�
		if(this.num == temp.num){
			return true;
		}
		else{
			return false;
		}
		
		
		
	}
}


