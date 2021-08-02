package sec04.exam03;

public class Car {
	int gas;
	
	void setCas(int gas) {
		this.gas = gas;
	}
	
	//리턴값이 booleean인 메소드로 gas필드값이 0이면 false를 , 0이 아니면 true를 리턴 
	boolean isLeftGas() { 
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false; // false 를 리턴
		}
		System.out.println("gas가 있습니다.");
		return true; // ture 를  리턴
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다. (gas잔량 :"+gas+")");
				gas -= 1;
			}else {//gas필드값이 0이면 return문으로 메소드를 강제종료
				System.out.println("멈춥니다.(gas잔량 :"+gas+")");
				return; //메소드 실행 종료
			}
			
		}
	}
}

