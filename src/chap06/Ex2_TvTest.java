package chap06;

class Tv2{
	//tv�� �Ӽ�(�������)
	String color;
	boolean power;
	int channel;
	
	//Tv�� ���(�޼���)
	void power() {power =!power;}//tv�� �Ѱų� ���� ����� �ϴ� �޼���
	void channelUp() {++channel;}//tv�� ä���� ���̴� ����� �ϴ� �޼���
	void channelDown() {--channel;}//tv�� ä���� ���ߴ� ����� �ϴ� �޼���
	
}

public class Ex2_TvTest {
	public static void main(String[] args) {
		Tv2 t1 = new Tv2();
		Tv2 t2 = new Tv2();
		
		System.out.println("t1�� channel ����"+t1.channel);
		System.out.println("t2�� channel ����"+t2.channel);
		
		t1.channel = 7; 
		System.out.println("t1�� channel ����"+t1.channel);
		System.out.println("t2�� channel ����"+t2.channel);
	}

}
