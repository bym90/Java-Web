package P_0516;
/*
 * ��, ���� �߻�
 * ���ϱ� ���, ����� �Լ��� ���� ���� ó���ϼ���
 */
public class Function_01 {
	
	/*
	//���� �߻� �Լ� - �ϳ��� ���ڸ� �߻����� �˷��ִ� ���
	static int getNum(){
		int temp = (int)(Math.random()*(100 - 1 + 1) + 1);
		return temp;
	}
	//���ϱ� ��� �Լ� - �ΰ��� ���ڸ� �߻����� �˷��ִ� ���
	
	static int add(int a, int b){
		int temp = a + b;
		return temp;
	}
	//����Լ� - ���� ����� ����ϴ� ���
	static void display(int a){
		System.out.println("����� " + a);
	}
	//������ �� ���� �߻��� �� ���ϰ� �� ����� ����ߴ�
	//�ٵ� ������ �̵� ����� ����� �Լ��� ����
	public static void main(String[] args) {
		//�μ� �߻�
		int num1=getNum();
		int num2=getNum();
		//��ó�� �Լ��� ������ ����!!!!!!!!!
		int sum = add(num1, num2);
		
		display(sum);
	}	
	*/	
		
	

/*
 * �غ��� ���̸� �����ϰ� �߻��� �� �ﰢ���� ���̸� ���Ͽ�
 * ����ϴ� ���α׷��� �ۼ�
 * ��, ������ ����, ��� , ����� �Լ��� ���	
 */
	/*
	//������ ���� �ϳ��� �˷��ִ� ���, �߻��� ������ ������ �˷��ְ� �ʹ�.
	static int getNum(int max, int min){
		int temp = (int)(Math.random()*(max - min + 1) + min);
		return temp;
	}
	
	static float calcArea(int a, int b){
		float temp= (a + b)/2;
		return temp;	
	}
	//�غ�=?, ����=?�� �ﰢ���� ���� =??
	static void display(int a, int b, float c){
		System.out.printf("�غ�  =%3d ���� =%3d �� �ﰢ���� ���� = %5.2f\n", a, b, c);;
		//return�� ����
	}
	
	
	public static void main(String[] args){
		int num1 = getNum(100, 1);
		int num2 = getNum(50, 1);
		
		float area = calcArea(num1, num2);
		
		display(num1, num2, area);		
	}
	*/	
		
		
		
/*
 * 5���� �迭�� ���� �� �ȿ� ������ ���ڸ� �Է��� �� ���� ���Ͽ� ����ϴ�
 * ���α׷��� �ۼ��ϼ���
 * ��, �Լ� ������ �հ� �����ϴ�	
 */
	/*
	//�ڹ��� �Լ��� ��ġ�� ������� �ʴ´�
	//������ ���� �߻� �Լ�
	static int getData(){
		int temp = (int)(Math.random()*(100 - 1 + 1) + 1);
		return temp;
		
		
	}
	//���ϴ� �Լ� - �迭�� �ּҸ� �޾� 5���� �����͸� �޾Ƽ� ���ϴ� ���
	static int add(int[] a){
		//��ó�� �Ű������� �ּҷ� ���� �غ� �ϴ� ���� Call By Reference��� ǥ��
		//�տ����� ���� �Ű������� �����ͷ� ���� �غ� �ϴ� ���� Call By Value��� ǥ��
		//��ó�� �迭�� �ּҸ� �����ؼ� �迭�� ����� �� �ֵ��� �ϴ°��� ���� ����� �Ѵ�
		int sum = 0 ;
		for(int i = 0;  i < a.length; i++){
			sum = sum + a[i];
		}
		return sum;
	}
	//��� �Լ�
	static void display(int[] a, int sum){
		System.out.print("�迭�� ������ ���ڴ� ");
		for(int i = 0;  i < a.length; i++){
			System.out.print(a[i] + " ");
		}
		System.out.println("����" + sum);
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
 * ���� 3�� �������� �Է��� ������ �ʿ��� �������� ������ �˷��ָ� 
 * �� ������ �ٹ޾Ƽ� ó���ϵ����Ѵ�	
 */
		/*
		//��ȯ���� �ټ��ΰ��� �������� ����
		//�ʿ��� ������ŭ ���� �����͸� ����� �迭�� �����
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
			System.out.print("�迭�� ������ ���ڴ� ");
			for(int i = 0;  i < a.length; i++){
				System.out.print(a[i] + " ");
			}
			System.out.println("����" + sum);
		}
		
		public static void main(String[] args){
			int[] num =getData(6);
			int sum = add(num);
			display(num, sum);
			
		}
		*/
	
	
	
/* ����16 
 * 5����� 3���� ������ ó���ϴ� ���α׷��� ���弼��
 * ��, �Է�, ���, ����� �Լ��� ó���ϼ���
 * ������ �ϳ���
 * �ѻ���� �з�
 * ��ü ������ �Է¹�� 3���� �߿� �����Ӱ�	
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
			System.out.print("�迭�� ������ ���ڴ� ");
			System.out.println();
			for(int i = 0;  i < a.length; i++){
				for(int j = 0; j < (a[i].length - 1); j++){
				System.out.print(a[i][j] + " ");
				}
				System.out.println("���� " + a[i][3]);
			}
		}
		
		
		public static void main(String[] args){
			int[][] num = getData();
			add(num);
			display(num);
		}
		

	

}