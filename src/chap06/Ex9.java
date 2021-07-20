/*
 * 메서드를 호출할 때 매개변수로 지정한 값을 메서드의 매개변수에 복사해서 넘겨준다
 * 매개변수의 타입이 기본형일 때는 기본형 값이 복사, 참조형일 때는 인스턴스의 주소가 복사 되어 값을 읽고 변경도 가능하다
 * 기본형 매개변수 : 변수의 값을 읽기만 할 수 있다. 
 * 참조형 매개변수 : 변수의 값을 읽고 변경할 수 있다. 
 */
package chap06;

class Data{
	int x;
}

public class Ex9 {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("1.x = " + d.x); //x=10
		
		change(d.x);//메서드가 호출되면서 d.x가 change메서드의 매개변수 x에 복사됨-> change메서드에서 x의 값을 1000으로 변경 -> 메서드 종료되면서 매개변수 x는 스택에서 제거
		
		System.out.println("After change(d.x)");
		System.out.println("4.x = " + d.x);//d.x값이 1000으로 변경되지않음 x=
	}
	
	static void change(int x) {//기본형 매개변수 -> 변수의 값을 읽기만 가능 (수정x)
		System.out.println("2.x = " + x);//d.x가 change메서드의 매개변수 x에 복사됨 -> x=10
		x = 1000;//  x의 값을 1000으로 변경
		System.out.println("3.x = " + x); //x =1000
	}
}
