package P_0504;

public class If_Else_03 {

	public static void main(String[] args) {
		/*
		 * ������ ���� 3���� �߻��� ��
		 * ũ�� ������� ����϶�
		 */
		int num1 = (int)(Math.random()*(100+1-1)+1);
		int num2 = (int)(Math.random()*(100+1-1)+1);
		int num3 = (int)(Math.random()*(100+1-1)+1);
		
		int max, cen, min;
		//1�� 2 ��
		if(num1 > num2){
			//3�� 1 ��
			if(num1 > num3){
				max = num1;
				//2�� 3��
				if(num2 > num3){
					cen = num2;
					min = num3;
				}
				else{
					cen = num3;
					min = num2;
				}
			
			}
			//1���� 3�� ū���
			else{
				max = num3;
				cen = num1;
				min = num2;
			}
		}  
		
		
		else{	
			//1���� 2�� ū ��� 2�� 3��
			if(num2 > num3){
				max = num2;
				//2���� 3�� ū���  1�� 3��
				if(num1 > num3){
					cen = num1;
					min = num3;
				}
				else{
					cen = num3;
					min = num1;
				}
			}
			//2���� 3�� ū���
			else{
				max = num3;
				cen = num2;
				min = num1;
			}
			
		}
		System.out.println("ù��° ���ڴ� " + num1 + "  �ι�° ���ڴ� " +  num2 + "  ����° ���ڴ� " + num3);
		System.out.println("�������Ľ�  " + max + "   " + cen + "    " + min);
			
			
	}		
}