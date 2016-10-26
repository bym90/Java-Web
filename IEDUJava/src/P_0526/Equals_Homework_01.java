package P_0526;

/*
   int garo, sero, area; 변수를 가진 클래스를 만든다
1) new Sagak()
   new Sagak(int g, int s);의 방식으로 new가 가능하도록 생성자 함수를 구성한다
2) 면적을 계산하는 calcArea() 함수를 만든다
3) 면적이 같으면 같은 클래스로 인정하도록 equals 함수를 오버라이드하세요
*/
public class Equals_Homework_01 {

	public static void main(String[] args) {
		sagak s1 = new sagak(10, 20);
		sagak s2 = new sagak(20, 10);
			
			s1.calcArea(s1.garo, s1.sero);
		
			s2.calcArea(s2.garo, s2.sero);
			
		if (s1.equals(s2)) {
			System.out.println("같다");
		}
		else{
			System.out.println("다르다");
		}

	}

}

class sagak{
	int garo;
	int sero;
	int area;
	
	sagak(){
		
	}
	sagak(int g, int s){
		garo=g;
		sero=s;
	}
	void calcArea(int g, int s){
		area = g * s;
	}
	
	
	public boolean equals(Object obj){
		sagak temp = (sagak) obj;
		
		if(this.area==temp.area){
			return true;
		}
		else{
			return false;
		}
				
				
	}
	
}