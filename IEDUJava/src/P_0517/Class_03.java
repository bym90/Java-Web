package P_0517;

public class Class_03 {

	public static void main(String[] args) {
//같은 패기지 안에서 같은 이름의 클래스를 만들지 못함
		Test002 t1 = new Test002();
		Test002 t2 = new Test002();
		
		t1.num1 = 100; t1.num2 = 200;
		t2.num1 = 300; t2.num2 = 400;
		t1.calc();
		t1.display();
		t2.calc();
		t2.display();
		
	}
}
class Test002{
	int num1, num2;
	int sum;
	
	void calc(){
		sum = num1 + num2;
	}
	void display(){
		System.out.println("합은 " + sum);
	}
	
}
