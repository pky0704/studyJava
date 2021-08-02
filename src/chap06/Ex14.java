/*
 *	참조형 반환타입 => 메서드가 객체의 주소를 반환한다는 의미
 *
 * 
 */
package chap06;

class data1{
	int x;
}

public class Ex14 {
	public static void main(String[] args) {
		data1 d = new data1();
		d.x = 10;
		
		data1 d2 = copy(d); //1)copy메소드를 호출하면서 참조변수 d의 값이 매개변수 d에 복사된다
		//4)copy메소드가 종료 
		System.out.println("d.x = "+d.x);
		System.out.println("d2.x = "+d2.x);//5)반환한 tmp의 값은 참조변수 d2에 저장된다
		
	}
	static data1 copy(data1 d) {//copy 메소드 
		data1 tmp = new data1(); //2)새로운 객체 tmp 생성
		tmp.x = d.x; //3)d.x의 값을 tmp.x에 복사 
		
		return tmp; //복사한 객체의 주소를 반환 
	}

}
