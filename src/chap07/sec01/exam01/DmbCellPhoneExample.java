package chap07.sec01.exam01;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		//DmbCellPhone ��ü ����
		DmbCellPhone dcp = new DmbCellPhone("�ＺGalalxyS21", "white", 10);
		
		//CellPhone Ŭ�����κ��� ��ӹ��� �ʵ�
		System.out.println("�� : " + dcp.model);
		System.out.println("���� : " + dcp.color);
		
		//DmbCellPhone Ŭ������ �ʵ�
		System.out.println("ä�� : " + dcp.channel);
		
		//CellPhone  Ŭ�����κ��� ��ӹ��� �޼ҵ� ȣ��
		dcp.powerOn();
		dcp.bell();
		dcp.sendVoice("���� ������!");
		dcp.recieve("�ȳ��ϼ��� ! ���� �򽺺��Դϴ�.");
		dcp.sendVoice("������ ���͵帱���");
		dcp.hangUp();
		
		//DmbCellPhone Ŭ������ �޼ҵ� ȣ��
		dcp.turnOnDmb();
		dcp.changeChannelDmb(12);
		dcp.turnOffDmb();
	}

}
