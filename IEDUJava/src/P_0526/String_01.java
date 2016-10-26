package P_0526;

public class String_01 {

	public static void main(String[] args) {
		String str1 = "bae"; //리터럴풀에 저장되므로 같다
		String str2 = "bae";
		//String str1 = new String("bae"); 힙에 저장되므로 다르다
		//String str2 = new String("bae");
		
		if(str1 == str2){
			System.out.println("같다");
		}
		else{
			System.out.println("다르다");
		}
		
		
	}

}
