package sec05.exam04;
//싱글톤  : 전체 프로그램에서 단 하나의 객체만 만들도록 보장해야 하는 경우, 단 하나의 생성되는 객체를 말함
public class Singleton {
	//정적필드
	// private static 클래스이름 singleton = new 클래스이름();
	
	private static Singleton singleton = new Singleton();
	
	//생성자
	//private 클래스 이름() {}
	private Singleton() {}
	
	/*
	//정적 메소드
	static 클래스이름 getInstance(){
		return singleton
	}
	*/
	static Singleton getInstance() {
		return singleton;
	}
}
