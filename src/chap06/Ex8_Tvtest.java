package chap06;

public class Ex8_Tvtest {
	public static void main(String[] args) {
		System.out.println("1 main(String[] args) ����");
		firstMethod();
		System.out.println("6 main(String[] args) ����");
	}
	
	static void firstMethod(){
		System.out.println("2 firstMethod() ����");
		secondMethod();
		System.out.println("5 firstMethod() ����");
	}
	static void secondMethod() {
		System.out.println("3 secondMethod() ����");
		System.out.println("4 secondMethod() ����");
	}

}
