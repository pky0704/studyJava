package chap06;

class Ex5_Tvtest {
	public static void main(String[] args) {
		System.out.println("Card.width ="+Card.width);
		System.out.println("Card.height="+Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은"+c1.kind+", "+c1.number+"이며, 크기는 ("+Card.width+","+Card.height+")");
		System.out.println("c2은"+c2.kind+", "+c2.number+"이며, 크기는 ("+Card.width+","+Card.height+")");
		System.out.println("================================");
		
		
		System.out.println("c1의 width와 height를 각각 50,80으로 변경하면 c2의 width, height 값도 같이 바뀐다 =>클래스 변수(static 변수)는  같은 저장 공간을 참조하기 때문.");
		c1.width = 50;
		c1.height = 80;
		
		System.out.println("c1은"+c1.kind+", "+c1.number+"이며, 크기는 ("+Card.width+","+Card.height+")");
		System.out.println("c2은"+c2.kind+", "+c2.number+"이며, 크기는 ("+Card.width+","+Card.height+")");
	}
}
class Card{
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
	
}
