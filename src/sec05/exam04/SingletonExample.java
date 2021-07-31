package sec05.exam04;
//�̱��� ��ü 
public class SingletonExample {

	public static void main(String[] args) {
		//��ü ���� ������ ����!
//		Singleton.obj1 = new Singleton();
//		Singleton.obj2 = new Singleton();
		
		//�̱��� ��ü ����
		//Ŭ�����̸� ���� = Ŭ�����̸�.getInstance();
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		
		
		//getInstance() �޼ҵ� ȣ�� => �� �ϳ��� ��ü�� ����
		
		//getInstance()�޼ҵ�� �ϳ��� ��ü�� �����ϱ� ������ ob1�� obj2�� ������ ��ü�� �����Ѵ�. 
		if(obj1 == obj2) {
			System.out.println("���� Singleton ��ü�Դϴ�.");
		}else {
			System.out.println("�ٸ� Singleton ��ü �Դϴ�.");
		}
		
	}

}
