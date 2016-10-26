package LJY.LJY_BOOK.자바의정석.chapter6;
/*
 * copy메서드는 새로운 객체를 생성한 다음에, 매개변수로 넘겨받은 객체에 저장된 값을 복사해서 반환한다.
 * 반환하는 값이 Data객체의 주소이므로 반환 타입이 Data인 것이다.
 */
public class ReferenceReturnEx_268 {
	static Data3 copy(Data3 d){//반환형이 Data3(객체) 형이기 때문에
		Data3 tmp = new Data3();	//객체를 생성한 후 d.x의 객체를 그대로 참조하도록 복사하였다.
		tmp.x = d.x;

		return tmp;		//복사한 객체의 주소를 반환한다.

	}
	public static void main(String[] args) {
		Data3 d = new Data3();

		d.x=10;

		Data3 d2 = copy(d);
		System.out.println("d.x = "+d.x);
		System.out.println("d2.x = "+d2.x);
	}
}
class Data3 {
	int x;
}