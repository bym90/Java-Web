package P_0518;

public class Constructor_02 {

	public static void main(String[] args) {
		//Test061 t = new Test061();
		//Test061 t = new Test061(4);
		Test061 t = new Test061(4, 5);
	}
}

class Test061{
		
	Test061(){
		System.out.println("1腰 持失切");
	}
	Test061(int a){
		System.out.println("2腰 持失切");
	}
	Test061(int a, int b){
		System.out.println("3腰 持失切");
	}
	Test061(float a){
		System.out.println("4腰 持失切");
	}
	Test061(double a){
		System.out.println("5腰 持失切");
	}
	Test061(int a, float b){
		
	}

}
