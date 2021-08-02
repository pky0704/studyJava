package chap06;

class Tv{
	//tv의 속성(멤버변수)
	String color;
	boolean power;
	int channel;
	
	//Tv의 기능(메서드)
	void power() {power =!power;}//tv를 켜거나 끄는 기능을 하는 메서드
	void channelUp() {++channel;}//tv의 채널을 높이는 기능을 하는 메서드
	void channelDown() {--channel;}//tv의 채널을 낮추는 기능을 하는 메서드
	
}
public class Ex1_TvTest {
	public static void main(String[] args) {
		Tv t; //tv인스턴스를 참조하기 위한 변수 t 선언
		t = new Tv(); //Tv인스턴스 생성
				
		t.channel = 7; //tv인스턴스의 멤버변수 channel 의 값을 7로 한ㄴ다
		t.channelDown(); //tv인스턴스의 메서드 channelDown() 호출
		System.out.println("현재 채널은 "+t.channel+"입니다");
	}

}
