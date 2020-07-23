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
		
		// StudentDTO 타입의 변수 stu1 선언 
		StudentDTO stu1 = null;
//		stu1.name = "회원1";
		// set 메소드를 이용하여 name 필드에 값 저장 
//		stu1.setName("회원1");
		
//		System.out.println(stu1.name);
		// get 메소드를 이용하여 name 필드 값 출력
//		System.out.println(stu1.getName());
		
		List<StudentDTO> stuList = new ArrayList<StudentDTO>();
		
		while(run) {
			System.out.println("--------------------------------------------------------------");
			System.out.println("1.신규등록 | 2.출석체크 | 3.내정보확인 | 4.정보수정 | 5.종료 | 6.DTO클래스 이용한 객체");
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
				stu = new Student(name, address, phone);
				break;
			case 2:
				app.enter(stu);
				break;
			case 3:
				// 내 정보 확인(객체에 담긴 모든 필드값 출력) 
				app.view(stu);
				break;
			case 4:
				// 정보수정
				// 주소를 서울특별시로 바꾸고 모든 필드값 출력
				stu = new Student();
				app.modify(stu);
				break;
			case 6:
				// DTO 클래스를 이용한 객체 생성 
				System.out.print("이름 : ");
				name = scan.next();
				System.out.print("주소 : ");
				address = scan.next();
				System.out.print("전화번호 : ");
				phone = scan.next();
				// stu1을 StudentDTO 클래스의 객체로 생성 
				stu1 = new StudentDTO();
				// set 메소드를 이용하여 각 필드값 저장 
				stu1.setName(name);
				stu1.setAddress(address);
				stu1.setPhone(phone);
				stuList.add(stu1);
				break;
			case 7:
				// 아이디 출력용 메소드 호출 
				app.ListView(stuList);
				for(int i=0; i<stuList.size(); i++) {
					System.out.println(stuList.get(i));
				}
			}
		}
	}

}











