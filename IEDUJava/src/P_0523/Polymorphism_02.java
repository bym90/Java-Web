package P_0523;

public class Polymorphism_02 {
/*
 * 문제
 * 랜덤하게 숫자 하나를 발생한 후
 * 그 숫자를 3으로 나눈 나머지가 0,1,2일 때마다
 * 사용하는 클래스를 다르게 해보자
 * 단, 변수는 한개만 사용하라
 * 이런것을 우리는 다형성이라 한다
 * 1.사용할 모든 클래스를 대표하는 최상위 클래스를 하나 만든다
 * (이미자바는 이런 클래스는 다 만들어 놓았다
 * 2. 최상위 클래스를 이용해서 나머지 클래스는 이 클래스를 상속받아서 만들도록 한다
 * 형변환의 원리에 따라 작업을 한다
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
		System.out.println("도형");
	}
}


class Rect extends Shape{
	void display(){
		System.out.println("사각형");
	}
}

class Triangle extends Shape{
	void display(){
		System.out.println("삼각형");
	}
}

class Circle extends Shape{
	void display(){
		System.out.println("원");
	}
}