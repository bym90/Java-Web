package P_0511;

public class Reference_01 {

	public static void main(String[] args) {
/*
 * 10���� �����͸� ����� �迭�� �����
 * �����ϰ� ���ڸ� ����� �� ����غ���
 */		
		/*
		//�迭�� �ּҷ� �����ؾ� �ϹǷ� �ּҸ� ����� ������ ������
		int[] num;
		//���� ������ �ּҸ� ����ϴ� ������ �Ǹ� �̺����� ������ 4����Ʈ ������ �ȴ�. 
		//byte[] num;�̿��� 4����Ʈ ����
		//Heap�� �ʿ��� ������ ����� �� �ּҸ� �޾ƿ���
		num = new int[10];
		
		//�����ϰ� 10���� �迭�� �����͸� �Է�
		for(int i=0; i<10; i++){
			num[i] = (int)(Math.random()*(100-1+1)+1);
			System.out.println(num[i]);
		}
		*/
		
		
		
/*
 * 10���� �迭 ������ ����� �����ϰ� �Է��� ��
 * ���� ū ���� �˾ƺ���		
 */
		/*
		int[] num = new int[10];
		System.out.println("������ ");
		for(int i=0; i<10; i++){
			num[i] = (int)(Math.random()*(100-1+1)+1);
			System.out.println(num[i]);
		}
		//�ִ밪 ���ϴ� �˰�����
		int max = num[0];
		for(int i=1; i<10; i++){
			if(max < num[i]){
				max = num[i];
			}
		}
		System.out.println("�ִ밪�� " + max);
		*/
		
		
		
/*
 * 5������ ������ �迭�� �Է��� �� ������ ����� ���ϼ���
 */	
		/*
		int subject = 5;
		//�ڹٴ� ���� �Ҵ��� �����ϴ�
		int[] score = new int[subject];
		//�迭�� ũ�⸦ �̿��ؼ� �۾��� �� ��� ���� ���ڷ� �Է����� ����
		//�ּ�.length�� �̿�����
		for(int i=0; i<score.length; i++){
			score[i] = (int)(Math.random()*(100-1+1)+1);		
		}
		int total = 0;
		for(int i=0; i<score.length; i++){
			total = total + score[i];
		}
		float avg = (float)total / score.length;
		
		System.out.println("������ " + total);
		System.out.println("����� " + avg);
		*/
		
		
		
/*
 * 1~45������ ���ڸ� 6�� �߻��ؼ� ����ϵ��� �Ѵ�
 * ��, ����� �ߺ��� ���ڰ� ������ �ȵȴ�
 */
		/*
		int[] lotto = new int[6];//�߻��� ��ȣ�� ����� ����
		int success = 0; //������ Ƚ���� ����� ����
		//�ݺ��ϸ鼭 ���ڸ� �߻�
		//��� �߻��ؾ� �ߺ����� �ʴ� ���ڰ� 6�� ������ �𸥴�
		dasi:
		while(true){
			int temp = (int)(Math.random()*(45-1+1)+1);
			//�� ��ȣ�� ���� �߻���ȣ�� �������� �˾ƺ���
			//������ ��ȣ�� lotto��� �迭�� ���
			for(int i=0; i<success; i++){
				if(temp == lotto[i]){
					//  �̹� �� ��ȣ�� �߻��� ��ȣ�̴�
					//	�� ��ȣ�� ������ �ٽ� ��ȣ�� �߻��� �����Ѵ�
					//	��ȣ�� �ٽ� �߻��ϰ��� �ϸ� while�� �����Ѵ�
					continue dasi;
				}
			}
			lotto[success] = temp;
			success++;
			if(success == 6){
				break;
			}
		}
		for(int i=0; i<lotto.length; i++){
			System.out.println(lotto[i]);
		}
		*/
		
		
		
/*
 * 100���� ���ĺ� �빮�ڸ� �����ϰ� �߻��� ��
 * 'A'�� ��� �߻��ߴ��� �˾ƺ���		
 */	
		    /*
			char[] ch = new char[100];
			int count=0; //�߻�Ƚ���� ����� ����
			for(int i=0; i<ch.length; i++){
				ch[i]=(char)(Math.random()*('Z'-'A'+1)+'A');
				if(ch[i]=='A'){
					count = count + 1;
				}
			}
			System.out.println("�߻� Ƚ���� " + count);
			*/
		
		
		
/*
 * 0~9������ ���ڸ� 100�� �߻��ϸ鼭 �̰��� �����������
 * ������ ���ڰ� �� �� �߻��ߴ��� ����϶�		
 */
		/*
		int[] count = new int[10]; //������ ���ڰ� �߻��� ȸ���� ����� ����
		//count[0]�� 0�� �߻��� Ƚ��
		//count[1]�� 1�� �߻��� Ƚ��
		//...
		//count[9]�� 9�� �߻��� Ƚ��
		//100�� ���ڸ� �߻��ؾ� �Ѵ�
		for(int i=0; i<100; i++){
			int temp = (int)(Math.random()*(9-0+1)+0);
				//Heap�� ���� �޸𸮴� �ڵ� �ʱ�ȭ
				count[temp]++;
		}
		for(int i=0; i<count.length; i++){
			System.out.println(i + "�� �߻� Ƚ���� " + count[i]);
		}
		*/
		
		
		
/*
 * ���ĺ� �빮�ڸ� 100�� �߻��� ��
 * ������ ���ĺ� ���ڰ� ��� �߻��ߴ��� ����϶�		
 */
		/*
		int[] count = new int[26];
		//count[0]���� 'A(65)'�� �߻�Ƚ��
		//count[1]���� 'B(66)'�� �߻�Ƚ��
		//....
		//count[26]���� 'Z'�� �߻�Ƚ��
		for(int i=0; i<100; i++){
			int temp = (int)(Math.random()*('Z'-'A'+1)+'A');
			count[temp-65]++;
		}
		for(int i=0; i<count.length; i++){
			System.out.println((char)(i+65) + "�� �߻� Ƚ���� " + count[i]);
		}
		*/
		

		
/*
 * 10����� ������ �����ϰ� ����� ��
 * �� ����� ������ ���϶�
 * ���� ���ϴ� ����
 * �ڽź��� ū ���ڰ� ��� ���Դ����� ī��Ʈ �� �� ��������� +1�� �ϸ�ȴ�	
 */
		
		/*
		int[] score = new int[10]; //���� ����� �迭
		int[] rank = new int[score.length]; //���� ũ�⸸ŭ ������ ���
		
		for(int i=0; i<score.length; i++){
			score[i]=(int)(Math.random()*(100-1+1)+1);
		}
		
		for(int i=0; i<score.length; i++){
			for(int j=0; j<score.length; j++){
				if(score[i]<score[j]){
					rank[i]++;
				}
			}
			rank[i]++;
		}
		for(int i=0; i<score.length; i++){
			System.out.println(score[i] + "�� " + rank[i] + "��");
		}
		*/
		
		
		/*
		//����
		for(int i=0; i<score.length; i++){
			if(score[6]<score[i]){
				rank[6]++;
			}
		}
		rank[6]++;
		System.out.println(rank[6]);
		//
		*/
		
	
/*
 * 1. ���ĺ� �빮�ڸ� 100�� �߻��� �� ������ ���ڰ� ��� �߻��ߴ����� ����϶�
 * 2. 1���� ����� �̿��ؼ� ������ ���ϼ���
 * 3. 1���� ����� �̿��ؼ� �׷��� ����� �϶�
 * ��  A 5*****
 *   B 7*******
 *   C 10**********
 *   D 2**
 */
		/*
		int[] count = new int[26];
		int[] rank = new int[count.length];
		for(int i=0; i<100; i++){
			int temp=(int)(Math.random()*('Z'-'A'+1)+'A');
			  count[temp-65]++;
		}
		
		for(int i=0; i<count.length; i++){
			for(int j=0; j<count.length; j++){
				if(count[i]<count[j]){
					rank[i]++;
				}
			}
			rank[i]++;
		}
		
		for(int i=0; i<count.length; i++){
			System.out.print((char)(i+65)+"�� �߻�Ƚ���� "+count[i] + " ");
			for(int j=0; j<count[i]; j++){
				System.out.print("*");
			}
			System.out.println(" " + rank[i] + "��");
			
		}
				int result=0;
				for(int i=0; i<count.length; i++){
					result=result+count[i];
				}
				System.out.println(result);
		*/
		
		
		
/*
 * ���ĺ� �빮�ڸ� 10�� �߻��ϼ���
 * ��, ����� �ߺ��� ���ڴ� �߻����� ������
 */
			/*
			char[] num=new char[10];
			int count=0;
			a:
			for(int i=0; i<10; i++){
				int temp=(int)(Math.random()*('Z'-'A'+1)+'A');
					if(temp==num[i]){
						continue a;
					}
					
					num[count]=(char)(temp);
					++count;
					if(count==10){
						break;
					}
			}
			for(int i=0; i<10; i++){
				System.out.println(num[i]);
			}
			*/
			
			
	
			

		
		
		
		
		
		
		
		
		

	}

}