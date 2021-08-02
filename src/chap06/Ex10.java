package chap06;

class Data2{
	int x;
}

public class Ex10 {
	public static void main(String[] args) {
		Data2 d = new Data2();
		d.x = 10;
		System.out.println("1 main() :  x = " + d.x);
		
		change2(d); //참조변수 d의 값(주소)이 매개변수 d에 복사됨 -> 매개변수 d에 저장 => 매개변수 d에 저장된 주소값으로 x에 접근이 가능
		
		System.out.println("3 After change2(d)");
		System.out.println("4 main() : x = " + d.x); //메서드가 종료되면서 매개변수 d는 스택에서 제거
	}
	
	static void change2(Data2 d) {//참조형 매개변수 ->  변수의 값 변경 가능 
		d.x = 1000;// 매개변수 d로 x의 값을 1000으로 변경 
		System.out.println("2 change2() : x = " + d.x);
	}
}