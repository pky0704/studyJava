package chap06;

public class Ex4_TvTest {
	
	public static void main(String[] args) {
		Tv4[] tvArr = new Tv4[3]; //���̰� 3�� tv��ü �迭 
		
		//tv��ü�� �����ؼ� tv��ü �迭�� �� ��ҿ� ����
		for(int i=0; i<tvArr.length ; i++) {
			tvArr[i] = new Tv4();
			tvArr[i].channel = i + 10;
		}
		
		for(int i=0; i<tvArr.length;i++) {
			tvArr[i].channelUp();//tvArr[i]�� �޼��� ȣ��, ä�� 1�� ����
			System.out.printf("tvArr[%d].channel=%d%n",i,tvArr[i].channel);
		}
	}

}
class Tv4{
	String color;
	boolean power;
	int channel;
	
	void power() {power=!power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}
