package P_0513;
//�� ���α׷����� ����� ��ǰ�� ��� �Ҽ����� �˷���� �Ѵ�
//import java.util.*;

//�ϳ��� ����� ��� import java.util.Scanner;

public class Scanner_01 {

	public static void main(String[] args) {
		//��ǰ�� ����ϱ� ���ؼ� ������Ʈ�� ����� ���ƾ� �Ѵ�
		/*
		Scanner scan = new Scanner(System.in);
		
		System.out.print("����� ���� ���� = ");
		int kor = scan.nextInt();
		
		System.out.println("����� �Է��� ���� ���� = " + kor);
		*/
		
		
		/*
		String a = "123";
		String b = "456";
		System.out.println(a + b);
		int c = Integer.parseInt(a);
		int d = Integer.parseInt(b);
		System.out.println(c + d);
		*/
		
		
		
		/*
		Scanner	scan = new Scanner(System.in);
		
		String	a, b;
		
		System.out.print("ù��° ���� = ");
		a = scan.nextLine();
		System.out.print("�ι�° ���� = ");
		b = scan.nextLine();
		
		int	hap = Integer.parseInt(a) + Integer.parseInt(b);
		System.out.printf("��� = %5d", hap);
		*/
		
		
		
/*
 * ��ǻ�Ͱ� ���� �ϳ��� ����ϵ��� �ϰ� �� ���ڸ� ���ߴ� ������ ������
 * ��, ���ڰ� �ٸ��� ��Ʈ(�۴�, ũ��)�� �ֵ��� �Ѵ�
 * ��ǻ�Ͱ� ���� �ϳ��� ����ϵ��� �ؾ��Ѵ�
 * 
 * ������� ������ ������� ���� �������
 * 
 * ���� 10�� �õ����� ������ ������ ������ ������ ������ �����Ѵ�
 */
		/*
		Scanner scan = new Scanner(System.in);
		
		int computer = (int)(Math.random()*(100 - 1 + 1) + 1);
		int count = 0;//Ƚ���� ����� ����
		
		//����� ���ļ� �Է��ؾ� ���ڸ� ������ �𸣹Ƿ�
		while(true){
			//Ű���带 �̿��ؼ� ���� ���ڸ� �Է��ϵ��� �Ѵ�
			count++;
			System.out.print("����� ������ ���� = ");
			int guess = scan.nextInt();
				
			//�� ���ڰ� �¾Ҵ��� Ȯ���Ѵ�
				if(computer == guess){
					System.out.println(count + "�� ���� �����Դϴ� ^^");
					break;
				}
				if(count == 10){
					System.out.println("10�� ���� ������ ���ؼ� ������ ����˴ϴ�");
					break;
				}
				//��Ʈ�� �ֵ��� ����
				if(computer > guess){
					System.out.println("UP!!!");
				}
				else{
					System.out.println("DOWN!!!");
				}
	
		}
		*/
		
		
		
/*
 *  5���ڷ� ������ ������ ���ڸ� ����� ��
 *  "12345"
 *  ���ڸ��� ������ ���� ���ϼ���		
 */
		/*
		String str="75196";
		int sum=0;//���� ����� ���
		for(int i=0; i<5; i++){
			char ch =str.charAt(i);
			int num = ch - '0';
			sum = sum + num;
			
		}
		
		System.out.printf("�� ���� %d\n", sum);
		*/
		
		
		
		/*
		int a = 4;
		String result = Integer.toBinaryString(a);
		
		System.out.println(result);
		*/
		
		
		
/*
 * Ư�� ���ڸ� 2������ ǥ���϶�
 * ��, ���� �޸𸮿� �ִ� ������ ����϶� (��ȿ���ڵ� �� ����϶�)
 */
/*
 * ����-��� �̸��� �ִµ� �̸� �տ� *ǥ�� �ٿ��� �ݵ�� 20���ڷ� ���弼��
 * Hong #################Hong�̷���
 * �ϴ� "#"�� 20���� �̸��տ� ���δ�
 * �� �߿��� �ڿ��� 20���� ������ �ȴ�.
 * �տ� ����ڸ� �� �������� ������ �ȴ�.
 */
		int a=4;
		String result = Integer.toBinaryString(a);
		
		String temp = "00000000000000000000000000000000" + result;
		temp = temp.substring(result.length());
		System.out.println("12345678901234567890123456789012");
		System.out.println(temp);
		
		
		
		
		
	}

}