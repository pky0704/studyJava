package sec05.exam04;
//�̱���  : ��ü ���α׷����� �� �ϳ��� ��ü�� ���鵵�� �����ؾ� �ϴ� ���, �� �ϳ��� �����Ǵ� ��ü�� ����
public class Singleton {
	//�����ʵ�
	// private static Ŭ�����̸� singleton = new Ŭ�����̸�();
	
	private static Singleton singleton = new Singleton();
	
	//������
	//private Ŭ���� �̸�() {}
	private Singleton() {}
	
	/*
	//���� �޼ҵ�
	static Ŭ�����̸� getInstance(){
		return singleton
	}
	*/
	static Singleton getInstance() {
		return singleton;
	}
}
