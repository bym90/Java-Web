package LJY.LJY_STUDY;

import java.text.DecimalFormat;

public class DecimalFotmatTest {

	public static void main(String[] args) {

		  String a = "1000";
	  String b = "9000000";

	  String korea = Comma_won(a);

	  System.out.println("����ݾ���? " + korea + "�� �Դϴ�.\n");
	  System.out.println("õ ���� �޸� �׽�Ʈ ��");

	  System.out.println("�̹��� 90000�� �׽�Ʈ");
	  System.out.println(Comma_won(b) + "�� �Դϴ�.");

	 }

	 public static String Comma_won(String junsu) {
	  int inValues = Integer.parseInt(junsu);
	  DecimalFormat Commas = new DecimalFormat("#,###");
	  String result_int = (String)Commas.format(inValues);
	  return result_int;

	}
}