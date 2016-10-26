package P_0512;

//import org.omg.Messaging.SyncScopeHelper;

public class Demesion_Array_01 {
/*
 * 5학생의 3과목 점수를 입력하고 출력하라
 * 한 학생 분량이 1차배열이 되는데 배열이 5개 필요하다
 */
	public static void main(String[] args) {
		
		/*
		int[][] score;//배열 전체 관리 변수
		score = new int[5][];//1차배열을 관리할 주소 변수 5개를 만든다
		for(int i=0; i<5; i++){
		score[i]=new int[3];
		}
		*/
		/* 학생 점수 입력
		 * [0][0] 입력
		 * [0][1] 입력
		 * [0][2] 입력
		 * [1][0] 입력
		 * [1][1] 입력
		 * [1][2] 입력
		 * ...
		 * [4][0] 입력
		 * [4][1] 입력
		 * [4][2] 입력
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
 * 5학생의 3과목을 입력한 후 각 학생의 총점과 평균을 구해서 출력하라
 * 총점과 평균을 다른 Haep에 저장하는 이유는 총점은 int 평균은 float으로 형태가 맞지 않기 때문		
 */
		/*
		int[][] score = new int[5][4];
		float[] avg=new float[5];
		for(int i=0; i<score.length; i++){
			for(int j=0; j<score[i].length - 1; j++){//총점을 넣어야하기 때문에
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
			System.out.println("평균 " + avg[i]);
		}
		*/
		
//숙제 1 5학생의 3과목을 입력한 후 각 학생의 과목별 총점을 구해서 출력하라	
		
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
		
		
		
//숙제2 각 학생의 평균 석차까지 구해서 출력하라
		
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
				System.out.print("과목별점수 " + score[i][j]+ "    ");
			}
		
			System.out.print("총점은 " + score[i][3] +"   ");	
			
			System.out.print("평균은 " + avg[i] + "   ");
			
			System.out.print(rank[i] + "등");
			
			System.out.println();
		}
		/*
				
				
		
//숙제3 10사람의 이름,3과목 성적을 입력한 후 총점을 계산하라
//그리고 1등한 사람의 이름을 출력하라	
		
		
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
			
			System.out.print("이름은  " + name[i] + "  " + "과목별 점수  ");
			for(int j=0; j<score[i].length - 1; j++){
				
				System.out.print(score[i][j]+ "   ");
			}
			System.out.println(rank[i] + "등");
			System.out.println();
			if(rank[i]==1){
				System.out.println("1등의 이름은  " + name[i]);
				break;
			}	
		}
		*/
		
	
		
		
/*숙제4   
        **  
		**  
		****
		****			을 배열에 기억하고

		char[][] ch = new char[4][4];
	
	출력할때

		  **
		  **
		****
		****		의 모양으로 출력하라.

	즉, 원래 배열을 90도 회전시킨것이다.
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
