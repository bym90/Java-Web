package P_0512;

//import org.omg.Messaging.SyncScopeHelper;

public class Demesion_Array_01 {
/*
 * 5�л��� 3���� ������ �Է��ϰ� ����϶�
 * �� �л� �з��� 1���迭�� �Ǵµ� �迭�� 5�� �ʿ��ϴ�
 */
	public static void main(String[] args) {
		
		/*
		int[][] score;//�迭 ��ü ���� ����
		score = new int[5][];//1���迭�� ������ �ּ� ���� 5���� �����
		for(int i=0; i<5; i++){
		score[i]=new int[3];
		}
		*/
		/* �л� ���� �Է�
		 * [0][0] �Է�
		 * [0][1] �Է�
		 * [0][2] �Է�
		 * [1][0] �Է�
		 * [1][1] �Է�
		 * [1][2] �Է�
		 * ...
		 * [4][0] �Է�
		 * [4][1] �Է�
		 * [4][2] �Է�
		 */
		/*
		for(int i=0; i<5; i++){
			for(int j=0; j<3; j++){
				score[i][j]=(int)(Math.random()*(100-1+1)+1);
			}
		}
		for(int i=0; i<5; i++){
			for(int j=0; j<3; j++){
				System.out.print(score[i][j] + "    ");
			}
			System.out.println();
		}
		*/
		
		
/*
 * 5�л��� 3������ �Է��� �� �� �л��� ������ ����� ���ؼ� ����϶�
 * ������ ����� �ٸ� Haep�� �����ϴ� ������ ������ int ����� float���� ���°� ���� �ʱ� ����		
 */
		/*
		int[][] score = new int[5][4];
		float[] avg=new float[5];
		for(int i=0; i<score.length; i++){
			for(int j=0; j<score[i].length - 1; j++){//������ �־���ϱ� ������
				score[i][j]=(int)(Math.random()*(100-1+1)+1);
			}
			
		}
		for(int i=0; i<score.length; i++){
			for(int j=0; j<(score[i].length-1); j++){
				score[i][3]=score[i][3]+score[i][j];
			}
			avg[i]=score[i][3]/3.0F;
		}
		
		for(int i=0; i<score.length; i++){
			for(int j=0; j<score[i].length; j++){
				System.out.print(score[i][j] + "    ");
			}
			System.out.println("��� " + avg[i]);
		}
		*/
		
//���� 1 5�л��� 3������ �Է��� �� �� �л��� ���� ������ ���ؼ� ����϶�	
		
		/*
		int[][] score=new int[3][6];
		
		for(int i=0; i<score.length; i++){
			for(int j=0; j<(score[i].length - 1); j++){
				score[i][j]=(int)(Math.random()*(100-1+1)+1);
			}
		}
		
		for(int i=0; i<score.length; i++){
			for(int j=0; j<(score[i].length - 1); j++){
				score[i][(score[i].length - 1)]=score[i][(score[i].length - 1)]+score[i][j];
			}
		}
		
		for(int i=0; i<score.length; i++){
			for(int j=0; j<(score[i].length); j++){
				System.out.print(score[i][j] + "      ");
			}
			System.out.println();
		}		
		*/
		
		
		
//����2 �� �л��� ��� �������� ���ؼ� ����϶�
		
		/*
		int[][] score=new int[5][4];
		float[] avg=new float[score.length];
		int[] rank=new int[score.length];
		
		for(int i=0; i<score.length; i++){
			for(int j=0; j<(score[i].length - 1); j++){
				score[i][j]=(int)(Math.random()*(100-1+1)+1);
			}
		}
		
		for(int i=0; i<score.length; i++){
			for(int j=0; j<(score[i].length - 1); j++){
				score[i][(score[i].length - 1)]
						=score[i][(score[i].length - 1)] + score[i][j];
			}
		}
		
		for(int i=0; i<score.length; i++){
			avg[i]=score[i][3]/3.0F;
		}
		
		
		for(int i=0; i<score.length; i++){
			for(int j=0; j<score.length; j++){
				if(avg[i]<avg[j]){
					rank[i]++;
				}
			}
			rank[i]++;
		}
		
		for(int i=0; i<score.length; i++){
			for(int j=0; j<(score[i].length - 1); j++){
				System.out.print("�������� " + score[i][j]+ "    ");
			}
		
			System.out.print("������ " + score[i][3] +"   ");	
			
			System.out.print("����� " + avg[i] + "   ");
			
			System.out.print(rank[i] + "��");
			
			System.out.println();
		}
		/*
				
				
		
//����3 10����� �̸�,3���� ������ �Է��� �� ������ ����϶�
//�׸��� 1���� ����� �̸��� ����϶�	
		
		
		/*
		String[] name=new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
		int[][] score=new int[10][4];
		int[] rank=new int[score.length];
		for(int i=0; i<score.length; i++){
			for(int j=0; j<(score[i].length - 1); j++){
				score[i][j]=(int)(Math.random()*(100 - 1 + 1) + 1);
			}
		}
		
		for(int i=0; i<score.length; i++){
			for(int j=0; j<(score[i].length - 1); j++){
				score[i][(score[i].length - 1)]=score[i][(score[i].length - 1)] + score[i][j];
			}
		}
		
		for(int i=0; i<score.length; i++){
			for(int j=0; j<score.length; j++){
					if(score[i][(score[i].length - 1)]<score[j][(score[i].length - 1)]){
						rank[i]++;
					}
				}
				rank[i]++;
		}
		
		for(int i=0; i<score.length; i++){
			
			System.out.print("�̸���  " + name[i] + "  " + "���� ����  ");
			for(int j=0; j<score[i].length - 1; j++){
				
				System.out.print(score[i][j]+ "   ");
			}
			System.out.println(rank[i] + "��");
			System.out.println();
			if(rank[i]==1){
				System.out.println("1���� �̸���  " + name[i]);
				break;
			}	
		}
		*/
		
	
		
		
/*����4   
        **  
		**  
		****
		****			�� �迭�� ����ϰ�

		char[][] ch = new char[4][4];
	
	����Ҷ�

		  **
		  **
		****
		****		�� ������� ����϶�.

	��, ���� �迭�� 90�� ȸ����Ų���̴�.
*/
				
		char[][] ch = new char[4][4];
		
		for(int i=0; i<ch.length; i++){
			for(int j=0; j<ch[i].length; j++){
				if((j==2 || j==3) && (i==0 || i==1)){
					ch[i][j]=' ';	
				}
				else{
					ch[i][j]='*';
				}
			}
		}
		
		for(int i=0; i<ch.length; i++){
			for(int j=0; j<ch[i].length; j++){
			System.out.print(ch[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=(ch.length - 1); i>=0; i--){
			for(int j=(ch[i].length - 1); j>=0; j--){
				System.out.print(ch[i][j]);
			}
			System.out.println();
		}	
		
		
		
	}

}