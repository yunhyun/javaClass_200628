package java0723_01;

public class Phone {
	/*
	 * ��� 
	 * �ڹٿ����� ���
	 * 	: �θ�Ŭ������ �ʵ�, �޼ҵ带 ��� �޴� �� 
	 *  : �θ�Ŭ����, �ڽ�Ŭ������ ������. 
	 * ����� ���� 
	 * 	: �ڵ� �ߺ��� ���� �� ����. 
	 *  : �������� ��
	 *  : ��ü�� ������ ������ ���� 
	 * ���� ����
	 * 	: private���� ������ �ʵ�, �޼ҵ�� ��� �Ұ��� 
	 * 
	 */
	// �ʵ� ���� 
	String model;
	String color;
	
	// �޼ҵ� ���� 
	void hangOn() {
		System.out.println("��ȭ�� �̴ϴ�. ");
	}
	void hangOff() {
		System.out.println("��ȭ�� �����ϴ�. ");
	}
	void call(String sendVoice) {
		System.out.println(sendVoice);
	}
}










