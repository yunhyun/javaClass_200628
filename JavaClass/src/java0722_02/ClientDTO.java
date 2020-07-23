package java0722_02;

public class ClientDTO {
	private int clientNumber;
	private String name;
	private String phone;
	private int bookNumber;

	public int getClientNumber() {
		return clientNumber;
	}

	public void setClientNumber(int clientNumber) {
		this.clientNumber = clientNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}

	@Override
	public String toString() {
		return "ClientDTO [clientNumber=" + clientNumber + ", name=" + name + ", phone=" + phone + ", bookNumber="
				+ bookNumber + "]";
	}

	public ClientDTO(int clientNumber, String name, String phone, int bookNumber) {
		this.clientNumber = clientNumber;
		this.name = name;
		this.phone = phone;
		this.bookNumber = bookNumber;
	}

	public ClientDTO() {
	}

}
