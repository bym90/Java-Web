package P_0524;

public class Abstract_Function_05 {

	public static void main(String[] args) {
		Grand051 g = new Father051();
		
		//변수를 직접 사용하는 경우는 레퍼런스 쪽 변수를 사용한다.
		//System.out.println(g.a);
		
        //함수를 이용해서 변수를 사용하는 경우에는 
		//실제 함수가 존재하는 곳의 변수를 사용한다
		g.abc();

	}

}

class Grand051{
	int a = 10;
	void abc(){
		System.out.println("할아버지" + a);
	}
}

class Father051 extends Grand051{
	int a = 20;
}

class Son051 extends Father051{
	int a = 30;
	void abc(){
		System.out.println("아들" + a);
	}
}