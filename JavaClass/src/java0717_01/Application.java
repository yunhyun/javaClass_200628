package java0717_01;

import java.util.Date;
import java.util.List;

public class Application {

	public void enter(Student stu) {
		System.out.println("Application Ŭ������ enter �޼ҵ�");
		System.out.println(stu.name+" �� �ԽǿϷ� ");
		System.out.println("�Խǽð� : "+ new Date());
	}

	public void view(Student stu) {
		System.out.println("����Ȯ�� �޴� ���� ");
		System.out.println(stu.toString());
		
		
		
	}

	public void modify(Student stu) {
		stu.address = "����Ư����";
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








