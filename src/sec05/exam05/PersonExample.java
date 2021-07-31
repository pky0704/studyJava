package sec05.exam05;
//final 필드 테스트
public class PersonExample {

	public static void main(String[] args) {
		Person person1 = new Person("12345-67890", "김햇빛");
		
		
		//person1.nation="미국"; // final 타입이므로 값을 변경할 수없다.
		//person1.ssn="12345-67888"; // final 타입이므로 값을 변경할 수없다.
		person1.name= "김달빛";
		System.out.println(person1.nation);
		System.out.println(person1.ssn);
		System.out.println(person1.name);
		
		
	}

}
