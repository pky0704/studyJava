package sec06.exam03.package2;

import sec06.exam03.package1.B;

public class C {
	//A a; //A클래스 접근 불가능 : default 접근 제한 => 다른 패키지내에서 접근 불가능
	B b; //B클래스 접근 가능 : public 접근제한 => 모든 패키지에서 접근 가능 
}
