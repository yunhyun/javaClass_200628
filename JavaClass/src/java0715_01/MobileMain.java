package java0715_01;

public class MobileMain {

	public static void main(String[] args) {
		// �⺻�����ڸ� �̿��� Mobile ��ü ���� 
		Mobile mobile1 = new Mobile();
		mobile1.company = "����";
		mobile1.model = "������11Pro";
		mobile1.color = "black";
		
		mobile1.type = 5;
		
		Mobile mobile2 = new Mobile();
		mobile2.model = "s20";
		mobile2.color = "red";
		mobile2.type = 5;
		
		System.out.println(mobile2.color);
		System.out.println(mobile2.company);
		System.out.println(mobile2.model);
		System.out.println(mobile2.type);
		
		// ��ü�� ���� �� �ʵ� ������ �Բ� �����ϰ��� �Ҷ� 
		// �Ű������� �ִ� �����ڸ� ��� 
		
		Mobile mobile3 = new Mobile();
		System.out.println(mobile3.color);
		System.out.println(mobile3.company);
		System.out.println(mobile3.model);
		System.out.println(mobile3.type);
		
		// ��� �ʵ带 �Ű������� �ϴ� �����ڸ� �̿��� ��ü ����
		Mobile mobile4 = new Mobile("�Ｚ", "��Ʈ10", "black", 5);
		System.out.println(mobile4.color);
		System.out.println(mobile4.company);
		System.out.println(mobile4.model);
		System.out.println(mobile4.type);
		
		mobile4.model = "��Ʈ10plus";
		System.out.println(mobile4.model);
		
		
		
		
		
		
		
		
	}

}
