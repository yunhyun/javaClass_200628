package java0716_03;

public class Student {
	// 이름, 생년월일, 나이, 주소, 성별, 전화번호, 프로그래밍 경험 여부
	String name;
	String birth;
	int age;
	String address;
	String gender;
	String phone;
	boolean exp;
	
	Student() {
		
	}
	
	public Student(String name, String birth, int age, String address, String gender, String phone, boolean exp) {
		super();
		this.name = name;
		this.birth = birth;
		this.age = age;
		this.address = address;
		this.gender = gender;
		this.phone = phone;
		this.exp = exp;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", birth=" + birth + ", age=" + age + ", address=" + address + ", gender="
				+ gender + ", phone=" + phone + ", exp=" + exp + "]";
	}
	
}
