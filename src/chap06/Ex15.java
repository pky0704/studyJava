/*
 * ���ȣ�� : �޼ҵ� ���ο��� �޼ҵ� �ڽ��� �ٽ� ȣ�� �ϴ� ��
 * ��� �޼ҵ� : ���ȣ���� �ϴ� �޼��� 
 * ���� - ���丮�� ���ϱ�  5! = 5 * 4 * 3 * 2 * 1
 * */
package chap06;

public class Ex15 {

	public static void main(String[] args) {
		int result = factorial(4);//=Ex15.factorial(4)   => main�޼ҵ�� ���� Ŭ������ �ֱ� ������ static �޼��带 ȣ���� �� Ŭ�����̸��� �����ϴ� ���� �����ϴ�.
		System.out.println(result);
	}
	static int factorial(int n) {//static �޼ҵ��̹Ƿ� �ν��Ͻ��� �������� �ʰ� ���� ȣ�� �� �� �ִ�. 
		int result = 0;
		if(n ==1)
			result = 1;
		else
			result = n * factorial(n-1); //=4*3*2*1
		return result;
	}
}
