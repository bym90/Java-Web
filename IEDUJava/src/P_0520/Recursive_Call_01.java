package P_0520;

public class Recursive_Call_01 {

	public static void main(String[] args) {
		int result = factorial(5);
		System.out.println(result);

	}

	
	
	static int factorial(int n){
		int result=0;
		
		if (n==1) {
			result = 1;
		}
		else {
			result = n * factorial(n-1);
		}
		return result;
		
		
		
	}
	
}

