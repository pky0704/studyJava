package sec06.exam06;
//Getter Setter 메소드 선언
//필드는 외부에서 접근할 수 없도록 막고 
// 메소드는 공개해서 외부에서 메소드를 통해 필드에 접근하도록 유도한다. 
// Getter : 필드의 값을 외부로 리턴해주는 메소드
// Setter : 외부에서 값을 받아 필드를 변경하는 메소드

public class Car {
	//필드
	private int speed;
	private boolean stop;
	
	//생성자
	
	
	//메소드
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
