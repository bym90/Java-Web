package P_0524;
/*
 * ����ϴ� ��ǰ Runtime
 */
public class Abstract_Function_02 {

	public static void main(String[] args) {
		Runtime run = Runtime.getRuntime();
		
		long max = run.maxMemory();
		
		System.out.println(max);
	}

}