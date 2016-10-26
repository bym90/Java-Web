package P_0523;

public class Polymorphism_02 {
/*
 * ����
 * �����ϰ� ���� �ϳ��� �߻��� ��
 * �� ���ڸ� 3���� ���� �������� 0,1,2�� ������
 * ����ϴ� Ŭ������ �ٸ��� �غ���
 * ��, ������ �Ѱ��� ����϶�
 * �̷����� �츮�� �������̶� �Ѵ�
 * 1.����� ��� Ŭ������ ��ǥ�ϴ� �ֻ��� Ŭ������ �ϳ� �����
 * (�̹��ڹٴ� �̷� Ŭ������ �� ����� ���Ҵ�
 * 2. �ֻ��� Ŭ������ �̿��ؼ� ������ Ŭ������ �� Ŭ������ ��ӹ޾Ƽ� ���鵵�� �Ѵ�
 * ����ȯ�� ������ ���� �۾��� �Ѵ�
 */
	public static void main(String[] args) {
		Shape s = null;
		int num = (int)(Math.random()*(100 - 1 + 1 ) + 1);
		switch(num%3){
		case 0:
			s = new Rect();
			break;
		case 1:
			s = new Triangle();
			break;
		case 2:
			s = new Circle();
			break;
		}
		s.display();

	}

} 

class Shape{
	void display(){
		System.out.println("����");
	}
}


class Rect extends Shape{
	void display(){
		System.out.println("�簢��");
	}
}

class Triangle extends Shape{
	void display(){
		System.out.println("�ﰢ��");
	}
}

class Circle extends Shape{
	void display(){
		System.out.println("��");
	}
}