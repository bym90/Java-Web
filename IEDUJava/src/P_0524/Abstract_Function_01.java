package P_0524;
import java.util.*;
public class Abstract_Function_01 {
	public static void main(String[] args){
		//Calendar c = new Calendar();
		//추상 클래스는 스스로 new 될 수 없다
		
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		//월은 1월을 0부터 카운트 한다
		int month = c.get(Calendar.MONTH) + 1;
		int day = c.get(Calendar.DATE);
		
		System.out.println(year + "년" + month + "월" + day + "일");
		
	}
	
	
}
