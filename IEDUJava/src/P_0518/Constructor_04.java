package P_0518;

public class Constructor_04 {

	public static void main(String[] args) {
		String str1 = new String();
		
		String str2 = new String("Hong");
		
		char[] temp3 = {'B', 'a', 'e'};
		String str3 = new String(temp3);
		System.out.println(str3);
		
		int[] temp4 = {'B','a','e',' ' ,'Y','o','u','n','g'};
		String str4 = new String(temp4, 4, 5);
		System.out.println(str4);
	}

}
