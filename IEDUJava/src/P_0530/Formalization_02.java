package P_0530;

import	java.text.*;
import 	java.util.*;

public class Formalization_02 {

	public static void main(String[] args) {
		Calendar	car = Calendar.getInstance();
		//작업을 진행하다가 최종 결과를 출력할 상태가 되.....
		
		SimpleDateFormat	df = new SimpleDateFormat("YYYY년 MM월 dd일 HH시 mm분 ss초");
		String		result = df.format(car.getTime());
		System.out.println(result);

	}

}
