package sec03.exam03;
//������ �����ε�. �Ű������� Ÿ��, ����, ������ �ٸ��� ����
public class Car {
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	//������1
	Car(){
		
	}
	
	//������2	
	Car(String model){
		this.model = model;
		
	}
	
	//������3
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	//������4
	Car(String model, String color, int maxSpeed){
		//���� ���� �ڵ�
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
