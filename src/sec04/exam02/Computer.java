package sec04.exam02;
//매개 변수의 개수를 모를 경우 
//매개변수를 배열 타입으로 선언, or  배열을 생성하지 않고 값의 목록만 넘겨준다 (... 사용)
public class Computer {
	//매개변수를 배열 타입으로 선언
	int sum1(int[] values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	int sum2(int ... values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}
