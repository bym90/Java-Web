package P_0530;

import java.util.*;
public class Calendar_01 {

	public static void main(String[] args) {
		Calendar car = Calendar.getInstance();
		
		int year = car.get(Calendar.YEAR);
		int month = car.get(Calendar.MONTH) + 1;//���� 1���� 0���� ����
		int day = car.get(Calendar.DATE);
		
		System.out.println(year + "��" + month + "��" + day + "��");
		
	}

}


//���� 531 539���������� �ҽ��� ��� �м��Ͽ� �׾ȿ��� ���� �Լ� ����