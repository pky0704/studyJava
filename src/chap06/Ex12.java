/*
 * �޼���� �迭�� �ٷ�� �������� ���:�迭�� ���� ������� ������
 * �Ű����� Ÿ�� : �迭 => ������ �Ű����� 
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
		for(int i : arr) { //���� for�� : for(Ÿ�� ������ : �迭 �Ǵ� �÷���)  �迭�̳� �÷��ǿ� ����� ��ҵ��� �о���� �뵵�θ� ��� ����.
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
	}// �迭 arr ���� �հ�
	
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
