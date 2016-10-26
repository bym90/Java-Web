package P_0524;

public class Interface_01 {

	public static void main(String[] args) {
		System.out.println(Inter.num);
		
		//Inter.num = 200; 

	}

}

interface Inter{
	void asd();//묵시적으로 추상함수가 된다
	abstract void zxc();//명시적으로 밝혀도 상관없다
	
	//coid lma(){} 일반함수 절대 존재 불가
	
	int num = 100; //묵시적으로 public static final 변수
					//일반 변수는 만들지 못함
}