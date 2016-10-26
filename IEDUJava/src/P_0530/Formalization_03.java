package P_0530;

import	java.text.*;
public class Formalization_03 {

	public static void main(String[] args) {
		//원래 데이터
//		double[] limites = {60, 70, 80, 90};
		//대신할 데이터
//		String[] grades = {"D", "C", "B", "A"};
		//format 준비를 위한 데이터는 반드시 오름차순 순서대로 만들어야 한다
		
		
//		ChoiceFormat cf = new ChoiceFormat(limites, grades);
		ChoiceFormat cf = new ChoiceFormat("60#D|70#C|80#B|90#A");

		//	어떤 학생의 점수를 최종적으로 만들자.
		int		score = 85;
		String	grade = cf.format(score);
		
		System.out.println(score + "점 : " + grade);		
	}

}
