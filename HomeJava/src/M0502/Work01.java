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
		
		System.out.println("365.2458����");
		System.out.println(year + "��");
		System.out.println(hours + "��");
		System.out.println(minute + "��" );
		System.out.println(seconds + "��");
		System.out.printf("365���� %.1f�� %.1f�� %.1f�� %.1f�� �Դϴ�\n\n", year, hours, minute, seconds);
		//365�� ���
	
		double c = 3.141592;
		double d = c * 1000;
		float intNum = (int)d;
		float result = (float)(intNum/1000);
		 System.out.printf("����� %.3f" ,result);
		//3.141592 3��°¥������ ����

	}

}