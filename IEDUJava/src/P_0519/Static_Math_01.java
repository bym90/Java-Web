package P_0519;
/*
 * 숙제1 Math클래스의 있는 함수 3개이상 선택하여
 * 함수의 의미를 알아내고 함수를 사용하는 프로그램을 만들어라
 * 
 * 숙제2 Integer 클래스에도 static 함수를 2개 이상 선택하여
 * 함수의 의미를 알아내고 함수를 사용하는 프로그램을 만들어라
 * 
 * 숙제 3 String 클래스에도 static 함수를 1개 이상 선택하여
 * 함수의 의미를 알아내고 함수를 사용하는 프로그램을 만들어라 
 */
public class Static_Math_01 {

	public static void main(String[] args) {
		//Math 1번 원의 넓이를 구하고 소수점을 버려라
		//Math.ceil은 인덱스를 최소의 double치로 돌려주는 함수
		/*
		int r=(int)(Math.random()*(100 - 1 + 1) + 1);
		double area = r * r * Math.PI;
		double result = Math.ceil(area);
		System.out.println(result);
		*/
		
		
		//Math 2번 변의 길이가 3, 4, ?인 삼각형의 ?길이를 구하여라
		//Math.hypot(x,y)는 sqrt(x^2 + y^2)값을 돌려준다
		/*
		double x = 3;
		double y = 4;
		
	 	double z = Math.hypot(x, y);
				
		System.out.println(z);
		*/
		
		
		//Math 3번 3학생의 3과목의 총점과 평균을 구하고
		//평균을 비교해서 학생의 가장 높은 평균을 출력하라
		/*
		float [] avg = new float[3];
		float result = 0;
		int[][] score = new int[3][4];
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < (score[i].length - 1); j++) {
				score[i][j] = (int)	(Math.random()*(101));	
			}
		}
		
		System.out.println("각 학생의 평균은");
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < (score[i].length - 1); j++) {
				score[i][(score[i].length - 1)] = 
						score[i][(score[i].length - 1)] + score[i][j];
			}	
			avg[i] = score[i][(score[i].length - 1)]/3.0F;
			System.out.println(avg[i]);
		}
		System.out.println("평균비교 과정");
		for (int i = 0; i < score.length; i++) {
			result = Math.max(result, avg[i]);
			System.out.println(result);
		}

		System.out.println("가장 높은 평균은 "+result);
		*/
		
		
		/*
		//Integer 1번
		int a=400;
		int b=100;
		//Integer.compare(x,y) x>y는 1출력 x=y 0출력 x<y -1출력
		int result = Integer.compare(a, b);
		
		System.out.println(result);
		 */
		int sign = 0;
		int temp = 0;
		for (int i = 0; ; i++) {
		
			int a =(int)(Math.random()*(101));
			int b =(int)(Math.random()*(101));
		
			sign = Integer.compare(a, b);
			
			temp += sign;
			System.out.println(temp);
			if(temp==10){
				
				break;
			}
			
		}
		 	
		
		
		
		
		
		
		
		
		
		
	}

}



