package java0715_01;

public class Mobile {
	String company = "�Ｚ";
	String model;
	String color;
	int type;// 4g, 5g 
	
	// ��� �ʵ带 �Ű������� �ϴ� ������ 
	Mobile(String company, String model, String color, int type) {
		// ���޹��� �Ű������� ��� ���� ���� �ʵ忡 ����
		this.company = company;
		this.model = model;
		this.color = color;
		this.type = type;
	}
	
	
	// �⺻������ ���� 
	Mobile() {
		System.out.println("������ ȣ��");
	}
	// ������ overloading : �����ڸ� ���� �� ������ �� ����
	
	Mobile (String model, String color, int type){
		this.model = model;
		this.color = color;
		this.type = type;
	}
	
	
}









