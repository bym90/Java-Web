package P_0524;

public class Abstract_Function_03 {

	public static void main(String[] args) {
		//	�߻� Ŭ������ ������ new �� �� ����.
		//  Test031	t = new Test031();
		//	new ��ų���� ����ڰ� ���� Ŭ������ �̿��ؼ� new ��Ų��.
		Test032	t = new Test032();
	}

}


abstract class Test031 {
	void abc() {
		
	}
	abstract void xyz();
}

class Test032 extends Test031 {
	void xyz() {
		//	����� ����� �־��.
	}
}