package sec05.exam02;

public class CalculatorExample {

	public static void main(String[] args) {
		// 정적 메소드 선언시 객체가 없어도 실행 된다.
		// 내부에 인스턴스 필드나 인스턴스 메소드를 사용할 수 없다.
		// 객체 자신의 참조인 this 키워드도 사용이 불가능하다
		
		double result1 = 10 * 10 * Calculator.pi;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
	}

}
