package chap06;

class Tv2{
	//tv의 속성(멤버변수)
	String color;
	boolean power;
	int channel;
	
	//Tv의 기능(메서드)
	void power() {power =!power;}//tv를 켜거나 끄는 기능을 하는 메서드
	void channelUp() {++channel;}//tv의 채널을 높이는 기능을 하는 메서드
	void channelDown() {--channel;}//tv의 채널을 낮추는 기능을 하는 메서드
	
}

public class Ex2_TvTest {
	public static void main(String[] args) {
		Tv2 t1 = new Tv2();
		Tv2 t2 = new Tv2();
		
		System.out.println("t1의 channel 값은"+t1.channel);
		System.out.println("t2의 channel 값은"+t2.channel);
		
		t1.channel = 7; 
		System.out.println("t1의 channel 값은"+t1.channel);
		System.out.println("t2의 channel 값은"+t2.channel);
	}

}
