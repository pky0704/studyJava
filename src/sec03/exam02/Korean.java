package sec03.exam02;

public class Korean {
	//필드
	String nation="대한민국";
	String name;
	String ssn;
	
	//생성자
	//클래스이름(매개변수1, 매개변수2...)
	public Korean(String n, String s) {
		name = n;
		ssn = s;
	}
	
	//매개변수와 필드명 이름이 같을 경우 this 사용
	/*
	public Korean(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	*/
}
