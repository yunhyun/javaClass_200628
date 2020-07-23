package java0717_01;

import java.util.Date;
import java.util.List;

public class Application {

	public void enter(Student stu) {
		System.out.println("Application 클래스의 enter 메소드");
		System.out.println(stu.name+" 님 입실완료 ");
		System.out.println("입실시간 : "+ new Date());
	}

	public void view(Student stu) {
		System.out.println("정보확인 메뉴 실행 ");
		System.out.println(stu.toString());
		
		
		
	}

	public void modify(Student stu) {
		stu.address = "서울특별시";
		System.out.println(stu.toString());
	}

	public void ListView() {
//		stuList.get(0).getName();
	}

	public void ListView(List<StudentDTO> stuList) {
		// TODO Auto-generated method stub
		stuList.get(0).getName();
	}


}








