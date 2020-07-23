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
			System.out.println("1.신규등록 | 2.출석체크 | 3. | 4. | 5.종료");
			System.out.println("--------------------------------------------------------------");
			System.out.print("선택> ");
			int selectNo = scan.nextInt();
			switch(selectNo) {
			case 1:
				System.out.print("이름 : ");
				name = scan.next();
				System.out.print("주소 : ");
				address = scan.next();
				System.out.print("전화번호 : ");
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
