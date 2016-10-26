package P_0523;

public class Instance_Of_01 {

	public static void main(String[] args) {
		Test007 t = new Test017();
		
		if(t instanceof Test027){
			System.out.println("족보에 있다");
		}
		else{
			System.out.println("족보에 없다");
		}

	}

}

class Test007{
	
}

class Test017 extends Test007{
	
}

class Test027 extends Test017{
	
}