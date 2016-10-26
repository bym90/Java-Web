package LJY.LJY_BOOK.자바의정석.chapter6;


public class PrimitiveParamEx_264 {
	static void change(int x){//기본형 매개변수

		x= 1000;
		System.out.println("change() : x = "+x);
	}

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;

		System.out.println("main() : x = "+d.x);

		change(d.x);

	}
}

class Data{
	int x;
}