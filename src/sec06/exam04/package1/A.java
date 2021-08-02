package sec06.exam04.package1;
//생성자의 접근제한
public class A {
	//필드
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
	
	//생성자
	public A(boolean b) {}//public 접근제한 : 모든 패키지 가능
	A(int b){}//default접근제한 : 같은 패키지내 생성자 호출 가능
	private A(String s){} //private 접근제한 : 클래스 내부에서만 생성자 호출
	
}
