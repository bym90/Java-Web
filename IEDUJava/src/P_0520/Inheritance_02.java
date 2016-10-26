package P_0520;

public class Inheritance_02 {

	public static void main(String[] args) {
		
		

		Test001 t = new Test001();
		//이 클래스느 묵시적으로 object 클래스를 상속받아서
		//제작된것
		//그러므로 object 클래스가 가진 기능을 사용 가능
		String name = t.toString();
		System.out.println(name);
		
	}

}


class Test001{

}
		
		
		