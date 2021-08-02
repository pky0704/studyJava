package sec05.exam06;
//상수 static final : 불변의 값을 저장하는 필드(예. 원주율 파일, 지구의 무게 및 둘레 등..)
//상수는 객체마다 저장할 필요가 없는 공용성이 있다. => 클래스에만 존재. 
//한번 초기값이 저장되면 변경할 수 없음
//대문자로 작성. 혼합된 단어는 _ 언더바 사용
//final필드는 객체마다 저장됨. 생성자의 매개값을 통해 여러가지 값을 가질 수 있다.
public class Earth {
	//static final 타입 상수 = 초기값;
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	
}
