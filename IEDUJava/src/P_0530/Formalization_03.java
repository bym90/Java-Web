package P_0530;

import	java.text.*;
public class Formalization_03 {

	public static void main(String[] args) {
		//���� ������
//		double[] limites = {60, 70, 80, 90};
		//����� ������
//		String[] grades = {"D", "C", "B", "A"};
		//format �غ� ���� �����ʹ� �ݵ�� �������� ������� ������ �Ѵ�
		
		
//		ChoiceFormat cf = new ChoiceFormat(limites, grades);
		ChoiceFormat cf = new ChoiceFormat("60#D|70#C|80#B|90#A");

		//	� �л��� ������ ���������� ������.
		int		score = 85;
		String	grade = cf.format(score);
		
		System.out.println(score + "�� : " + grade);		
	}

}