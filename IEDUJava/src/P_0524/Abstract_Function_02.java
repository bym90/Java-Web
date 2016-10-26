package P_0524;
/*
 * 사용하는 부품 Runtime
 */
public class Abstract_Function_02 {

	public static void main(String[] args) {
		Runtime run = Runtime.getRuntime();
		
		long max = run.maxMemory();
		
		System.out.println(max);
	}

}
