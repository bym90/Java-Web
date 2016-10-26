package P_0530;

import java.text.*;

public class Formalization_01 {

	public static void main(String[] args) {
		//	뭔가 처리를 이용해서 아래의 결과가 탄생되었다
		float		a = 33145.1257F;
		//	이것을 출력하고자 한다
		
		DecimalFormat	df = new DecimalFormat("#,###,##0.00");
		String		result = df.format(a);
		
		System.out.println(result);

	}

}
