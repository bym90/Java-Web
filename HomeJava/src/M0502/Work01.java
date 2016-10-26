package M0502;

public class Work01 {

	public static void main(String[] args) {
		float num=365.2458F;
		float year, hours, minute, seconds, floatnum;
		
		year = (int)num;
		floatnum = (float)(num-year);
		hours = (int)(floatnum * 24);
		floatnum = floatnum * 24 - hours;
		minute = (int)(floatnum * 60);
		floatnum = floatnum * 60 - minute;
		seconds = (int)(floatnum * 60);
		
		System.out.println("365.2458일은");
		System.out.println(year + "일");
		System.out.println(hours + "시");
		System.out.println(minute + "분" );
		System.out.println(seconds + "초");
		System.out.printf("365일은 %.1f일 %.1f시 %.1f분 %.1f초 입니다\n\n", year, hours, minute, seconds);
		//365일 계산
	
		double c = 3.141592;
		double d = c * 1000;
		float intNum = (int)d;
		float result = (float)(intNum/1000);
		 System.out.printf("결과는 %.3f" ,result);
		//3.141592 3번째짜리까지 도출

	}

}
