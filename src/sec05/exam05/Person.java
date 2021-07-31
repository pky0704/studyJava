package sec05.exam05;
//final 필드 선언과 초기화
//final 필드는 저장된 초기값이 최종값이므로 수정할 수 없다.

public class Person {
	final String nation = "Korea"; //항상 고정된 값으로 값을 처음에 지정한다.
	final String ssn;
	String name;
	
	//생성자
	//ssn은 Person 객체가 생성될 때 부여 되므로 Person 클래스 설계 시 초기값을 미리 줄 수 없다.
	//그래서 생성자 매개값으로 ssn을 받아서 초기값으로 지정해준다.
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
	
	
}
