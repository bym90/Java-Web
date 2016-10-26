package P_0530;

public class Calendar_06 {

	public static void main(String[] args) {
		String data1 = "201508";
		String data2 = "201405";
		
		int month1 = Integer.parseInt(data1.substring(0, 4))*12
				+ Integer.parseInt(data1.substring(4));
		int month2 = Integer.parseInt(data2.substring(0, 4))*12
				+ Integer.parseInt(data2.substring(4));
		
		System.out.println(Math.abs(month1 - month2));

	}

}

