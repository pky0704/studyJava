/*
 * ��ȯ���� �ִ� �޼��带 ��ȯ���� ���� �޼���� �ٲٱ�  
 */
package chap06;

public class Ex13 {

	public static void main(String[] args) {
		Ex13 r = new Ex13();
		
		int result = r.add(3, 5);
		System.out.println(result); // a+b = 3+5 = 8
		
		int[] result2 = {0}; // �迭�� �����ϰ� result2[0] �� ���� 0 ���� �ʱ�ȭ
		r.add(3, 5, result2); //result2[0] = 3+5 = 8
		System.out.println(result2[0]);
	}
	int add(int a, int b) {
		return a+b;
	}
	void add(int a, int b, int[] result) {
		result[0] = a +b; // �Ű������� �Ѱܹ��� �迭�� �������� ����
	}

}
