package sec06.exam04.package1;
//�������� ��������
public class A {
	//�ʵ�
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("���ڿ�");
	
	//������
	public A(boolean b) {}//public �������� : ��� ��Ű�� ����
	A(int b){}//default�������� : ���� ��Ű���� ������ ȣ�� ����
	private A(String s){} //private �������� : Ŭ���� ���ο����� ������ ȣ��
	
}