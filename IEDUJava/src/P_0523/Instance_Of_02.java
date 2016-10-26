package P_0523;

public class Instance_Of_02 {

	public static void main(String[] args) {
			Test008 t1 = new Test008(5);
			Test008 t2 = new Test008(5);
		
			//Test008은 Object에서 상속받은 클래스이므로
			//equals함수 사용가능
			
			if(t1.equals(t2)){
				System.out.println("같은 클래스");
			}
			else{
				System.out.println("다른 클래스");
			}
	}

}

class Test008{
	int num;
	Test008(){}
	Test008(int a){
		num = a;
	}

		//이 안에는 equals함수가 복사되어있는데
		//Object 클래스의 equals 함수의 기능은 주소를 비교하는 기능
		//나는 equals 함수의 기능을 num변수가 같은지를 비교하는 기능
		//으로 바꾸고싶다

		//1.오버라이드
public boolean equals(/*Test008 this*/Object obj){
	//이 함수는 true를 반환하면 같은 클래스이고
	//이 함수가 false를 반환하면 다른 클래스이다
	//이 함수는 테스트하는 곳에서 t1.equals(t2)형식으로 사용
	//this 		 => t1
	//Object obj => t2
	//Object는 원하는 형태로 형 변환해서 사용
	Test008 temp = (Test008) obj; //temp => t2
	
	if(this.num == temp.num){
		return true;
	}
	else{
		return false;
	}
}

}

