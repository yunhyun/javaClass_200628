package java0716_03;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		String name = "";
		String birth = "";
		int age = 0;
		String address = "";
		String gender = "";
		String phone = "";
		boolean exp = false;
		Student stu = null;
		Attendance att = new Attendance();
		
		while(run) {
			System.out.println("--------------------------------------------------------------");
			System.out.println("1.�űԵ�� | 2.�⼮üũ | 3. | 4. | 5.����");
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
				stu = new Student(name, address, selectNo, phone, phone, phone, exp);
				break;
			case 2:
				att.enter(stu);
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				run = false;
				break;
			}
		}

	}

}
