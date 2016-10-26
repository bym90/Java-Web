package P_0520;

import java.net.StandardSocketOptions;

public class Constructor_Call_01 {

	public static void main(String[] args) {
		//Test014 t = new Test014();
			Test024 t=new Test024(6);
			
	}

}

class Test004{
	Test004(){
		System.out.println("나는 아버지의 default 생성자 함수");
	}
	Test004(int a){
		System.out.println("나는 아버지 생성자 함수");
	}
}


class Test024 extends Test004{
	Test024(int a){
		//이 클래스는 명시적으로 상속을 받은 클래스이고
		//아들 생성자 함수가 실행되기 전에
		//아버지 생성자 함수가 실행되어지는
		//아버지 생성자 함수는 오직 default 생성자만 실행할 수 있다
		//아버지쪽에 dafault가 없어서 에러
		System.out.println("나는 아들 int 생성자 함수");
	}
}



/*
class Test014 extends Test004{
	Test014(){
		System.out.println("나는 아들 생성자 함수");
	}
}
*/