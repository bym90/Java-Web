package P_0527;
import java.util.*;
public class Util_01 {

	public static void main(String[] args) {
		Random	rand = new Random(100);
		
		for(int i = 0; i < 10; i++) {
			int	num = rand.nextInt(100);
			System.out.println(num);

		}
		System.out.println();
		for (int i = 0; i < 6; i++) {
			int num2 = rand.nextInt((45 - 1 + 1) + 1);
			System.out.print(num2 + "  ");
			
		}

	}
}

//숙제 이외의 함수 중에서 1~2개 정도만 더 조사하세요