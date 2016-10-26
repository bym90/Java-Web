package P_0525;

public class Exception_Throw_03 {

	static void abc() throws Exception{
		lmn();
	}
	
	static void xyz() throws Exception{
		
	}
	
	static void lmn() throws Exception{
		xyz();
	}
	
	
	public static void main(String[] args) {
		try{
		abc();
		}
		catch(Exception e){
			
		}
	}

}

