package P_0530;

import java.text.*;

public class Formalization_01 {

	public static void main(String[] args) {
		//	���� ó���� �̿��ؼ� �Ʒ��� ����� ź���Ǿ���
		float		a = 33145.1257F;
		//	�̰��� ����ϰ��� �Ѵ�
		
		DecimalFormat	df = new DecimalFormat("#,###,##0.00");
		String		result = df.format(a);
		
		System.out.println(result);

	}

}