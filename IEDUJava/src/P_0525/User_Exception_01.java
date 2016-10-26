package P_0525;

public class User_Exception_01 {

	public static void main(String[] args) {
		int age;
		age = -10;
		try{
		if(age<0){
			//이 경우는 JVM에게 예외로 인정하라고 부탁하고자 한다
			throw new AgeException();
			//이렇게 하면 JVM은 예외가 발생한 것으로 인정하고 예외처리를 시도한다
		}
		}
		catch(Exception e){
			System.out.println("에러"+ e);
		}
		System.out.println(age);
		
		
		
		
		
	}

}
