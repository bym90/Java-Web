package P_0523;

public class Polymorphism_03 {
	public static void main(String[] args){
		Grand g1 = new GrandSon();
		Father g2 = (Father) g1;
		g2.abc();
		//g1.abc(); �Ҿƹ������� ���ڱ��� ����� �ߴµ�
		//�Ҿƹ����ʿ� ����ϴ� �Լ��� ����
		//g�������� ���������Ͽ� GrandSon���� �����ϸ鼭
		//������ ������ �Լ��� �����Ѵ�
		//���⼭�� Son�� �ִ� �Լ��� ���õȴ�
	}
}

class Grand{
	
}

class Father extends Grand{
	void abc(){
		System.out.println("�Ҿƹ���");
	}
}

class Son extends Father{
	void abc(){
		System.out.println("�Ƶ�");
	}
}

class GrandSon extends Son{
	
}