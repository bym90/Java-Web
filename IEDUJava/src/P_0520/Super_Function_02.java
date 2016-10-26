package P_0520;

public class Super_Function_02 {

	public static void main(String[] args) {
		
	}

}

class Test091 {
	Test091(int a) {
		System.out.println("나는 아버지의 int 생성자이다.");
	}
}


//Test091이 필요한데
//default 생성자가 없으므로 사용하지 못하게 된 상태이다
//이런 경우에 바로 super()를 사용하는 것이다
class Test092 extends Test091{
	Test092() {
		super(5);
	}
}