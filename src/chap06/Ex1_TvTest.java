package chap06;

class Tv{
	//tv�� �Ӽ�(�������)
	String color;
	boolean power;
	int channel;
	
	//Tv�� ���(�޼���)
	void power() {power =!power;}//tv�� �Ѱų� ���� ����� �ϴ� �޼���
	void channelUp() {++channel;}//tv�� ä���� ���̴� ����� �ϴ� �޼���
	void channelDown() {--channel;}//tv�� ä���� ���ߴ� ����� �ϴ� �޼���
	
}
public class Ex1_TvTest {
	public static void main(String[] args) {
		Tv t; //tv�ν��Ͻ��� �����ϱ� ���� ���� t ����
		t = new Tv(); //Tv�ν��Ͻ� ����
				
		t.channel = 7; //tv�ν��Ͻ��� ������� channel �� ���� 7�� �Ѥ���
		t.channelDown(); //tv�ν��Ͻ��� �޼��� channelDown() ȣ��
		System.out.println("���� ä���� "+t.channel+"�Դϴ�");
	}

}
