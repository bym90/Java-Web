package P_0527;
/*
 * Ű������ �̿��ؼ� ��ȭ��ȣ�� �Է¹ް�
 * ��ȭ��ȣ ������ �ùٸ��� �ľ��ϼ���
 */
import java.util.*;
import java.util.regex.*;

public class Scanner_01 {

	public static void main(String[] args) {
		
		
		/*Scanner scan = new Scanner(System.in);
		String tel = null;
		
		
		while(true){
		try{
			System.out.println("���⿡ �Է��ϼ���");
			tel = scan.nextLine();
		}
		catch(Exception e){
			System.out.println("�߸��� ������");
		}
		
		Pattern p = Pattern.compile("[0-9]{3}-[0-9]{3,4}-[0-9]{4}");
		Matcher m = p.matcher(tel);
		
		if(m.matches()){
			System.out.println("�ùٸ� ��ȭ��ȣ");
			break;
		}
		else{
			System.out.println("��ȭ��ȣ�� ����� �Է����ּ���");
		}
		}*/
	
		
	/*while(true){
		Random ran = new Random(1);
		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		for (int i = 0; i < 1; i++) {
			num2 = ran.nextInt(100);
		}
		
	
		
		try{
			System.out.println("�Է��ϼ���");
			num1 = scan.nextInt();
		}
		catch(Exception e){
			System.out.println("���ڸ� �Է��ϼ���");
		}

		
		if (num1 == num2) {
			System.out.println("����");
			break;
		}
		else{
			System.out.println("Ʋ��");
			
			if (num1 > num2) {
				System.out.println("�� ��������");
			}
			else{
				System.out.println("�� ū����");
			}
		}
	}	*/
	
		int num1 = (int)(Math.random()*(9 - 1 + 1) + 1);
		int num2 = (int)(Math.random()*(9 - 1 + 1) + 1);
		
		while(true){
		
		Scanner scan = new Scanner(System.in);
		String data = null;
		
		int gob1 = 0;
		int gob2 = 0;
		
		System.out.println("�Է��ϼ���");
		data = scan.nextLine();
		
		String[] str = data.split("[*]");
		int[] intNum = new int[2];
	
		for (int i = 0; i < str.length; i++) {
			intNum[i] = Integer.parseInt(str[i]);
			
		}
			
		/*gob1 = intNum[0] * intNum[1];
		gob2 = num1 * num2;
		
		if (gob1 == gob2) {
			System.out.println("����");
			break;
		}
		else{
			System.out.println("����");
				
		}*/
		
		
		if(intNum[0]==num1){
			System.out.println("1��° ���ڰ� ����");
			if(intNum[1]==num2){
				System.out.println("2��°�� �¾Ƽ� ����");
				break;
			}
			else{
				System.out.println("2��° ���ڰ� Ʋ��");
				if(intNum[1]>num2){
					System.out.println("�Է��� 2��° ���ڰ� �� ũ��");
				}
				else{
					System.out.println("�Է��� 2��° ���ڰ� �� �۴�");
				}
			}
		}
		else{
			System.out.println("1��° ���ڰ� Ʋ��");
			if (intNum[0]>num1) {
				System.out.println("�Է��� 1��° ���ڰ� �� ũ��");
			}
			else{
				System.out.println("�Է��� 1��° ���ڰ� �� ����");
			}
		}
		
		} 
		System.out.println(num1);
		System.out.println(num2);
		
		
		
		
	}


	

}

//���� �����ϰ� 0~100������ ���ڸ� �߻��� �� 
//����ڰ� ������ ���ߴ� ������ ���弼��

//���� �����ϰ� 2���� ���ڸ� 1~9���̷� �߻��� ��
//������ ����� ���ߴ� ������ ���弼��
//��Ʈ ?*?=�Է�
//		���� Ȥ�� �����̶�� ���