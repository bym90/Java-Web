package P_0530;

import	java.text.*;
import 	java.util.*;

public class Formalization_02 {

	public static void main(String[] args) {
		Calendar	car = Calendar.getInstance();
		//�۾��� �����ϴٰ� ���� ����� ����� ���°� ��.....
		
		SimpleDateFormat	df = new SimpleDateFormat("YYYY�� MM�� dd�� HH�� mm�� ss��");
		String		result = df.format(car.getTime());
		System.out.println(result);

	}

}