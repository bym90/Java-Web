package P_0520;

import java.net.StandardSocketOptions;

public class Constructor_Call_01 {

	public static void main(String[] args) {
		//Test014 t = new Test014();
			Test024 t=new Test024(6);
			
	}

}

class Test004{
	Test004(){
		System.out.println("���� �ƹ����� default ������ �Լ�");
	}
	Test004(int a){
		System.out.println("���� �ƹ��� ������ �Լ�");
	}
}


class Test024 extends Test004{
	Test024(int a){
		//�� Ŭ������ ���������� ����� ���� Ŭ�����̰�
		//�Ƶ� ������ �Լ��� ����Ǳ� ����
		//�ƹ��� ������ �Լ��� ����Ǿ�����
		//�ƹ��� ������ �Լ��� ���� default �����ڸ� ������ �� �ִ�
		//�ƹ����ʿ� dafault�� ��� ����
		System.out.println("���� �Ƶ� int ������ �Լ�");
	}
}



/*
class Test014 extends Test004{
	Test014(){
		System.out.println("���� �Ƶ� ������ �Լ�");
	}
}
*/