package M0429;

public class Work01 {

	public static void main(String[] args) {
		
	int bottom = 5, height = 3;
	float area = (bottom*height)/2F;
			
	System.out.printf("삼각형의 넓이는%.1f\n", area);
			
	int r = 4;
	float pi = 3.14F;
	float area2 = r*r*pi;
	System.out.printf("원의 넓이는%.2f%n", area2);
	
	int rr = 7;
	float area3 = 2*rr*pi;
	System.out.printf("원의 둘레는%.2f%n", area3);
	
	int finger = 10;
	long big = 100_000_000_000L;
	System.out.printf("big=%d%n",big);
	System.out.printf("finger=[%5d]%n", finger);
	
	
	
	}

}
