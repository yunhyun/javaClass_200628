package java0715_02;

public class StudentMain {

	public static void main(String[] args) {
		// �⺻�����ڸ� Ȱ���� ��ü ���� 
		Student stu1 = new Student();
		stu1.name = "������";
		stu1.birth = "991111";
		stu1.age = 22;
		stu1.address = "��õ������";
		stu1.gender = "male";
		stu1.phone = "01011111111";
		stu1.exp = false;
		System.out.println(stu1.name);
		System.out.println(stu1.birth);
		System.out.println(stu1.age);
		System.out.println(stu1.toString());
		
		// �Ű������� �ִ� �����ڸ� �̿��� ��ü ���� 
		Student stu2 = new Student("�赿��","991111",22,"��õ������","����","01055555555", false);
		System.out.println(stu2.toString());
		
	}

}









