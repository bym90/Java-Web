package P_0530;

public class Inner_Class_04 {

	public static void main(String[] args) {
		MyTest03 t = new MyTest03(){
			public String toString(){
				return "내가만든클래스";
			}
		};
		//이 클래스를 출력할 때 클래스의 출력내용을 변경하기 위해서는
		// toString()를 오버라이드하여 기능을 바꿔라
			System.out.println(t);
	}

}

class MyTest03{
	
}

/*class YouTest03 extends MyTest03{
	public String toString(){
		
	}
}*/