package P_0516;
/*
 * 단, 숫자 발생
 * 더하기 계산, 출력은 함수를 따로 만들어서 처리하세요
 */
public class Function_01 {
	
	/*
	//숫자 발생 함수 - 하나의 숫자를 발생시켜 알려주는 기능
	static int getNum(){
		int temp = (int)(Math.random()*(100 - 1 + 1) + 1);
		return temp;
	}
	//더하기 계산 함수 - 두개의 숫자를 발생시켜 알려주는 기능
	
	static int add(int a, int b){
		int temp = a + b;
		return temp;
	}
	//출력함수 - 더한 결과를 출력하는 기능
	static void display(int a){
		System.out.println("결과는 " + a);
	}
	//원래는 두 수를 발생한 후 더하고 그 결과를 출력했다
	//근데 지금은 이들 기능을 대신할 함수가 존재
	public static void main(String[] args) {
		//두수 발생
		int num1=getNum();
		int num2=getNum();
		//이처럼 함수의 장점은 재사용!!!!!!!!!
		int sum = add(num1, num2);
		
		display(sum);
	}	
	*/	
		
	

/*
 * 밑변과 높이를 랜덤하게 발생한 후 삼각형의 넓이를 구하여
 * 출력하는 프로그램을 작성
 * 단, 데이터 생성, 계산 , 출력은 함수를 사용	
 */
	/*
	//랜덤한 숫자 하나를 알려주는 기능, 발생할 숫자의 범위를 알려주고 싶다.
	static int getNum(int max, int min){
		int temp = (int)(Math.random()*(max - min + 1) + min);
		return temp;
	}
	
	static float calcArea(int a, int b){
		float temp= (a + b)/2;
		return temp;	
	}
	//밑변=?, 높이=?인 삼각형의 면적 =??
	static void display(int a, int b, float c){
		System.out.printf("밑변  =%3d 높이 =%3d 인 삼각형의 면적 = %5.2f\n", a, b, c);;
		//return은 생략
	}
	
	
	public static void main(String[] args){
		int num1 = getNum(100, 1);
		int num2 = getNum(50, 1);
		
		float area = calcArea(num1, num2);
		
		display(num1, num2, area);		
	}
	*/	
		
		
		
/*
 * 5개의 배열을 만들어서 그 안에 랜덤한 숫자를 입력한 후 합을 구하여 출력하는
 * 프로그램을 작성하세요
 * 단, 함수 조건은 앞과 동일하다	
 */
	/*
	//자바의 함수의 위치는 상관하지 않는다
	//랜덤한 숫자 발생 함수
	static int getData(){
		int temp = (int)(Math.random()*(100 - 1 + 1) + 1);
		return temp;
		
		
	}
	//더하는 함수 - 배열의 주소를 받아 5개의 데이터를 받아서 더하는 기능
	static int add(int[] a){
		//이처럼 매개변수를 주소로 받을 준비를 하는 것을 Call By Reference라고 표현
		//앞에서와 같이 매개변수를 데이터로 받을 준비를 하는 것을 Call By Value라고 표현
		//이처럼 배열의 주소를 복사해서 배열을 사용할 수 있도록 하는것을 얕은 복사라 한다
		int sum = 0 ;
		for(int i = 0;  i < a.length; i++){
			sum = sum + a[i];
		}
		return sum;
	}
	//출력 함수
	static void display(int[] a, int sum){
		System.out.print("배열에 지정된 숫자는 ");
		for(int i = 0;  i < a.length; i++){
			System.out.print(a[i] + " ");
		}
		System.out.println("합은" + sum);
	}
	
	public static void main(String[] args){
		int[] num = new int[5];
		for(int i = 0; i < num.length; i++){
			num[i]=getData();
		}
		
		int result = add(num);
		
		display(num, result);
		
		
	}
	*/
	
	
	
/*
 * 앞의 3번 문제에서 입력을 받을때 필요한 데이터의 갯수를 알려주면 
 * 그 갯수를 다받아서 처리하도록한다	
 */
		/*
		//반환값이 다수인경우는 존재하지 않음
		//필요한 갯수만큼 만든 데이터를 기억할 배열을 만든다
		static int[] getData(int count){
			int[] num = new int[count];
			for(int i = 0; i < num.length; i++){
				num[i] = (int)(Math.random()*(100 - 1 + 1) + 1);	
			}
			return num;
		}
		
		static int add(int[] a){
			int sum = 0 ;
			for(int i = 0;  i < a.length; i++){
				sum = sum + a[i];
			}
			return sum;
		}
		
		static void display(int[] a, int sum){
			System.out.print("배열에 지정된 숫자는 ");
			for(int i = 0;  i < a.length; i++){
				System.out.print(a[i] + " ");
			}
			System.out.println("합은" + sum);
		}
		
		public static void main(String[] args){
			int[] num =getData(6);
			int sum = add(num);
			display(num, sum);
			
		}
		*/
	
	
	
/* 숙제16 
 * 5사람의 3과목 점수를 처리하는 프로그램을 만드세요
 * 단, 입력, 계산, 출력은 함수로 처리하세요
 * 데이터 하나씩
 * 한사람의 분량
 * 전체 데이터 입력방식 3가지 중에 자유롭게	
 */
		
		static int[][] getData(){
			int[][] num = new int[5][4];
			for(int i = 0; i < num.length; i++){
				for(int j = 0; j < (num[i].length - 1); j++){
					num[i][j]=(int)(Math.random()*(100 - 0 + 1));
				}
			}
			return num;
		}
		
		
		static void add(int[][] a){
			for(int i = 0; i < a.length; i++){
				for(int j = 0; j <(a[i].length - 1); j++){
					 a[i][3] = a[i][3] + a[i][j];
					}
			}
		}
		
		
		static void display(int[][] a){
			System.out.print("배열에 지정된 숫자는 ");
			System.out.println();
			for(int i = 0;  i < a.length; i++){
				for(int j = 0; j < (a[i].length - 1); j++){
				System.out.print(a[i][j] + " ");
				}
				System.out.println("합은 " + a[i][3]);
			}
		}
		
		
		public static void main(String[] args){
			int[][] num = getData();
			add(num);
			display(num);
		}
		

	

}
