package P_0531;

import java.util.Arrays;

public class Arrays_01 {

	public static void main(String[] args) {
		int[] temp = new int[10];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = (int)(Math.random()*10);
		}
		
		System.out.println("ó������");
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + "    ");
		}
		System.out.println();
		
		Arrays.sort(temp);
		
		System.out.println("���� ����");
		for(int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + "    "); 
		}
		System.out.println();
		
		System.out.println(Arrays.binarySearch(temp, 5));
		
	}

}

//Arrays Ŭ������ �Լ��� 2~3�� ����