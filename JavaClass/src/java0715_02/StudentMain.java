package java0715_02;

public class StudentMain {

	public static void main(String[] args) {
		// 기본생성자를 활용한 객체 생성 
		Student stu1 = new Student();
		stu1.name = "박태훈";
		stu1.birth = "991111";
		stu1.age = 22;
		stu1.address = "인천광역시";
		stu1.gender = "male";
		stu1.phone = "01011111111";
		stu1.exp = false;
		System.out.println(stu1.name);
		System.out.println(stu1.birth);
		System.out.println(stu1.age);
		System.out.println(stu1.toString());
		
		// 매개변수가 있는 생성자를 이용한 객체 생성 
		Student stu2 = new Student("김동연","991111",22,"인천광역시","남자","01055555555", false);
		System.out.println(stu2.toString());
		
	}

}









