package java0715_02;

public class Student {
	// �̸�, �������, ����, �ּ�, ����, ��ȭ��ȣ, ���α׷��� ���� ����
	String name;
	String birth;
	int age;
	String address;
	String gender;
	String phone;//01011111111, 010-1111-1111
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
	
	// ��� �ʵ带 �Ű������� �ϴ� ������ 
//	Student(String name, String birth, int age, String address, String gender, String phone, boolean exp){
//		this.name = name;
//	}
	
	
	
	
	
	
	
	
	
}









