package P_0526;


/*int radius; ������ ���� Ŭ������ �����Ѵ�
float area;
new Circle();
new Circle(int r); �ΰ��� ������� new ��ų �� �ִ� ������ �Լ��� ����

���� ���̸� ����ϴ�  calcArea()�� �����Ѵ�

�� Ŭ������ ������ ������ ���� �˷��ֵ��� �Ѵ�

�� Ŭ������ ������ ??�� ���� �����ϴ� Ŭ�����Դϴ�*/

public class ToString_Homework_01 {

	public static void main(String[] args) {
		
		Circle c = new Circle(10);
		
		c.calcArea(c.radius);
		System.out.println(c.toString());
		
	}

}

class Circle{
	int radius;
	float area;
	
	Circle(){
		
	}
	Circle(int r){
		radius = r;
	}
	void calcArea(int r){
		area = (float)Math.PI*r*r;
		
	}
	
	
	public String toString(){
		return "������" + area + "�� ���� �����ϴ� Ŭ�����Դϴ�";
	}
}

