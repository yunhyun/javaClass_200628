package java0717_01;

public class Student {
	// DTO(Data Transfer Object) : 데이터를 담아서 전달하기 위한 클래스 
	// 교육원 훈련생 정보를 담을 필드와 모든 필드를 매개변수로 하는 생성자를 선언
	String name;
	String birth;
	int age;
	String address;
	String gender;
	String phone;
	boolean exp;
	
	/*
	 * get, set 메소드 
	 */
	
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

	

	public Student(String name, String address, String phone) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", birth=" + birth + ", age=" + age + ", address=" + address + ", gender="
				+ gender + ", phone=" + phone + ", exp=" + exp + "]";
	}
}
