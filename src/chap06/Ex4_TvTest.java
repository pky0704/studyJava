package chap06;

public class Ex4_TvTest {
	
	public static void main(String[] args) {
		Tv4[] tvArr = new Tv4[3]; //길이가 3인 tv객체 배열 
		
		//tv객체를 생성해서 tv객체 배열의 각 요소에 저장
		for(int i=0; i<tvArr.length ; i++) {
			tvArr[i] = new Tv4();
			tvArr[i].channel = i + 10;
		}
		
		for(int i=0; i<tvArr.length;i++) {
			tvArr[i].channelUp();//tvArr[i]의 메서드 호출, 채널 1이 증가
			System.out.printf("tvArr[%d].channel=%d%n",i,tvArr[i].channel);
		}
	}

}
class Tv4{
	String color;
	boolean power;
	int channel;
	
	void power() {power=!power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}
