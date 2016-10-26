package P_0525;

public class Exception_01 {

	public static void main(String[] args) {
		int a = 5;
		int b = 0; //b가 0이라면 오류
		int c = 0;
		//이처럼 데이터가 잘못된 경우라도 정상적으로 작동하도록
		//프로그램 유도해주는것을 예외처리라 한다
		if (b == 0) {
			c=1;
		}
		else{
			c=a/b;
		}
		System.out.println(c);
	}

}
