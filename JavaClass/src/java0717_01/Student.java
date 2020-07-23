package java0717_01;

public class Student {
	// DTO(Data Transfer Object) : �����͸� ��Ƽ� �����ϱ� ���� Ŭ���� 
	// ������ �Ʒû� ������ ���� �ʵ�� ��� �ʵ带 �Ű������� �ϴ� �����ڸ� ����
	String name;
	String birth;
	int age;
	String address;
	String gender;
	String phone;
	boolean exp;
	
	/*
	 * get, set �޼ҵ� 
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
