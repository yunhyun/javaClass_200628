package java0723_01;

public class SmartPhone extends CellPhone {
	String type;
	
	@Override
	void powerOn() {
		System.out.println("����Ʈ���� �մϴ�.");
	}
	
	@Override
	void hangOn() {
		System.out.println("����Ʈ������ ��ȭ�� �̴ϴ�.");
	}
	
}
