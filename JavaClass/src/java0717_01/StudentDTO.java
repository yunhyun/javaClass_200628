package java0717_01;

public class StudentDTO {
	private String name;
	private String birth;
	private int age;
	private String address;
	private String gender;
	private String phone;
	private boolean exp;
	// public, private : ���������� 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public boolean isExp() {
		return exp;
	}
	public void setExp(boolean exp) {
		this.exp = exp;
	}
	public StudentDTO(String name, String birth, int age, String address, String gender, String phone, boolean exp) {
		this.name = name;
		this.birth = birth;
		this.age = age;
		this.address = address;
		this.gender = gender;
		this.phone = phone;
		this.exp = exp;
	}
	
	public StudentDTO() {

	}
	@Override
	public String toString() {
		return "StudentDTO [name=" + name + ", birth=" + birth + ", age=" + age + ", address=" + address + ", gender="
				+ gender + ", phone=" + phone + ", exp=" + exp + "]";
	}
	
	
	
	/*
	 * get, set �޼ҵ� 
	 *  ��� ���� : �ʵ忡 ���� ������ �ƴ� �޼ҵ带 ���� ���� �����Ͽ� 
	 *  		 �ʵ尪 ���� �� ����
	 *  get �޼ҵ� : �ܺο��� �ʵ尪�� ������ �� ��
	 *  set �޼ҵ� : �ܺο��� �ʵ尪�� ������ ��  
	 */
	// name �ʵ忡 ���� get, set �޼ҵ� ���� 
	
	
	
	
	
	
}
