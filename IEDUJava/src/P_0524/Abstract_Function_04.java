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

//아래의 3개의 각각의 클래스를 다형성 구현을 하기위해서는
//이것을 대표하는 상위 클래스가 필요하다
abstract class Shape{
	//이 함수를 만든 목적은 뭔가를 출력하기 위해서가 아니라
	//계층 추적을 하기 위해서 만든 것이다
	//고로 이 함수는 기능이 필요한것은 아니다
	abstract void display();
	//이렇게 만들면 함수는 명시적으로 존재하지만 기능이 없으므로
	//메모리를 차지하지 않게된다!!!!
}

class Sakak041 extends Shape{
	void display(){
		System.out.println("사각형");
	}
}

class Samkak041 extends Shape{
	void display(){
		System.out.println("삼각형");
	}
	
}

class Circle041 extends Shape{
	void display(){
		System.out.println("원");
	}
}