package chap06;

public class Ex8_Tvtest {
	public static void main(String[] args) {
		System.out.println("1 main(String[] args) 시작");
		firstMethod();
		System.out.println("6 main(String[] args) 종료");
	}
	
	static void firstMethod(){
		System.out.println("2 firstMethod() 시작");
		secondMethod();
		System.out.println("5 firstMethod() 종료");
	}
	static void secondMethod() {
		System.out.println("3 secondMethod() 시작");
		System.out.println("4 secondMethod() 종료");
	}

}
