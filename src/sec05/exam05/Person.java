package sec05.exam05;
//final �ʵ� ����� �ʱ�ȭ
//final �ʵ�� ����� �ʱⰪ�� �������̹Ƿ� ������ �� ����.

public class Person {
	final String nation = "Korea"; //�׻� ������ ������ ���� ó���� �����Ѵ�.
	final String ssn;
	String name;
	
	//������
	//ssn�� Person ��ü�� ������ �� �ο� �ǹǷ� Person Ŭ���� ���� �� �ʱⰪ�� �̸� �� �� ����.
	//�׷��� ������ �Ű������� ssn�� �޾Ƽ� �ʱⰪ���� �������ش�.
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
	
	
}
