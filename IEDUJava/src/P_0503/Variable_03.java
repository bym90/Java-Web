package P_0503;

public class Variable_03 {

	public static void main(String[] args) {
		String str1 = new String ("Hong");
		String str2 = new String ("Hong");
		/*
		 * String str1 = "Hong" 이 경우는 같다
		       리터럴 영역은 같은  데이터가 들어와도 다시 저장하지않아 같은 주소를 갔기때문에 같다
		   String str1 = new String ("Hong") 이 경우는 다르다
		   Heap 영역은 같은 데이터가 들어와도 다시 저장하므로 다른주소 값을 갔기때문에 다르다
		 */
		if(str1 == str2){
			System.out.println("같다");
			}
			else {System.out.println("다르다");
			}
		/*
		 * if(str1.eqauls(str2)){
			System.out.println("같다");
			}
			else {System.out.println("다르다");
			}
			쓰면 new String ("Hong")이든  "Hong"이든 결과값은 같다
		 */
	    
		int a = 10;
		int b = 20;
		int c = 30;
		boolean d = a > b && b == c;
		System.out.println(d);
	   }

	}


