package sec03.exam04;
//다른 생성자를 호출해서 중복 코드 줄이기. this 사용
public class Car {
	//필드 
	String company="현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자1
	Car(){
		
	}
	//생성자2
	Car(String model){
		// 클래스의 다른 생성자 호출
		//this(매개변수, ..., 값, ...);
		//this() => 다른 생성자를 호출하는 코드로 반드시 생성자의 첫 줄에서만 허용
		this(model, "은색", 250);
	}
	
	//생성자3
	Car(String model, String color){
		this(model, color, 250);
	}
	
	//생성자4
	Car(String model, String color, int maxSpeed){
		//공통 실행 코드 
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
}
