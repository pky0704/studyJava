/*
 * 재귀호출 : 메소드 내부에서 메소드 자신을 다시 호출 하는 것
 * 재귀 메소드 : 재귀호출을 하는 메서드 
 * 예제 - 팩토리얼 구하기  5! = 5 * 4 * 3 * 2 * 1
 * */
package chap06;

public class Ex15 {

	public static void main(String[] args) {
		int result = factorial(4);//=Ex15.factorial(4)   => main메소드와 같은 클래스에 있기 때문에 static 메서드를 호출할 때 클래스이름을 생략하는 것이 가능하다.
		System.out.println(result);
	}
	static int factorial(int n) {//static 메소드이므로 인스턴스를 생성하지 않고 직접 호출 할 수 있다. 
		int result = 0;
		if(n ==1)
			result = 1;
		else
			result = n * factorial(n-1); //=4*3*2*1
		return result;
	}
}
