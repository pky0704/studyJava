package chap07.sec01.exam01;
//���
//�θ�Ŭ����
public class CellPhone {
	//�ʵ�
	String model;
	String color;
	
	//�żҵ�
	void powerOn() {System.out.println("������ �մϴ�.");}
	void powerOff() {System.out.println("������ ���ϴ�.");}
	void bell() {System.out.println("���� �︳�ϴ�.");}
	void sendVoice(String message) {System.out.println("�ڱ� : " + message);}
	void recieve(String message) {System.out.println("���� : " + message);}
	void hangUp() {System.out.println("��ȭ�� �����ϴ�.");}
}
