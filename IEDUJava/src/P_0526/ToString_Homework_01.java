package P_0526;


/*int radius; 변수를 가진 클래스를 제작한다
float area;
new Circle();
new Circle(int r); 두가지 방식으로 new 시킬 수 있는 생성자 함수를 생성

원의 넓이를 계산하는  calcArea()를 제작한다

이 클래스의 정보를 다음과 같이 알려주도록 한다

이 클래스는 면적이 ??인 원을 관리하는 클래스입니다*/

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
		return "면적이" + area + "인 원을 관리하는 클래스입니다";
	}
}


