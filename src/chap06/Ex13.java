package chap06;

public class Ex13 {

	public static void main(String[] args) {
		Ex13 r = new Ex13();
		
		int result = r.add(3, 5);
		System.out.println(result); // a+b = 3+5 = 8
		
		int[] result2 = {0}; // 배열을 생성하고 result2[0] 의 값을 0 으로 초기화
		r.add(3, 5, result2); //result2[0] = 3+5 = 8
		System.out.println(result2[0]);
	}
	int add(int a, int b) {
		return a+b;
	}
	void add(int a, int b, int[] result) {
		result[0] = a +b; // 매개변수로 넘겨받은 배열에 연산결과를 저장 
	}

}
