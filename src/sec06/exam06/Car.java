package sec06.exam06;
//Getter Setter �޼ҵ� ����
//�ʵ�� �ܺο��� ������ �� ������ ���� 
// �޼ҵ�� �����ؼ� �ܺο��� �޼ҵ带 ���� �ʵ忡 �����ϵ��� �����Ѵ�. 
// Getter : �ʵ��� ���� �ܺη� �������ִ� �޼ҵ�
// Setter : �ܺο��� ���� �޾� �ʵ带 �����ϴ� �޼ҵ�

public class Car {
	//�ʵ�
	private int speed;
	private boolean stop;
	
	//������
	
	
	//�޼ҵ�
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
			return;
		}else {
			this.speed = speed;
		}
	}
	
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}
