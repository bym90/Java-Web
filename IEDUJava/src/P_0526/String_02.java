package P_0526;

public class String_02 {
	
	public static void main(String[] args) {
		//String str = "";
		StringBuffer str = new StringBuffer();
		Runtime	run = Runtime.getRuntime();
		long		start = run.freeMemory();
		System.out.println("시작전 = " + start);
		for(int i = 0; i < 100000; i++) {
			//str = str + i;
			str.append(i);
		}
		long end = run.freeMemory();
		System.out.println("종료수 = " + end);

	}

}
