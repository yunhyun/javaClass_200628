package java0723_01;

public class CellPhoneMain {

	public static void main(String[] args) {
		// CellPhone Ŭ������ ��ü ���� 
		CellPhone cp = new CellPhone();
		// �ڽ�Ŭ�������� �θ�Ŭ������ ������ �ִ� �ʵ带 ��� ��� ����  
		cp.button = "��ư 10��";
		cp.color = "red";
		cp.message  = "�޽���";
		cp.model = "��ȭ��";
		// �θ�Ŭ����(Phone) �޼ҵ� ȣ�� 
		cp.hangOn();
		cp.hangOff();
		// �ڽ�Ŭ����(CellPhone) �޼ҵ� ȣ�� 
		cp.sendMessage("�ȳ�");
		cp.powerOn();
		cp.hangOn();
		
		SmartPhone sp = new SmartPhone();
		Phone p = new Phone();
		sp.button = "��ġ��ũ��";
		sp.color = "black";
		sp.message = "ī��";
		sp.model = "������";
		sp.type = "lte";
		sp.call("��������");
		
		sp.hangOff();
		sp.hangOn();
		sp.powerOff();
		sp.powerOn();
		sp.receiveMessage("�ȳ�");
		sp.sendMessage("�ȳ�");
		
		
	}

}






