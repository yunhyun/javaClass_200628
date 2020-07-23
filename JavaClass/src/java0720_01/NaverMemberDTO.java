package java0720_01;

public class NaverMemberDTO {
	// 필드 선언 
	private String id;
	private String name;
	private String password;

	// get, set 메소드 선언 
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	// 기본 생성자 선언 
	public NaverMemberDTO() {
		
	}
	
	// 모든 필드를 매개변수로 하는 생성자 
	public NaverMemberDTO(String id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}
	
	// toString 메소드 선언 
	@Override
	public String toString() {
		return "NaverMemberDTO [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
	
	
	
}











