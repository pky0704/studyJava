/*
 * 매개변수의 유효성을 검사하는 코드를 추가해서 메서드 factorial의 매개변수 n이 음수거나 20보다 크면 -1을 반환 
 */
package chap06;

public class Ex16 {
	static long factorial(int n) {
		if(n<=0 || n>20) //매개변수의 유효성 검사 
			return -1;
		if(n<=1) 
			return 1;
		return n * factorial(n-1);
	}
	public static void main(String[] args) {
		int n =21;
		long result = 0;
		
		for(int i=1; i<=n; i++) {
			result = factorial(i);
			
			if(result==-1) {
				System.out.printf("유효하지 않은 값입니다. (0<n<=20):%d%n",n);
				break;
			}
			System.out.printf("%2d! = %20d%n", i, result);
		}
	}

}
