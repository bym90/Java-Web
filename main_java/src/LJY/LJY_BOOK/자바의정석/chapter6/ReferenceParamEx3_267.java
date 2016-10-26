package LJY.LJY_BOOK.자바의정석.chapter6;

public class ReferenceParamEx3_267 {
	public static void main(String[] args) {

		int[] arr = new int[] {3,2,1,10,5,4,9};

		printArr(arr);
		sortArr(arr);
		printArr(arr);

		System.out.println("sum="+sumArr(arr));


	}

	static void printArr(int[] arr){		//배열의 모든 요소를 출력
		System.out.print("[");

		for(int i : arr){
			System.out.print(i+",");
		}
		System.out.println("]");
	}

	static int sumArr(int[] arr){//배열의 모든 요소의 합을 반환
		int sum = 0;

//		for(int i : arr){
//			sum += arr[i];
//		}
//		return sum;

		for(int i=0;i<arr.length; i++){
			sum+= arr[i];

		}
		return sum;
	}

	static void sortArr(int[] arr){		//배열의 오름차순으로 정렬
		for(int i=0; i<arr.length-1; i++){
			for(int j=0; j<arr.length-1-i; j++){
				if(arr[j] > arr[j+1]){
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}

		}
	}
}
