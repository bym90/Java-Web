package P_0526;

public class String_03 {
/*	static void change(String str){
		str = str +" Gil Dong"; // (3)
		System.out.println(str);
	}*/
	
	static void change(StringBuffer str){ //StringBuffer ����
		str.append(" Gil Dong"); 
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		//String str = "Hong"; // (1)
		StringBuffer str = new StringBuffer("Hong"); //StringBuffer ����
		change(str);		// (2)
		System.out.println(str);
	}

}



//���� StringBuffer�� �Լ� 3~5������ ���� ������� �����ϼ���