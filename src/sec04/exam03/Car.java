package sec04.exam03;

public class Car {
	int gas;
	
	void setCas(int gas) {
		this.gas = gas;
	}
	
	//���ϰ��� booleean�� �޼ҵ�� gas�ʵ尪�� 0�̸� false�� , 0�� �ƴϸ� true�� ���� 
	boolean isLeftGas() { 
		if(gas == 0) {
			System.out.println("gas�� �����ϴ�.");
			return false; // false �� ����
		}
		System.out.println("gas�� �ֽ��ϴ�.");
		return true; // ture ��  ����
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("�޸��ϴ�. (gas�ܷ� :"+gas+")");
				gas -= 1;
			}else {//gas�ʵ尪�� 0�̸� return������ �޼ҵ带 ��������
				System.out.println("����ϴ�.(gas�ܷ� :"+gas+")");
				return; //�޼ҵ� ���� ����
			}
			
		}
	}
}

