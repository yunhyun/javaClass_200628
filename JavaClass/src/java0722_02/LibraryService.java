package java0722_02;

import java.util.*;

public class LibraryService {
	
	Scanner scan = new Scanner(System.in);
		
	public List<BookDTO> borrowBook(List<ClientDTO> clientList, List<BookDTO> bookList) {
		System.out.print("�� ��ȣ : ");
		int clientNumber = scan.nextInt();
		System.out.print("����å ��ȣ : ");
		int bookNumber = scan.nextInt();
		for(int i=0;i<bookList.size();i++) {
			if(bookNumber==bookList.get(i).getBookNumber() && bookList.get(i).isCheck()==false) {
				bookList.get(i).setClientNumber(clientNumber);
				bookList.get(i).setCheck(true);
				System.out.println("������ �Ϸ�Ǿ����ϴ�.");
			}
		}
		return bookList;
	}
	// ����ȣ, å��ȣ�� ��� �����ϸ� ���� ó��. 
	// �׸��� ���� ���� true�� �ٲ�. ���� �����ߴ������� bookList�� ����?

	public void bookList(List<BookDTO> bookList) {
		for(int i=0; i<bookList.size(); i++) {
			System.out.println(bookList.get(i));
		}
	}

	public void clientList(List<ClientDTO> clientList) {
		for(int i=0; i<clientList.size(); i++) {
			System.out.println(clientList.get(i));
		}
		
	}
	
	
	
	
}
