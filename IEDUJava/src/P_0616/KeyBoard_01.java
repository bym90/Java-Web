package P_0616;

/*
 * Ű���带 �̿��ؼ� ���ڸ� �Է¹޾Ƽ� �������.
 */
import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class KeyBoard_01 {

	public KeyBoard_01() {
		try {
			// 1. �ѹ��ڸ� �о �������.
			   System.out.print("���⿡ �Է� : ");
//		       int ch = System.in.read();
//			// read�� �� ���ڸ� �д� �Լ�
//			// ���� System.in�� �ٸ������� ����ϸ�
//			// �ٸ� �ܺ���ġ���� �����͸� �о���̸�
//			// 
//			System.out.println("����� �Է��� ���� : " + (char) ch);
			
			
			// 2. �������ڸ� ���ÿ� �о �������.
			//    �Է� ���� ����� ����� byte[]�� �غ��� ���ƾ� �Ѵ�.
//			byte[] buff = new byte[256];
//			// �غ�� �迭�� �� ��ŭ�� ���� �� �ִ�.
//			int len = System.in.read(buff);
//			// ��ȯ���� ���� �Էµ� ����Ʈ ���� ���ǰ�
//			// �Էµ� ������ byte[] buff�� ����Ѵ�.
//			System.out.println("�Է��� ���� = " + len);
//			System.out.println("�Է��� ���� = " + new String(buff, 0 , len));
			
			   
			// 3. ���ÿ� �������ڸ� �о �������.
			byte[] buff = new byte[256];
			// �� �迭�ȿ� Ư�� ���ڷ� ä���� �����̴�.
			Arrays.fill(buff, (byte)'Z');
			int len = System.in.read(buff, 10, 246);
			// �غ�� byte[] �߿��� 10������� �Է¹�������.
			// 246byte�� �Է¹�������.
			System.out.println("�Է��� ���� = " + len);
			System.out.println("�Է��� ���� = " + new String(buff, 0 , len + 10));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new KeyBoard_01();

	}

}