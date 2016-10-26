package LJY.LJY_STUDY;

import java.text.DecimalFormat;

public class DecimalFotmatTest {

	public static void main(String[] args) {

		  String a = "1000";
	  String b = "9000000";

	  String korea = Comma_won(a);

	  System.out.println("현재금액은? " + korea + "원 입니다.\n");
	  System.out.println("천 단위 콤마 테스트 중");

	  System.out.println("이번엔 90000을 테스트");
	  System.out.println(Comma_won(b) + "원 입니다.");

	 }

	 public static String Comma_won(String junsu) {
	  int inValues = Integer.parseInt(junsu);
	  DecimalFormat Commas = new DecimalFormat("#,###");
	  String result_int = (String)Commas.format(inValues);
	  return result_int;

	}
}
