package sec05.exam03;
//정적 메소드 선언 시 주의할 점
//정적 메소드 선언시 객체가 없어도 실행 된다.
// 내부에 인스턴스 필드나 인스턴스 메소드를 사용할 수 없다.
// 객체 자신의 참조인 this 키워드도 사용이 불가능하다
public class Car {
	//인스턴스 필드와 메소드
	int speed1;
	void run1() {
		System.out.println(speed1 + "으로 달립니다.");
	}
	//정적 필드와 메소드
	static int speed2;
	static void run2() {
		System.out.println(speed2 + "으로 달립니다.");
	}
	static void run3() {
		//this.speed1 = 10; //에러발생 ! 정적 메소드를 선언할 때는 내부에서 인스턴스 필드/메소드를 사용할 수 없다. this키워드도 사용불가능
		//this.run1();
		speed2 = 150;
		run2();
	}
	
	public static void main(String[] args) {
		//정적 메소드에서 인스턴스 멤버를 사용하고 싶으면 
		//객체를 먼저 생성하고 참조 변수로 접근한다.
		
		//잘못된 코딩! =>인스턴스 필드와메소드를 메인 메소드에서 바로 사용 X, 객체생성, 참조변수 사용!
//		speed2 = 150;
//		run2();
		
		Car myCar = new Car();
		myCar.speed1 = 60;
		myCar.run1();
	}
}
