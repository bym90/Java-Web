package P_0527;
/*
 * ����
 * ���ٿ� 3���� ���ڸ� ������ �̿��ؼ� Ű����� �Է��� ��
 * �Է� 32 42 87 ������ �����Ƿ� String���� �Է� �޾ƾ� �Ѵ�
 * 3���� ���ڸ� ���� ����� ����ϼ���
 */
import java.util.*;
import java.io.*;
import java.util.regex.*;
public class Scanner_02 {

	public static void main(String[] args) {
		/*Scanner scan = new Scanner(System.in);
		String data = null;
		
		System.out.println("�Է��ϼ���");
		data = scan.nextLine();
		
		//�Է¹��� ���ڸ� �������� �߽����� ������ ���ƾ� �Ѵ�
		String[] nums = data.split(" ");
		int[] intNum = new int[3];
		int sum=0;
		for (int i = 0; i < nums.length; i++) {
			intNum[i] = Integer.parseInt(nums[i]);
			sum += intNum[i];
		}
		System.out.println("��� = " + sum);*/
		
		
		
		//����
		Scanner scan = new Scanner(System.in);
		String data = null;
		System.out.println("�Է��ϼ���");
		data = scan.nextLine();
		
		String[] a = new String[data.length()];
	
		int[] intnum = new int[data.length()];
	
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = data.substring(i, i+1);
			
			Pattern p = Pattern.compile("[0-9]");
			
			for (int j = 0; j < a.length; j++) {
				Matcher m = p.matcher(a[i]);
				if (m.matches()) {
					intnum[i] = Integer.parseInt(a[i]);
				}
			}
			
			sum += intnum[i];
		}	
		
		System.out.println("��� = " + sum);
	}

}


//getNumericValue();
//���� ""�ȿ� ���ڷθ� ������ ���ڿ��� �Է��� �� �� �ڸ�����
//���ڸ� ��� ���� ����� ����ϼ���
//�� "12345" 1+2+3+4+5
//format