package P_0531;

import java.util.Arrays;

public class Arrays_01 {

	public static void main(String[] args) {
		int[] temp = new int[10];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = (int)(Math.random()*10);
		}
		
		System.out.println("처음상태");
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + "    ");
		}
		System.out.println();
		
		Arrays.sort(temp);
		
		System.out.println("다음 상태");
		for(int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + "    "); 
		}
		System.out.println();
		
		System.out.println(Arrays.binarySearch(temp, 5));
		
	}

}

//Arrays 클래스의 함수중 2~3개 조사
