package P_0523;

public class Polymorphism_01 {

	public static void main(String[] args) {
		//�ƹ����� �Ƶ��� �����ϴ°��� �������
		//Father001 f = new Son001();
		//f.abc();
		
		//���� �̿��ϴ� �ν��Ͻ��� Father�̹Ƿ� �Ƶ��� �ƹ����� �����ϴ°��� �ȵ�
		//Son001 s = (Son001) new Father001();
		//s.abc();
	
		/*Son001  s1 = new Son001();
		Father001 f = s1;
		Son001 s2 = (Son001) f;
		
		s2.abc();*/
	}

}

class Father001{
	void abc(){
		System.out.println("���� �ƹ���");
	}
}

class Son001 extends Father001{
	void xyz(){
		System.out.println("���� �Ƶ�");
	}
	void abc(){
		System.out.println("���� �ƹ���");
	}
}