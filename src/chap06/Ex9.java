/*
 * �޼��带 ȣ���� �� �Ű������� ������ ���� �޼����� �Ű������� �����ؼ� �Ѱ��ش�
 * �Ű������� Ÿ���� �⺻���� ���� �⺻�� ���� ����, �������� ���� �ν��Ͻ��� �ּҰ� ���� �Ǿ� ���� �а� ���浵 �����ϴ�
 * �⺻�� �Ű����� : ������ ���� �б⸸ �� �� �ִ�. 
 * ������ �Ű����� : ������ ���� �а� ������ �� �ִ�. 
 */
package chap06;

class Data{
	int x;
}

public class Ex9 {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("1.x = " + d.x); //x=10
		
		change(d.x);//�޼��尡 ȣ��Ǹ鼭 d.x�� change�޼����� �Ű����� x�� �����-> change�޼��忡�� x�� ���� 1000���� ���� -> �޼��� ����Ǹ鼭 �Ű����� x�� ���ÿ��� ����
		
		System.out.println("After change(d.x)");
		System.out.println("4.x = " + d.x);//d.x���� 1000���� ����������� x=
	}
	
	static void change(int x) {//�⺻�� �Ű����� -> ������ ���� �б⸸ ���� (����x)
		System.out.println("2.x = " + x);//d.x�� change�޼����� �Ű����� x�� ����� -> x=10
		x = 1000;//  x�� ���� 1000���� ����
		System.out.println("3.x = " + x); //x =1000
	}
}
