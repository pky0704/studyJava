package sec03.exam04;
//�ٸ� �����ڸ� ȣ���ؼ� �ߺ� �ڵ� ���̱�. this ���
public class Car {
	//�ʵ� 
	String company="�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	//������1
	Car(){
		
	}
	//������2
	Car(String model){
		// Ŭ������ �ٸ� ������ ȣ��
		//this(�Ű�����, ..., ��, ...);
		//this() => �ٸ� �����ڸ� ȣ���ϴ� �ڵ�� �ݵ�� �������� ù �ٿ����� ���
		this(model, "����", 250);
	}
	
	//������3
	Car(String model, String color){
		this(model, color, 250);
	}
	
	//������4
	Car(String model, String color, int maxSpeed){
		//���� ���� �ڵ� 
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
}
