/*
 * 메서드로 배열을 다루는 여러가지 방법:배열의 값을 순서대로 재정렬
 * 매개변수 타입 : 배열 => 참조형 매개변수 
 * */
package chap06;

public class Ex12 {

	public static void main(String[] args) {
		int[] arr = new int[] {3,2,1,6,5,4};
		
		printArr(arr);
		sortArr(arr);
		printArr(arr);
		System.out.println("sum="+sumArr(arr));
	}
	static void printArr(int[] arr) {
		System.out.print("[");
		for(int i : arr) { //향상된 for문 : for(타입 변수명 : 배열 또는 컬렉션)  배열이나 컬렉션에 저장된 요소들을 읽어오는 용도로만 사용 가능.
			System.out.print(i+",");//0,1,2,3,4,5
		}
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(i+",");
//		}
		System.out.println("]");
	}
	
	static int sumArr(int[] arr) {
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum+= arr[i];
		}
		return sum;
	}// 배열 arr 값의 합계
	
	static void sortArr(int[] arr) {
		for(int i=0;i<arr.length;i++) 
			for(int j=0; j<arr.length-1-i; j++ ) 
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] =  tmp;
				}
	}

}
