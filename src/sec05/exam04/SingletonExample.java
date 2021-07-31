package sec05.exam04;
//싱글톤 객체 
public class SingletonExample {

	public static void main(String[] args) {
		//객체 생성 컴파일 에러!
//		Singleton.obj1 = new Singleton();
//		Singleton.obj2 = new Singleton();
		
		//싱글톤 객체 생성
		//클래스이름 변수 = 클래스이름.getInstance();
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		
		
		//getInstance() 메소드 호출 => 단 하나의 객체만 리턴
		
		//getInstance()메소드는 하나의 객체만 리턴하기 때문에 ob1과 obj2는 동일한 객체를 참조한다. 
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		}else {
			System.out.println("다른 Singleton 객체 입니다.");
		}
		
	}

}
