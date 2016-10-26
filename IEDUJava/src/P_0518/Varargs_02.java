package P_0518;

public class Varargs_02 {

	public static void main(String[] args) {
		String[] strArr = {"100", "200", "300"};
		
		System.out.println(Varargs("", "100", "200", "300"));
		System.out.println(Varargs("-", strArr));
		System.out.println(Varargs(",", new String[]{"1", "2", "3"}));
		System.out.println("[" + Varargs(",", new String[0]) + "]");
		System.out.println("[" + Varargs(",") + "]");
	
	}



static String Varargs(String delim, String... args){
	String result="";
	
	for (String str : args) {
		result += str + delim;
	}
	return result;
}
	
}