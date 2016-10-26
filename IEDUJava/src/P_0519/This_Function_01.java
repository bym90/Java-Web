package P_0519;
/*
 * 친구의 정보를 관리하는 클래스를 만들어라
 * 
 * 이 클래스를 new시키는 방식
 * 1. 디폴트
 * 2. 이름만 아는 상태
 * 3. 이름과 나이만 아는 상태
 * 4. 이름과 나이, 성별을 아는 상태
 * 5. 이름과 나이, 성별과 전화번호를 아는 상태로 가정하여 만들자
 */
public class This_Function_01 {

	public static void main(String[] args) {
		
	}

}


class Friend{
	String name;
	int age;
	boolean gender;
	String tel;
	
	Friend(){
		this("", 0, true,"");
	}
	
	Friend(String n){
		this(n, 0, true, "");
	}
	
	Friend(String n , int a){
		this(n, a, true, "");
	}

	Friend(String n , int a, boolean g){
		this(n, a, g, "");
	}
	
	Friend(String n , int a, boolean g, String t){
		name = n;
		age = a;
		gender = g;
		tel = t;
	}
	
}




/*
//This 함수 예제
class Test005{
	Test005(){
		System.out.println("출력");
		//this(5); 다른 문장이 먼제 오게되면 에러
		
	}
	Test005(int a){
		this(); //생성
	}
	
	void abc(){
		//this();일반함수에는 쓸 수 없고 생성자함수에만 쓸 수 있다
	}
}
*/