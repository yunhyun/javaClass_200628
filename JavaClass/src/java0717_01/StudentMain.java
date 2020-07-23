package java0717_01;

import java.util.*;

public class StudentMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		String name = "";
		String address = "";
		String phone = "";
		
		Student stu = null;
		
		Application app = new Application();
		
		// StudentDTO Ÿ���� ���� stu1 ���� 
		StudentDTO stu1 = null;
//		stu1.name = "ȸ��1";
		// set �޼ҵ带 �̿��Ͽ� name �ʵ忡 �� ���� 
//		stu1.setName("ȸ��1");
		
//		System.out.println(stu1.name);
		// get �޼ҵ带 �̿��Ͽ� name �ʵ� �� ���
//		System.out.println(stu1.getName());
		
		List<StudentDTO> stuList = new ArrayList<StudentDTO>();
		
		while(run) {
			System.out.println("--------------------------------------------------------------");
			System.out.println("1.�űԵ�� | 2.�⼮üũ | 3.������Ȯ�� | 4.�������� | 5.���� | 6.DTOŬ���� �̿��� ��ü");
			System.out.println("--------------------------------------------------------------");
			System.out.print("����> ");
			int selectNo = scan.nextInt();
			switch(selectNo) {
			case 1:
				System.out.print("�̸� : ");
				name = scan.next();
				System.out.print("�ּ� : ");
				address = scan.next();
				System.out.print("��ȭ��ȣ : ");
				phone = scan.next();
				stu = new Student(name, address, phone);
				break;
			case 2:
				app.enter(stu);
				break;
			case 3:
				// �� ���� Ȯ��(��ü�� ��� ��� �ʵ尪 ���) 
				app.view(stu);
				break;
			case 4:
				// ��������
				// �ּҸ� ����Ư���÷� �ٲٰ� ��� �ʵ尪 ���
				stu = new Student();
				app.modify(stu);
				break;
			case 6:
				// DTO Ŭ������ �̿��� ��ü ���� 
				System.out.print("�̸� : ");
				name = scan.next();
				System.out.print("�ּ� : ");
				address = scan.next();
				System.out.print("��ȭ��ȣ : ");
				phone = scan.next();
				// stu1�� StudentDTO Ŭ������ ��ü�� ���� 
				stu1 = new StudentDTO();
				// set �޼ҵ带 �̿��Ͽ� �� �ʵ尪 ���� 
				stu1.setName(name);
				stu1.setAddress(address);
				stu1.setPhone(phone);
				stuList.add(stu1);
				break;
			case 7:
				// ���̵� ��¿� �޼ҵ� ȣ�� 
				app.ListView(stuList);
				for(int i=0; i<stuList.size(); i++) {
					System.out.println(stuList.get(i));
				}
			}
		}
	}

}











