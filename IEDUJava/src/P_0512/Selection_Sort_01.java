package P_0512;

public class Selection_Sort_01 {

	public static void main(String[] args) {
		/*
		int[] num=new int[10];
		for(int i=0; i<num.length; i++){
			num[i]=(int)(Math.random()*100);
		}
		//���� �ݺ��� �Ǿ���Ѵ�
		//����� �������� ���� - 1��ŭ �ϸ�ȴ�.
		for(int i=0; i<num.length-1; i++){
			//�� ���帶�� �񱳸� ���� �ݺ��� ����
			for(int j=i+1; j<10; j++){
				if(num[i]<num[j]){
					//�� ���� �ٲ�ߵȴ�.
					int temp = num[i];
					num[i]=num[j];
					num[j]=temp;//swapping �˰�����
				}
			}
	
		}
		for(int i=0; i<num.length; i++){
			System.out.println(num[i]);
		}
		*/
		
		
		
/*
 * 10�� �л��� 3������ ������ ������ ���Ͻÿ�
 */
		
		int[][] score=new int[10][4];
		
		for(int i=0; i<score.length; i++){
			for(int j=0; j<score[i].length-1; j++){
				score[i][j]=(int)(Math.random()*(100-0+1)+0);
			}
		}
		
		for(int i=0; i<score.length; i++){
			for(int j=0; j<score[i].length-1; j++){
				score[i][3]=score[i][3]+score[i][j];
			}
		}
		
		for(int i=0; i<score.length - 1; i++){
			for(int j=(i + 1); j<score.length; j++){
				if(score[i][3]<score[j][3]){
					int[] temp=score[i];
					score[i]=score[j];
					score[j]=temp;
					//��ü�����͸� �ٲٴ°��� �ƴ϶� �ּҸ� �ٲ� �������� ������ �ٲ۴�
				}
			}	
		}
		
	
		for(int i=0; i<score.length; i++){
			for(int j=0; j<score[i].length; j++){
				System.out.print(score[i][j]+"   ");
			}
			System.out.println();
		}	
		//Arrays.sort(num);
		
		
		
		
		
		
		
		
	}

}