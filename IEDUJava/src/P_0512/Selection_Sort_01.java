package P_0512;

public class Selection_Sort_01 {

	public static void main(String[] args) {
		/*
		int[] num=new int[10];
		for(int i=0; i<num.length; i++){
			num[i]=(int)(Math.random()*100);
		}
		//라운드 반복이 되어야한다
		//라운드는 데이터의 개수 - 1만큼 하면된다.
		for(int i=0; i<num.length-1; i++){
			//각 라운드마다 비교를 위한 반복을 실행
			for(int j=i+1; j<10; j++){
				if(num[i]<num[j]){
					//두 값을 바꿔야된다.
					int temp = num[i];
					num[i]=num[j];
					num[j]=temp;//swapping 알고리즘
				}
			}
	
		}
		for(int i=0; i<num.length; i++){
			System.out.println(num[i]);
		}
		*/
		
		
		
/*
 * 10명 학생의 3과목의 총점의 순위를 구하시오
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
					//전체데이터를 바꾸는것이 아니라 주소를 바꿔 데이터의 순서를 바꾼다
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
