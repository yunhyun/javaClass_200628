package java0720_01;

public class NaverMemberDTO {
	// �ʵ� ���� 
	private String id;
	private String name;
	private String password;

	// get, set �޼ҵ� ���� 
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
	
	// �⺻ ������ ���� 
	public NaverMemberDTO() {
		
	}
	
	// ��� �ʵ带 �Ű������� �ϴ� ������ 
	public NaverMemberDTO(String id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}
	
	// toString �޼ҵ� ���� 
	@Override
	public String toString() {
		return "NaverMemberDTO [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
	
	
	
}











