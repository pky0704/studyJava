package sec04.exam02;
//�Ű� ������ ������ �� ��� 
//�Ű������� �迭 Ÿ������ ����, or  �迭�� �������� �ʰ� ���� ��ϸ� �Ѱ��ش� (... ���)
public class Computer {
	//�Ű������� �迭 Ÿ������ ����
	int sum1(int[] values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	int sum2(int ... values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}
