package java0715_03;

public class Naver {
	// ���̹� ȸ�� ���� 
	// ���̵�, ��й�ȣ, �̸�, �������, ����, �̸���, �޴���ȭ 
	String id;
	String password;
	String name;
	String birth;
	String gender;
	String email;
	String phone;
	
	// �⺻ ������ ���� 
	Naver() {
		System.out.println("�⺻ ������ ȣ�� ");
	}

	public Naver(String id, String password, String name, String birth, String gender, String email, String phone) {
		//super();
		System.out.println("�Ű����� �ִ� ������ ȣ��");
		this.id = id;
		this.password = password;
		this.name = name;
		this.birth = birth;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
	}

	// �޼ҵ�(method)
	@Override // ������̼�(Annotation)
	public String toString() {
		return "Naver [id=" + id + ", password=" + password + ", name=" + name + ", birth=" + birth + ", gender="
				+ gender + ", email=" + email + ", phone=" + phone + "]";
	}
	
	
	
}















