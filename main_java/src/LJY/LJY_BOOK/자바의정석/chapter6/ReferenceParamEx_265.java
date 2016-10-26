package LJY.LJY_BOOK.자바의정석.chapter6;

public class ReferenceParamEx_265 {
	static void change(Data2 d){
		d.x = 1000;
		System.out.println("change() : x "+d.x );
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data2 d = new Data2();
		d.x = 10;
		System.out.println("main () : x = "+d.x);
		System.out.println(d);

		change(d);

		System.out.println("After change(d)");
		System.out.println("main() : x "+d.x);

	}
}

class Data2{
	int x;
}