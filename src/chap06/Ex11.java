package chap06;

public class Ex11 {

	public static void main(String[] args) {
		int[] x = {10}; //ũ�Ⱑ 1�� �迭 . x[0] = 10;
		System.out.println("1main() : x = " + x[0]); // 10
		
		change3(x);
		System.out.println("3After change3(x)");
		System.out.println("4main() : x = " + x[0]);//1000
	}
	
	static void change3(int[] x) { //������ �Ű�����
		x[0] = 1000; 
		System.out.println("2change3() : x =" + x[0]); //1000
	}
}
