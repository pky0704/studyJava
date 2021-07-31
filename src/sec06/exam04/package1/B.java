package sec06.exam04.package1;
//생성자의 접근제한
public class B {
	//필드
	A a1 = new A(true);
	A a2 = new A(1);// default 생성자 : 동일 패키지 내 접근가능
	//A a3 = new A("문자열"); // 컴파일 에러 : private 생성자 접근 불가능
}
