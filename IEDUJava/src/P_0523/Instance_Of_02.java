package P_0523;

public class Instance_Of_02 {

	public static void main(String[] args) {
			Test008 t1 = new Test008(5);
			Test008 t2 = new Test008(5);
		
			//Test008�� Object���� ��ӹ��� Ŭ�����̹Ƿ�
			//equals�Լ� ��밡��
			
			if(t1.equals(t2)){
				System.out.println("���� Ŭ����");
			}
			else{
				System.out.println("�ٸ� Ŭ����");
			}
	}

}

class Test008{
	int num;
	Test008(){}
	Test008(int a){
		num = a;
	}

		//�� �ȿ��� equals�Լ��� ����Ǿ��ִµ�
		//Object Ŭ������ equals �Լ��� ����� �ּҸ� ���ϴ� ���
		//���� equals �Լ��� ����� num������ �������� ���ϴ� ���
		//���� �ٲٰ��ʹ�

		//1.�������̵�
public boolean equals(/*Test008 this*/Object obj){
	//�� �Լ��� true�� ��ȯ�ϸ� ���� Ŭ�����̰�
	//�� �Լ��� false�� ��ȯ�ϸ� �ٸ� Ŭ�����̴�
	//�� �Լ��� �׽�Ʈ�ϴ� ������ t1.equals(t2)�������� ���
	//this 		 => t1
	//Object obj => t2
	//Object�� ���ϴ� ���·� �� ��ȯ�ؼ� ���
	Test008 temp = (Test008) obj; //temp => t2
	
	if(this.num == temp.num){
		return true;
	}
	else{
		return false;
	}
}

}
