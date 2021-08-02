package sec03.exam03;
//생성자 오버로딩. 매개변수의 타입, 개수, 순서가 다르게 선언
public class Car {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자1
	Car(){
		
	}
	
	//생성자2	
	Car(String model){
		this.model = model;
		
	}
	
	//생성자3
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	//생성자4
	Car(String model, String color, int maxSpeed){
		//공통 실행 코드
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
