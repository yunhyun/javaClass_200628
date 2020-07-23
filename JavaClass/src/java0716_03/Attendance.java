package java0716_03;

import java.util.Date;

public class Attendance {

	public void enter(Student stu) {
		System.out.println(stu.name+"님 입실 완료 ");
		System.out.println("현재시간 : " + new Date());
	}

}
