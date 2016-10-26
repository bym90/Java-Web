package P_0524;

public class Abstract_Function_04 {

	public static void main(String[] args) {
		int num =(int)(Math.random()*100);
		Shape s = null;
		switch(num % 3){
		case 1 :
			s = new Sakak041();
			break;
		case 2 :
			s = new Samkak041();
			break;
		case 3:
			s = new Circle041();
			break;
		}
		s.display();
	}

}

//�Ʒ��� 3���� ������ Ŭ������ ������ ������ �ϱ����ؼ���
//�̰��� ��ǥ�ϴ� ���� Ŭ������ �ʿ��ϴ�
abstract class Shape{
	//�� �Լ��� ���� ������ ������ ����ϱ� ���ؼ��� �ƴ϶�
	//���� ������ �ϱ� ���ؼ� ���� ���̴�
	//���� �� �Լ��� ����� �ʿ��Ѱ��� �ƴϴ�
	abstract void display();
	//�̷��� ����� �Լ��� ���������� ���������� ����� �����Ƿ�
	//�޸𸮸� �������� �ʰԵȴ�!!!!
}

class Sakak041 extends Shape{
	void display(){
		System.out.println("�簢��");
	}
}

class Samkak041 extends Shape{
	void display(){
		System.out.println("�ﰢ��");
	}
	
}

class Circle041 extends Shape{
	void display(){
		System.out.println("��");
	}
}