package chap06;

class Data2{
	int x;
}

public class Ex10 {
	public static void main(String[] args) {
		Data2 d = new Data2();
		d.x = 10;
		System.out.println("1 main() :  x = " + d.x);
		
		change2(d); //�������� d�� ��(�ּ�)�� �Ű����� d�� ����� -> �Ű����� d�� ���� => �Ű����� d�� ����� �ּҰ����� x�� ������ ����
		
		System.out.println("3 After change2(d)");
		System.out.println("4 main() : x = " + d.x); //�޼��尡 ����Ǹ鼭 �Ű����� d�� ���ÿ��� ����
	}
	
	static void change2(Data2 d) {//������ �Ű����� ->  ������ �� ���� ���� 
		d.x = 1000;// �Ű����� d�� x�� ���� 1000���� ���� 
		System.out.println("2 change2() : x = " + d.x);
	}
}