package java0715_03;

public class Naver {
	// 네이버 회원 정보 
	// 아이디, 비밀번호, 이름, 생년월일, 성별, 이메일, 휴대전화 
	String id;
	String password;
	String name;
	String birth;
	String gender;
	String email;
	String phone;
	
	// 기본 생성자 선언 
	Naver() {
		System.out.println("기본 생성자 호출 ");
	}

	public Naver(String id, String password, String name, String birth, String gender, String email, String phone) {
		//super();
		System.out.println("매개변수 있는 생성자 호출");
		this.id = id;
		this.password = password;
		this.name = name;
		this.birth = birth;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
	}

	// 메소드(method)
	@Override // 어노테이션(Annotation)
	public String toString() {
		return "Naver [id=" + id + ", password=" + password + ", name=" + name + ", birth=" + birth + ", gender="
				+ gender + ", email=" + email + ", phone=" + phone + "]";
	}
	
	
	
}















