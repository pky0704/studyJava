/*
 *	������ ��ȯŸ�� => �޼��尡 ��ü�� �ּҸ� ��ȯ�Ѵٴ� �ǹ�
 *
 * 
 */
package chap06;

class data1{
	int x;
}

public class Ex14 {
	public static void main(String[] args) {
		data1 d = new data1();
		d.x = 10;
		
		data1 d2 = copy(d); //1)copy�޼ҵ带 ȣ���ϸ鼭 �������� d�� ���� �Ű����� d�� ����ȴ�
		//4)copy�޼ҵ尡 ���� 
		System.out.println("d.x = "+d.x);
		System.out.println("d2.x = "+d2.x);//5)��ȯ�� tmp�� ���� �������� d2�� ����ȴ�
		
	}
	static data1 copy(data1 d) {//copy �޼ҵ� 
		data1 tmp = new data1(); //2)���ο� ��ü tmp ����
		tmp.x = d.x; //3)d.x�� ���� tmp.x�� ���� 
		
		return tmp; //������ ��ü�� �ּҸ� ��ȯ 
	}

}
