package P_0520;

public class Super_02 {
	public static void main(String[] args) {
		Test073 t = new Test073();
		t.xyz();
	}
}

class Test071 {
	void abc() {
		System.out.println("���� �Ҿƹ���");
	}
}
class Test072 extends Test071 {
	void abc() {
		System.out.println("���� �ƹ���");
	}
}
class Test073 extends Test072 {
	void xyz() {
		super.abc();// �ƹ��������� ����� �� ������
		 //	�Ҿƹ��������� ���Ұ�
		 // super.super.abc(); �Ұ�
		 // super�� ���� �Ѵܰ� ���������� ��Ī
	}
	void abc() {
		System.out.println("���� �Ƶ�");
	}
}
