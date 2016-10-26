package P_0526;

public class String_03 {
/*	static void change(String str){
		str = str +" Gil Dong"; // (3)
		System.out.println(str);
	}*/
	
	static void change(StringBuffer str){ //StringBuffer 설명
		str.append(" Gil Dong"); 
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		//String str = "Hong"; // (1)
		StringBuffer str = new StringBuffer("Hong"); //StringBuffer 설명
		change(str);		// (2)
		System.out.println(str);
	}

}



//숙제 StringBuffer의 함수 3~5정도를 같은 방식으로 조사하세요