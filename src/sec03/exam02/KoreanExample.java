package sec03.exam02;
//객체 생성 후 필드값 출력 
public class KoreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean("박세리", "01234-12343");
		System.out.println("k1.name : "+k1.name);
		System.out.println("k1.ssn"+k1.ssn);
		System.out.println();
		Korean k2 = new Korean("김세희", "98445-23423");
		System.out.println("k2.name"+k2.name);
		System.out.println("k2.ssn"+k2.ssn);
	}

}
