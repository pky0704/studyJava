package sec05.exam05;
//final �ʵ� �׽�Ʈ
public class PersonExample {

	public static void main(String[] args) {
		Person person1 = new Person("12345-67890", "���޺�");
		
		
		//person1.nation="�̱�"; // final Ÿ���̹Ƿ� ���� ������ ������.
		//person1.ssn="12345-67888"; // final Ÿ���̹Ƿ� ���� ������ ������.
		person1.name= "��޺�";
		System.out.println(person1.nation);
		System.out.println(person1.ssn);
		System.out.println(person1.name);
		
		
	}

}
