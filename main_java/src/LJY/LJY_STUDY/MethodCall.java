package LJY.LJY_STUDY;

public class MethodCall {
	static int a;		//Ŭ����(Static) ����
	int b;		//�ν��Ͻ� �ʵ�
	static void setA(int i){ //Ŭ����(Static) �޼ҵ�
		a = i;
	}

	void setB(int i) { //�ν��Ͻ� �޼ҵ�
		b = i;
	}
	public static void main(String[] args) {
		MethodCall obj1 = new MethodCall();		//��ü ����
		MethodCall obj2 = new MethodCall();		//��ü ����

		setA(10);
		System.out.println("setA :"+a);

		obj1.setA(20);
		System.out.println("setA :"+a);
		System.out.println("setA :"+obj1.a);

//		MethodCall.setb(50);
//		The method setb(int) is undefined for the type MethodCall



		obj1.setB(30);
		obj2.setB(40);
		System.out.println("obj1.setB :"+obj1.b);
		System.out.println("obj2.setB :"+obj1.b);





	}

}