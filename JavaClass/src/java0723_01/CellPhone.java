package java0723_01;
// CellPhone Ŭ������ Phone�� �ڽ�Ŭ������ �����ϱ� 
public class CellPhone extends Phone {
	String button;
	String message;
	
	// ������
	CellPhone(){
		
	}
	// button, model, color�� �Ű������� �ϴ� ������ ���� 
	CellPhone(String button, String model, String color){
		this.button = button;
		this.model = model;
		this.color = color;
	}
	
	// �޼ҵ� 
	void sendMessage(String message) {
		System.out.println("�޽��� ���� : "+message);
	}
	void receiveMessage(String message) {
		System.out.println("�޽��� ���� : "+message);
	}
	void powerOn() {
		System.out.println("������ �մϴ�.");
	}
	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
	
	// �޼ҵ� ������ (Overriding)
	@Override
	void hangOn() {
		System.out.println("CellPhone���� ��ȭ��  �̴ϴ�. ");
		}
	
	
	
	
	
	
	
	
	
}
