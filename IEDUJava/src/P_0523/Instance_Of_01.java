package P_0523;

public class Instance_Of_01 {

	public static void main(String[] args) {
		Test007 t = new Test017();
		
		if(t instanceof Test027){
			System.out.println("������ �ִ�");
		}
		else{
			System.out.println("������ ����");
		}

	}

}

class Test007{
	
}

class Test017 extends Test007{
	
}

class Test027 extends Test017{
	
}