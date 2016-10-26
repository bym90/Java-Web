package P_0511;

public class Reference_01 {

	public static void main(String[] args) {
/*
 * 10개의 데이터를 기억할 배열을 만들고
 * 랜덤하게 숫자를 기억한 후 출력해보자
 */		
		/*
		//배열은 주소로 관리해야 하므로 주소를 기억할 변수를 만들자
		int[] num;
		//참고 변수가 주소를 기억하는 변수가 되면 이변수는 무조건 4바이트 변수가 된다. 
		//byte[] num;이여도 4바이트 변수
		//Heap에 필요한 공간을 만들고 그 주소를 받아오자
		num = new int[10];
		
		//랜덤하게 10개의 배열에 데이터를 입력
		for(int i=0; i<10; i++){
			num[i] = (int)(Math.random()*(100-1+1)+1);
			System.out.println(num[i]);
		}
		*/
		
		
		
/*
 * 10개의 배열 공간을 만들고 랜덤하게 입력한 후
 * 가장 큰 수를 알아보자		
 */
		/*
		int[] num = new int[10];
		System.out.println("난수는 ");
		for(int i=0; i<10; i++){
			num[i] = (int)(Math.random()*(100-1+1)+1);
			System.out.println(num[i]);
		}
		//최대값 구하는 알고리즘
		int max = num[0];
		for(int i=1; i<10; i++){
			if(max < num[i]){
				max = num[i];
			}
		}
		System.out.println("최대값은 " + max);
		*/
		
		
		
/*
 * 5과목의 점수를 배열로 입력한 후 총점과 평균을 구하세요
 */	
		/*
		int subject = 5;
		//자바는 동적 할당이 가능하다
		int[] score = new int[subject];
		//배열의 크기를 이용해서 작업을 할 경우 직접 숫자로 입력하지 말고
		//주소.length를 이용하자
		for(int i=0; i<score.length; i++){
			score[i] = (int)(Math.random()*(100-1+1)+1);		
		}
		int total = 0;
		for(int i=0; i<score.length; i++){
			total = total + score[i];
		}
		float avg = (float)total / score.length;
		
		System.out.println("총점은 " + total);
		System.out.println("평균은 " + avg);
		*/
		
		
		
/*
 * 1~45까지의 숫자를 6번 발생해서 기억하도록 한다
 * 단, 절대로 중복된 숫자가 나오면 안된다
 */
		/*
		int[] lotto = new int[6];//발생한 번호를 기억할 변수
		int success = 0; //성공한 횟수를 기억할 변수
		//반복하면서 숫자를 발생
		//몇번 발생해야 중복되지 않는 숫자가 6번 나올지 모른다
		dasi:
		while(true){
			int temp = (int)(Math.random()*(45-1+1)+1);
			//이 번호가 기존 발생번호롸 동일한지 알아보자
			//성공한 번호는 lotto라는 배열에 기억
			for(int i=0; i<success; i++){
				if(temp == lotto[i]){
					//  이미 이 번호는 발생된 번호이다
					//	이 번호는 버리고 다시 번호를 발생해 봐야한다
					//	번호를 다시 발생하고자 하면 while로 가야한다
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
 * 100개의 알파벳 대문자를 랜덤하게 발생한 후
 * 'A'가 몇번 발생했는지 알아보자		
 */	
		    /*
			char[] ch = new char[100];
			int count=0; //발생횟수를 기억할 변수
			for(int i=0; i<ch.length; i++){
				ch[i]=(char)(Math.random()*('Z'-'A'+1)+'A');
				if(ch[i]=='A'){
					count = count + 1;
				}
			}
			System.out.println("발생 횟수는 " + count);
			*/
		
		
		
/*
 * 0~9까지의 숫자를 100번 발생하면서 이것은 기억하지말고
 * 각가의 숫자가 몇 번 발생했는지 출력하라		
 */
		/*
		int[] count = new int[10]; //각각의 숫자가 발생된 회수를 기억할 변수
		//count[0]은 0이 발생된 횟수
		//count[1]은 1이 발생된 횟수
		//...
		//count[9]은 9이 발생된 횟수
		//100번 숫자를 발생해야 한다
		for(int i=0; i<100; i++){
			int temp = (int)(Math.random()*(9-0+1)+0);
				//Heap에 만든 메모리는 자동 초기화
				count[temp]++;
		}
		for(int i=0; i<count.length; i++){
			System.out.println(i + "의 발생 횟수는 " + count[i]);
		}
		*/
		
		
		
/*
 * 알파벳 대문자를 100번 발생한 후
 * 각각의 알파벳 문자가 몇번 발생했는지 출력하라		
 */
		/*
		int[] count = new int[26];
		//count[0]에는 'A(65)'의 발생횟수
		//count[1]에는 'B(66)'의 발생횟수
		//....
		//count[26]에는 'Z'의 발생횟수
		for(int i=0; i<100; i++){
			int temp = (int)(Math.random()*('Z'-'A'+1)+'A');
			count[temp-65]++;
		}
		for(int i=0; i<count.length; i++){
			System.out.println((char)(i+65) + "의 발생 횟수는 " + count[i]);
		}
		*/
		

		
/*
 * 10사람의 점수를 랜덤하게 기억한 후
 * 각 사람의 석차를 구하라
 * 석차 구하는 원리
 * 자신보다 큰 숫자가 몇번 나왔는지를 카운트 한 후 최종결과에 +1을 하면된다	
 */
		
		/*
		int[] score = new int[10]; //점수 기억할 배열
		int[] rank = new int[score.length]; //같은 크기만큼 석차를 기억
		
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
			System.out.println(score[i] + "는 " + rank[i] + "등");
		}
		*/
		
		
		/*
		//예시
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
 * 1. 알파벳 대문자를 100번 발생한 후 각가의 문자가 몇번 발생했는지를 출력하라
 * 2. 1번의 결과를 이용해서 석차를 구하세요
 * 3. 1번의 결과를 이용해서 그래프 출력을 하라
 * 예  A 5*****
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
			System.out.print((char)(i+65)+"의 발생횟수는 "+count[i] + " ");
			for(int j=0; j<count[i]; j++){
				System.out.print("*");
			}
			System.out.println(" " + rank[i] + "등");
			
		}
				int result=0;
				for(int i=0; i<count.length; i++){
					result=result+count[i];
				}
				System.out.println(result);
		*/
		
		
		
/*
 * 알파벳 대문자를 10개 발생하세요
 * 단, 절대로 중복된 문자는 발생하지 마세요
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
