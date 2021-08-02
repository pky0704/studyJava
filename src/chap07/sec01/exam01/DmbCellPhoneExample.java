package chap07.sec01.exam01;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		//DmbCellPhone 객체 생성
		DmbCellPhone dcp = new DmbCellPhone("삼성GalalxyS21", "white", 10);
		
		//CellPhone 클래스로부터 상속받은 필드
		System.out.println("모델 : " + dcp.model);
		System.out.println("색상 : " + dcp.color);
		
		//DmbCellPhone 클래스의 필드
		System.out.println("채널 : " + dcp.channel);
		
		//CellPhone  클래스로부터 상속받은 메소드 호출
		dcp.powerOn();
		dcp.bell();
		dcp.sendVoice("하이 갤럭시!");
		dcp.recieve("안녕하세요 ! 저는 빅스비입니다.");
		dcp.sendVoice("무엇을 도와드릴까요");
		dcp.hangUp();
		
		//DmbCellPhone 클래스의 메소드 호출
		dcp.turnOnDmb();
		dcp.changeChannelDmb(12);
		dcp.turnOffDmb();
	}

}
