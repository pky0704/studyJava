package sec05.exam03;
//���� �޼ҵ� ���� �� ������ ��
//���� �޼ҵ� ����� ��ü�� ��� ���� �ȴ�.
// ���ο� �ν��Ͻ� �ʵ峪 �ν��Ͻ� �޼ҵ带 ����� �� ����.
// ��ü �ڽ��� ������ this Ű���嵵 ����� �Ұ����ϴ�
public class Car {
	//�ν��Ͻ� �ʵ�� �޼ҵ�
	int speed1;
	void run1() {
		System.out.println(speed1 + "���� �޸��ϴ�.");
	}
	//���� �ʵ�� �޼ҵ�
	static int speed2;
	static void run2() {
		System.out.println(speed2 + "���� �޸��ϴ�.");
	}
	static void run3() {
		//this.speed1 = 10; //�����߻� ! ���� �޼ҵ带 ������ ���� ���ο��� �ν��Ͻ� �ʵ�/�޼ҵ带 ����� �� ����. thisŰ���嵵 ���Ұ���
		//this.run1();
		speed2 = 150;
		run2();
	}
	
	public static void main(String[] args) {
		//���� �޼ҵ忡�� �ν��Ͻ� ����� ����ϰ� ������ 
		//��ü�� ���� �����ϰ� ���� ������ �����Ѵ�.
		
		//�߸��� �ڵ�! =>�ν��Ͻ� �ʵ�͸޼ҵ带 ���� �޼ҵ忡�� �ٷ� ��� X, ��ü����, �������� ���!
//		speed2 = 150;
//		run2();
		
		Car myCar = new Car();
		myCar.speed1 = 60;
		myCar.run1();
	}
}
