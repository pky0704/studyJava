/*
 * �Ű������� ��ȿ���� �˻��ϴ� �ڵ带 �߰��ؼ� �޼��� factorial�� �Ű����� n�� �����ų� 20���� ũ�� -1�� ��ȯ 
 */
package chap06;

public class Ex16 {
	static long factorial(int n) {
		if(n<=0 || n>20) //�Ű������� ��ȿ�� �˻� 
			return -1;
		if(n<=1) 
			return 1;
		return n * factorial(n-1);
	}
	public static void main(String[] args) {
		int n =21;
		long result = 0;
		
		for(int i=1; i<=n; i++) {
			result = factorial(i);
			
			if(result==-1) {
				System.out.printf("��ȿ���� ���� ���Դϴ�. (0<n<=20):%d%n",n);
				break;
			}
			System.out.printf("%2d! = %20d%n", i, result);
		}
	}

}
