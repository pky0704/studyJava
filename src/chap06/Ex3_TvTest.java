package chap06;
class Tv3{
	//tv�� �Ӽ�(�������)
	String color;
	boolean power;
	int channel;
	
	//Tv�� ���(�޼���)
	void power() {power =!power;}//tv�� �Ѱų� ���� ����� �ϴ� �޼���
	void channelUp() {++channel;}//tv�� ä���� ���̴� ����� �ϴ� �޼���
}
public class Ex3_TvTest {
	public static void main(String[] args) {
		Tv3 t1 = new Tv3();
		Tv3 t2 = new Tv3();
		
		System.out.println("t1�� channel ����"+t1.channel);
		System.out.println("t2�� channel ����"+t2.channel);
		
		t2=t1;
		t1.channel = 7;
		System.out.println("t1�� channel ����"+t1.channel);
		System.out.println("t2�� channel ����"+t2.channel);
		

	}

}
